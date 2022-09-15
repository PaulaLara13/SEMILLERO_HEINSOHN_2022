import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GestionarCompraCOmicComponent } from './gestionar-compra-comic.component';

describe('GestionarCompraCOmicComponent', () => {
  let component: GestionarCompraCOmicComponent;
  let fixture: ComponentFixture<GestionarCompraCOmicComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GestionarCompraCOmicComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GestionarCompraCOmicComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
