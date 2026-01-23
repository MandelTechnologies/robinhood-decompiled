package com.robinhood.scarlet;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.SparseArray;
import android.view.View;
import androidx.core.util.SparseArray2;
import androidx.tracing.Trace;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.navigation.compose.NavTransition2;
import com.robinhood.android.util.collections.WeakHashSet;
import com.robinhood.scarlet.transition.ThemeTransition;
import com.robinhood.scarlet.transition.window.WindowBackgroundColorTransition;
import com.robinhood.scarlet.util.ElementProperties;
import com.robinhood.scarlet.util.SparseArrays;
import com.robinhood.scarlet.util.ThemeNode;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.StyleResource;
import com.robinhood.utils.extensions.AnimatorSetBuilder;
import io.reactivex.Observable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ScarletManager.kt */
@Metadata(m3635d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b!\b\u0007\u0018\u0000 n2\u00020\u0001:\u0002mnB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u0000H\u0002J\u000e\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u0011J\u000e\u0010D\u001a\u00020B2\u0006\u0010C\u001a\u00020\u0011J\u0012\u0010E\u001a\u00020B2\n\u0010F\u001a\u000606R\u000207J5\u0010G\u001a\u00020B2\u0006\u0010H\u001a\u00020I2\u0014\u0010J\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\"2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010?¢\u0006\u0002\u0010LJ!\u0010G\u001a\u00020B2\u0006\u0010M\u001a\u00020N2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010?H\u0007¢\u0006\u0002\u0010OJ\u0011\u0010P\u001a\u00020?2\u0006\u0010M\u001a\u00020NH\u0086\u0002J!\u0010Q\u001a\u00020B2\u0006\u0010H\u001a\u00020I2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010?H\u0007¢\u0006\u0002\u0010RJ\u0016\u0010S\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\"0!J\u001e\u0010T\u001a\u00020B2\u0016\u0010U\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\"0!J%\u0010V\u001a\u00020B2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020&0%2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010?¢\u0006\u0002\u0010XJ\u0014\u0010Y\u001a\u00020B2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020&0%J1\u0010Z\u001a\u00020B2\b\b\u0001\u0010[\u001a\u00020I2\u000e\u0010\\\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\n\b\u0002\u0010K\u001a\u0004\u0018\u00010?¢\u0006\u0002\u0010LJ-\u0010]\u001a\u00020B2\b\b\u0002\u0010^\u001a\u00020\u00162\n\b\u0002\u0010K\u001a\u0004\u0018\u00010?2\b\b\u0002\u0010_\u001a\u00020?H\u0002¢\u0006\u0002\u0010`J\u0018\u0010a\u001a\u00020B2\u0006\u0010^\u001a\u00020\u00162\u0006\u0010b\u001a\u00020\u0016H\u0002J\u0010\u0010c\u001a\u00020B2\u0006\u0010d\u001a\u00020\u0016H\u0002J\u0017\u0010e\u001a\u00020B2\b\u0010K\u001a\u0004\u0018\u00010?H\u0002¢\u0006\u0002\u0010fJ'\u0010g\u001a\u00020B2\u0006\u0010h\u001a\u00020\u00162\u0006\u0010i\u001a\u00020\u00052\b\u0010K\u001a\u0004\u0018\u00010?H\u0002¢\u0006\u0002\u0010jJ\b\u0010k\u001a\u00020BH\u0002J\b\u0010l\u001a\u00020\u0016H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0018R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\"0!X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R4\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R(\u0010.\u001a\u0004\u0018\u00010&2\b\u0010)\u001a\u0004\u0018\u00010&@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0011\u00103\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b4\u0010\u0018R\u0015\u00105\u001a\u000606R\u0002078F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0017\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00160;8F¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006o"}, m3636d2 = {"Lcom/robinhood/scarlet/ScarletManager;", "", "context", "Landroid/content/Context;", "animationMode", "Lcom/robinhood/scarlet/ScarletManager$AnimationMode;", "rootOverlay", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "Lcom/robinhood/scarlet/util/resource/StyleResource;", "<init>", "(Landroid/content/Context;Lcom/robinhood/scarlet/ScarletManager$AnimationMode;Lcom/robinhood/scarlet/util/resource/ResourceReference;)V", "getAnimationMode", "()Lcom/robinhood/scarlet/ScarletManager$AnimationMode;", "setAnimationMode", "(Lcom/robinhood/scarlet/ScarletManager$AnimationMode;)V", "registeredViews", "Lcom/robinhood/android/util/collections/WeakHashSet;", "Landroid/view/View;", "children", "themeAnimator", "Landroid/animation/Animator;", "contextThemeNode", "Lcom/robinhood/scarlet/util/ThemeNode;", "getContextThemeNode", "()Lcom/robinhood/scarlet/util/ThemeNode;", "contextThemeNode$delegate", "Lkotlin/Lazy;", "_baseThemeNode", "baseThemeNode", "getBaseThemeNode", "_currentThemeNode", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "overlays", "Landroid/util/SparseArray;", "Lcom/robinhood/scarlet/util/resource/StyleReference;", "activityThemeTransitions", "", "Lcom/robinhood/scarlet/transition/ThemeTransition;", "Landroid/app/Activity;", "activityElementProperties", "Lcom/robinhood/scarlet/util/ElementProperties;", "value", "getRootOverlay", "()Lcom/robinhood/scarlet/util/resource/ResourceReference;", "setRootOverlay", "(Lcom/robinhood/scarlet/util/resource/ResourceReference;)V", "activity", "getActivity", "()Landroid/app/Activity;", "setActivity", "(Landroid/app/Activity;)V", "currentThemeNode", "getCurrentThemeNode", "currentTheme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "getCurrentTheme", "()Landroid/content/res/Resources$Theme;", "themeChanges", "Lio/reactivex/Observable;", "getThemeChanges", "()Lio/reactivex/Observable;", "registerChild", "", "scarletManager", "register", "", "view", "unregister", "initBaseTheme", "theme", "putOverlay", "priority", "", "styleReference", "overrideAnimated", "(ILcom/robinhood/scarlet/util/resource/ResourceReference;Ljava/lang/Boolean;)V", "overlay", "Lcom/robinhood/scarlet/ScarletOverlay;", "(Lcom/robinhood/scarlet/ScarletOverlay;Ljava/lang/Boolean;)V", "contains", "removeOverlay", "(ILjava/lang/Boolean;)V", "dumpOverlays", "loadOverlays", "styles", "addActivityThemeTransition", NavTransition2.KEY_TRANSITION, "(Lcom/robinhood/scarlet/transition/ThemeTransition;Ljava/lang/Boolean;)V", "removeActivityThemeTransition", "overrideActivityAttribute", "attrResId", "reference", "applyChanges", "previousThemeNode", "force", "(Lcom/robinhood/scarlet/util/ThemeNode;Ljava/lang/Boolean;Z)V", "animateThemeChange", "newTheme", "applyImmediateThemeChange", "newThemeNode", "propagateThemeChange", "(Ljava/lang/Boolean;)V", "notifyParentThemeChange", "parentThemeNode", "parentAnimationMode", "(Lcom/robinhood/scarlet/util/ThemeNode;Lcom/robinhood/scarlet/ScarletManager$AnimationMode;Ljava/lang/Boolean;)V", "cancelCurrentAnimator", "obtainThemeNode", "AnimationMode", "Companion", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class ScarletManager {

    @JvmField
    public static final String SERVICE_NAME;
    private ThemeNode _baseThemeNode;
    private final BehaviorRelay<ThemeNode> _currentThemeNode;
    private Activity activity;
    private final ElementProperties activityElementProperties;
    private List<? extends ThemeTransition<? super Activity>> activityThemeTransitions;
    private AnimationMode animationMode;
    private final WeakHashSet<ScarletManager> children;
    private final Context context;

    /* renamed from: contextThemeNode$delegate, reason: from kotlin metadata */
    private final Lazy contextThemeNode;
    private final SparseArray<ResourceReferences4<StyleResource>> overlays;
    private final WeakHashSet<View> registeredViews;
    private ResourceReferences4<StyleResource> rootOverlay;
    private Animator themeAnimator;
    public static final int $stable = 8;

    @JvmOverloads
    public final void putOverlay(ScarletOverlay overlay) {
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        putOverlay$default(this, overlay, null, 2, null);
    }

    @JvmOverloads
    public final void removeOverlay(int i) {
        removeOverlay$default(this, i, null, 2, null);
    }

    public ScarletManager(Context context, AnimationMode animationMode, ResourceReferences4<StyleResource> resourceReferences4) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(animationMode, "animationMode");
        this.context = context;
        this.animationMode = animationMode;
        this.registeredViews = new WeakHashSet<>();
        this.children = new WeakHashSet<>();
        this.contextThemeNode = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.robinhood.scarlet.ScarletManager$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ScarletManager.contextThemeNode_delegate$lambda$0(this.f$0);
            }
        });
        BehaviorRelay<ThemeNode> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this._currentThemeNode = behaviorRelayCreate;
        this.overlays = new SparseArray<>();
        this.activityThemeTransitions = CollectionsKt.listOf(WindowBackgroundColorTransition.INSTANCE);
        this.activityElementProperties = new ElementProperties();
        if (resourceReferences4 != null) {
            behaviorRelayCreate.accept(getContextThemeNode().get(resourceReferences4));
        }
        this.rootOverlay = resourceReferences4;
        ScarletManager scarletManager = (ScarletManager) context.getSystemService(SERVICE_NAME);
        if (scarletManager != null) {
            scarletManager.registerChild(this);
            this._baseThemeNode = scarletManager.getCurrentThemeNode();
        }
    }

    public /* synthetic */ ScarletManager(Context context, AnimationMode animationMode, ResourceReferences4 resourceReferences4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? AnimationMode.ANIMATED_AND_INHERIT : animationMode, (i & 4) != 0 ? null : resourceReferences4);
    }

    public final AnimationMode getAnimationMode() {
        return this.animationMode;
    }

    public final void setAnimationMode(AnimationMode animationMode) {
        Intrinsics.checkNotNullParameter(animationMode, "<set-?>");
        this.animationMode = animationMode;
    }

    private final ThemeNode getContextThemeNode() {
        return (ThemeNode) this.contextThemeNode.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ThemeNode.Root contextThemeNode_delegate$lambda$0(ScarletManager scarletManager) {
        Resources.Theme theme = scarletManager.context.getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
        return new ThemeNode.Root(theme);
    }

    private final ThemeNode getBaseThemeNode() {
        ThemeNode themeNode = this._baseThemeNode;
        return themeNode == null ? getContextThemeNode() : themeNode;
    }

    public final ResourceReferences4<StyleResource> getRootOverlay() {
        return this.rootOverlay;
    }

    public final void setRootOverlay(ResourceReferences4<StyleResource> resourceReferences4) {
        this.rootOverlay = resourceReferences4;
        applyChanges$default(this, null, null, false, 7, null);
    }

    public final Activity getActivity() {
        return this.activity;
    }

    public final void setActivity(Activity activity) {
        this.activity = activity;
        applyChanges$default(this, getCurrentThemeNode(), Boolean.FALSE, false, 4, null);
    }

    public final ThemeNode getCurrentThemeNode() {
        ThemeNode value = this._currentThemeNode.getValue();
        return value == null ? getBaseThemeNode() : value;
    }

    public final Resources.Theme getCurrentTheme() {
        return getCurrentThemeNode().getTheme$lib_scarlet_externalRelease();
    }

    public final Observable<ThemeNode> getThemeChanges() {
        if (this._currentThemeNode.hasValue()) {
            return this._currentThemeNode;
        }
        Observable<ThemeNode> observableStartWith = this._currentThemeNode.startWith((BehaviorRelay<ThemeNode>) getBaseThemeNode());
        Intrinsics.checkNotNull(observableStartWith);
        return observableStartWith;
    }

    private final boolean registerChild(ScarletManager scarletManager) {
        return this.children.add(scarletManager);
    }

    public final void register(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ElementProperties elementProperties = ScarletManager2.getElementProperties(view);
        ThemeTransition<Object> themeTransition$lib_scarlet_externalRelease = elementProperties.getThemeTransition$lib_scarlet_externalRelease();
        if (themeTransition$lib_scarlet_externalRelease != null) {
            themeTransition$lib_scarlet_externalRelease.applyTo(view, elementProperties, getCurrentThemeNode());
        }
        this.registeredViews.add(view);
    }

    public final void unregister(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.registeredViews.remove(view);
    }

    public final void initBaseTheme(Resources.Theme theme) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        this._baseThemeNode = new ThemeNode.Root(theme);
        applyChanges$default(this, getCurrentThemeNode(), Boolean.FALSE, false, 4, null);
    }

    public static /* synthetic */ void putOverlay$default(ScarletManager scarletManager, int i, ResourceReferences4 resourceReferences4, Boolean bool, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            bool = null;
        }
        scarletManager.putOverlay(i, resourceReferences4, bool);
    }

    public final void putOverlay(int priority, ResourceReferences4<StyleResource> styleReference, Boolean overrideAnimated) {
        if (Intrinsics.areEqual(this.overlays.get(priority), styleReference)) {
            return;
        }
        if (styleReference == null) {
            this.overlays.remove(priority);
        } else {
            this.overlays.put(priority, styleReference);
        }
        applyChanges$default(this, null, overrideAnimated, false, 5, null);
    }

    public static /* synthetic */ void putOverlay$default(ScarletManager scarletManager, ScarletOverlay scarletOverlay, Boolean bool, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = null;
        }
        scarletManager.putOverlay(scarletOverlay, bool);
    }

    @JvmOverloads
    public final void putOverlay(ScarletOverlay overlay, Boolean overrideAnimated) {
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        putOverlay(overlay.getPriority(), overlay.getStyleReference(), overrideAnimated);
    }

    public final boolean contains(ScarletOverlay overlay) {
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        return Intrinsics.areEqual(this.overlays.get(overlay.getPriority()), overlay.getStyleReference());
    }

    public static /* synthetic */ void removeOverlay$default(ScarletManager scarletManager, int i, Boolean bool, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            bool = null;
        }
        scarletManager.removeOverlay(i, bool);
    }

    @JvmOverloads
    public final void removeOverlay(int priority, Boolean overrideAnimated) {
        putOverlay(priority, null, overrideAnimated);
    }

    public final SparseArray<ResourceReferences4<StyleResource>> dumpOverlays() {
        SparseArray<ResourceReferences4<StyleResource>> sparseArrayClone = this.overlays.clone();
        Intrinsics.checkNotNullExpressionValue(sparseArrayClone, "clone(...)");
        return sparseArrayClone;
    }

    public final void loadOverlays(SparseArray<ResourceReferences4<StyleResource>> styles) {
        Intrinsics.checkNotNullParameter(styles, "styles");
        if (SparseArrays.deepEquals(this.overlays, styles)) {
            return;
        }
        this.overlays.clear();
        SparseArray2.putAll(this.overlays, styles);
        applyChanges$default(this, null, Boolean.FALSE, false, 5, null);
    }

    public static /* synthetic */ void addActivityThemeTransition$default(ScarletManager scarletManager, ThemeTransition themeTransition, Boolean bool, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = null;
        }
        scarletManager.addActivityThemeTransition(themeTransition, bool);
    }

    public final void addActivityThemeTransition(ThemeTransition<? super Activity> transition, Boolean overrideAnimated) {
        Intrinsics.checkNotNullParameter(transition, "transition");
        if (this.activityThemeTransitions.contains(transition)) {
            return;
        }
        this.activityThemeTransitions = CollectionsKt.plus((Collection<? extends ThemeTransition<? super Activity>>) this.activityThemeTransitions, transition);
        applyChanges$default(this, null, overrideAnimated, true, 1, null);
    }

    public final void removeActivityThemeTransition(ThemeTransition<? super Activity> transition) {
        Intrinsics.checkNotNullParameter(transition, "transition");
        this.activityThemeTransitions = CollectionsKt.minus(this.activityThemeTransitions, transition);
    }

    public static /* synthetic */ void overrideActivityAttribute$default(ScarletManager scarletManager, int i, ResourceReferences4 resourceReferences4, Boolean bool, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            bool = null;
        }
        scarletManager.overrideActivityAttribute(i, resourceReferences4, bool);
    }

    public final void overrideActivityAttribute(int attrResId, ResourceReferences4<? extends Object> reference, Boolean overrideAnimated) {
        this.activityElementProperties.overrideAttribute(attrResId, reference);
        applyChanges$default(this, null, overrideAnimated, true, 1, null);
    }

    static /* synthetic */ void applyChanges$default(ScarletManager scarletManager, ThemeNode themeNode, Boolean bool, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            themeNode = scarletManager.getCurrentThemeNode();
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        scarletManager.applyChanges(themeNode, bool, z);
    }

    private final void applyChanges(ThemeNode previousThemeNode, Boolean overrideAnimated, boolean force) {
        Trace.beginSection("ScarletManager.applyChanges");
        try {
            ThemeNode themeNodeObtainThemeNode = obtainThemeNode();
            if (!Intrinsics.areEqual(themeNodeObtainThemeNode, previousThemeNode) || force) {
                cancelCurrentAnimator();
                this._currentThemeNode.accept(themeNodeObtainThemeNode);
                if (Intrinsics.areEqual(overrideAnimated, Boolean.TRUE) || (overrideAnimated == null && getAnimationMode().getIsAnimationEnabled())) {
                    animateThemeChange(previousThemeNode, themeNodeObtainThemeNode);
                } else {
                    applyImmediateThemeChange(themeNodeObtainThemeNode);
                }
                propagateThemeChange(overrideAnimated);
            }
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateThemeChange(ThemeNode previousThemeNode, ThemeNode newTheme) {
        Animator animatorCreateAnimator;
        Trace.beginSection("ScarletManager.animateThemeChange");
        try {
            AnimatorSetBuilder animatorSetBuilder = new AnimatorSetBuilder();
            for (View view : this.registeredViews) {
                ElementProperties elementProperties = ScarletManager2.getElementProperties(view);
                ThemeTransition<Object> themeTransition$lib_scarlet_externalRelease = elementProperties.getThemeTransition$lib_scarlet_externalRelease();
                if (view.isAttachedToWindow() && view.getVisibility() == 0) {
                    if (themeTransition$lib_scarlet_externalRelease != null && (animatorCreateAnimator = themeTransition$lib_scarlet_externalRelease.createAnimator(view, elementProperties, previousThemeNode, newTheme)) != null) {
                        animatorSetBuilder.with(animatorCreateAnimator);
                    }
                } else if (themeTransition$lib_scarlet_externalRelease != null) {
                    themeTransition$lib_scarlet_externalRelease.applyTo(view, elementProperties, newTheme);
                }
            }
            Activity activity = getActivity();
            if (activity != null) {
                List list = this.activityThemeTransitions;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Animator animatorCreateAnimator2 = ((ThemeTransition) list.get(i)).createAnimator(activity, this.activityElementProperties, previousThemeNode, newTheme);
                    if (animatorCreateAnimator2 != null) {
                        animatorSetBuilder.with(animatorCreateAnimator2);
                    }
                }
            }
            AnimatorSet animatorSetBuild = animatorSetBuilder.getAnimatorSet();
            animatorSetBuild.start();
            animatorSetBuild.addListener(new Animator.AnimatorListener() { // from class: com.robinhood.scarlet.ScarletManager$animateThemeChange$lambda$9$lambda$8$$inlined$addListener$default$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.this$0.themeAnimator = null;
                }
            });
            this.themeAnimator = animatorSetBuild;
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyImmediateThemeChange(ThemeNode newThemeNode) {
        Trace.beginSection("ScarletManager.applyImmediateThemeChange");
        try {
            Iterator it = this.registeredViews.iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                ElementProperties elementProperties = ScarletManager2.getElementProperties(view);
                ThemeTransition<Object> themeTransition$lib_scarlet_externalRelease = elementProperties.getThemeTransition$lib_scarlet_externalRelease();
                if (themeTransition$lib_scarlet_externalRelease != null) {
                    themeTransition$lib_scarlet_externalRelease.applyTo(view, elementProperties, newThemeNode);
                }
            }
            Activity activity = getActivity();
            if (activity != null) {
                List list = this.activityThemeTransitions;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((ThemeTransition) list.get(i)).applyTo(activity, this.activityElementProperties, newThemeNode);
                }
            }
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void propagateThemeChange(Boolean overrideAnimated) {
        Trace.beginSection("ScarletManager.propagateThemeChange");
        try {
            ThemeNode currentThemeNode = getCurrentThemeNode();
            Iterator<T> it = this.children.iterator();
            while (it.hasNext()) {
                ((ScarletManager) it.next()).notifyParentThemeChange(currentThemeNode, getAnimationMode(), overrideAnimated);
            }
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyParentThemeChange(ThemeNode parentThemeNode, AnimationMode parentAnimationMode, Boolean overrideAnimated) {
        ThemeNode currentThemeNode = getCurrentThemeNode();
        this._baseThemeNode = parentThemeNode;
        if (overrideAnimated == null) {
            overrideAnimated = this.animationMode.getIsAnimationInherited() ? Boolean.valueOf(parentAnimationMode.getIsAnimationEnabled()) : null;
        }
        applyChanges$default(this, currentThemeNode, overrideAnimated, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelCurrentAnimator() {
        Animator animator = this.themeAnimator;
        if (animator != null) {
            animator.cancel();
        }
        this.themeAnimator = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ThemeNode obtainThemeNode() {
        ThemeNode baseThemeNode = getBaseThemeNode();
        ResourceReferences4<StyleResource> resourceReferences4 = this.rootOverlay;
        if (resourceReferences4 != null) {
            baseThemeNode = baseThemeNode.get(resourceReferences4);
        }
        SparseArray<ResourceReferences4<StyleResource>> sparseArray = this.overlays;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray.keyAt(i);
            baseThemeNode = baseThemeNode.get(sparseArray.valueAt(i));
        }
        return baseThemeNode;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ScarletManager.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/scarlet/ScarletManager$AnimationMode;", "", "isAnimationEnabled", "", "isAnimationInherited", "<init>", "(Ljava/lang/String;IZZ)V", "()Z", "ANIMATED_AND_INHERIT", "ALWAYS_ANIMATED", "NOT_ANIMATED_AND_INHERIT", "NEVER_ANIMATED", "Companion", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AnimationMode {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AnimationMode[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final AnimationMode[] values;
        private final boolean isAnimationEnabled;
        private final boolean isAnimationInherited;
        public static final AnimationMode ANIMATED_AND_INHERIT = new AnimationMode("ANIMATED_AND_INHERIT", 0, true, true);
        public static final AnimationMode ALWAYS_ANIMATED = new AnimationMode("ALWAYS_ANIMATED", 1, true, false);
        public static final AnimationMode NOT_ANIMATED_AND_INHERIT = new AnimationMode("NOT_ANIMATED_AND_INHERIT", 2, false, true);
        public static final AnimationMode NEVER_ANIMATED = new AnimationMode("NEVER_ANIMATED", 3, false, false);

        private static final /* synthetic */ AnimationMode[] $values() {
            return new AnimationMode[]{ANIMATED_AND_INHERIT, ALWAYS_ANIMATED, NOT_ANIMATED_AND_INHERIT, NEVER_ANIMATED};
        }

        public static EnumEntries<AnimationMode> getEntries() {
            return $ENTRIES;
        }

        private AnimationMode(String str, int i, boolean z, boolean z2) {
            this.isAnimationEnabled = z;
            this.isAnimationInherited = z2;
        }

        /* renamed from: isAnimationEnabled, reason: from getter */
        public final boolean getIsAnimationEnabled() {
            return this.isAnimationEnabled;
        }

        /* renamed from: isAnimationInherited, reason: from getter */
        public final boolean getIsAnimationInherited() {
            return this.isAnimationInherited;
        }

        static {
            AnimationMode[] animationModeArr$values = $values();
            $VALUES = animationModeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(animationModeArr$values);
            INSTANCE = new Companion(null);
            values = values();
        }

        /* compiled from: ScarletManager.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nR\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/scarlet/ScarletManager$AnimationMode$Companion;", "", "<init>", "()V", "values", "", "Lcom/robinhood/scarlet/ScarletManager$AnimationMode;", "[Lcom/robinhood/scarlet/ScarletManager$AnimationMode;", "fromOrdinal", "ordinal", "", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final AnimationMode fromOrdinal(int ordinal) {
                return AnimationMode.values[ordinal];
            }
        }

        public static AnimationMode valueOf(String str) {
            return (AnimationMode) Enum.valueOf(AnimationMode.class, str);
        }

        public static AnimationMode[] values() {
            return (AnimationMode[]) $VALUES.clone();
        }
    }

    static {
        String name = ScarletManager.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        SERVICE_NAME = name;
    }
}
