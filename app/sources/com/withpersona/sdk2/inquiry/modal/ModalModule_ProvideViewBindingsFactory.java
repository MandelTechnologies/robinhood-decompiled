package com.withpersona.sdk2.inquiry.modal;

import com.squareup.workflow1.p415ui.ViewFactory;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Set;

/* loaded from: classes18.dex */
public final class ModalModule_ProvideViewBindingsFactory implements Factory<Set<ViewFactory<?>>> {

    private static final class InstanceHolder {
        static final ModalModule_ProvideViewBindingsFactory INSTANCE = new ModalModule_ProvideViewBindingsFactory();
    }

    @Override // javax.inject.Provider
    public Set<ViewFactory<?>> get() {
        return provideViewBindings();
    }

    public static ModalModule_ProvideViewBindingsFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Set<ViewFactory<?>> provideViewBindings() {
        return (Set) Preconditions.checkNotNullFromProvides(ModalModule.provideViewBindings());
    }
}
