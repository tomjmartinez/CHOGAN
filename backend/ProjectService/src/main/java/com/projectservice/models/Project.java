package com.projectservice.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Pojo for projects
 */
@Data
@Document(collection="projects")
public class Project {
    @Id
    private String projectId;

    private String userId;
    private String projectName;
    private String projectStatus;
    private String projectDescription;
}