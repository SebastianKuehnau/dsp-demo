import 'Frontend/demo/init'; // hidden-source-line

import { html, LitElement } from 'lit';
import { customElement } from 'lit/decorators.js';
import '@vaadin/icon';
import '@vaadin/icons';
import '@vaadin/text-field';
import { applyTheme } from 'Frontend/generated/theme';

@customElement('text-field-placeholder')
export class Example extends LitElement {
  protected override createRenderRoot() {
    const root = super.createRenderRoot();
    // Apply custom theme (only supported if your app uses one)
    applyTheme(root);
    return root;
  }

  protected override render() {
    return html`
      <!-- tag::snippet[] -->
      <vaadin-text-field placeholder="Search">
        <vaadin-icon slot="prefix" icon="vaadin:search"></vaadin-icon>
      </vaadin-text-field>
      <!-- end::snippet[] -->
    `;
  }
}
