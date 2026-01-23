package com.withpersona.sdk2.inquiry.permissions;

import com.squareup.workflow1.p415ui.ViewFactory;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Set;

/* loaded from: classes18.dex */
public final class PermissionsModule_ProvideViewBindingsFactory implements Factory<Set<ViewFactory<?>>> {

    private static final class InstanceHolder {
        static final PermissionsModule_ProvideViewBindingsFactory INSTANCE = new PermissionsModule_ProvideViewBindingsFactory();
    }

    @Override // javax.inject.Provider
    public Set<ViewFactory<?>> get() {
        return provideViewBindings();
    }

    public static PermissionsModule_ProvideViewBindingsFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Set<ViewFactory<?>> provideViewBindings() {
        return (Set) Preconditions.checkNotNullFromProvides(PermissionsModule.provideViewBindings());
    }
}
