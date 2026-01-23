package com.robinhood.android.cortex.digest.asset.preview;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing3;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Intrinsic3;
import androidx.compose.foundation.layout.Intrinsic4;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.draw.Blur;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextMeasurer;
import androidx.compose.p011ui.text.TextMeasurerHelper;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.core.os.Bundle2;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.CreationExtras2;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.cortex.contracts.AssetDigestFragmentKey;
import com.robinhood.android.cortex.contracts.AssetDigestValuePropsExperiment2;
import com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewDuxo;
import com.robinhood.android.cortex.models.asset.AssetDigest;
import com.robinhood.android.cortex.models.asset.AssetDigest6;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.time.android.format.DurationFormatter;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.Duration;

/* compiled from: AssetDigestPreviewComposable.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a)\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0012\u001a'\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a3\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0 H\u0003¢\u0006\u0002\u0010!\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\"²\u0006\n\u0010#\u001a\u00020$X\u008a\u0084\u0002²\u0006\n\u0010%\u001a\u00020\u0004X\u008a\u008e\u0002²\u0006\n\u0010&\u001a\u00020\u001eX\u008a\u008e\u0002²\u0006\n\u0010'\u001a\u00020\u001eX\u008a\u008e\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u0084\u0002²\u0006\n\u0010(\u001a\u00020\u0019X\u008a\u0084\u0002²\u0006\n\u0010)\u001a\u00020\u0001X\u008a\u008e\u0002"}, m3636d2 = {"TEST_TAG_DESCRIPTION", "", "TEST_TAG_TIMESTAMP", "CONTENT_ANIMATION_DURATION_MS", "", "ACCESSORY_ANIMATION_DURATION_MS", "ACCESSORY_PAUSE_MS", "", "MAX_PREVIEW_LINES_SIGNED_AGREEMENT", "MAX_PREVIEW_LINES_NEEDS_AGREEMENT", "AssetDigestPreviewComposable", "", "args", "Lcom/robinhood/android/cortex/digest/asset/preview/AssetDigestPreviewDuxo$Args;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/cortex/digest/asset/preview/AssetDigestPreviewDuxo;", "(Lcom/robinhood/android/cortex/digest/asset/preview/AssetDigestPreviewDuxo$Args;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/cortex/digest/asset/preview/AssetDigestPreviewDuxo;Landroidx/compose/runtime/Composer;II)V", "AssetDigestPreviewHeader", "instrumentDigest", "Lcom/robinhood/android/cortex/models/asset/AssetDigest;", "alpha", "", "offset", "Landroidx/compose/ui/unit/Dp;", "AssetDigestPreviewHeader-TDGSqEk", "(Lcom/robinhood/android/cortex/models/asset/AssetDigest;FFLandroidx/compose/runtime/Composer;I)V", "AssetDigestPreviewTeaserOverlay", "animationComplete", "", "onPreviewClick", "Lkotlin/Function0;", "(Lcom/robinhood/android/cortex/models/asset/AssetDigest;FZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "lib-cortex-digest-asset-preview_externalDebug", "viewState", "Lcom/robinhood/android/cortex/digest/asset/preview/AssetDigestPreviewViewState;", "width", "isAccessoriesVisible", "isBlurred", "blur", "currentText"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class AssetDigestPreviewComposable {
    private static final int ACCESSORY_ANIMATION_DURATION_MS = 200;
    private static final long ACCESSORY_PAUSE_MS = 300;
    private static final int CONTENT_ANIMATION_DURATION_MS = 800;
    private static final int MAX_PREVIEW_LINES_NEEDS_AGREEMENT = 2;
    private static final int MAX_PREVIEW_LINES_SIGNED_AGREEMENT = 4;
    private static final String TEST_TAG_DESCRIPTION = "copilot_digest_preview_description";
    private static final String TEST_TAG_TIMESTAMP = "copilot_digest_preview_timestamp";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AssetDigestPreviewComposable$lambda$1(AssetDigestPreviewDuxo.Args args, Modifier modifier, AssetDigestPreviewDuxo assetDigestPreviewDuxo, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        AssetDigestPreviewComposable(args, modifier, assetDigestPreviewDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AssetDigestPreviewComposable$lambda$2(AssetDigestPreviewDuxo.Args args, Modifier modifier, AssetDigestPreviewDuxo assetDigestPreviewDuxo, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        AssetDigestPreviewComposable(args, modifier, assetDigestPreviewDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AssetDigestPreviewComposable$lambda$33(AssetDigestPreviewDuxo.Args args, Modifier modifier, AssetDigestPreviewDuxo assetDigestPreviewDuxo, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        AssetDigestPreviewComposable(args, modifier, assetDigestPreviewDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AssetDigestPreviewHeader_TDGSqEk$lambda$37(AssetDigest assetDigest, float f, float f2, int i, Composer composer, int i2) {
        m12567AssetDigestPreviewHeaderTDGSqEk(assetDigest, f, f2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AssetDigestPreviewTeaserOverlay$lambda$39(AssetDigest assetDigest, float f, boolean z, Function0 function0, int i, Composer composer, int i2) {
        AssetDigestPreviewTeaserOverlay(assetDigest, f, z, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:249:0x0911  */
    /* JADX WARN: Removed duplicated region for block: B:257:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019c  */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v4, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AssetDigestPreviewComposable(final AssetDigestPreviewDuxo.Args args, Modifier modifier, AssetDigestPreviewDuxo assetDigestPreviewDuxo, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        int i3;
        Modifier modifier2;
        AssetDigestPreviewDuxo assetDigestPreviewDuxo2;
        boolean z;
        Composer composer2;
        int i4;
        final AssetDigestPreviewDuxo assetDigestPreviewDuxo3;
        int i5;
        final Modifier modifier3;
        ?? r15;
        Tuples2<AssetDigest, AssetDigestValuePropsExperiment2> digestAndVariant;
        Component.ComponentType componentType;
        int i6;
        String str;
        Modifier.Companion companion;
        int i7;
        BentoTheme bentoTheme;
        long jM21426getFg20d7_KjU;
        Composer composer3;
        final AssetDigestPreviewDuxo assetDigestPreviewDuxo4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(args, "args");
        Composer composerStartRestartGroup = composer.startRestartGroup(-457449063);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(args) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    assetDigestPreviewDuxo2 = assetDigestPreviewDuxo;
                    int i9 = composerStartRestartGroup.changedInstance(assetDigestPreviewDuxo2) ? 256 : 128;
                    i3 |= i9;
                } else {
                    assetDigestPreviewDuxo2 = assetDigestPreviewDuxo;
                }
                i3 |= i9;
            } else {
                assetDigestPreviewDuxo2 = assetDigestPreviewDuxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        composerStartRestartGroup.startReplaceGroup(2050738472);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        CreationExtras2 creationExtras2 = new CreationExtras2(current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                        creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, args)));
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        z = false;
                        composer2 = composerStartRestartGroup;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(AssetDigestPreviewDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composer2, 0, 0);
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewComposableKt$AssetDigestPreviewComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewComposableKt$AssetDigestPreviewComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer2, 0);
                        composer2.endReplaceGroup();
                        i5 = -1633490746;
                        assetDigestPreviewDuxo3 = (AssetDigestPreviewDuxo) baseDuxo;
                        i4 = i3 & (-897);
                    } else {
                        z = false;
                        composer2 = composerStartRestartGroup;
                        i4 = i3;
                        assetDigestPreviewDuxo3 = assetDigestPreviewDuxo2;
                        i5 = -1633490746;
                    }
                    modifier3 = modifier5;
                    r15 = z;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    r15 = 0;
                    composer2 = composerStartRestartGroup;
                    i4 = i3;
                    modifier3 = modifier2;
                    assetDigestPreviewDuxo3 = assetDigestPreviewDuxo2;
                    i5 = -1633490746;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-457449063, i4, -1, "com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewComposable (AssetDigestPreviewComposable.kt:83)");
                }
                Composer composer4 = composer2;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(assetDigestPreviewDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                digestAndVariant = AssetDigestPreviewComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getDigestAndVariant();
                if (digestAndVariant != null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer4.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup2 != null) {
                        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewComposableKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return AssetDigestPreviewComposable.AssetDigestPreviewComposable$lambda$1(args, modifier3, assetDigestPreviewDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                final AssetDigest assetDigestComponent1 = digestAndVariant.component1();
                final AssetDigestValuePropsExperiment2 assetDigestValuePropsExperiment2Component2 = digestAndVariant.component2();
                if (assetDigestComponent1 == null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composer4.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup3 != null) {
                        scopeUpdateScopeEndRestartGroup3.updateScope(new Function2() { // from class: com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewComposableKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return AssetDigestPreviewComposable.AssetDigestPreviewComposable$lambda$2(args, modifier3, assetDigestPreviewDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                Modifier modifier6 = modifier3;
                final AssetDigestPreviewDuxo assetDigestPreviewDuxo5 = assetDigestPreviewDuxo3;
                boolean hasSeenAnimation = AssetDigestPreviewComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getHasSeenAnimation();
                final Context context = (Context) composer4.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final Navigator navigator = (Navigator) composer4.consume(LocalNavigator.getLocalNavigator());
                composer4.startReplaceGroup(-1224400529);
                boolean zChangedInstance2 = composer4.changedInstance(assetDigestComponent1) | composer4.changed(assetDigestValuePropsExperiment2Component2.ordinal()) | composer4.changedInstance(navigator) | composer4.changedInstance(context);
                Object objRememberedValue2 = composer4.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewComposableKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AssetDigestPreviewComposable.AssetDigestPreviewComposable$lambda$4$lambda$3(assetDigestComponent1, assetDigestValuePropsExperiment2Component2, navigator, context);
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue2);
                }
                Function0 function0 = (Function0) objRememberedValue2;
                composer4.endReplaceGroup();
                composer4.startReplaceGroup(1849434622);
                Object objRememberedValue3 = composer4.rememberedValue();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objRememberedValue3 == companion2.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewComposableKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AssetDigestPreviewComposable.AssetDigestPreviewComposable$lambda$6$lambda$5((SemanticsPropertyReceiver) obj);
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue3);
                }
                composer4.endReplaceGroup();
                Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(SemanticsModifier6.semantics$default(modifier6, r15, (Function1) objRememberedValue3, 1, null), hasSeenAnimation, null, null, function0, 6, null);
                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer4.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                boolean z2 = assetDigestComponent1 instanceof AssetDigest.HasSignedAgreement;
                if (z2) {
                    componentType = Component.ComponentType.CORTEX_DIGEST_SECTION;
                } else {
                    if (!(assetDigestComponent1 instanceof AssetDigest.NeedsAgreement)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    componentType = Component.ComponentType.CORTEX_DIGEST_UPSELL_SECTION;
                }
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierM4893clickableXHw0xAI$default, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(componentType, assetDigestComponent1.getDigestId(), null, 4, null), null, 15, null), true, false, false, true, false, null, 108, null);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion3 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composer4, r15);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, r15);
                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierAutoLogEvents$default);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion4.getConstructor();
                if (composer4.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer4.startReusableNode();
                if (composer4.getInserting()) {
                    composer4.createNode(constructor);
                } else {
                    composer4.useNode();
                }
                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                String description = assetDigestComponent1.getPreview().getDescription();
                composer4.startReplaceGroup(1849434622);
                Object objRememberedValue4 = composer4.rememberedValue();
                if (objRememberedValue4 == companion2.getEmpty()) {
                    objRememberedValue4 = SnapshotIntState3.mutableIntStateOf(r15);
                    composer4.updateRememberedValue(objRememberedValue4);
                }
                final SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue4;
                composer4.endReplaceGroup();
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i10 = BentoTheme.$stable;
                TextStyle textM = bentoTheme2.getTypography(composer4, i10).getTextM();
                TextMeasurer textMeasurerRememberTextMeasurer = TextMeasurerHelper.rememberTextMeasurer(r15, composer4, r15, 1);
                int intValue = snapshotIntState2.getIntValue();
                composer4.startReplaceGroup(i5);
                boolean zChanged = composer4.changed(intValue) | composer4.changed(description);
                Object objRememberedValue5 = composer4.rememberedValue();
                if (zChanged || objRememberedValue5 == companion2.getEmpty()) {
                    long jM7986fixedWidthOenEA2s = Constraints.INSTANCE.m7986fixedWidthOenEA2s(snapshotIntState2.getIntValue());
                    if (z2) {
                        i6 = 4;
                    } else {
                        if (!(assetDigestComponent1 instanceof AssetDigest.NeedsAgreement)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i6 = 2;
                    }
                    str = description;
                    objRememberedValue5 = TextMeasurer.m7623measurewNUYSr0$default(textMeasurerRememberTextMeasurer, str, textM, 0, false, i6, jM7986fixedWidthOenEA2s, null, null, null, false, 972, null);
                    composer4.updateRememberedValue(objRememberedValue5);
                } else {
                    str = description;
                }
                TextLayoutResult textLayoutResult = (TextLayoutResult) objRememberedValue5;
                composer4.endReplaceGroup();
                composer4.startReplaceGroup(5004770);
                boolean zChanged2 = composer4.changed(textLayoutResult);
                Object objRememberedValue6 = composer4.rememberedValue();
                if (zChanged2 || objRememberedValue6 == companion2.getEmpty()) {
                    SnapshotState snapshotStateMutableStateOf$default = SnapshotState3.mutableStateOf$default(Boolean.valueOf(hasSeenAnimation), null, 2, null);
                    composer4.updateRememberedValue(snapshotStateMutableStateOf$default);
                    objRememberedValue6 = snapshotStateMutableStateOf$default;
                }
                SnapshotState snapshotState = (SnapshotState) objRememberedValue6;
                composer4.endReplaceGroup();
                composer4.startReplaceGroup(5004770);
                boolean zChanged3 = composer4.changed(textLayoutResult);
                Object objRememberedValue7 = composer4.rememberedValue();
                if (zChanged3 || objRememberedValue7 == companion2.getEmpty()) {
                    SnapshotState snapshotStateMutableStateOf$default2 = SnapshotState3.mutableStateOf$default(Boolean.valueOf(!hasSeenAnimation), null, 2, null);
                    composer4.updateRememberedValue(snapshotStateMutableStateOf$default2);
                    objRememberedValue7 = snapshotStateMutableStateOf$default2;
                }
                SnapshotState snapshotState2 = (SnapshotState) objRememberedValue7;
                composer4.endReplaceGroup();
                float fM7995constructorimpl = C2002Dp.m7995constructorimpl(AssetDigestPreviewComposable$lambda$32$lambda$12(snapshotState) ? (float) r15 : -4);
                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(200, r15, Easing3.getLinearEasing(), 2, null);
                composer4.startReplaceGroup(5004770);
                boolean zChangedInstance3 = composer4.changedInstance(assetDigestPreviewDuxo5);
                Object objRememberedValue8 = composer4.rememberedValue();
                if (zChangedInstance3 || objRememberedValue8 == companion2.getEmpty()) {
                    objRememberedValue8 = new Function1() { // from class: com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewComposableKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AssetDigestPreviewComposable.AssetDigestPreviewComposable$lambda$32$lambda$18$lambda$17(assetDigestPreviewDuxo5, (C2002Dp) obj);
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue8);
                }
                composer4.endReplaceGroup();
                SnapshotState4<C2002Dp> snapshotState4M4812animateDpAsStateAjpBEmI = AnimateAsState.m4812animateDpAsStateAjpBEmI(fM7995constructorimpl, tweenSpecTween$default, null, (Function1) objRememberedValue8, composer4, 0, 4);
                SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(AssetDigestPreviewComposable$lambda$32$lambda$12(snapshotState) ? 1.0f : 0.0f, AnimationSpecKt.tween$default(200, r15, Easing3.getLinearEasing(), 2, null), 0.0f, null, null, composer4, 0, 28);
                SnapshotState4<C2002Dp> snapshotState4M4812animateDpAsStateAjpBEmI2 = AnimateAsState.m4812animateDpAsStateAjpBEmI(C2002Dp.m7995constructorimpl(AssetDigestPreviewComposable$lambda$32$lambda$15(snapshotState2) ? 16 : (float) r15), AnimationSpecKt.tween$default(CONTENT_ANIMATION_DURATION_MS, r15, Easing3.getLinearEasing(), 2, null), null, null, composer4, 0, 12);
                m12567AssetDigestPreviewHeaderTDGSqEk(assetDigestComponent1, AssetDigestPreviewComposable$lambda$32$lambda$20(snapshotState4AnimateFloatAsState), AssetDigestPreviewComposable$lambda$32$lambda$19(snapshotState4M4812animateDpAsStateAjpBEmI), composer4, r15);
                composer4.startReplaceGroup(5004770);
                boolean zChanged4 = composer4.changed(textLayoutResult);
                Object objRememberedValue9 = composer4.rememberedValue();
                if (zChanged4 || objRememberedValue9 == companion2.getEmpty()) {
                    Animatable animatableAnimatable$default = Animatable2.Animatable$default(0.0f, 0.0f, 2, null);
                    composer4.updateRememberedValue(animatableAnimatable$default);
                    objRememberedValue9 = animatableAnimatable$default;
                }
                Animatable animatable = (Animatable) objRememberedValue9;
                composer4.endReplaceGroup();
                composer4.startReplaceGroup(5004770);
                boolean zChanged5 = composer4.changed(textLayoutResult);
                Object objRememberedValue10 = composer4.rememberedValue();
                if (zChanged5 || objRememberedValue10 == companion2.getEmpty()) {
                    objRememberedValue10 = SnapshotState3.mutableStateOf$default(hasSeenAnimation ? str : "", null, 2, null);
                    composer4.updateRememberedValue(objRememberedValue10);
                }
                SnapshotState snapshotState3 = (SnapshotState) objRememberedValue10;
                composer4.endReplaceGroup();
                Modifier.Companion companion5 = Modifier.INSTANCE;
                Modifier modifierHeight = Intrinsic3.height(companion5, Intrinsic4.Min);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), r15);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, r15);
                CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, modifierHeight);
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                if (composer4.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer4.startReusableNode();
                if (composer4.getInserting()) {
                    composer4.createNode(constructor2);
                } else {
                    composer4.useNode();
                }
                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer4);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composer4, r15);
                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer4, r15);
                CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer4, companion5);
                Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                if (composer4.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer4.startReusableNode();
                if (composer4.getInserting()) {
                    composer4.createNode(constructor3);
                } else {
                    composer4.useNode();
                }
                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer4);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(TestTag3.testTag(companion5, TEST_TAG_DESCRIPTION), 0.0f, 1, null);
                composer4.startReplaceGroup(5004770);
                Object objRememberedValue11 = composer4.rememberedValue();
                if (objRememberedValue11 == companion2.getEmpty()) {
                    objRememberedValue11 = new Function1() { // from class: com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewComposableKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AssetDigestPreviewComposable.m1857xda72ef01(snapshotIntState2, (IntSize) obj);
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue11);
                }
                composer4.endReplaceGroup();
                String str2 = str;
                BentoText2.m20747BentoText38GnDrw(AssetDigestPreviewComposable$lambda$32$lambda$24(snapshotState3), PaddingKt.m5146paddingqDBjuR0$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Blur.m6449blurF8QBwvs$default(OnRemeasuredModifier2.onSizeChanged(modifierFillMaxWidth$default, (Function1) objRememberedValue11), AssetDigestPreviewComposable$lambda$32$lambda$21(snapshotState4M4812animateDpAsStateAjpBEmI2), null, 2, null), 0.0f, composer4, 0, 1), 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composer4, i10).m21593getSmallD9Ej5fM(), 7, null), null, null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, textLayoutResult.getLineCount(), textLayoutResult.getLineCount(), null, 0, null, composer4, 12582912, 0, 14716);
                Composer composer5 = composer4;
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Alpha.alpha(companion5, AssetDigestPreviewComposable$lambda$32$lambda$20(snapshotState4AnimateFloatAsState)), 0.0f, composer5, 0, 1);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion3.getCenterVertically(), composer5, 48);
                int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer5, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer5.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer5, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
                if (composer5.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer5.startReusableNode();
                if (composer5.getInserting()) {
                    composer5.createNode(constructor4);
                } else {
                    composer5.useNode();
                }
                Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer5);
                Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
                if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion4.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                boolean z3 = assetDigestComponent1.getPreview().getStyle() == AssetDigest6.BREAKING;
                composer5.startReplaceGroup(-1985650473);
                if (z3) {
                    bentoTheme = bentoTheme2;
                    companion = companion5;
                    i7 = i10;
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size12(ServerToBentoAssetMapper2.LIGHTNING_12), null, bentoTheme.getColors(composer5, i10).m21368getAccent0d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(companion5, 0.0f, 0.0f, bentoTheme.getSpacing(composer5, i10).m21595getXsmallD9Ej5fM(), 0.0f, 11, null), null, false, composer5, BentoIcon4.Size12.$stable | 48, 48);
                    composer5 = composer5;
                } else {
                    companion = companion5;
                    i7 = i10;
                    bentoTheme = bentoTheme2;
                }
                composer5.endReplaceGroup();
                Modifier modifierTestTag = TestTag3.testTag(companion, TEST_TAG_TIMESTAMP);
                int i11 = C12041R.string.copilot_digest_preview_updated_at;
                Resources resources = ((Context) composer5.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                Duration durationBetween = Duration.between(assetDigestComponent1.getUpdatedAt(), AssetDigestPreviewComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getNow());
                Intrinsics.checkNotNullExpressionValue(durationBetween, "between(...)");
                String strStringResource = StringResources_androidKt.stringResource(i11, new Object[]{DurationFormatter.formatNarrow(resources, durationBetween, true)}, composer5, 0);
                TextStyle textS = bentoTheme.getTypography(composer5, i7).getTextS();
                if (z3) {
                    composer5.startReplaceGroup(-1424492381);
                    jM21426getFg20d7_KjU = bentoTheme.getColors(composer5, i7).m21368getAccent0d7_KjU();
                    composer5.endReplaceGroup();
                } else {
                    composer5.startReplaceGroup(-1424407162);
                    jM21426getFg20d7_KjU = bentoTheme.getColors(composer5, i7).m21426getFg20d7_KjU();
                    composer5.endReplaceGroup();
                }
                Composer composer6 = composer5;
                BentoTheme bentoTheme3 = bentoTheme;
                BentoText2.m20747BentoText38GnDrw(strStringResource, modifierTestTag, Color.m6701boximpl(jM21426getFg20d7_KjU), null, z3 ? FontWeight.INSTANCE.getBold() : null, null, null, 0, false, 0, 0, null, 0, textS, composer6, 48, 0, 8168);
                int i12 = i7;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12041R.string.copilot_digest_preview_dot, composer6, 0), PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme3.getSpacing(composer6, i7).m21593getSmallD9Ej5fM(), 0.0f, 2, null), Color.m6701boximpl(bentoTheme3.getColors(composer6, i7).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composer6, i7).getTextS(), composer6, 0, 0, 8184);
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12041R.string.copilot_digest_preview_ai_generated, composer6, 0), null, Color.m6701boximpl(bentoTheme3.getColors(composer6, i12).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composer6, i12).getTextS(), composer6, 0, 0, 8186);
                composer3 = composer6;
                composer3.endNode();
                composer3.startReplaceGroup(-464411563);
                if (!hasSeenAnimation) {
                    composer3.startReplaceGroup(-1224400529);
                    boolean zChangedInstance4 = composer3.changedInstance(textLayoutResult) | composer3.changedInstance(animatable) | composer3.changed(snapshotState3) | composer3.changed(str2) | composer3.changed(snapshotState) | composer3.changed(snapshotState2);
                    Object objRememberedValue12 = composer3.rememberedValue();
                    if (zChangedInstance4 || objRememberedValue12 == companion2.getEmpty()) {
                        objRememberedValue12 = new AssetDigestPreviewComposable2(textLayoutResult, animatable, str2, snapshotState3, snapshotState, snapshotState2, null);
                        composer3.updateRememberedValue(objRememberedValue12);
                    }
                    composer3.endReplaceGroup();
                    EffectsKt.LaunchedEffect(textLayoutResult, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue12, composer3, TextLayoutResult.$stable);
                }
                composer3.endReplaceGroup();
                composer3.endNode();
                AssetDigestPreviewTeaserOverlay(assetDigestComponent1, AssetDigestPreviewComposable$lambda$32$lambda$20(snapshotState4AnimateFloatAsState), hasSeenAnimation, function0, composer3, 0);
                composer3.endNode();
                composer3.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                assetDigestPreviewDuxo4 = assetDigestPreviewDuxo5;
                modifier4 = modifier6;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                assetDigestPreviewDuxo4 = assetDigestPreviewDuxo2;
                composer3 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewComposableKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AssetDigestPreviewComposable.AssetDigestPreviewComposable$lambda$33(args, modifier4, assetDigestPreviewDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i3 & 147) == 146) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i8 == 0) {
                }
                if ((i2 & 4) == 0) {
                }
                modifier3 = modifier5;
                r15 = z;
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Composer composer42 = composer2;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(assetDigestPreviewDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7);
                digestAndVariant = AssetDigestPreviewComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getDigestAndVariant();
                if (digestAndVariant != null) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final AssetDigestPreviewViewState AssetDigestPreviewComposable$lambda$0(SnapshotState4<AssetDigestPreviewViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final boolean AssetDigestPreviewComposable$lambda$32$lambda$12(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean AssetDigestPreviewComposable$lambda$32$lambda$15(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final float AssetDigestPreviewComposable$lambda$32$lambda$19(SnapshotState4<C2002Dp> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    private static final float AssetDigestPreviewComposable$lambda$32$lambda$20(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final float AssetDigestPreviewComposable$lambda$32$lambda$21(SnapshotState4<C2002Dp> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    private static final String AssetDigestPreviewComposable$lambda$32$lambda$24(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AssetDigestPreviewComposable$lambda$4$lambda$3(AssetDigest assetDigest, AssetDigestValuePropsExperiment2 assetDigestValuePropsExperiment2, Navigator navigator, Context context) {
        Navigator.DefaultImpls.showFragment$default(navigator, context, new AssetDigestFragmentKey(assetDigest, assetDigestValuePropsExperiment2), false, false, false, null, false, null, true, false, null, null, 3828, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AssetDigestPreviewComposable$lambda$6$lambda$5(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AssetDigestPreviewComposable$lambda$32$lambda$13(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AssetDigestPreviewComposable$lambda$32$lambda$16(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AssetDigestPreviewComposable$lambda$32$lambda$18$lambda$17(AssetDigestPreviewDuxo assetDigestPreviewDuxo, C2002Dp c2002Dp) {
        assetDigestPreviewDuxo.animationComplete();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AssetDigestPreviewComposable$lambda$32$lambda$31$lambda$30$lambda$27$lambda$26 */
    public static final Unit m1857xda72ef01(SnapshotIntState2 snapshotIntState2, IntSize intSize) {
        snapshotIntState2.setIntValue((int) (intSize.getPackedValue() >> 32));
        return Unit.INSTANCE;
    }

    /* renamed from: AssetDigestPreviewHeader-TDGSqEk, reason: not valid java name */
    private static final void m12567AssetDigestPreviewHeaderTDGSqEk(final AssetDigest assetDigest, final float f, float f2, Composer composer, final int i) {
        int i2;
        final float f3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-228733525);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(assetDigest) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(f2) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            f3 = f2;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-228733525, i2, -1, "com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewHeader (AssetDigestPreviewComposable.kt:316)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composerStartRestartGroup, 6, 1);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierM21623defaultHorizontalPaddingrAjV9yQ, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM(), 7, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            int i4 = i2;
            BentoText2.m20747BentoText38GnDrw(assetDigest.getPreview().getTitle(), Row6.INSTANCE.weight(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM(), 0.0f, 11, null), 1.0f, false), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21368getAccent0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8184);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.startReplaceGroup(-1033552293);
            if (assetDigest instanceof AssetDigest.HasSignedAgreement) {
                Modifier modifierAlpha = Alpha.alpha(companion, f);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean z = (i4 & 896) == 256;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    f3 = f2;
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AssetDigestPreviewComposable.AssetDigestPreviewHeader_TDGSqEk$lambda$36$lambda$35$lambda$34(f3, (Density) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    f3 = f2;
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.ARROW_RIGHT_16), null, bentoTheme.getColors(composerStartRestartGroup, i3).m21368getAccent0d7_KjU(), OffsetKt.offset(modifierAlpha, (Function1) objRememberedValue), null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable | 48, 48);
            } else {
                f3 = f2;
                if (!(assetDigest instanceof AssetDigest.NeedsAgreement)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AssetDigestPreviewComposable.AssetDigestPreviewHeader_TDGSqEk$lambda$37(assetDigest, f, f3, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset AssetDigestPreviewHeader_TDGSqEk$lambda$36$lambda$35$lambda$34(float f, Density offset) {
        Intrinsics.checkNotNullParameter(offset, "$this$offset");
        return IntOffset.m8030boximpl(IntOffset.m8033constructorimpl((offset.mo5010roundToPx0680j_4(f) << 32) | (0 & 4294967295L)));
    }

    private static final void AssetDigestPreviewTeaserOverlay(final AssetDigest assetDigest, final float f, final boolean z, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Function0<Unit> function02;
        Composer composerStartRestartGroup = composer.startRestartGroup(83333184);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(assetDigest) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function02 = function0;
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
        } else {
            function02 = function0;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(83333184, i2, -1, "com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewTeaserOverlay (AssetDigestPreviewComposable.kt:360)");
            }
            if (!(assetDigest instanceof AssetDigest.HasSignedAgreement)) {
                if (!(assetDigest instanceof AssetDigest.NeedsAgreement)) {
                    throw new NoWhenBranchMatchedException();
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composerStartRestartGroup, 6, 1);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Column5.weight$default(Column6.INSTANCE, companion, 1.0f, false, 2, null), 0.0f, 1, null);
                Brush.Companion companion3 = Brush.INSTANCE;
                Tuples2 tuples2M3642to = Tuples4.m3642to(Float.valueOf(0.0f), Color.m6701boximpl(Color.INSTANCE.m6725getTransparent0d7_KjU()));
                Float fValueOf = Float.valueOf(0.9f);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                BoxKt.Box(Background3.background$default(modifierFillMaxSize$default, Brush.Companion.m6683verticalGradient8A3gB4$default(companion3, new Tuples2[]{tuples2M3642to, Tuples4.m3642to(fValueOf, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21371getBg0d7_KjU()))}, 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composerStartRestartGroup, 0);
                BentoTextButton2.m20715BentoTextButtonPIknLig(function02, StringResources_androidKt.stringResource(C12041R.string.copilot_digest_preview_read_more, composerStartRestartGroup, 0), Alpha.alpha(Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), bentoTheme.getColors(composerStartRestartGroup, i3).m21371getBg0d7_KjU(), null, 2, null), f), null, null, z, null, composerStartRestartGroup, ((i2 >> 9) & 14) | ((i2 << 9) & 458752), 88);
                composerStartRestartGroup.endNode();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AssetDigestPreviewComposable.AssetDigestPreviewTeaserOverlay$lambda$39(assetDigest, f, z, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
