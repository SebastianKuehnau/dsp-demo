import 'Frontend/demo/init'; // hidden-source-line
import { createFakeUploadFiles } from './upload-demo-helpers'; // hidden-source-line
import { html, LitElement } from 'lit';
import { customElement } from 'lit/decorators.js';
import '@vaadin/upload';
import { applyTheme } from 'Frontend/generated/theme';

function createFakeFiles() {
  return createFakeUploadFiles([
    { name: 'Financials.xlsx', error: 'Something went wrong, please try again' },
  ]);
}

@customElement('upload-retry-button')
export class Example extends LitElement {
  protected override createRenderRoot() {
    const root = super.createRenderRoot();
    // Apply custom theme (only supported if your app uses one)
    applyTheme(root);
    return root;
  }

  protected override render() {
    return html`<vaadin-upload .files="${createFakeFiles()}"></vaadin-upload>`;
  }
}
