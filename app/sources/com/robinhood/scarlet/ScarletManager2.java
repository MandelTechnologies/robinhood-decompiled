package com.robinhood.scarlet;

import android.content.Context;
import android.view.View;
import com.robinhood.android.util.extensions.ViewTags;
import com.robinhood.scarlet.AffectedAttributes;
import com.robinhood.scarlet.registry.AttributeTransitionsRegistry;
import com.robinhood.scarlet.transition.ThemeTransition;
import com.robinhood.scarlet.util.ElementProperties;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.StyleResource;
import com.robinhood.utils.extensions.ContextSystemServices2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: ScarletManager.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\f\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a.\u0010\u0010\u001a\u00020\u0011\"\b\b\u0000\u0010\u0012*\u00020\u0013*\u00020\b2\b\b\u0001\u0010\u0014\u001a\u00020\u00152\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u0002H\u0012\u0018\u00010\u0017\u001a\u001a\u0010\u0018\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0017*\u00020\b2\b\b\u0001\u0010\u0014\u001a\u00020\u0015\u001a\"\u0010\u0019\u001a\u00020\u0011*\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u001c\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\t\"\u001f\u0010\n\u001a\u00020\u000b*\u00020\b8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u001d"}, m3636d2 = {"scarletManager", "Lcom/robinhood/scarlet/ScarletManager;", "Landroid/content/Context;", "getScarletManager", "(Landroid/content/Context;)Lcom/robinhood/scarlet/ScarletManager;", "scarletManager$delegate", "Lkotlin/properties/ReadOnlyProperty;", "scarletManagerOrNull", "Landroid/view/View;", "(Landroid/view/View;)Lcom/robinhood/scarlet/ScarletManager;", "elementProperties", "Lcom/robinhood/scarlet/util/ElementProperties;", "getElementProperties", "(Landroid/view/View;)Lcom/robinhood/scarlet/util/ElementProperties;", "elementProperties$delegate", "Lkotlin/properties/ReadWriteProperty;", "overrideAttribute", "", "T", "", "attribute", "", "reference", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "getAttribute", "overrideStyle", "Lcom/robinhood/scarlet/util/resource/StyleResource;", "applyToAllPossibleAttributes", "", "lib-scarlet_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.scarlet.ScarletManagerKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class ScarletManager2 {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ScarletManager2.class, "scarletManager", "getScarletManager(Landroid/content/Context;)Lcom/robinhood/scarlet/ScarletManager;", 1)), Reflection.property1(new PropertyReference1Impl(ScarletManager2.class, "elementProperties", "getElementProperties(Landroid/view/View;)Lcom/robinhood/scarlet/util/ElementProperties;", 1))};
    private static final Interfaces2 scarletManager$delegate = ContextSystemServices2.INSTANCE.systemService(ScarletManager.SERVICE_NAME);
    private static final Interfaces3 elementProperties$delegate = ViewTags.INSTANCE.property(C37284R.id.tag_scarlet_element_properties, new Function1() { // from class: com.robinhood.scarlet.ScarletManagerKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ScarletManager2.elementProperties_delegate$lambda$0((View) obj);
        }
    });

    public static final ScarletManager getScarletManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (ScarletManager) scarletManager$delegate.getValue(context, $$delegatedProperties[0]);
    }

    public static final ScarletManager scarletManagerOrNull(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (ScarletManager) context.getSystemService(ScarletManager.SERVICE_NAME);
    }

    public static final ScarletManager getScarletManager(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return getScarletManager(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ElementProperties elementProperties_delegate$lambda$0(View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new ElementProperties();
    }

    public static final ElementProperties getElementProperties(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (ElementProperties) elementProperties$delegate.getValue(view, $$delegatedProperties[1]);
    }

    public static final <T> void overrideAttribute(View view, int i, ResourceReferences4<? extends T> resourceReferences4) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ElementProperties elementProperties = getElementProperties(view);
        elementProperties.overrideAttribute(i, resourceReferences4);
        ThemeTransition<Object> themeTransition$lib_scarlet_externalRelease = elementProperties.getThemeTransition$lib_scarlet_externalRelease();
        if (themeTransition$lib_scarlet_externalRelease != null) {
            themeTransition$lib_scarlet_externalRelease.applyTo(view, elementProperties, getScarletManager(view).getCurrentThemeNode());
        }
    }

    public static final ResourceReferences4<?> getAttribute(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return getElementProperties(view).getAttribute(i);
    }

    public static /* synthetic */ void overrideStyle$default(View view, ResourceReferences4 resourceReferences4, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        overrideStyle(view, resourceReferences4, z);
    }

    public static final void overrideStyle(View view, ResourceReferences4<StyleResource> reference, boolean z) {
        ThemeTransition<Object> themeTransition$lib_scarlet_externalRelease;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(reference, "reference");
        ElementProperties elementProperties = getElementProperties(view);
        elementProperties.setStyleReference$lib_scarlet_externalRelease(reference);
        if (z) {
            themeTransition$lib_scarlet_externalRelease = Scarlet.INSTANCE.getAttributeTransitionsRegistry$lib_scarlet_externalRelease().getAttributeTransitionSet((AttributeTransitionsRegistry) view, (AffectedAttributes) AffectedAttributes.Everything.INSTANCE);
        } else {
            themeTransition$lib_scarlet_externalRelease = elementProperties.getThemeTransition$lib_scarlet_externalRelease();
        }
        if (themeTransition$lib_scarlet_externalRelease != null) {
            themeTransition$lib_scarlet_externalRelease.applyTo(view, elementProperties, getScarletManager(view).getCurrentThemeNode());
        }
    }
}
