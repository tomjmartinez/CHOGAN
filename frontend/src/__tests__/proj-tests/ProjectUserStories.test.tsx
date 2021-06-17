import * as React from 'react';
import { mount} from 'enzyme';
import { store } from '../../redux/store';
import { Provider } from 'react-redux';
import ProjectUserStories from '../../components/ProjectUserStories';

describe('ProjectUserStories tests', () => {
    let wrapper:any;
    let projs:any;
    beforeEach(() => {
        wrapper = mount(
          <Provider store={store} > 
            <ProjectUserStories /> 
          </Provider>
        );
     });
    it('checking page loads', () => {
        const actual = wrapper.find('#pg-content');
        expect(actual.length).toBeGreaterThanOrEqual(1);
    });
});