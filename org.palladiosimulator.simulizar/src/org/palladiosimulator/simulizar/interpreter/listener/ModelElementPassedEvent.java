package org.palladiosimulator.simulizar.interpreter.listener;

import org.eclipse.emf.ecore.EObject;

import de.uka.ipd.sdq.simucomframework.SimuComSimProcess;

public class ModelElementPassedEvent<T extends EObject> extends SimulationEvent {

    private final T modelElement;
    private final EventType eventType;
    
    public ModelElementPassedEvent(final T modelElement, final EventType eventType, final SimuComSimProcess thread) {
        super(thread);
        this.modelElement = modelElement;
        this.eventType = eventType;
    }

    /**
     * @return the modelElement
     */
    public T getModelElement() {
        return this.modelElement;
    }

    public EventType getEventType() {
        return this.eventType;
    }
}
