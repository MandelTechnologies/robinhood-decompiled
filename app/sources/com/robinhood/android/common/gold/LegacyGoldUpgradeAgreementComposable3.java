package com.robinhood.android.common.gold;

import android.content.Context;
import android.content.res.Resources;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PrimitiveResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import coil.compose.SingletonAsyncImagePainter;
import com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementComposable3;
import com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementViewState2;
import com.robinhood.android.gold.sparkle.bento.BentoSparkleButton2;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.mediaservice.ImageDensityUrl;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.api.bonfire.ApiGoldSweepAgreement;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LegacyGoldUpgradeAgreementComposable.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\u001ai\u0010\u0004\u001a\u00020\u00052#\u0010\u0006\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00050\u00072!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0015\u001a5\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u001c2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0003¢\u0006\u0002\u0010\u001d\u001a#\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u001cH\u0003¢\u0006\u0002\u0010!\"\u0016\u0010\u0000\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003¨\u0006\"²\u0006\n\u0010#\u001a\u00020\u001fX\u008a\u0084\u0002²\u0006\n\u0010$\u001a\u00020%X\u008a\u0084\u0002"}, m3636d2 = {"CardAssetTestTag", "", "getCardAssetTestTag$annotations", "()V", "GoldUpgradeAgreementComposable", "", "onClickAccept", "Lkotlin/Function1;", "Ljava/util/UUID;", "Lkotlin/ParameterName;", "name", "selectedPlanId", "onError", "", "error", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/common/gold/LegacyGoldUpgradeAgreementDuxo;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/common/gold/LegacyGoldUpgradeAgreementDuxo;Landroidx/compose/runtime/Composer;II)V", "Loading", "(Landroidx/compose/runtime/Composer;I)V", "Loaded", "state", "Lcom/robinhood/android/common/gold/GoldUpgradeAgreementViewState$Loaded;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "onClickReview", "Lkotlin/Function0;", "(Lcom/robinhood/android/common/gold/GoldUpgradeAgreementViewState$Loaded;Landroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BottomBar", "Lcom/robinhood/android/common/gold/GoldUpgradeAgreementViewState;", "onClickCta", "(Lcom/robinhood/android/common/gold/GoldUpgradeAgreementViewState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-lib-gold_externalRelease", "viewState", "isScrolledToEnd", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class LegacyGoldUpgradeAgreementComposable3 {
    public static final String CardAssetTestTag = "cardAsset";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBar$lambda$17(LegacyGoldUpgradeAgreementViewState2 legacyGoldUpgradeAgreementViewState2, Function0 function0, int i, Composer composer, int i2) throws Resources.NotFoundException {
        BottomBar(legacyGoldUpgradeAgreementViewState2, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldUpgradeAgreementComposable$lambda$3(Function1 function1, Function1 function12, Modifier modifier, LegacyGoldUpgradeAgreementDuxo legacyGoldUpgradeAgreementDuxo, int i, int i2, Composer composer, int i3) {
        GoldUpgradeAgreementComposable(function1, function12, modifier, legacyGoldUpgradeAgreementDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Loaded$lambda$13(LegacyGoldUpgradeAgreementViewState2.Loaded loaded, ScrollState scrollState, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Loaded(loaded, scrollState, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Loading$lambda$4(int i, Composer composer, int i2) {
        Loading(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getCardAssetTestTag$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoldUpgradeAgreementComposable(final Function1<? super UUID, Unit> onClickAccept, final Function1<? super Throwable, Unit> onError, Modifier modifier, LegacyGoldUpgradeAgreementDuxo legacyGoldUpgradeAgreementDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        LegacyGoldUpgradeAgreementDuxo legacyGoldUpgradeAgreementDuxo2;
        Modifier modifier3;
        int i4;
        int i5;
        int i6;
        final LegacyGoldUpgradeAgreementDuxo legacyGoldUpgradeAgreementDuxo3;
        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        final ScrollState scrollStateRememberScrollState;
        boolean zChanged;
        Object objRememberedValue;
        boolean zBooleanValue;
        boolean zChanged2;
        Object objRememberedValue2;
        final LegacyGoldUpgradeAgreementDuxo legacyGoldUpgradeAgreementDuxo4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClickAccept, "onClickAccept");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Composer composerStartRestartGroup = composer.startRestartGroup(1513152628);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onClickAccept) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onError) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    legacyGoldUpgradeAgreementDuxo2 = legacyGoldUpgradeAgreementDuxo;
                    int i8 = composerStartRestartGroup.changedInstance(legacyGoldUpgradeAgreementDuxo2) ? 2048 : 1024;
                    i3 |= i8;
                } else {
                    legacyGoldUpgradeAgreementDuxo2 = legacyGoldUpgradeAgreementDuxo;
                }
                i3 |= i8;
            } else {
                legacyGoldUpgradeAgreementDuxo2 = legacyGoldUpgradeAgreementDuxo;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        CreationExtras defaultViewModelCreationExtras = current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
                        i5 = 0;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(LegacyGoldUpgradeAgreementDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementComposableKt$GoldUpgradeAgreementComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementComposableKt$GoldUpgradeAgreementComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        i4 = -1633490746;
                        i6 = i3 & (-7169);
                        legacyGoldUpgradeAgreementDuxo3 = (LegacyGoldUpgradeAgreementDuxo) baseDuxo;
                    } else {
                        i4 = -1633490746;
                        i5 = 0;
                        LegacyGoldUpgradeAgreementDuxo legacyGoldUpgradeAgreementDuxo5 = legacyGoldUpgradeAgreementDuxo2;
                        i6 = i3;
                        legacyGoldUpgradeAgreementDuxo3 = legacyGoldUpgradeAgreementDuxo5;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    LegacyGoldUpgradeAgreementDuxo legacyGoldUpgradeAgreementDuxo6 = legacyGoldUpgradeAgreementDuxo2;
                    i6 = i3;
                    legacyGoldUpgradeAgreementDuxo3 = legacyGoldUpgradeAgreementDuxo6;
                    modifier3 = modifier2;
                    i4 = -1633490746;
                    i5 = 0;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1513152628, i6, -1, "com.robinhood.android.common.gold.GoldUpgradeAgreementComposable (LegacyGoldUpgradeAgreementComposable.kt:59)");
                }
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(legacyGoldUpgradeAgreementDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                scrollStateRememberScrollState = ScrollKt.rememberScrollState(i5, composerStartRestartGroup, i5, 1);
                LegacyGoldUpgradeAgreementViewState2 legacyGoldUpgradeAgreementViewState2GoldUpgradeAgreementComposable$lambda$0 = GoldUpgradeAgreementComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(legacyGoldUpgradeAgreementViewState2GoldUpgradeAgreementComposable$lambda$0);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    LegacyGoldUpgradeAgreementViewState2 legacyGoldUpgradeAgreementViewState2GoldUpgradeAgreementComposable$lambda$02 = GoldUpgradeAgreementComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                    LegacyGoldUpgradeAgreementViewState2.Loaded loaded = !(legacyGoldUpgradeAgreementViewState2GoldUpgradeAgreementComposable$lambda$02 instanceof LegacyGoldUpgradeAgreementViewState2.Loaded) ? (LegacyGoldUpgradeAgreementViewState2.Loaded) legacyGoldUpgradeAgreementViewState2GoldUpgradeAgreementComposable$lambda$02 : null;
                    objRememberedValue = Boolean.valueOf((loaded == null ? loaded.getStatus() : null) != LegacyGoldUpgradeAgreementDataState2.REVIEWED ? 1 : i5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Boolean bool = (Boolean) objRememberedValue;
                zBooleanValue = bool.booleanValue();
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(i4);
                zChanged2 = composerStartRestartGroup.changed(zBooleanValue) | composerStartRestartGroup.changed(scrollStateRememberScrollState);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new LegacyGoldUpgradeAgreementComposable4(zBooleanValue, scrollStateRememberScrollState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(bool, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i5);
                final AppCompatActivity appCompatActivityRequireActivityBaseContext = BaseContexts.requireActivityBaseContext((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-2082472400, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementComposableKt.GoldUpgradeAgreementComposable.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i9) {
                        if ((i9 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2082472400, i9, -1, "com.robinhood.android.common.gold.GoldUpgradeAgreementComposable.<anonymous> (LegacyGoldUpgradeAgreementComposable.kt:76)");
                        }
                        Function2<Composer, Integer, Unit> function2M12211getLambda$1622016285$feature_lib_gold_externalRelease = LegacyGoldUpgradeAgreementComposable.INSTANCE.m12211getLambda$1622016285$feature_lib_gold_externalRelease();
                        final AppCompatActivity appCompatActivity = appCompatActivityRequireActivityBaseContext;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M12211getLambda$1622016285$feature_lib_gold_externalRelease, null, ComposableLambda3.rememberComposableLambda(398915087, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementComposableKt.GoldUpgradeAgreementComposable.2.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                                invoke(bentoAppBarScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i10) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i10 & 6) == 0) {
                                    i10 |= (i10 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i10 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(398915087, i10, -1, "com.robinhood.android.common.gold.GoldUpgradeAgreementComposable.<anonymous>.<anonymous> (LegacyGoldUpgradeAgreementComposable.kt:79)");
                                }
                                AppCompatActivity appCompatActivity2 = appCompatActivity;
                                composer3.startReplaceGroup(5004770);
                                boolean zChangedInstance2 = composer3.changedInstance(appCompatActivity2);
                                Object objRememberedValue4 = composer3.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = new LegacyGoldUpgradeAgreementComposable5(appCompatActivity2);
                                    composer3.updateRememberedValue(objRememberedValue4);
                                }
                                composer3.endReplaceGroup();
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) ((KFunction) objRememberedValue4), composer3, (BentoAppBarScope.$stable << 12) | ((i10 << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), null, null, false, false, null, null, 0L, null, composer2, 390, 0, 2042);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54);
                final Modifier modifier5 = modifier3;
                Composer composer2 = composerStartRestartGroup;
                ScaffoldKt.m5939ScaffoldTvnljyQ(null, composableLambdaRememberComposableLambda, null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-852408251, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementComposableKt.GoldUpgradeAgreementComposable.3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* compiled from: LegacyGoldUpgradeAgreementComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementComposableKt$GoldUpgradeAgreementComposable$3$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
                        final /* synthetic */ LegacyGoldUpgradeAgreementDuxo $duxo;
                        final /* synthetic */ Function1<UUID, Unit> $onClickAccept;
                        final /* synthetic */ SnapshotState4<LegacyGoldUpgradeAgreementViewState2> $viewState$delegate;

                        /* compiled from: LegacyGoldUpgradeAgreementComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        /* renamed from: com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementComposableKt$GoldUpgradeAgreementComposable$3$1$WhenMappings */
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[LegacyGoldUpgradeAgreementDataState2.values().length];
                                try {
                                    iArr[LegacyGoldUpgradeAgreementDataState2.UNREVIEWED.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[LegacyGoldUpgradeAgreementDataState2.REVIEWED.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                try {
                                    iArr[LegacyGoldUpgradeAgreementDataState2.ACCEPTED.ordinal()] = 3;
                                } catch (NoSuchFieldError unused3) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass1(SnapshotState4<? extends LegacyGoldUpgradeAgreementViewState2> snapshotState4, LegacyGoldUpgradeAgreementDuxo legacyGoldUpgradeAgreementDuxo, Function1<? super UUID, Unit> function1) {
                            this.$viewState$delegate = snapshotState4;
                            this.$duxo = legacyGoldUpgradeAgreementDuxo;
                            this.$onClickAccept = function1;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) throws Resources.NotFoundException {
                            invoke(bentoButtonBar3, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) throws Resources.NotFoundException {
                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                            if ((i & 17) == 16 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-468915472, i, -1, "com.robinhood.android.common.gold.GoldUpgradeAgreementComposable.<anonymous>.<anonymous> (LegacyGoldUpgradeAgreementComposable.kt:88)");
                            }
                            LegacyGoldUpgradeAgreementViewState2 legacyGoldUpgradeAgreementViewState2GoldUpgradeAgreementComposable$lambda$0 = LegacyGoldUpgradeAgreementComposable3.GoldUpgradeAgreementComposable$lambda$0(this.$viewState$delegate);
                            composer.startReplaceGroup(-1746271574);
                            boolean zChanged = composer.changed(this.$viewState$delegate) | composer.changedInstance(this.$duxo) | composer.changed(this.$onClickAccept);
                            final SnapshotState4<LegacyGoldUpgradeAgreementViewState2> snapshotState4 = this.$viewState$delegate;
                            final LegacyGoldUpgradeAgreementDuxo legacyGoldUpgradeAgreementDuxo = this.$duxo;
                            final Function1<UUID, Unit> function1 = this.$onClickAccept;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementComposableKt$GoldUpgradeAgreementComposable$3$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return LegacyGoldUpgradeAgreementComposable3.C111733.AnonymousClass1.invoke$lambda$2$lambda$1(snapshotState4, legacyGoldUpgradeAgreementDuxo, function1);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            LegacyGoldUpgradeAgreementComposable3.BottomBar(legacyGoldUpgradeAgreementViewState2GoldUpgradeAgreementComposable$lambda$0, (Function0) objRememberedValue, composer, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$2$lambda$1(SnapshotState4 snapshotState4, LegacyGoldUpgradeAgreementDuxo legacyGoldUpgradeAgreementDuxo, Function1 function1) {
                            LegacyGoldUpgradeAgreementViewState2 legacyGoldUpgradeAgreementViewState2GoldUpgradeAgreementComposable$lambda$0 = LegacyGoldUpgradeAgreementComposable3.GoldUpgradeAgreementComposable$lambda$0(snapshotState4);
                            LegacyGoldUpgradeAgreementViewState2.Loaded loaded = legacyGoldUpgradeAgreementViewState2GoldUpgradeAgreementComposable$lambda$0 instanceof LegacyGoldUpgradeAgreementViewState2.Loaded ? (LegacyGoldUpgradeAgreementViewState2.Loaded) legacyGoldUpgradeAgreementViewState2GoldUpgradeAgreementComposable$lambda$0 : null;
                            if (loaded != null) {
                                int i = WhenMappings.$EnumSwitchMapping$0[loaded.getStatus().ordinal()];
                                if (i == 1) {
                                    legacyGoldUpgradeAgreementDuxo.onReviewed();
                                } else if (i == 2) {
                                    legacyGoldUpgradeAgreementDuxo.onAccepted();
                                    function1.invoke(loaded.getSelectedPlanId());
                                } else if (i != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i9) {
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i9 & 6) == 0) {
                            i9 |= composer3.changed(paddingValues) ? 4 : 2;
                        }
                        if ((i9 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-852408251, i9, -1, "com.robinhood.android.common.gold.GoldUpgradeAgreementComposable.<anonymous> (LegacyGoldUpgradeAgreementComposable.kt:86)");
                        }
                        Modifier modifierPadding = PaddingKt.padding(modifier5, paddingValues);
                        ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-468915472, true, new AnonymousClass1(snapshotState4CollectAsStateWithLifecycle, legacyGoldUpgradeAgreementDuxo3, onClickAccept), composer3, 54);
                        final ScrollState scrollState = scrollStateRememberScrollState;
                        final LegacyGoldUpgradeAgreementDuxo legacyGoldUpgradeAgreementDuxo7 = legacyGoldUpgradeAgreementDuxo3;
                        final Function1<Throwable, Unit> function1 = onError;
                        final SnapshotState4<LegacyGoldUpgradeAgreementViewState2> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                        BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifierPadding, false, composableLambdaRememberComposableLambda2, ComposableLambda3.rememberComposableLambda(1780131933, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementComposableKt.GoldUpgradeAgreementComposable.3.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer4, Integer num) {
                                invoke(boxScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer4, int i10) {
                                Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                if ((i10 & 17) == 16 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1780131933, i10, -1, "com.robinhood.android.common.gold.GoldUpgradeAgreementComposable.<anonymous>.<anonymous> (LegacyGoldUpgradeAgreementComposable.kt:110)");
                                }
                                LegacyGoldUpgradeAgreementViewState2 legacyGoldUpgradeAgreementViewState2GoldUpgradeAgreementComposable$lambda$03 = LegacyGoldUpgradeAgreementComposable3.GoldUpgradeAgreementComposable$lambda$0(snapshotState4);
                                if (legacyGoldUpgradeAgreementViewState2GoldUpgradeAgreementComposable$lambda$03 instanceof LegacyGoldUpgradeAgreementViewState2.Loading) {
                                    composer4.startReplaceGroup(1309807174);
                                    LegacyGoldUpgradeAgreementComposable3.Loading(composer4, 0);
                                    composer4.endReplaceGroup();
                                } else if (legacyGoldUpgradeAgreementViewState2GoldUpgradeAgreementComposable$lambda$03 instanceof LegacyGoldUpgradeAgreementViewState2.Loaded) {
                                    composer4.startReplaceGroup(1309809534);
                                    LegacyGoldUpgradeAgreementViewState2.Loaded loaded2 = (LegacyGoldUpgradeAgreementViewState2.Loaded) legacyGoldUpgradeAgreementViewState2GoldUpgradeAgreementComposable$lambda$03;
                                    ScrollState scrollState2 = scrollState;
                                    Object obj = legacyGoldUpgradeAgreementDuxo7;
                                    composer4.startReplaceGroup(5004770);
                                    boolean zChangedInstance2 = composer4.changedInstance(obj);
                                    Object objRememberedValue4 = composer4.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue4 = new LegacyGoldUpgradeAgreementComposable6(obj);
                                        composer4.updateRememberedValue(objRememberedValue4);
                                    }
                                    composer4.endReplaceGroup();
                                    LegacyGoldUpgradeAgreementComposable3.Loaded(loaded2, scrollState2, (Function0) ((KFunction) objRememberedValue4), null, composer4, 0, 8);
                                    composer4.endReplaceGroup();
                                } else {
                                    if (!(legacyGoldUpgradeAgreementViewState2GoldUpgradeAgreementComposable$lambda$03 instanceof LegacyGoldUpgradeAgreementViewState2.Error)) {
                                        composer4.startReplaceGroup(1309804781);
                                        composer4.endReplaceGroup();
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    composer4.startReplaceGroup(1949608256);
                                    Unit unit = Unit.INSTANCE;
                                    composer4.startReplaceGroup(-1633490746);
                                    boolean zChanged3 = composer4.changed(function1) | composer4.changed(legacyGoldUpgradeAgreementViewState2GoldUpgradeAgreementComposable$lambda$03);
                                    Function1<Throwable, Unit> function12 = function1;
                                    Object objRememberedValue5 = composer4.rememberedValue();
                                    if (zChanged3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue5 = new LegacyGoldUpgradeAgreementComposable7(function12, legacyGoldUpgradeAgreementViewState2GoldUpgradeAgreementComposable$lambda$03, null);
                                        composer4.updateRememberedValue(objRememberedValue5);
                                    }
                                    composer4.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composer4, 6);
                                    composer4.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, 3504, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, 805306416, 509);
                composerStartRestartGroup = composer2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                legacyGoldUpgradeAgreementDuxo4 = legacyGoldUpgradeAgreementDuxo3;
                modifier4 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                legacyGoldUpgradeAgreementDuxo4 = legacyGoldUpgradeAgreementDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LegacyGoldUpgradeAgreementComposable3.GoldUpgradeAgreementComposable$lambda$3(onClickAccept, onError, modifier4, legacyGoldUpgradeAgreementDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if ((i3 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i7 == 0) {
                }
                if ((i2 & 8) == 0) {
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(legacyGoldUpgradeAgreementDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                scrollStateRememberScrollState = ScrollKt.rememberScrollState(i5, composerStartRestartGroup, i5, 1);
                LegacyGoldUpgradeAgreementViewState2 legacyGoldUpgradeAgreementViewState2GoldUpgradeAgreementComposable$lambda$03 = GoldUpgradeAgreementComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(legacyGoldUpgradeAgreementViewState2GoldUpgradeAgreementComposable$lambda$03);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    LegacyGoldUpgradeAgreementViewState2 legacyGoldUpgradeAgreementViewState2GoldUpgradeAgreementComposable$lambda$022 = GoldUpgradeAgreementComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                    if (!(legacyGoldUpgradeAgreementViewState2GoldUpgradeAgreementComposable$lambda$022 instanceof LegacyGoldUpgradeAgreementViewState2.Loaded)) {
                    }
                    objRememberedValue = Boolean.valueOf((loaded == null ? loaded.getStatus() : null) != LegacyGoldUpgradeAgreementDataState2.REVIEWED ? 1 : i5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    Boolean bool2 = (Boolean) objRememberedValue;
                    zBooleanValue = bool2.booleanValue();
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(i4);
                    zChanged2 = composerStartRestartGroup.changed(zBooleanValue) | composerStartRestartGroup.changed(scrollStateRememberScrollState);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged2) {
                        objRememberedValue2 = new LegacyGoldUpgradeAgreementComposable4(zBooleanValue, scrollStateRememberScrollState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(bool2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i5);
                        final AppCompatActivity appCompatActivityRequireActivityBaseContext2 = BaseContexts.requireActivityBaseContext((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
                        ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-2082472400, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementComposableKt.GoldUpgradeAgreementComposable.2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer22, Integer num) {
                                invoke(composer22, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer22, int i9) {
                                if ((i9 & 3) == 2 && composer22.getSkipping()) {
                                    composer22.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2082472400, i9, -1, "com.robinhood.android.common.gold.GoldUpgradeAgreementComposable.<anonymous> (LegacyGoldUpgradeAgreementComposable.kt:76)");
                                }
                                Function2<Composer, Integer, Unit> function2M12211getLambda$1622016285$feature_lib_gold_externalRelease = LegacyGoldUpgradeAgreementComposable.INSTANCE.m12211getLambda$1622016285$feature_lib_gold_externalRelease();
                                final AppCompatActivity appCompatActivity = appCompatActivityRequireActivityBaseContext2;
                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M12211getLambda$1622016285$feature_lib_gold_externalRelease, null, ComposableLambda3.rememberComposableLambda(398915087, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementComposableKt.GoldUpgradeAgreementComposable.2.1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                                        invoke(bentoAppBarScope, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i10) {
                                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                        if ((i10 & 6) == 0) {
                                            i10 |= (i10 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                                        }
                                        if ((i10 & 19) == 18 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(398915087, i10, -1, "com.robinhood.android.common.gold.GoldUpgradeAgreementComposable.<anonymous>.<anonymous> (LegacyGoldUpgradeAgreementComposable.kt:79)");
                                        }
                                        AppCompatActivity appCompatActivity2 = appCompatActivity;
                                        composer3.startReplaceGroup(5004770);
                                        boolean zChangedInstance2 = composer3.changedInstance(appCompatActivity2);
                                        Object objRememberedValue4 = composer3.rememberedValue();
                                        if (zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue4 = new LegacyGoldUpgradeAgreementComposable5(appCompatActivity2);
                                            composer3.updateRememberedValue(objRememberedValue4);
                                        }
                                        composer3.endReplaceGroup();
                                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) ((KFunction) objRememberedValue4), composer3, (BentoAppBarScope.$stable << 12) | ((i10 << 12) & 57344), 7);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer22, 54), null, null, false, false, null, null, 0L, null, composer22, 390, 0, 2042);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54);
                        final Modifier modifier52 = modifier3;
                        Composer composer22 = composerStartRestartGroup;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(null, composableLambdaRememberComposableLambda2, null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-852408251, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementComposableKt.GoldUpgradeAgreementComposable.3
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                invoke(paddingValues, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* compiled from: LegacyGoldUpgradeAgreementComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementComposableKt$GoldUpgradeAgreementComposable$3$1, reason: invalid class name */
                            static final class AnonymousClass1 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
                                final /* synthetic */ LegacyGoldUpgradeAgreementDuxo $duxo;
                                final /* synthetic */ Function1<UUID, Unit> $onClickAccept;
                                final /* synthetic */ SnapshotState4<LegacyGoldUpgradeAgreementViewState2> $viewState$delegate;

                                /* compiled from: LegacyGoldUpgradeAgreementComposable.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                /* renamed from: com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementComposableKt$GoldUpgradeAgreementComposable$3$1$WhenMappings */
                                public /* synthetic */ class WhenMappings {
                                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                    static {
                                        int[] iArr = new int[LegacyGoldUpgradeAgreementDataState2.values().length];
                                        try {
                                            iArr[LegacyGoldUpgradeAgreementDataState2.UNREVIEWED.ordinal()] = 1;
                                        } catch (NoSuchFieldError unused) {
                                        }
                                        try {
                                            iArr[LegacyGoldUpgradeAgreementDataState2.REVIEWED.ordinal()] = 2;
                                        } catch (NoSuchFieldError unused2) {
                                        }
                                        try {
                                            iArr[LegacyGoldUpgradeAgreementDataState2.ACCEPTED.ordinal()] = 3;
                                        } catch (NoSuchFieldError unused3) {
                                        }
                                        $EnumSwitchMapping$0 = iArr;
                                    }
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                AnonymousClass1(SnapshotState4<? extends LegacyGoldUpgradeAgreementViewState2> snapshotState4, LegacyGoldUpgradeAgreementDuxo legacyGoldUpgradeAgreementDuxo, Function1<? super UUID, Unit> function1) {
                                    this.$viewState$delegate = snapshotState4;
                                    this.$duxo = legacyGoldUpgradeAgreementDuxo;
                                    this.$onClickAccept = function1;
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) throws Resources.NotFoundException {
                                    invoke(bentoButtonBar3, composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) throws Resources.NotFoundException {
                                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                    if ((i & 17) == 16 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-468915472, i, -1, "com.robinhood.android.common.gold.GoldUpgradeAgreementComposable.<anonymous>.<anonymous> (LegacyGoldUpgradeAgreementComposable.kt:88)");
                                    }
                                    LegacyGoldUpgradeAgreementViewState2 legacyGoldUpgradeAgreementViewState2GoldUpgradeAgreementComposable$lambda$0 = LegacyGoldUpgradeAgreementComposable3.GoldUpgradeAgreementComposable$lambda$0(this.$viewState$delegate);
                                    composer.startReplaceGroup(-1746271574);
                                    boolean zChanged = composer.changed(this.$viewState$delegate) | composer.changedInstance(this.$duxo) | composer.changed(this.$onClickAccept);
                                    final SnapshotState4 snapshotState4 = this.$viewState$delegate;
                                    final LegacyGoldUpgradeAgreementDuxo legacyGoldUpgradeAgreementDuxo = this.$duxo;
                                    final Function1 function1 = this.$onClickAccept;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementComposableKt$GoldUpgradeAgreementComposable$3$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return LegacyGoldUpgradeAgreementComposable3.C111733.AnonymousClass1.invoke$lambda$2$lambda$1(snapshotState4, legacyGoldUpgradeAgreementDuxo, function1);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    LegacyGoldUpgradeAgreementComposable3.BottomBar(legacyGoldUpgradeAgreementViewState2GoldUpgradeAgreementComposable$lambda$0, (Function0) objRememberedValue, composer, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$2$lambda$1(SnapshotState4 snapshotState4, LegacyGoldUpgradeAgreementDuxo legacyGoldUpgradeAgreementDuxo, Function1 function1) {
                                    LegacyGoldUpgradeAgreementViewState2 legacyGoldUpgradeAgreementViewState2GoldUpgradeAgreementComposable$lambda$0 = LegacyGoldUpgradeAgreementComposable3.GoldUpgradeAgreementComposable$lambda$0(snapshotState4);
                                    LegacyGoldUpgradeAgreementViewState2.Loaded loaded = legacyGoldUpgradeAgreementViewState2GoldUpgradeAgreementComposable$lambda$0 instanceof LegacyGoldUpgradeAgreementViewState2.Loaded ? (LegacyGoldUpgradeAgreementViewState2.Loaded) legacyGoldUpgradeAgreementViewState2GoldUpgradeAgreementComposable$lambda$0 : null;
                                    if (loaded != null) {
                                        int i = WhenMappings.$EnumSwitchMapping$0[loaded.getStatus().ordinal()];
                                        if (i == 1) {
                                            legacyGoldUpgradeAgreementDuxo.onReviewed();
                                        } else if (i == 2) {
                                            legacyGoldUpgradeAgreementDuxo.onAccepted();
                                            function1.invoke(loaded.getSelectedPlanId());
                                        } else if (i != 3) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    }
                                    return Unit.INSTANCE;
                                }
                            }

                            public final void invoke(PaddingValues paddingValues, Composer composer3, int i9) {
                                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                if ((i9 & 6) == 0) {
                                    i9 |= composer3.changed(paddingValues) ? 4 : 2;
                                }
                                if ((i9 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-852408251, i9, -1, "com.robinhood.android.common.gold.GoldUpgradeAgreementComposable.<anonymous> (LegacyGoldUpgradeAgreementComposable.kt:86)");
                                }
                                Modifier modifierPadding = PaddingKt.padding(modifier52, paddingValues);
                                ComposableLambda composableLambdaRememberComposableLambda22 = ComposableLambda3.rememberComposableLambda(-468915472, true, new AnonymousClass1(snapshotState4CollectAsStateWithLifecycle, legacyGoldUpgradeAgreementDuxo3, onClickAccept), composer3, 54);
                                final ScrollState scrollState = scrollStateRememberScrollState;
                                final LegacyGoldUpgradeAgreementDuxo legacyGoldUpgradeAgreementDuxo7 = legacyGoldUpgradeAgreementDuxo3;
                                final Function1<? super Throwable, Unit> function1 = onError;
                                final SnapshotState4<? extends LegacyGoldUpgradeAgreementViewState2> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                                BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifierPadding, false, composableLambdaRememberComposableLambda22, ComposableLambda3.rememberComposableLambda(1780131933, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementComposableKt.GoldUpgradeAgreementComposable.3.2
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer4, Integer num) {
                                        invoke(boxScope, composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer4, int i10) {
                                        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                        if ((i10 & 17) == 16 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1780131933, i10, -1, "com.robinhood.android.common.gold.GoldUpgradeAgreementComposable.<anonymous>.<anonymous> (LegacyGoldUpgradeAgreementComposable.kt:110)");
                                        }
                                        LegacyGoldUpgradeAgreementViewState2 legacyGoldUpgradeAgreementViewState2GoldUpgradeAgreementComposable$lambda$032 = LegacyGoldUpgradeAgreementComposable3.GoldUpgradeAgreementComposable$lambda$0(snapshotState4);
                                        if (legacyGoldUpgradeAgreementViewState2GoldUpgradeAgreementComposable$lambda$032 instanceof LegacyGoldUpgradeAgreementViewState2.Loading) {
                                            composer4.startReplaceGroup(1309807174);
                                            LegacyGoldUpgradeAgreementComposable3.Loading(composer4, 0);
                                            composer4.endReplaceGroup();
                                        } else if (legacyGoldUpgradeAgreementViewState2GoldUpgradeAgreementComposable$lambda$032 instanceof LegacyGoldUpgradeAgreementViewState2.Loaded) {
                                            composer4.startReplaceGroup(1309809534);
                                            LegacyGoldUpgradeAgreementViewState2.Loaded loaded2 = (LegacyGoldUpgradeAgreementViewState2.Loaded) legacyGoldUpgradeAgreementViewState2GoldUpgradeAgreementComposable$lambda$032;
                                            ScrollState scrollState2 = scrollState;
                                            Object obj = legacyGoldUpgradeAgreementDuxo7;
                                            composer4.startReplaceGroup(5004770);
                                            boolean zChangedInstance2 = composer4.changedInstance(obj);
                                            Object objRememberedValue4 = composer4.rememberedValue();
                                            if (zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue4 = new LegacyGoldUpgradeAgreementComposable6(obj);
                                                composer4.updateRememberedValue(objRememberedValue4);
                                            }
                                            composer4.endReplaceGroup();
                                            LegacyGoldUpgradeAgreementComposable3.Loaded(loaded2, scrollState2, (Function0) ((KFunction) objRememberedValue4), null, composer4, 0, 8);
                                            composer4.endReplaceGroup();
                                        } else {
                                            if (!(legacyGoldUpgradeAgreementViewState2GoldUpgradeAgreementComposable$lambda$032 instanceof LegacyGoldUpgradeAgreementViewState2.Error)) {
                                                composer4.startReplaceGroup(1309804781);
                                                composer4.endReplaceGroup();
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            composer4.startReplaceGroup(1949608256);
                                            Unit unit = Unit.INSTANCE;
                                            composer4.startReplaceGroup(-1633490746);
                                            boolean zChanged3 = composer4.changed(function1) | composer4.changed(legacyGoldUpgradeAgreementViewState2GoldUpgradeAgreementComposable$lambda$032);
                                            Function1<Throwable, Unit> function12 = function1;
                                            Object objRememberedValue5 = composer4.rememberedValue();
                                            if (zChanged3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue5 = new LegacyGoldUpgradeAgreementComposable7(function12, legacyGoldUpgradeAgreementViewState2GoldUpgradeAgreementComposable$lambda$032, null);
                                                composer4.updateRememberedValue(objRememberedValue5);
                                            }
                                            composer4.endReplaceGroup();
                                            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composer4, 6);
                                            composer4.endReplaceGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), composer3, 3504, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composer22, 805306416, 509);
                        composerStartRestartGroup = composer22;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        legacyGoldUpgradeAgreementDuxo4 = legacyGoldUpgradeAgreementDuxo3;
                        modifier4 = modifier52;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LegacyGoldUpgradeAgreementViewState2 GoldUpgradeAgreementComposable$lambda$0(SnapshotState4<? extends LegacyGoldUpgradeAgreementViewState2> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Loaded$lambda$7(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Loading(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1904301537);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1904301537, i, -1, "com.robinhood.android.common.gold.Loading (LegacyGoldUpgradeAgreementComposable.kt:129)");
            }
            LoadingScreenComposablesKt.ListLoadingScreenComposable(null, true, false, 0, composerStartRestartGroup, 48, 13);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LegacyGoldUpgradeAgreementComposable3.Loading$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Loaded(final LegacyGoldUpgradeAgreementViewState2.Loaded loaded, final ScrollState scrollState, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        SnapshotState4 snapshotState4;
        boolean zChangedInstance;
        Object objRememberedValue2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ApiGoldSweepAgreement.Card card;
        Composer composer2;
        final Modifier modifier3;
        long jM21372getBg20d7_KjU;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1315588906);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(loaded) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(scrollState) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1315588906, i3, -1, "com.robinhood.android.common.gold.Loaded (LegacyGoldUpgradeAgreementComposable.kt:139)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Boolean.valueOf(LegacyGoldUpgradeAgreementComposable3.Loaded$lambda$6$lambda$5(scrollState));
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState4 = (SnapshotState4) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Boolean boolValueOf = Boolean.valueOf(Loaded$lambda$7(snapshotState4));
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = ((i3 & 896) != 256) | composerStartRestartGroup.changedInstance(loaded);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new LegacyGoldUpgradeAgreementComposable8(loaded, function0, snapshotState4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                Modifier modifier5 = modifier4;
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(modifier5, scrollState, false, null, false, 14, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifierVerticalScroll$default, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), composerStartRestartGroup, 0, 0);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                card = loaded.getCard();
                composerStartRestartGroup.startReplaceGroup(-808428275);
                if (card != null) {
                    Alignment.Vertical centerVertically = companion2.getCenterVertically();
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                    if (bentoTheme.getColors(composerStartRestartGroup, i5).getIsDay()) {
                        composerStartRestartGroup.startReplaceGroup(-421702338);
                        jM21372getBg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).getMineral();
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-421616158);
                        jM21372getBg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21372getBg20d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    Modifier modifierM4871backgroundbw27NRU = Background3.m4871backgroundbw27NRU(modifierFillMaxWidth$default, jM21372getBg20d7_KjU, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM()));
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4871backgroundbw27NRU);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    Modifier modifierM5145paddingqDBjuR0 = PaddingKt.m5145paddingqDBjuR0(Row5.weight$default(Row6.INSTANCE, companion4, 1.0f, false, 2, null), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM());
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5145paddingqDBjuR0);
                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                    BentoText2.m20747BentoText38GnDrw(card.getTitle(), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM(), composerStartRestartGroup, 24576, 0, 8174);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM()), composerStartRestartGroup, 0);
                    BentoText2.m20747BentoText38GnDrw(card.getContent(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, 0, 0, 8190);
                    composerStartRestartGroup.endNode();
                    ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageDensityUrl(card.getAssetPath(), null, 2, null).getImageDensityUrl(ContextsUiExtensions.getDensitySpec((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()))), null, null, ContentScale.INSTANCE.getFillWidth(), 0, null, composerStartRestartGroup, 3072, 54), (String) null, PaddingKt.m5146paddingqDBjuR0$default(SizeKt.m5158heightInVpY3zN4$default(SizeKt.m5174width3ABfNKs(TestTag3.testTag(companion4, "cardAsset"), PrimitiveResources_androidKt.dimensionResource(C11182R.dimen.gold_upgrade_agreement_card_image_width, composerStartRestartGroup, 0)), PrimitiveResources_androidKt.dimensionResource(C11182R.dimen.gold_upgrade_agreement_card_image_width, composerStartRestartGroup, 0), 0.0f, 2, null), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 48, 120);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                    Unit unit = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                Composer composer3 = composerStartRestartGroup;
                composer2 = composer3;
                BentoMarkdownText2.BentoMarkdownText(loaded.getDisclosureMarkdown(), (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), 0, 0L, bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU(), false, composer3, BentoMarkdownText.$stable << 15, 22), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, MarkdownStyle.$stable << 6, 26);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LegacyGoldUpgradeAgreementComposable3.Loaded$lambda$13(loaded, scrollState, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            snapshotState4 = (SnapshotState4) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Boolean boolValueOf2 = Boolean.valueOf(Loaded$lambda$7(snapshotState4));
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            zChangedInstance = ((i3 & 896) != 256) | composerStartRestartGroup.changedInstance(loaded);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue2 = new LegacyGoldUpgradeAgreementComposable8(loaded, function0, snapshotState4, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                Modifier modifier52 = modifier4;
                Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(modifier52, scrollState, false, null, false, 14, null);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifierVerticalScroll$default2, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), composerStartRestartGroup, 0, 0);
                Arrangement arrangement2 = Arrangement.INSTANCE;
                Arrangement.Vertical top2 = arrangement2.getTop();
                Alignment.Companion companion22 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ2);
                ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor4 = companion32.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy3, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion32.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    card = loaded.getCard();
                    composerStartRestartGroup.startReplaceGroup(-808428275);
                    if (card != null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Composer composer32 = composerStartRestartGroup;
                    composer2 = composer32;
                    BentoMarkdownText2.BentoMarkdownText(loaded.getDisclosureMarkdown(), (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), 0, 0L, bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU(), false, composer32, BentoMarkdownText.$stable << 15, 22), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, MarkdownStyle.$stable << 6, 26);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Loaded$lambda$6$lambda$5(ScrollState scrollState) {
        return scrollState.getValue() == scrollState.getMaxValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BottomBar(final LegacyGoldUpgradeAgreementViewState2 legacyGoldUpgradeAgreementViewState2, Function0<Unit> function0, Composer composer, final int i) throws Resources.NotFoundException {
        int i2;
        String string2;
        boolean z;
        Modifier.Companion companion;
        boolean z2;
        Object obj;
        StringResource ctaText;
        StringResource disclosureAcceptText;
        final Function0<Unit> function02 = function0;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1798248319);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(legacyGoldUpgradeAgreementViewState2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1798248319, i3, -1, "com.robinhood.android.common.gold.BottomBar (LegacyGoldUpgradeAgreementComposable.kt:208)");
            }
            Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion2);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(modifierFillMaxWidth$default, bentoTheme.getColors(composerStartRestartGroup, i4).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 6, 4);
            composerStartRestartGroup = composerStartRestartGroup;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, 6, 0);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            boolean z3 = legacyGoldUpgradeAgreementViewState2 instanceof LegacyGoldUpgradeAgreementViewState2.Loaded;
            LegacyGoldUpgradeAgreementViewState2.Loaded loaded = z3 ? (LegacyGoldUpgradeAgreementViewState2.Loaded) legacyGoldUpgradeAgreementViewState2 : null;
            if (loaded == null || (disclosureAcceptText = loaded.getDisclosureAcceptText()) == null) {
                string2 = null;
                composerStartRestartGroup.startReplaceGroup(1976935417);
                if (string2 != null || StringsKt.isBlank(string2)) {
                    z = z3;
                    companion = companion2;
                    z2 = false;
                    obj = null;
                } else {
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion2);
                    Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy3, companion4.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                    MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I = BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composerStartRestartGroup, i4).getTextS(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), bentoTheme.getColors(composerStartRestartGroup, i4).m21426getFg20d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i4).m21426getFg20d7_KjU(), false, composerStartRestartGroup, BentoMarkdownText.$stable << 15, 16);
                    obj = null;
                    companion = companion2;
                    z = z3;
                    z2 = false;
                    composerStartRestartGroup = composerStartRestartGroup;
                    BentoMarkdownText2.BentoMarkdownText(string2, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), markdownStyleM21100withTextStylesYhh7B2I, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composerStartRestartGroup, (MarkdownStyle.$stable << 6) | 48, 24);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endNode();
                }
                composerStartRestartGroup.endReplaceGroup();
                if (loaded != null || (ctaText = loaded.getCtaText()) == null) {
                    String string3 = "";
                    boolean z4 = (!z || ((LegacyGoldUpgradeAgreementViewState2.Loaded) legacyGoldUpgradeAgreementViewState2).getStatus() == LegacyGoldUpgradeAgreementDataState2.ACCEPTED) ? z2 : true;
                    function02 = function0;
                    BentoSparkleButton2.BentoSparkleButton(function02, string3, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, obj), null, z4, legacyGoldUpgradeAgreementViewState2 instanceof LegacyGoldUpgradeAgreementViewState2.Loading, false, composerStartRestartGroup, ((i3 >> 3) & 14) | 384, 72);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    Intrinsics.checkNotNull(resources);
                    CharSequence text = ctaText.getText(resources);
                    if (text == null || (string3 = text.toString()) == null) {
                    }
                    if (z) {
                        function02 = function0;
                        BentoSparkleButton2.BentoSparkleButton(function02, string3, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, obj), null, z4, legacyGoldUpgradeAgreementViewState2 instanceof LegacyGoldUpgradeAgreementViewState2.Loading, false, composerStartRestartGroup, ((i3 >> 3) & 14) | 384, 72);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                }
            } else {
                Intrinsics.checkNotNull(resources);
                CharSequence text2 = disclosureAcceptText.getText(resources);
                if (text2 != null) {
                    string2 = text2.toString();
                }
                composerStartRestartGroup.startReplaceGroup(1976935417);
                if (string2 != null) {
                    z = z3;
                    companion = companion2;
                    z2 = false;
                    obj = null;
                    composerStartRestartGroup.endReplaceGroup();
                    if (loaded != null) {
                        String string32 = "";
                        if (z) {
                        }
                    }
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return LegacyGoldUpgradeAgreementComposable3.BottomBar$lambda$17(legacyGoldUpgradeAgreementViewState2, function02, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }
}
