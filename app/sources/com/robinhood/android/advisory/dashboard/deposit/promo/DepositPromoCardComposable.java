package com.robinhood.android.advisory.dashboard.deposit.promo;

import android.content.Context;
import android.net.Uri;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Intrinsic3;
import androidx.compose.foundation.layout.Intrinsic4;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
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
import androidx.compose.runtime.Updater;
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
import coil.Coil;
import coil.ImageLoader;
import coil.compose.AsyncImagePainter4;
import com.robinhood.android.advisory.contracts.AdvisoryDepositPromoDetailsFragmentKey;
import com.robinhood.android.advisory.dashboard.deposit.promo.DepositPromoCardComposable;
import com.robinhood.android.advisory.dashboard.deposit.promo.DepositPromoCardViewState;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.common.Haptics;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.advisory.p304db.card.StrategiesDashboardCard;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: DepositPromoCardComposable.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a)\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\"\u0016\u0010\u0000\u001a\u00020\u00018\u0000X\u0081D¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\f²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u0084\u0002"}, m3636d2 = {"TAG_DEPOSIT_PROMO_CARD", "", "getTAG_DEPOSIT_PROMO_CARD", "()Ljava/lang/String;", "DepositPromoCardComposable", "", "accountNumber", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/advisory/dashboard/deposit/promo/DepositPromoCardDuxo;", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/advisory/dashboard/deposit/promo/DepositPromoCardDuxo;Landroidx/compose/runtime/Composer;II)V", "lib-advisory-dashboard_externalDebug", "viewState", "Lcom/robinhood/android/advisory/dashboard/deposit/promo/DepositPromoCardViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.dashboard.deposit.promo.DepositPromoCardComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class DepositPromoCardComposable {
    private static final String TAG_DEPOSIT_PROMO_CARD = "deposit_promo_card";

    /* JADX INFO: Access modifiers changed from: private */
    public static final int DepositPromoCardComposable$lambda$4$lambda$3$lambda$1(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int DepositPromoCardComposable$lambda$4$lambda$3$lambda$2(int i) {
        return -i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DepositPromoCardComposable$lambda$6(String str, Modifier modifier, DepositPromoCardDuxo depositPromoCardDuxo, int i, int i2, Composer composer, int i3) {
        DepositPromoCardComposable(str, modifier, depositPromoCardDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final String getTAG_DEPOSIT_PROMO_CARD() {
        return TAG_DEPOSIT_PROMO_CARD;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DepositPromoCardComposable(final String accountNumber, Modifier modifier, DepositPromoCardDuxo depositPromoCardDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        DepositPromoCardDuxo depositPromoCardDuxo2;
        Modifier modifier3;
        int i4;
        DepositPromoCardDuxo depositPromoCardDuxo3;
        Object objRememberedValue;
        Composer.Companion companion;
        boolean zChangedInstance;
        Object objRememberedValue2;
        final DepositPromoCardDuxo depositPromoCardDuxo4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Composer composerStartRestartGroup = composer.startRestartGroup(2043816849);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(accountNumber) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    depositPromoCardDuxo2 = depositPromoCardDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(depositPromoCardDuxo2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    depositPromoCardDuxo2 = depositPromoCardDuxo;
                }
                i3 |= i6;
            } else {
                depositPromoCardDuxo2 = depositPromoCardDuxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(DepositPromoCardDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.advisory.dashboard.deposit.promo.DepositPromoCardComposableKt$DepositPromoCardComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.advisory.dashboard.deposit.promo.DepositPromoCardComposableKt$DepositPromoCardComposable$$inlined$duxo$1.1
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
                        i4 = i3 & (-897);
                        depositPromoCardDuxo3 = (DepositPromoCardDuxo) baseDuxo;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2043816849, i4, -1, "com.robinhood.android.advisory.dashboard.deposit.promo.DepositPromoCardComposable (DepositPromoCardComposable.kt:63)");
                        }
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(depositPromoCardDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                        DepositPromoCardViewState depositPromoCardViewStateDepositPromoCardComposable$lambda$0 = DepositPromoCardComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.dashboard.deposit.promo.DepositPromoCardComposableKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return DepositPromoCardComposable.DepositPromoCardComposable$lambda$4$lambda$3((AnimatedContentTransitionScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        modifier2 = modifier3;
                        AnimatedContentKt.AnimatedContent(depositPromoCardViewStateDepositPromoCardComposable$lambda$0, modifier2, (Function1) objRememberedValue, null, null, null, ComposableLambda3.rememberComposableLambda(-1951375861, true, new C86462(navigator, context, depositPromoCardDuxo3), composerStartRestartGroup, 54), composerStartRestartGroup, (i4 & 112) | 1573248, 56);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        int i7 = i4 & 14;
                        zChangedInstance = composerStartRestartGroup.changedInstance(depositPromoCardDuxo3) | (i7 != 4);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new DepositPromoCardComposable2(depositPromoCardDuxo3, accountNumber, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(accountNumber, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i7);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        depositPromoCardDuxo4 = depositPromoCardDuxo3;
                    } else {
                        i4 = i3;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                }
                depositPromoCardDuxo3 = depositPromoCardDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(depositPromoCardDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                DepositPromoCardViewState depositPromoCardViewStateDepositPromoCardComposable$lambda$02 = DepositPromoCardComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                modifier2 = modifier3;
                AnimatedContentKt.AnimatedContent(depositPromoCardViewStateDepositPromoCardComposable$lambda$02, modifier2, (Function1) objRememberedValue, null, null, null, ComposableLambda3.rememberComposableLambda(-1951375861, true, new C86462(navigator2, context2, depositPromoCardDuxo3), composerStartRestartGroup, 54), composerStartRestartGroup, (i4 & 112) | 1573248, 56);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                int i72 = i4 & 14;
                zChangedInstance = composerStartRestartGroup.changedInstance(depositPromoCardDuxo3) | (i72 != 4);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue2 = new DepositPromoCardComposable2(depositPromoCardDuxo3, accountNumber, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(accountNumber, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i72);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    depositPromoCardDuxo4 = depositPromoCardDuxo3;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                depositPromoCardDuxo4 = depositPromoCardDuxo2;
            }
            final Modifier modifier4 = modifier2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.dashboard.deposit.promo.DepositPromoCardComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DepositPromoCardComposable.DepositPromoCardComposable$lambda$6(accountNumber, modifier4, depositPromoCardDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                if (i5 == 0) {
                }
                if ((i2 & 4) == 0) {
                }
            }
        }
        final Modifier modifier42 = modifier2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentTransform DepositPromoCardComposable$lambda$4$lambda$3(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInVertically$default(null, new Function1() { // from class: com.robinhood.android.advisory.dashboard.deposit.promo.DepositPromoCardComposableKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(DepositPromoCardComposable.DepositPromoCardComposable$lambda$4$lambda$3$lambda$1(((Integer) obj).intValue()));
            }
        }, 1, null), EnterExitTransitionKt.slideOutVertically$default(null, new Function1() { // from class: com.robinhood.android.advisory.dashboard.deposit.promo.DepositPromoCardComposableKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(DepositPromoCardComposable.DepositPromoCardComposable$lambda$4$lambda$3$lambda$2(((Integer) obj).intValue()));
            }
        }, 1, null));
    }

    /* compiled from: DepositPromoCardComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.dashboard.deposit.promo.DepositPromoCardComposableKt$DepositPromoCardComposable$2 */
    static final class C86462 implements Function4<AnimatedContentScope, DepositPromoCardViewState, Composer, Integer, Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ DepositPromoCardDuxo $duxo;
        final /* synthetic */ Navigator $navigator;

        C86462(Navigator navigator, Context context, DepositPromoCardDuxo depositPromoCardDuxo) {
            this.$navigator = navigator;
            this.$context = context;
            this.$duxo = depositPromoCardDuxo;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, DepositPromoCardViewState depositPromoCardViewState, Composer composer, Integer num) {
            invoke(animatedContentScope, depositPromoCardViewState, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r13v13, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r13v14 */
        /* JADX WARN: Type inference failed for: r13v17 */
        public final void invoke(AnimatedContentScope AnimatedContent, final DepositPromoCardViewState vs, Composer composer, int i) {
            Modifier.Companion companion;
            boolean z;
            Color composeColor;
            ?? r13;
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            Intrinsics.checkNotNullParameter(vs, "vs");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1951375861, i, -1, "com.robinhood.android.advisory.dashboard.deposit.promo.DepositPromoCardComposable.<anonymous> (DepositPromoCardComposable.kt:76)");
            }
            if (vs instanceof DepositPromoCardViewState.Loaded) {
                composer.startReplaceGroup(-1055689577);
                composer.startReplaceGroup(-1746271574);
                int i2 = (i & 112) ^ 48;
                boolean zChangedInstance = ((i2 > 32 && composer.changedInstance(vs)) || (i & 48) == 32) | composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context);
                final Navigator navigator = this.$navigator;
                final Context context = this.$context;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.dashboard.deposit.promo.DepositPromoCardComposableKt$DepositPromoCardComposable$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DepositPromoCardComposable.C86462.invoke$lambda$1$lambda$0(vs, navigator, context);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                Function0<Unit> function0HapticClick = Haptics.hapticClick((Function0) objRememberedValue, composer, 0);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                float f = 8;
                Modifier modifierM4876borderxT4_qwU = BorderKt.m4876borderxT4_qwU(Background3.m4871backgroundbw27NRU(PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), bentoTheme.getColors(composer, i3).m21372getBg20d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f))), C2002Dp.m7995constructorimpl(1), bentoTheme.getColors(composer, i3).m21373getBg30d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f)));
                Intrinsic4 intrinsic4 = Intrinsic4.Min;
                Modifier modifierTestTag = TestTag3.testTag(ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(Clip.clip(Intrinsic3.height(modifierM4876borderxT4_qwU, intrinsic4), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f))), false, null, null, function0HapticClick, 7, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.CARD, "advisory_promo", null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null), DepositPromoCardComposable.getTAG_DEPOSIT_PROMO_CARD());
                Alignment.Companion companion3 = Alignment.INSTANCE;
                Alignment.Vertical centerVertically = companion3.getCenterVertically();
                final DepositPromoCardDuxo depositPromoCardDuxo = this.$duxo;
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer, 48);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierTestTag);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion4.getConstructor();
                if (composer.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                Modifier modifierM5142padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m5142padding3ABfNKs(Row5.weight$default(Row6.INSTANCE, companion2, 1.0f, false, 2, null), bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM());
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composer, 0);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM5142padding3ABfNKs);
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                if (composer.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                DepositPromoCardViewState.Loaded loaded = (DepositPromoCardViewState.Loaded) vs;
                BentoText2.m20747BentoText38GnDrw(loaded.getCard().getTextMarkdown(), null, Color.m6701boximpl(bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getTextM(), composer, 0, 0, 8186);
                Composer composer2 = composer;
                StrategiesDashboardCard.Cta cta = loaded.getCard().getCta();
                composer2.startReplaceGroup(1124994079);
                if (cta == null) {
                    companion = companion2;
                    r13 = 0;
                } else {
                    String title = cta.getTitle();
                    Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composer2, i3).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    companion = companion2;
                    ThemedColorDto foregroundColor = cta.getForegroundColor();
                    composer2.startReplaceGroup(1125003949);
                    if (foregroundColor == null) {
                        composeColor = null;
                        z = false;
                    } else {
                        z = false;
                        composeColor = SduiColors2.toComposeColor(foregroundColor, composer2, 0);
                    }
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(1125003322);
                    long jM21425getFg0d7_KjU = composeColor == null ? bentoTheme.getColors(composer2, i3).m21425getFg0d7_KjU() : composeColor.getValue();
                    composer2.endReplaceGroup();
                    BentoTextButton2.m20715BentoTextButtonPIknLig(function0HapticClick, title, modifierM5146paddingqDBjuR0$default, null, null, false, Color.m6701boximpl(jM21425getFg0d7_KjU), composer2, 0, 56);
                    Unit unit = Unit.INSTANCE;
                    r13 = z;
                }
                composer2.endReplaceGroup();
                composer2.endNode();
                Modifier modifierHeight = Intrinsic3.height(SizeKt.m5174width3ABfNKs(companion, C2002Dp.m7995constructorimpl(80)), intrinsic4);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), r13);
                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, r13);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierHeight);
                Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                StrategiesDashboardCard.Image image = loaded.getCard().getImage();
                composer2.startReplaceGroup(951751408);
                if (image != null) {
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                    String lightUrl = bentoTheme.getColors(composer2, i3).getIsDay() ? image.getLightUrl() : image.getDarkUrl();
                    ImageLoader imageLoader = Coil.imageLoader((Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
                    ContentScale.Companion companion5 = ContentScale.INSTANCE;
                    composer2 = composer;
                    ImageKt.Image(AsyncImagePainter4.m9105rememberAsyncImagePainter0YpotYA(lightUrl, imageLoader, null, null, companion5.getFillHeight(), 0, null, composer2, 24576, 108), (String) null, modifierFillMaxSize$default, (Alignment) null, companion5.getFillHeight(), 0.0f, (ColorFilter) null, composer2, 25008, 104);
                    Unit unit2 = Unit.INSTANCE;
                }
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(951773967);
                if (loaded.getDismissable()) {
                    BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.BUBBLE_REMOVE_FILLED_24);
                    long jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(bentoTheme.getColors(composer2, i3).getNova(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
                    String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_close, composer2, r13);
                    Modifier modifierM5142padding3ABfNKs2 = androidx.compose.foundation.layout.PaddingKt.m5142padding3ABfNKs(boxScopeInstance.align(companion, companion3.getTopEnd()), bentoTheme.getSpacing(composer2, i3).m21590getDefaultD9Ej5fM());
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChangedInstance2 = composer2.changedInstance(depositPromoCardDuxo) | (((i2 <= 32 || !composer2.changedInstance(vs)) && (i & 48) != 32) ? r13 : true);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.dashboard.deposit.promo.DepositPromoCardComposableKt$DepositPromoCardComposable$2$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return DepositPromoCardComposable.C86462.invoke$lambda$8$lambda$7$lambda$6$lambda$5(depositPromoCardDuxo, vs);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceGroup();
                    BentoIcon2.m20644BentoIconFU0evQE(size24, strStringResource, jM6705copywmQWz5c$default, modifierM5142padding3ABfNKs2, Haptics.hapticClick((Function0) objRememberedValue2, composer2, r13), false, composer, BentoIcon4.Size24.$stable, 32);
                    composer2 = composer;
                }
                composer2.endReplaceGroup();
                composer2.endNode();
                composer2.endNode();
                composer2.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1050834233);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C2002Dp.m7995constructorimpl(1)), composer, 6);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(DepositPromoCardViewState depositPromoCardViewState, Navigator navigator, Context context) {
            DepositPromoCardViewState.Loaded loaded = (DepositPromoCardViewState.Loaded) depositPromoCardViewState;
            StrategiesDashboardCard.Cta cta = loaded.getCard().getCta();
            String url = cta != null ? cta.getUrl() : null;
            if (url != null) {
                Navigator.DefaultImpls.handleDeepLink$default(navigator, context, Uri.parse(url), null, null, false, null, 60, null);
            } else {
                Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, new AdvisoryDepositPromoDetailsFragmentKey(null, loaded.isRetirement()), false, false, false, false, null, false, null, null, 1020, null);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8$lambda$7$lambda$6$lambda$5(DepositPromoCardDuxo depositPromoCardDuxo, DepositPromoCardViewState depositPromoCardViewState) {
            depositPromoCardDuxo.dismiss(((DepositPromoCardViewState.Loaded) depositPromoCardViewState).getCard());
            return Unit.INSTANCE;
        }
    }

    private static final DepositPromoCardViewState DepositPromoCardComposable$lambda$0(SnapshotState4<? extends DepositPromoCardViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
