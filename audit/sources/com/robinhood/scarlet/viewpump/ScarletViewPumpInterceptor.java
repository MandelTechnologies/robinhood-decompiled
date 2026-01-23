package com.robinhood.scarlet.viewpump;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.robinhood.android.common.util.TransitionReason;
import com.robinhood.scarlet.AffectedAttributes;
import com.robinhood.scarlet.C37284R;
import com.robinhood.scarlet.ContextThemeWrapperBehavior;
import com.robinhood.scarlet.Scarlet;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.UnexpectedContextThemeWrapperException;
import com.robinhood.scarlet.registry.AttributeTransitionsRegistry;
import com.robinhood.scarlet.res.ResourceArray;
import com.robinhood.scarlet.res.ResourceArray2;
import com.robinhood.scarlet.transition.ThemeTransitionSet;
import com.robinhood.scarlet.util.ContextThemeWrappers;
import com.robinhood.scarlet.util.ElementProperties;
import com.robinhood.scarlet.util.resource.AttributeSets;
import com.robinhood.scarlet.util.resource.BoxedResourceReference;
import com.robinhood.scarlet.util.resource.DirectResourceReference;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.StyleResource;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.TypedArrays3;
import io.github.inflationx.viewpump.InflateRequest;
import io.github.inflationx.viewpump.InflateResult;
import io.github.inflationx.viewpump.Interceptor;
import java.util.List;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: ScarletViewPumpInterceptor.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002&'B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0016\u0010\u0013\u001a\u00020\u0012*\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J*\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002J\f\u0010 \u001a\u00020!*\u00020\u0012H\u0002J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0018\u00010\u0007R\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u00060\u0007R\u00020\b*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0014\u001a\u00020\u0015*\u00020\u00168Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0017¨\u0006("}, m3636d2 = {"Lcom/robinhood/scarlet/viewpump/ScarletViewPumpInterceptor;", "Lio/github/inflationx/viewpump/Interceptor;", "<init>", "()V", "XMLNS_ANDROID", "", "_emptyTheme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "emptyTheme", "getEmptyTheme", "(Landroid/content/res/Resources;)Landroid/content/res/Resources$Theme;", "themeAttributes", "", "replaceContextThemeWrapper", "Lcom/robinhood/scarlet/ScarletContextWrapper;", "Lcom/robinhood/scarlet/ScarletManager$AnimationMode;", "request", "Lio/github/inflationx/viewpump/InflateRequest;", "transform", "isThemeWrapper", "", "Landroid/content/ContextWrapper;", "(Landroid/content/ContextWrapper;)Z", "determineThemeReference", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "Lcom/robinhood/scarlet/util/resource/StyleResource;", "originalContext", "Landroid/content/Context;", "tagName", "attrs", "Landroid/util/AttributeSet;", "readParameters", "Lcom/robinhood/scarlet/viewpump/ScarletViewPumpInterceptor$Parameters;", "intercept", "Lio/github/inflationx/viewpump/InflateResult;", TransitionReason.OPTION_TRADE_CHAIN, "Lio/github/inflationx/viewpump/Interceptor$Chain;", "Parameters", "ViewAttachStateRegistrationManager", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class ScarletViewPumpInterceptor implements Interceptor {
    private static final String XMLNS_ANDROID = "http://schemas.android.com/apk/res/android";
    private static Resources.Theme _emptyTheme;
    public static final ScarletViewPumpInterceptor INSTANCE = new ScarletViewPumpInterceptor();
    private static final int[] themeAttributes = {R.attr.theme};
    public static final int $stable = 8;

    /* compiled from: ScarletViewPumpInterceptor.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ContextThemeWrapperBehavior.values().length];
            try {
                iArr[ContextThemeWrapperBehavior.THROW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContextThemeWrapperBehavior.IGNORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ContextThemeWrapperBehavior.REPLACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private ScarletViewPumpInterceptor() {
    }

    private final Resources.Theme getEmptyTheme(Resources resources) {
        Resources.Theme theme = _emptyTheme;
        if (theme != null) {
            return theme;
        }
        Resources.Theme themeNewTheme = resources.newTheme();
        _emptyTheme = themeNewTheme;
        Intrinsics.checkNotNullExpressionValue(themeNewTheme, "also(...)");
        return themeNewTheme;
    }

    private final ScarletContextWrapper replaceContextThemeWrapper(ScarletManager.AnimationMode animationMode, InflateRequest inflateRequest) throws UnexpectedContextThemeWrapperException {
        ContextWrapper contextWrapper;
        boolean z;
        Context context = inflateRequest.getContext();
        AttributeSet attrs = inflateRequest.getAttrs();
        DirectResourceReference directResourceReference = null;
        ResourceReferences4<StyleResource> resourceReferences4DetermineThemeReference = attrs != null ? INSTANCE.determineThemeReference(context, inflateRequest.getName(), attrs) : null;
        if ((context instanceof ContextWrapper) && ((((z = (contextWrapper = (ContextWrapper) context) instanceof ContextThemeWrapper)) || (contextWrapper instanceof androidx.appcompat.view.ContextThemeWrapper)) && !(contextWrapper instanceof Activity))) {
            if (resourceReferences4DetermineThemeReference == null) {
                int i = WhenMappings.$EnumSwitchMapping$0[Scarlet.INSTANCE.getContextThemeWrapperBehavior$lib_scarlet_externalRelease().ordinal()];
                if (i == 1) {
                    throw new UnexpectedContextThemeWrapperException(inflateRequest);
                }
                if (i == 2) {
                    return null;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (z) {
                    Integer themeResId = ContextThemeWrappers.getThemeResId((ContextThemeWrapper) context);
                    if (themeResId != null) {
                        directResourceReference = new DirectResourceReference(ResourceType.STYLE.INSTANCE, themeResId.intValue());
                    }
                } else if (contextWrapper instanceof androidx.appcompat.view.ContextThemeWrapper) {
                    Integer numValueOf = Integer.valueOf(((androidx.appcompat.view.ContextThemeWrapper) context).getThemeResId());
                    if (numValueOf.intValue() == 0) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        directResourceReference = new DirectResourceReference(ResourceType.STYLE.INSTANCE, numValueOf.intValue());
                    }
                } else {
                    throw new AssertionError();
                }
                resourceReferences4DetermineThemeReference = directResourceReference;
            }
            context = contextWrapper.getBaseContext();
        } else if (resourceReferences4DetermineThemeReference == null) {
            return null;
        }
        Intrinsics.checkNotNull(context);
        if (animationMode == null) {
            animationMode = ScarletManager.AnimationMode.ANIMATED_AND_INHERIT;
        }
        return new ScarletContextWrapper(context, animationMode, resourceReferences4DetermineThemeReference);
    }

    private final InflateRequest transform(ScarletManager.AnimationMode animationMode, InflateRequest inflateRequest) throws UnexpectedContextThemeWrapperException {
        ScarletContextWrapper scarletContextWrapperReplaceContextThemeWrapper = replaceContextThemeWrapper(animationMode, inflateRequest);
        if (scarletContextWrapperReplaceContextThemeWrapper != null) {
            return inflateRequest.toBuilder().context(scarletContextWrapperReplaceContextThemeWrapper).build();
        }
        if (animationMode == null) {
            return inflateRequest;
        }
        return inflateRequest.toBuilder().context(new ScarletContextWrapper(inflateRequest.getContext(), animationMode, null, 4, null)).build();
    }

    private final boolean isThemeWrapper(ContextWrapper contextWrapper) {
        return ((contextWrapper instanceof ContextThemeWrapper) || (contextWrapper instanceof androidx.appcompat.view.ContextThemeWrapper)) && !(contextWrapper instanceof Activity);
    }

    private final ResourceReferences4<StyleResource> determineThemeReference(Context originalContext, String tagName, AttributeSet attrs) throws Resources.NotFoundException {
        ResourceReferences4 resourceReferences4From;
        Integer styleAttributeOrNull;
        String attributeValue;
        Resources resources = originalContext.getResources();
        if (attrs != null && (attributeValue = attrs.getAttributeValue(XMLNS_ANDROID, "theme")) != null) {
            if (StringsKt.startsWith$default(attributeValue, "@", false, 2, (Object) null)) {
                ResourceType.STYLE style = ResourceType.STYLE.INSTANCE;
                String strSubstring = attributeValue.substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return new DirectResourceReference(style, Integer.parseInt(strSubstring));
            }
            if (StringsKt.startsWith$default(attributeValue, "?", false, 2, (Object) null)) {
                ResourceType.STYLE style2 = ResourceType.STYLE.INSTANCE;
                String strSubstring2 = attributeValue.substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                return new ThemedResourceReference(style2, Integer.parseInt(strSubstring2));
            }
            Preconditions.INSTANCE.failUnexpectedItemKotlin(attributeValue);
            throw new ExceptionsH();
        }
        if (attrs == null || (styleAttributeOrNull = AttributeSets.getStyleAttributeOrNull(attrs)) == null) {
            resourceReferences4From = null;
        } else {
            int iIntValue = styleAttributeOrNull.intValue();
            ResourceReferences4.Companion companion = ResourceReferences4.INSTANCE;
            Intrinsics.checkNotNull(resources);
            resourceReferences4From = companion.from(resources, ResourceType.STYLE.INSTANCE, iIntValue);
        }
        List<ResourceReferences4<StyleResource>> forLayoutTag = Scarlet.INSTANCE.getDefStyleRegistry$lib_scarlet_externalRelease().getForLayoutTag(tagName, attrs);
        if (resourceReferences4From == null && forLayoutTag.isEmpty()) {
            return null;
        }
        Resources.Theme theme = originalContext.getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
        ResourceArray resourceArrayObtainStyledResources = ResourceArray2.obtainStyledResources(theme, themeAttributes, resourceReferences4From, forLayoutTag);
        try {
            if (resourceArrayObtainStyledResources.getResource(0) != null) {
                return new BoxedResourceReference(ResourceType.STYLE.INSTANCE, R.attr.theme, resourceReferences4From, forLayoutTag);
            }
            return null;
        } finally {
            resourceArrayObtainStyledResources.recycle();
        }
    }

    /* compiled from: ScarletViewPumpInterceptor.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B1\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\u0004\u0018\u0001`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\u0004\u0018\u0001`\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0015\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\u0004\u0018\u0001`\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\u0004\u0018\u0001`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/scarlet/viewpump/ScarletViewPumpInterceptor$Parameters;", "", "styleAttribute", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "Lcom/robinhood/scarlet/util/resource/StyleResource;", "Lcom/robinhood/scarlet/util/resource/StyleReference;", "childContextAnimationMode", "Lcom/robinhood/scarlet/ScarletManager$AnimationMode;", "affectedAttributes", "Lcom/robinhood/scarlet/AffectedAttributes;", "<init>", "(Lcom/robinhood/scarlet/util/resource/ResourceReference;Lcom/robinhood/scarlet/ScarletManager$AnimationMode;Lcom/robinhood/scarlet/AffectedAttributes;)V", "getStyleAttribute", "()Lcom/robinhood/scarlet/util/resource/ResourceReference;", "getChildContextAnimationMode", "()Lcom/robinhood/scarlet/ScarletManager$AnimationMode;", "getAffectedAttributes", "()Lcom/robinhood/scarlet/AffectedAttributes;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final /* data */ class Parameters {
        private final AffectedAttributes affectedAttributes;
        private final ScarletManager.AnimationMode childContextAnimationMode;
        private final ResourceReferences4<StyleResource> styleAttribute;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Parameters copy$default(Parameters parameters, ResourceReferences4 resourceReferences4, ScarletManager.AnimationMode animationMode, AffectedAttributes affectedAttributes, int i, Object obj) {
            if ((i & 1) != 0) {
                resourceReferences4 = parameters.styleAttribute;
            }
            if ((i & 2) != 0) {
                animationMode = parameters.childContextAnimationMode;
            }
            if ((i & 4) != 0) {
                affectedAttributes = parameters.affectedAttributes;
            }
            return parameters.copy(resourceReferences4, animationMode, affectedAttributes);
        }

        public final ResourceReferences4<StyleResource> component1() {
            return this.styleAttribute;
        }

        /* renamed from: component2, reason: from getter */
        public final ScarletManager.AnimationMode getChildContextAnimationMode() {
            return this.childContextAnimationMode;
        }

        /* renamed from: component3, reason: from getter */
        public final AffectedAttributes getAffectedAttributes() {
            return this.affectedAttributes;
        }

        public final Parameters copy(ResourceReferences4<StyleResource> styleAttribute, ScarletManager.AnimationMode childContextAnimationMode, AffectedAttributes affectedAttributes) {
            return new Parameters(styleAttribute, childContextAnimationMode, affectedAttributes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Parameters)) {
                return false;
            }
            Parameters parameters = (Parameters) other;
            return Intrinsics.areEqual(this.styleAttribute, parameters.styleAttribute) && this.childContextAnimationMode == parameters.childContextAnimationMode && Intrinsics.areEqual(this.affectedAttributes, parameters.affectedAttributes);
        }

        public int hashCode() {
            ResourceReferences4<StyleResource> resourceReferences4 = this.styleAttribute;
            int iHashCode = (resourceReferences4 == null ? 0 : resourceReferences4.hashCode()) * 31;
            ScarletManager.AnimationMode animationMode = this.childContextAnimationMode;
            int iHashCode2 = (iHashCode + (animationMode == null ? 0 : animationMode.hashCode())) * 31;
            AffectedAttributes affectedAttributes = this.affectedAttributes;
            return iHashCode2 + (affectedAttributes != null ? affectedAttributes.hashCode() : 0);
        }

        public String toString() {
            return "Parameters(styleAttribute=" + this.styleAttribute + ", childContextAnimationMode=" + this.childContextAnimationMode + ", affectedAttributes=" + this.affectedAttributes + ")";
        }

        public Parameters(ResourceReferences4<StyleResource> resourceReferences4, ScarletManager.AnimationMode animationMode, AffectedAttributes affectedAttributes) {
            this.styleAttribute = resourceReferences4;
            this.childContextAnimationMode = animationMode;
            this.affectedAttributes = affectedAttributes;
        }

        public final ResourceReferences4<StyleResource> getStyleAttribute() {
            return this.styleAttribute;
        }

        public final ScarletManager.AnimationMode getChildContextAnimationMode() {
            return this.childContextAnimationMode;
        }

        public final AffectedAttributes getAffectedAttributes() {
            return this.affectedAttributes;
        }
    }

    private final Parameters readParameters(InflateRequest inflateRequest) throws Resources.NotFoundException {
        ResourceReferences4 resourceReferences4From;
        Integer styleAttributeOrNull;
        Context context = inflateRequest.getContext();
        AttributeSet attrs = inflateRequest.getAttrs();
        int[] View = C37284R.styleable.View;
        Intrinsics.checkNotNullExpressionValue(View, "View");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, View, 0, 0);
        AttributeSet attrs2 = inflateRequest.getAttrs();
        if (attrs2 == null || (styleAttributeOrNull = AttributeSets.getStyleAttributeOrNull(attrs2)) == null) {
            resourceReferences4From = null;
        } else {
            int iIntValue = styleAttributeOrNull.intValue();
            ResourceReferences4.Companion companion = ResourceReferences4.INSTANCE;
            Resources resources = typedArrayObtainStyledAttributes.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            resourceReferences4From = companion.from(resources, ResourceType.STYLE.INSTANCE, iIntValue);
        }
        Integer intOrNull = TypedArrays3.getIntOrNull(typedArrayObtainStyledAttributes, C37284R.styleable.View_scarlet_childContext);
        ScarletManager.AnimationMode animationModeFromOrdinal = intOrNull != null ? ScarletManager.AnimationMode.INSTANCE.fromOrdinal(intOrNull.intValue()) : null;
        String string2 = typedArrayObtainStyledAttributes.getString(C37284R.styleable.View_scarlet_affectedAttributes);
        return new Parameters(resourceReferences4From, animationModeFromOrdinal, string2 != null ? AffectedAttributes.INSTANCE.parse(string2) : null);
    }

    @Override // io.github.inflationx.viewpump.Interceptor
    public InflateResult intercept(Interceptor.Chain chain) throws Resources.NotFoundException {
        ElementProperties elementProperties;
        Intrinsics.checkNotNullParameter(chain, "chain");
        InflateRequest request = chain.getRequest();
        Scarlet scarlet = Scarlet.INSTANCE;
        if (scarlet.getExclusionRegistry$lib_scarlet_externalRelease().shouldBeExcluded(request)) {
            InflateResult inflateResultProceed = chain.proceed(request);
            View view = inflateResultProceed.getView();
            if (view != null && (elementProperties = ScarletManager2.getElementProperties(view)) != null) {
                elementProperties.setExcluded$lib_scarlet_externalRelease(true);
            }
            return inflateResultProceed;
        }
        Parameters parameters = readParameters(request);
        InflateResult inflateResultProceed2 = chain.proceed(transform(parameters.getChildContextAnimationMode(), request));
        ResourceReferences4<StyleResource> styleAttribute = parameters.getStyleAttribute();
        View view2 = inflateResultProceed2.getView();
        if (view2 != null) {
            ThemeTransitionSet attributeTransitionSet = scarlet.getAttributeTransitionsRegistry$lib_scarlet_externalRelease().getAttributeTransitionSet((AttributeTransitionsRegistry) view2, parameters.getAffectedAttributes());
            List<ResourceReferences4<StyleResource>> forView = scarlet.getDefStyleRegistry$lib_scarlet_externalRelease().getForView(view2);
            ElementProperties elementProperties2 = ScarletManager2.getElementProperties(view2);
            Intrinsics.checkNotNull(attributeTransitionSet, "null cannot be cast to non-null type com.robinhood.scarlet.transition.ThemeTransition<kotlin.Any>");
            elementProperties2.setThemeTransition$lib_scarlet_externalRelease(attributeTransitionSet);
            if (elementProperties2.getStyleReference$lib_scarlet_externalRelease() == null) {
                elementProperties2.setStyleReference$lib_scarlet_externalRelease(styleAttribute);
            }
            elementProperties2.setDefStyle$lib_scarlet_externalRelease(forView);
            Resources resources = view2.getResources();
            if (resources == null) {
                resources = view2.getContext().getResources();
            }
            ScarletViewPumpInterceptor scarletViewPumpInterceptor = INSTANCE;
            Intrinsics.checkNotNull(resources);
            attributeTransitionSet.loadValues(scarletViewPumpInterceptor.getEmptyTheme(resources), inflateResultProceed2.getAttrs(), elementProperties2.getInflatedAttributes$lib_scarlet_externalRelease());
            view2.addOnAttachStateChangeListener(ViewAttachStateRegistrationManager.INSTANCE);
        }
        return inflateResultProceed2;
    }

    /* compiled from: ScarletViewPumpInterceptor.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/scarlet/viewpump/ScarletViewPumpInterceptor$ViewAttachStateRegistrationManager;", "Landroid/view/View$OnAttachStateChangeListener;", "<init>", "()V", "onViewAttachedToWindow", "", "view", "Landroid/view/View;", "onViewDetachedFromWindow", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class ViewAttachStateRegistrationManager implements View.OnAttachStateChangeListener {
        public static final ViewAttachStateRegistrationManager INSTANCE = new ViewAttachStateRegistrationManager();

        private ViewAttachStateRegistrationManager() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.refreshDrawableState();
            ScarletManager2.getScarletManager(view).register(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            ScarletManager2.getScarletManager(view).unregister(view);
        }
    }
}
