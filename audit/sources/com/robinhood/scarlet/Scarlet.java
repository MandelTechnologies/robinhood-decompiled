package com.robinhood.scarlet;

import com.robinhood.scarlet.registry.AttributeTransitionsRegistry;
import com.robinhood.scarlet.registry.DefStyleRegistry;
import com.robinhood.scarlet.registry.ExclusionRegistry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Scarlet.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\u0011R\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0080.¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t@BX\u0080.¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\r@BX\u0080.¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0011@BX\u0080.¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/scarlet/Scarlet;", "", "<init>", "()V", "value", "Lcom/robinhood/scarlet/registry/AttributeTransitionsRegistry;", "attributeTransitionsRegistry", "getAttributeTransitionsRegistry$lib_scarlet_externalRelease", "()Lcom/robinhood/scarlet/registry/AttributeTransitionsRegistry;", "Lcom/robinhood/scarlet/ContextThemeWrapperBehavior;", "contextThemeWrapperBehavior", "getContextThemeWrapperBehavior$lib_scarlet_externalRelease", "()Lcom/robinhood/scarlet/ContextThemeWrapperBehavior;", "Lcom/robinhood/scarlet/registry/ExclusionRegistry;", "exclusionRegistry", "getExclusionRegistry$lib_scarlet_externalRelease", "()Lcom/robinhood/scarlet/registry/ExclusionRegistry;", "Lcom/robinhood/scarlet/registry/DefStyleRegistry;", "defStyleRegistry", "getDefStyleRegistry$lib_scarlet_externalRelease", "()Lcom/robinhood/scarlet/registry/DefStyleRegistry;", "init", "", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class Scarlet {
    private static AttributeTransitionsRegistry attributeTransitionsRegistry;
    private static ContextThemeWrapperBehavior contextThemeWrapperBehavior;
    private static DefStyleRegistry defStyleRegistry;
    private static ExclusionRegistry exclusionRegistry;
    public static final Scarlet INSTANCE = new Scarlet();
    public static final int $stable = 8;

    private Scarlet() {
    }

    public final AttributeTransitionsRegistry getAttributeTransitionsRegistry$lib_scarlet_externalRelease() {
        AttributeTransitionsRegistry attributeTransitionsRegistry2 = attributeTransitionsRegistry;
        if (attributeTransitionsRegistry2 != null) {
            return attributeTransitionsRegistry2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("attributeTransitionsRegistry");
        return null;
    }

    public final ContextThemeWrapperBehavior getContextThemeWrapperBehavior$lib_scarlet_externalRelease() {
        ContextThemeWrapperBehavior contextThemeWrapperBehavior2 = contextThemeWrapperBehavior;
        if (contextThemeWrapperBehavior2 != null) {
            return contextThemeWrapperBehavior2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("contextThemeWrapperBehavior");
        return null;
    }

    public final ExclusionRegistry getExclusionRegistry$lib_scarlet_externalRelease() {
        ExclusionRegistry exclusionRegistry2 = exclusionRegistry;
        if (exclusionRegistry2 != null) {
            return exclusionRegistry2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("exclusionRegistry");
        return null;
    }

    public final DefStyleRegistry getDefStyleRegistry$lib_scarlet_externalRelease() {
        DefStyleRegistry defStyleRegistry2 = defStyleRegistry;
        if (defStyleRegistry2 != null) {
            return defStyleRegistry2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("defStyleRegistry");
        return null;
    }

    public static /* synthetic */ void init$default(Scarlet scarlet, AttributeTransitionsRegistry attributeTransitionsRegistry2, ContextThemeWrapperBehavior contextThemeWrapperBehavior2, ExclusionRegistry exclusionRegistry2, DefStyleRegistry defStyleRegistry2, int i, Object obj) {
        if ((i & 2) != 0) {
            contextThemeWrapperBehavior2 = ContextThemeWrapperBehavior.THROW;
        }
        if ((i & 4) != 0) {
            exclusionRegistry2 = ExclusionRegistry.INSTANCE.empty();
        }
        if ((i & 8) != 0) {
            defStyleRegistry2 = DefStyleRegistry.INSTANCE.empty();
        }
        scarlet.init(attributeTransitionsRegistry2, contextThemeWrapperBehavior2, exclusionRegistry2, defStyleRegistry2);
    }

    public final void init(AttributeTransitionsRegistry attributeTransitionsRegistry2, ContextThemeWrapperBehavior contextThemeWrapperBehavior2, ExclusionRegistry exclusionRegistry2, DefStyleRegistry defStyleRegistry2) {
        Intrinsics.checkNotNullParameter(attributeTransitionsRegistry2, "attributeTransitionsRegistry");
        Intrinsics.checkNotNullParameter(contextThemeWrapperBehavior2, "contextThemeWrapperBehavior");
        Intrinsics.checkNotNullParameter(exclusionRegistry2, "exclusionRegistry");
        Intrinsics.checkNotNullParameter(defStyleRegistry2, "defStyleRegistry");
        attributeTransitionsRegistry = attributeTransitionsRegistry2;
        contextThemeWrapperBehavior = contextThemeWrapperBehavior2;
        exclusionRegistry = exclusionRegistry2;
        defStyleRegistry = defStyleRegistry2;
    }
}
