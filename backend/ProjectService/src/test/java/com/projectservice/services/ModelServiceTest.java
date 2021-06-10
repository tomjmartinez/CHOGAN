package com.projectservice.services;

import com.projectservice.models.Model;
import com.projectservice.repository.ModelRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class ModelServiceTest {

    private final ModelRepo modelRepo = Mockito.mock(ModelRepo.class);

    private final ModelService modelService = new ModelService(modelRepo);

    /*
    *
    * Create
    *
    * */

    @Test
    void insertTest(){
        Model model = new Model();

        Mockito.when(modelRepo.save(model)).thenReturn(model);

        Model foundModel = modelService.insert(model);

        Assertions.assertEquals(foundModel,model);
    }

    /*
    *
    * Read
    *
    * */

    @Test
    void findByModelIdTest(){
        String modelId = "Id";
        Model model = new Model();

        Mockito.when(modelRepo.findByModelId(modelId)).thenReturn(model);

        Model foundModel = modelService.findByModelId(modelId);

        Assertions.assertEquals(foundModel,model);
    }

    @Test
    void findByProjectIdTest(){
        String projectId = "Id";
        List<Model> list = new ArrayList<>();
        list.add(new Model());

        Mockito.when(modelRepo.findByProjectId(projectId)).thenReturn(list);

        List<Model> foundList = modelService.findByProjectId(projectId);

        Assertions.assertEquals(foundList,list);
    }

    /*
    *
    * Update
    *
    * */

    /*
    *
    * Delete
    *
    * */
}
