package com.robinhood.android;

import android.app.Application;
import android.content.res.Resources;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.tabs.TabLayout;
import com.robinhood.android.designsystem.style.AttributeTransitionsKt;
import com.robinhood.scarlet.ContextThemeWrapperBehavior;
import com.robinhood.scarlet.Scarlet;
import com.robinhood.scarlet.registry.AttributeTransitionsRegistry;
import com.robinhood.scarlet.registry.DefStyleRegistry;
import com.robinhood.scarlet.registry.ExclusionRegistry;
import com.robinhood.scarlet.transition.StylePropertyTransition;
import com.robinhood.utils.AppInitializedListener;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ScarletAppInitializedListener.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B,\b\u0007\u0012\u0019\u0010\u0002\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004¢\u0006\u0002\b\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R!\u0010\u0002\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004¢\u0006\u0002\b\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/ScarletAppInitializedListener;", "Lcom/robinhood/utils/AppInitializedListener;", "transitions", "", "Lcom/robinhood/scarlet/transition/StylePropertyTransition;", "Lkotlin/jvm/JvmSuppressWildcards;", "resources", "Landroid/content/res/Resources;", "<init>", "(Ljava/util/Set;Landroid/content/res/Resources;)V", "onAppInitialized", "", "app", "Landroid/app/Application;", "app-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class ScarletAppInitializedListener implements AppInitializedListener {
    private final Resources resources;
    private final Set<StylePropertyTransition<?, ?>> transitions;

    public ScarletAppInitializedListener(Set<StylePropertyTransition<?, ?>> transitions, Resources resources) {
        Intrinsics.checkNotNullParameter(transitions, "transitions");
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.transitions = transitions;
        this.resources = resources;
    }

    @Override // com.robinhood.utils.AppInitializedListener
    public void onAppInitialized(Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        Scarlet scarlet = Scarlet.INSTANCE;
        AttributeTransitionsRegistry attributeTransitionsRegistryBuild = AttributeTransitionsKt.withDesignSystemDefaults(AttributeTransitionsRegistry.Builder.INSTANCE.withDefaults(this.resources), this.resources).add(this.transitions).markUnsupported(MaterialButton.class, android.R.attr.background).build();
        ContextThemeWrapperBehavior contextThemeWrapperBehavior = ContextThemeWrapperBehavior.REPLACE;
        ExclusionRegistry.Companion companion = ExclusionRegistry.INSTANCE;
        ExclusionRegistry.Builder builder = new ExclusionRegistry.Builder();
        builder.excludeDescendantsOf(TabLayout.TabView.class);
        Unit unit = Unit.INSTANCE;
        ExclusionRegistry exclusionRegistryBuild = builder.build();
        DefStyleRegistry.Companion companion2 = DefStyleRegistry.INSTANCE;
        scarlet.init(attributeTransitionsRegistryBuild, contextThemeWrapperBehavior, exclusionRegistryBuild, new DefStyleRegistry.Builder().build());
    }
}
