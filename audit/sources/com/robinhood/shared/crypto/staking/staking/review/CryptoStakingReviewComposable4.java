package com.robinhood.shared.crypto.staking.staking.review;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Parcelable;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.InspectionMode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
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
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
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
import androidx.view.compose.LocalActivity;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiComponent3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiIcon2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiText2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.component.text.BentoMarkdownSpannedText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.duxo.ComposeUiEvent;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.models.api.staking.ApiCryptoStakingOrder;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.crypto.p315ui.staking.UiCryptoStakingOrderModel;
import com.robinhood.models.serverdriven.experimental.api.CryptoDemeterDataRowCondensed;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.models.serverdriven.experimental.api.RenderableText;
import com.robinhood.models.serverdriven.experimental.api.TextStyle;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.CryptoStakingContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.crypto.p375ui.amountInputView.CryptoAmountInputComposable;
import com.robinhood.shared.crypto.p375ui.amountInputView.CryptoAmountInputEvent;
import com.robinhood.shared.crypto.p375ui.staking.CryptoStakingDataRowCondensedDefaults;
import com.robinhood.shared.crypto.p375ui.staking.SduiCryptoStakingDataRowCondensedKt;
import com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposable4;
import com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewDuxo;
import com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewEvent;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: CryptoStakingReviewComposable.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001aL\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a/\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\b\b\u0002\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u0017\u001a\u0017\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001a\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u001b\u001a/\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\b\b\u0002\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u0017\u001a-\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f2\b\b\u0002\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010 \"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006!²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002²\u0006\u0012\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u008a\u0084\u0002²\u0006\u0012\u0010\"\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#X\u008a\u008e\u0002"}, m3636d2 = {"StaticLoadingReviewContentTag", "", "CryptoStakingReviewComposable", "", "args", "Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewDuxo$InitArgs;", "onSubmitted", "Lkotlin/Function1;", "Lcom/robinhood/models/crypto/ui/staking/UiCryptoStakingOrderModel;", "Lkotlin/ParameterName;", "name", Card.Icon.ORDER, "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewDuxo;", "(Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewDuxo$InitArgs;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewDuxo;Landroidx/compose/runtime/Composer;II)V", "Content", "viewState", "Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewEvent;", "(Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewViewState;Lcom/robinhood/android/udf/event/Event;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LoadingReviewContent", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewLoadingReviewContent", "(Landroidx/compose/runtime/Composer;I)V", "MainContent", "ButtonBar", "primaryButtonOnClick", "Lkotlin/Function0;", "(Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewViewState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-crypto-staking_externalDebug", "reviewEvent", "Lcom/robinhood/compose/duxo/ComposeUiEvent;", "Lcom/robinhood/shared/crypto/ui/amountInputView/CryptoAmountInputEvent;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoStakingReviewComposable4 {
    public static final String StaticLoadingReviewContentTag = "staticLoadingReviewContentTag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ButtonBar$lambda$22(CryptoStakingReviewViewState cryptoStakingReviewViewState, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ButtonBar(cryptoStakingReviewViewState, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$7(CryptoStakingReviewViewState cryptoStakingReviewViewState, Event event, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Content(cryptoStakingReviewViewState, event, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoStakingReviewComposable$lambda$5(CryptoStakingReviewDuxo.InitArgs initArgs, Function1 function1, Modifier modifier, CryptoStakingReviewDuxo cryptoStakingReviewDuxo, int i, int i2, Composer composer, int i3) {
        CryptoStakingReviewComposable(initArgs, function1, modifier, cryptoStakingReviewDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingReviewContent$lambda$8(Modifier modifier, int i, int i2, Composer composer, int i3) {
        LoadingReviewContent(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainContent$lambda$18(CryptoStakingReviewViewState cryptoStakingReviewViewState, Event event, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MainContent(cryptoStakingReviewViewState, event, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewLoadingReviewContent$lambda$9(int i, Composer composer, int i2) {
        PreviewLoadingReviewContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoStakingReviewComposable(final CryptoStakingReviewDuxo.InitArgs args, final Function1<? super UiCryptoStakingOrderModel, Unit> onSubmitted, Modifier modifier, CryptoStakingReviewDuxo cryptoStakingReviewDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoStakingReviewDuxo cryptoStakingReviewDuxo2;
        final CryptoStakingReviewDuxo cryptoStakingReviewDuxo3;
        int i4;
        final Modifier modifier3;
        Event<CryptoStakingReviewEvent> event;
        Object objRememberedValue;
        final ActivityErrorHandler activityErrorHandler;
        final Event<CryptoStakingReviewEvent> eventCryptoStakingReviewComposable$lambda$1;
        final Event<CryptoStakingReviewEvent> eventCryptoStakingReviewComposable$lambda$12;
        final Modifier modifier4;
        EventConsumer<CryptoStakingReviewEvent> eventConsumerInvoke;
        EventConsumer<CryptoStakingReviewEvent> eventConsumerInvoke2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(onSubmitted, "onSubmitted");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2102287048);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(args) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSubmitted) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    cryptoStakingReviewDuxo2 = cryptoStakingReviewDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(cryptoStakingReviewDuxo2) ? 2048 : 1024;
                    i3 |= i6;
                } else {
                    cryptoStakingReviewDuxo2 = cryptoStakingReviewDuxo;
                }
                i3 |= i6;
            } else {
                cryptoStakingReviewDuxo2 = cryptoStakingReviewDuxo;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) == 0) {
                        composerStartRestartGroup.startReplaceGroup(2050738472);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        CreationExtras2 creationExtras2 = new CreationExtras2(current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                        creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, args)));
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoStakingReviewDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt$CryptoStakingReviewComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt$CryptoStakingReviewComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        cryptoStakingReviewDuxo3 = (CryptoStakingReviewDuxo) baseDuxo;
                        Modifier modifier6 = modifier5;
                        i4 = i3 & (-7169);
                        modifier3 = modifier6;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2102287048, i4, -1, "com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposable (CryptoStakingReviewComposable.kt:77)");
                        }
                        Object objConsume = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                        Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type android.app.Activity");
                        Activity activity = (Activity) objConsume;
                        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoStakingReviewDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        composerStartRestartGroup = composerStartRestartGroup;
                        final StateFlow<Event<CryptoStakingReviewEvent>> eventFlow = cryptoStakingReviewDuxo3.getEventFlow();
                        composerStartRestartGroup.startReplaceGroup(-523522313);
                        LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                        Lifecycle.State state = Lifecycle.State.STARTED;
                        CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                        Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt$CryptoStakingReviewComposable$$inlined$collectEventAsStateWithLifecycle$1

                            /* compiled from: Emitters.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt$CryptoStakingReviewComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                            public static final class AnonymousClass2<T> implements FlowCollector {
                                final /* synthetic */ FlowCollector $this_unsafeFlow;

                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt$CryptoStakingReviewComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoStakingReviewComposable.kt", m3646l = {50}, m3647m = "emit")
                                /* renamed from: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt$CryptoStakingReviewComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
                                public static final class AnonymousClass1 extends ContinuationImpl {
                                    Object L$0;
                                    Object L$1;
                                    int label;
                                    /* synthetic */ Object result;

                                    public AnonymousClass1(Continuation continuation) {
                                        super(continuation);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                    public final Object invokeSuspend(Object obj) {
                                        this.result = obj;
                                        this.label |= Integer.MIN_VALUE;
                                        return AnonymousClass2.this.emit(null, this);
                                    }
                                }

                                public AnonymousClass2(FlowCollector flowCollector) {
                                    this.$this_unsafeFlow = flowCollector;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                                @Override // kotlinx.coroutines.flow.FlowCollector
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object emit(Object obj, Continuation continuation) {
                                    AnonymousClass1 anonymousClass1;
                                    if (continuation instanceof AnonymousClass1) {
                                        anonymousClass1 = (AnonymousClass1) continuation;
                                        int i = anonymousClass1.label;
                                        if ((i & Integer.MIN_VALUE) != 0) {
                                            anonymousClass1.label = i - Integer.MIN_VALUE;
                                        } else {
                                            anonymousClass1 = new AnonymousClass1(continuation);
                                        }
                                    }
                                    Object obj2 = anonymousClass1.result;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i2 = anonymousClass1.label;
                                    if (i2 == 0) {
                                        ResultKt.throwOnFailure(obj2);
                                        FlowCollector flowCollector = this.$this_unsafeFlow;
                                        Event event = (Event) obj;
                                        if ((event != null ? event.getData() : null) instanceof CryptoStakingReviewEvent) {
                                            anonymousClass1.label = 1;
                                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                    } else {
                                        if (i2 != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj2);
                                    }
                                    return Unit.INSTANCE;
                                }
                            }

                            @Override // kotlinx.coroutines.flow.Flow
                            public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                                Object objCollect = eventFlow.collect(new AnonymousClass2(flowCollector), continuation);
                                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                            }
                        };
                        Event<CryptoStakingReviewEvent> value = eventFlow.getValue();
                        event = value;
                        if (!((event == null ? event.getData() : null) instanceof CryptoStakingReviewEvent)) {
                            value = null;
                        }
                        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            ActivityErrorHandler activityErrorHandler2 = new ActivityErrorHandler(activity, true, 0, null, 12, null);
                            composerStartRestartGroup.updateRememberedValue(activityErrorHandler2);
                            objRememberedValue = activityErrorHandler2;
                        }
                        activityErrorHandler = (ActivityErrorHandler) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        eventCryptoStakingReviewComposable$lambda$1 = CryptoStakingReviewComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                        if (eventCryptoStakingReviewComposable$lambda$1 != null && (eventCryptoStakingReviewComposable$lambda$1.getData() instanceof CryptoStakingReviewEvent.Error) && (eventConsumerInvoke2 = eventCryptoStakingReviewComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke2.consume(eventCryptoStakingReviewComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt$CryptoStakingReviewComposable$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    m24970invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m24970invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    activityErrorHandler.handleError(((CryptoStakingReviewEvent.Error) eventCryptoStakingReviewComposable$lambda$1.getData()).getThrowable(), true);
                                }
                            });
                        }
                        eventCryptoStakingReviewComposable$lambda$12 = CryptoStakingReviewComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                        if (eventCryptoStakingReviewComposable$lambda$12 != null && (eventCryptoStakingReviewComposable$lambda$12.getData() instanceof CryptoStakingReviewEvent.OrderSubmissionSuccess) && (eventConsumerInvoke = eventCryptoStakingReviewComposable$lambda$12.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(eventCryptoStakingReviewComposable$lambda$12, new Function1() { // from class: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt$CryptoStakingReviewComposable$$inlined$consumeIfType$2
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    m24971invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m24971invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    onSubmitted.invoke(((CryptoStakingReviewEvent.OrderSubmissionSuccess) eventCryptoStakingReviewComposable$lambda$12.getData()).getOrder());
                                }
                            });
                        }
                        GenericActionHandlerKt.GenericActionHandler(Boolean.FALSE, false, null, null, ComposableLambda3.rememberComposableLambda(-1387766938, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt.CryptoStakingReviewComposable.3

                            /* compiled from: CryptoStakingReviewComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            /* renamed from: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt$CryptoStakingReviewComposable$3$WhenMappings */
                            public /* synthetic */ class WhenMappings {
                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                static {
                                    int[] iArr = new int[ApiCryptoStakingOrder.OrderType.values().length];
                                    try {
                                        iArr[ApiCryptoStakingOrder.OrderType.DEPOSIT.ordinal()] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        iArr[ApiCryptoStakingOrder.OrderType.WITHDRAW.ordinal()] = 2;
                                    } catch (NoSuchFieldError unused2) {
                                    }
                                    try {
                                        iArr[ApiCryptoStakingOrder.OrderType.UNKNOWN.ordinal()] = 3;
                                    } catch (NoSuchFieldError unused3) {
                                    }
                                    $EnumSwitchMapping$0 = iArr;
                                }
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i7) {
                                String str;
                                if ((i7 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1387766938, i7, -1, "com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposable.<anonymous> (CryptoStakingReviewComposable.kt:99)");
                                }
                                Screen.Name name = Screen.Name.CRYPTO_STAKING_ORDER_REVIEW;
                                int i8 = WhenMappings.$EnumSwitchMapping$0[args.getOrder().getOrderType().ordinal()];
                                if (i8 == 1) {
                                    str = "staking";
                                } else if (i8 == 2) {
                                    str = "unstaking";
                                } else {
                                    if (i8 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    str = "unknown";
                                }
                                String str2 = str;
                                String string2 = args.getOrder().getCurrencyPairId().toString();
                                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, new Screen(name, str2, string2, null, 8, null), null, null, null, null, 61, null);
                                final Modifier modifier7 = modifier3;
                                final SnapshotState4<CryptoStakingReviewViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                                final CryptoStakingReviewDuxo cryptoStakingReviewDuxo4 = cryptoStakingReviewDuxo3;
                                final CryptoStakingReviewDuxo.InitArgs initArgs = args;
                                final SnapshotState4<Event<CryptoStakingReviewEvent>> snapshotState42 = snapshotState4CollectAsStateWithLifecycle2;
                                AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(-873384303, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt.CryptoStakingReviewComposable.3.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i9) {
                                        if ((i9 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-873384303, i9, -1, "com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposable.<anonymous>.<anonymous> (CryptoStakingReviewComposable.kt:112)");
                                        }
                                        Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(modifier7, null, 1, null);
                                        final SnapshotState4<CryptoStakingReviewViewState> snapshotState43 = snapshotState4;
                                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1546929997, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt.CryptoStakingReviewComposable.3.1.1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer4, int i10) {
                                                if ((i10 & 3) == 2 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1546929997, i10, -1, "com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposable.<anonymous>.<anonymous>.<anonymous> (CryptoStakingReviewComposable.kt:115)");
                                                }
                                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                                AppBarType appBarType = AppBarType.CENTER_ALIGNED;
                                                final SnapshotState4<CryptoStakingReviewViewState> snapshotState44 = snapshotState43;
                                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-490335808, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt.CryptoStakingReviewComposable.3.1.1.1
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                        invoke(composer5, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer5, int i11) {
                                                        if ((i11 & 3) == 2 && composer5.getSkipping()) {
                                                            composer5.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-490335808, i11, -1, "com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoStakingReviewComposable.kt:119)");
                                                        }
                                                        BentoText2.m20747BentoText38GnDrw(StringResource2.getString(CryptoStakingReviewComposable4.CryptoStakingReviewComposable$lambda$0(snapshotState44).getOrderTypeTitle(), composer5, StringResource.$stable), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer5, BentoTheme.$stable).getTextM(), composer5, 0, 0, 8190);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }, composer4, 54), modifierFillMaxWidth$default, CryptoStakingReviewComposable.INSTANCE.getLambda$791472108$feature_crypto_staking_externalDebug(), null, null, false, false, appBarType, null, 0L, null, composer4, 12583350, 0, 1912);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer3, 54);
                                        ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-2034839380, true, new AnonymousClass2(cryptoStakingReviewDuxo4, snapshotState4, initArgs), composer3, 54);
                                        final SnapshotState4<CryptoStakingReviewViewState> snapshotState44 = snapshotState4;
                                        final SnapshotState4<Event<CryptoStakingReviewEvent>> snapshotState45 = snapshotState42;
                                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifierLogScreenTransitions$default, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1012216226, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt.CryptoStakingReviewComposable.3.1.3
                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer4, Integer num) {
                                                invoke(paddingValues, composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(PaddingValues paddingValues, Composer composer4, int i10) {
                                                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                                if ((i10 & 6) == 0) {
                                                    i10 |= composer4.changed(paddingValues) ? 4 : 2;
                                                }
                                                if ((i10 & 19) == 18 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1012216226, i10, -1, "com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposable.<anonymous>.<anonymous>.<anonymous> (CryptoStakingReviewComposable.kt:136)");
                                                }
                                                CryptoStakingReviewComposable4.Content(CryptoStakingReviewComposable4.CryptoStakingReviewComposable$lambda$0(snapshotState44), CryptoStakingReviewComposable4.CryptoStakingReviewComposable$lambda$1(snapshotState45), PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer4, 0, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer3, 54), composer3, 805306800, 504);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    /* compiled from: CryptoStakingReviewComposable.kt */
                                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                    @SourceDebugExtension
                                    /* renamed from: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt$CryptoStakingReviewComposable$3$1$2, reason: invalid class name */
                                    static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                                        final /* synthetic */ CryptoStakingReviewDuxo.InitArgs $args;
                                        final /* synthetic */ CryptoStakingReviewDuxo $duxo;
                                        final /* synthetic */ SnapshotState4<CryptoStakingReviewViewState> $viewState$delegate;

                                        AnonymousClass2(CryptoStakingReviewDuxo cryptoStakingReviewDuxo, SnapshotState4<CryptoStakingReviewViewState> snapshotState4, CryptoStakingReviewDuxo.InitArgs initArgs) {
                                            this.$duxo = cryptoStakingReviewDuxo;
                                            this.$viewState$delegate = snapshotState4;
                                            this.$args = initArgs;
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                            invoke(composer, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer, int i) {
                                            if ((i & 3) == 2 && composer.getSkipping()) {
                                                composer.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-2034839380, i, -1, "com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposable.<anonymous>.<anonymous>.<anonymous> (CryptoStakingReviewComposable.kt:143)");
                                            }
                                            Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(Modifier.INSTANCE);
                                            CryptoStakingReviewViewState cryptoStakingReviewViewStateCryptoStakingReviewComposable$lambda$0 = CryptoStakingReviewComposable4.CryptoStakingReviewComposable$lambda$0(this.$viewState$delegate);
                                            composer.startReplaceGroup(-1746271574);
                                            boolean zChangedInstance = composer.changedInstance(this.$duxo) | composer.changed(this.$viewState$delegate) | composer.changedInstance(this.$args);
                                            final CryptoStakingReviewDuxo cryptoStakingReviewDuxo = this.$duxo;
                                            final CryptoStakingReviewDuxo.InitArgs initArgs = this.$args;
                                            final SnapshotState4<CryptoStakingReviewViewState> snapshotState4 = this.$viewState$delegate;
                                            Object objRememberedValue = composer.rememberedValue();
                                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt$CryptoStakingReviewComposable$3$1$2$$ExternalSyntheticLambda0
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return CryptoStakingReviewComposable4.C378753.AnonymousClass1.AnonymousClass2.invoke$lambda$1$lambda$0(cryptoStakingReviewDuxo, initArgs, snapshotState4);
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue);
                                            }
                                            composer.endReplaceGroup();
                                            CryptoStakingReviewComposable4.ButtonBar(cryptoStakingReviewViewStateCryptoStakingReviewComposable$lambda$0, (Function0) objRememberedValue, modifierNavigationBarsPadding, composer, 0, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$1$lambda$0(CryptoStakingReviewDuxo cryptoStakingReviewDuxo, CryptoStakingReviewDuxo.InitArgs initArgs, SnapshotState4 snapshotState4) {
                                            cryptoStakingReviewDuxo.submitOrder(CryptoStakingReviewComposable4.CryptoStakingReviewComposable$lambda$0(snapshotState4).getOrder(), initArgs.getIdempotencyId());
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }, composer2, 54), composer2, 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, 24582, 14);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                    } else {
                        modifier2 = modifier5;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                }
                i4 = i3;
                modifier3 = modifier2;
                cryptoStakingReviewDuxo3 = cryptoStakingReviewDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Object objConsume2 = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                Intrinsics.checkNotNull(objConsume2, "null cannot be cast to non-null type android.app.Activity");
                Activity activity2 = (Activity) objConsume2;
                final SnapshotState4<CryptoStakingReviewViewState> snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(cryptoStakingReviewDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup = composerStartRestartGroup;
                final Flow eventFlow2 = cryptoStakingReviewDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state2 = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt$CryptoStakingReviewComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt$CryptoStakingReviewComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt$CryptoStakingReviewComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoStakingReviewComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt$CryptoStakingReviewComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                Event event = (Event) obj;
                                if ((event != null ? event.getData() : null) instanceof CryptoStakingReviewEvent) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                        Object objCollect = eventFlow2.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                Event<CryptoStakingReviewEvent> value2 = eventFlow2.getValue();
                event = value2;
                if (!((event == null ? event.getData() : null) instanceof CryptoStakingReviewEvent)) {
                }
                final SnapshotState4<Event<CryptoStakingReviewEvent>> snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                activityErrorHandler = (ActivityErrorHandler) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                eventCryptoStakingReviewComposable$lambda$1 = CryptoStakingReviewComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventCryptoStakingReviewComposable$lambda$1 != null) {
                    eventConsumerInvoke2.consume(eventCryptoStakingReviewComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt$CryptoStakingReviewComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m24970invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m24970invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            activityErrorHandler.handleError(((CryptoStakingReviewEvent.Error) eventCryptoStakingReviewComposable$lambda$1.getData()).getThrowable(), true);
                        }
                    });
                }
                eventCryptoStakingReviewComposable$lambda$12 = CryptoStakingReviewComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventCryptoStakingReviewComposable$lambda$12 != null) {
                    eventConsumerInvoke.consume(eventCryptoStakingReviewComposable$lambda$12, new Function1() { // from class: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt$CryptoStakingReviewComposable$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m24971invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m24971invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            onSubmitted.invoke(((CryptoStakingReviewEvent.OrderSubmissionSuccess) eventCryptoStakingReviewComposable$lambda$12.getData()).getOrder());
                        }
                    });
                }
                GenericActionHandlerKt.GenericActionHandler(Boolean.FALSE, false, null, null, ComposableLambda3.rememberComposableLambda(-1387766938, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt.CryptoStakingReviewComposable.3

                    /* compiled from: CryptoStakingReviewComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    /* renamed from: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt$CryptoStakingReviewComposable$3$WhenMappings */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[ApiCryptoStakingOrder.OrderType.values().length];
                            try {
                                iArr[ApiCryptoStakingOrder.OrderType.DEPOSIT.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[ApiCryptoStakingOrder.OrderType.WITHDRAW.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[ApiCryptoStakingOrder.OrderType.UNKNOWN.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        String str;
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1387766938, i7, -1, "com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposable.<anonymous> (CryptoStakingReviewComposable.kt:99)");
                        }
                        Screen.Name name = Screen.Name.CRYPTO_STAKING_ORDER_REVIEW;
                        int i8 = WhenMappings.$EnumSwitchMapping$0[args.getOrder().getOrderType().ordinal()];
                        if (i8 == 1) {
                            str = "staking";
                        } else if (i8 == 2) {
                            str = "unstaking";
                        } else {
                            if (i8 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str = "unknown";
                        }
                        String str2 = str;
                        String string2 = args.getOrder().getCurrencyPairId().toString();
                        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                        UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, new Screen(name, str2, string2, null, 8, null), null, null, null, null, 61, null);
                        final Modifier modifier7 = modifier3;
                        final SnapshotState4<CryptoStakingReviewViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle3;
                        final CryptoStakingReviewDuxo cryptoStakingReviewDuxo4 = cryptoStakingReviewDuxo3;
                        final CryptoStakingReviewDuxo.InitArgs initArgs = args;
                        final SnapshotState4<Event<CryptoStakingReviewEvent>> snapshotState42 = snapshotState4CollectAsStateWithLifecycle22;
                        AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(-873384303, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt.CryptoStakingReviewComposable.3.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i9) {
                                if ((i9 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-873384303, i9, -1, "com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposable.<anonymous>.<anonymous> (CryptoStakingReviewComposable.kt:112)");
                                }
                                Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(modifier7, null, 1, null);
                                final SnapshotState4<CryptoStakingReviewViewState> snapshotState43 = snapshotState4;
                                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1546929997, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt.CryptoStakingReviewComposable.3.1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i10) {
                                        if ((i10 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1546929997, i10, -1, "com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposable.<anonymous>.<anonymous>.<anonymous> (CryptoStakingReviewComposable.kt:115)");
                                        }
                                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                        AppBarType appBarType = AppBarType.CENTER_ALIGNED;
                                        final SnapshotState4<CryptoStakingReviewViewState> snapshotState44 = snapshotState43;
                                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-490335808, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt.CryptoStakingReviewComposable.3.1.1.1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                invoke(composer5, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer5, int i11) {
                                                if ((i11 & 3) == 2 && composer5.getSkipping()) {
                                                    composer5.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-490335808, i11, -1, "com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoStakingReviewComposable.kt:119)");
                                                }
                                                BentoText2.m20747BentoText38GnDrw(StringResource2.getString(CryptoStakingReviewComposable4.CryptoStakingReviewComposable$lambda$0(snapshotState44).getOrderTypeTitle(), composer5, StringResource.$stable), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer5, BentoTheme.$stable).getTextM(), composer5, 0, 0, 8190);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer4, 54), modifierFillMaxWidth$default, CryptoStakingReviewComposable.INSTANCE.getLambda$791472108$feature_crypto_staking_externalDebug(), null, null, false, false, appBarType, null, 0L, null, composer4, 12583350, 0, 1912);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54);
                                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-2034839380, true, new AnonymousClass2(cryptoStakingReviewDuxo4, snapshotState4, initArgs), composer3, 54);
                                final SnapshotState4<CryptoStakingReviewViewState> snapshotState44 = snapshotState4;
                                final SnapshotState4<Event<CryptoStakingReviewEvent>> snapshotState45 = snapshotState42;
                                ScaffoldKt.m5939ScaffoldTvnljyQ(modifierLogScreenTransitions$default, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1012216226, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt.CryptoStakingReviewComposable.3.1.3
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer4, Integer num) {
                                        invoke(paddingValues, composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(PaddingValues paddingValues, Composer composer4, int i10) {
                                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                        if ((i10 & 6) == 0) {
                                            i10 |= composer4.changed(paddingValues) ? 4 : 2;
                                        }
                                        if ((i10 & 19) == 18 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1012216226, i10, -1, "com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposable.<anonymous>.<anonymous>.<anonymous> (CryptoStakingReviewComposable.kt:136)");
                                        }
                                        CryptoStakingReviewComposable4.Content(CryptoStakingReviewComposable4.CryptoStakingReviewComposable$lambda$0(snapshotState44), CryptoStakingReviewComposable4.CryptoStakingReviewComposable$lambda$1(snapshotState45), PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer4, 0, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), composer3, 805306800, 504);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* compiled from: CryptoStakingReviewComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt$CryptoStakingReviewComposable$3$1$2, reason: invalid class name */
                            static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                                final /* synthetic */ CryptoStakingReviewDuxo.InitArgs $args;
                                final /* synthetic */ CryptoStakingReviewDuxo $duxo;
                                final /* synthetic */ SnapshotState4<CryptoStakingReviewViewState> $viewState$delegate;

                                AnonymousClass2(CryptoStakingReviewDuxo cryptoStakingReviewDuxo, SnapshotState4<CryptoStakingReviewViewState> snapshotState4, CryptoStakingReviewDuxo.InitArgs initArgs) {
                                    this.$duxo = cryptoStakingReviewDuxo;
                                    this.$viewState$delegate = snapshotState4;
                                    this.$args = initArgs;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                    invoke(composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer, int i) {
                                    if ((i & 3) == 2 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-2034839380, i, -1, "com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposable.<anonymous>.<anonymous>.<anonymous> (CryptoStakingReviewComposable.kt:143)");
                                    }
                                    Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(Modifier.INSTANCE);
                                    CryptoStakingReviewViewState cryptoStakingReviewViewStateCryptoStakingReviewComposable$lambda$0 = CryptoStakingReviewComposable4.CryptoStakingReviewComposable$lambda$0(this.$viewState$delegate);
                                    composer.startReplaceGroup(-1746271574);
                                    boolean zChangedInstance = composer.changedInstance(this.$duxo) | composer.changed(this.$viewState$delegate) | composer.changedInstance(this.$args);
                                    final CryptoStakingReviewDuxo cryptoStakingReviewDuxo = this.$duxo;
                                    final CryptoStakingReviewDuxo.InitArgs initArgs = this.$args;
                                    final SnapshotState4 snapshotState4 = this.$viewState$delegate;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt$CryptoStakingReviewComposable$3$1$2$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return CryptoStakingReviewComposable4.C378753.AnonymousClass1.AnonymousClass2.invoke$lambda$1$lambda$0(cryptoStakingReviewDuxo, initArgs, snapshotState4);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    CryptoStakingReviewComposable4.ButtonBar(cryptoStakingReviewViewStateCryptoStakingReviewComposable$lambda$0, (Function0) objRememberedValue, modifierNavigationBarsPadding, composer, 0, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$1$lambda$0(CryptoStakingReviewDuxo cryptoStakingReviewDuxo, CryptoStakingReviewDuxo.InitArgs initArgs, SnapshotState4 snapshotState4) {
                                    cryptoStakingReviewDuxo.submitOrder(CryptoStakingReviewComposable4.CryptoStakingReviewComposable$lambda$0(snapshotState4).getOrder(), initArgs.getIdempotencyId());
                                    return Unit.INSTANCE;
                                }
                            }
                        }, composer2, 54), composer2, 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 24582, 14);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                cryptoStakingReviewDuxo3 = cryptoStakingReviewDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoStakingReviewComposable4.CryptoStakingReviewComposable$lambda$5(args, onSubmitted, modifier4, cryptoStakingReviewDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                if (i5 == 0) {
                }
                if ((i2 & 8) == 0) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoStakingReviewViewState CryptoStakingReviewComposable$lambda$0(SnapshotState4<CryptoStakingReviewViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Event<CryptoStakingReviewEvent> CryptoStakingReviewComposable$lambda$1(SnapshotState4<Event<CryptoStakingReviewEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final ComposeUiEvent<CryptoAmountInputEvent> MainContent$lambda$11(SnapshotState<ComposeUiEvent<CryptoAmountInputEvent>> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Content(final CryptoStakingReviewViewState viewState, final Event<CryptoStakingReviewEvent> event, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Event<CryptoStakingReviewEvent> event2;
        int i4;
        Modifier modifier2;
        int i5;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Composer composerStartRestartGroup = composer.startRestartGroup(1310814586);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                event2 = event;
                i3 |= composerStartRestartGroup.changed(event2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
                    if (i4 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1310814586, i3, -1, "com.robinhood.shared.crypto.staking.staking.review.Content (CryptoStakingReviewComposable.kt:165)");
                    }
                    if (!viewState.isLoading()) {
                        composerStartRestartGroup.startReplaceGroup(634887375);
                        LoadingReviewContent(modifier2, composerStartRestartGroup, (i3 >> 6) & 14, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(634969990);
                        UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                        CryptoStakingContext cryptoStakingContext = viewState.getCryptoStakingContext();
                        if (cryptoStakingContext != null) {
                            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier2, UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, cryptoStakingContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -536870913, -1, 16383, null), new Component(null, "page", null, 5, null), null, 39, null)), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                            if (modifierAutoLogEvents$default == null) {
                                i5 = i3;
                                modifier3 = modifier2;
                            } else {
                                int i6 = i3;
                                modifier3 = modifierAutoLogEvents$default;
                                i5 = i6;
                            }
                            MainContent(viewState, event2, modifier3, composerStartRestartGroup, i5 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 0);
                            composerStartRestartGroup.endReplaceGroup();
                        }
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier4 = modifier2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CryptoStakingReviewComposable4.Content$lambda$7(viewState, event, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            modifier2 = modifier;
            if ((i3 & 147) != 146) {
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (!viewState.isLoading()) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        event2 = event;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 147) != 146) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadingReviewContent(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(658229740);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(658229740, i3, -1, "com.robinhood.shared.crypto.staking.staking.review.LoadingReviewContent (CryptoStakingReviewComposable.kt:191)");
            }
            LoadingScreenComposablesKt.ListLoadingScreenComposable(TestTag3.testTag(modifier, StaticLoadingReviewContentTag), true, true, 4, composerStartRestartGroup, 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoStakingReviewComposable4.LoadingReviewContent$lambda$8(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewLoadingReviewContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2146521751);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2146521751, i, -1, "com.robinhood.shared.crypto.staking.staking.review.PreviewLoadingReviewContent (CryptoStakingReviewComposable.kt:202)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, CryptoStakingReviewComposable.INSTANCE.getLambda$1423085745$feature_crypto_staking_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoStakingReviewComposable4.PreviewLoadingReviewContent$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void MainContent(final CryptoStakingReviewViewState cryptoStakingReviewViewState, final Event<CryptoStakingReviewEvent> event, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        String currencySymbol;
        Object objRememberedValue2;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        final Modifier modifier3;
        EventConsumer<CryptoStakingReviewEvent> eventConsumerInvoke;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1069944767);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(cryptoStakingReviewViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(event) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1069944767, i3, -1, "com.robinhood.shared.crypto.staking.staking.review.MainContent (CryptoStakingReviewComposable.kt:213)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                if (event != null) {
                    if ((event.getData() instanceof CryptoStakingReviewEvent.ReviewEvent) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt$MainContent$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m24972invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m24972invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                snapshotState.setValue(new ComposeUiEvent(((CryptoStakingReviewEvent.ReviewEvent) event.getData()).getCryptoAmountInputEvent()));
                            }
                        });
                    }
                    Unit unit = Unit.INSTANCE;
                }
                Resources resources = ((android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                Arrangement arrangement = Arrangement.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM());
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
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
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Spacer2.Spacer(Column5.weight$default(column6, companion4, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                StringResource amountText = cryptoStakingReviewViewState.getAmountText();
                Intrinsics.checkNotNull(resources);
                String string2 = amountText.getText(resources).toString();
                String string3 = cryptoStakingReviewViewState.getAmountSubtitleText().getText(resources).toString();
                currencySymbol = cryptoStakingReviewViewState.getCurrencySymbol();
                if (currencySymbol == null) {
                    currencySymbol = "";
                }
                boolean showCurrencySymbolForTickerInput = cryptoStakingReviewViewState.getShowCurrencySymbolForTickerInput();
                ComposeUiEvent<CryptoAmountInputEvent> composeUiEventMainContent$lambda$11 = MainContent$lambda$11(snapshotState);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(companion4, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                CryptoAmountInputComposable.CryptoAmountInputView(string2, string3, currencySymbol, showCurrencySymbolForTickerInput, composeUiEventMainContent$lambda$11, (Function0) objRememberedValue2, modifierFillMaxWidth$default, false, composerStartRestartGroup, (ComposeUiEvent.$stable << 12) | 12779520, 0);
                composerStartRestartGroup = composerStartRestartGroup;
                Spacer2.Spacer(Column5.weight$default(column6, companion4, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composerStartRestartGroup, i5).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 5);
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion4, 0.0f, composerStartRestartGroup, 6, 1);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor2);
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                composerStartRestartGroup.startReplaceGroup(2063616575);
                for (UIComponent<GenericAction> uIComponent : cryptoStakingReviewViewState.getInfoRows()) {
                    if (((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
                        composerStartRestartGroup.startReplaceGroup(-452316377);
                        Intrinsics.checkNotNull(uIComponent, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.CryptoDemeterDataRowCondensed<com.robinhood.models.serverdriven.experimental.api.GenericAction>");
                        final CryptoDemeterDataRowCondensed cryptoDemeterDataRowCondensed = (CryptoDemeterDataRowCondensed) uIComponent;
                        composerStartRestartGroup.startReplaceGroup(1148721117);
                        Modifier.Companion companion5 = Modifier.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(cryptoDemeterDataRowCondensed);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt$MainContent$lambda$17$lambda$16$$inlined$SduiCryptoStakingDataRowCondensed$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(SemanticsPropertyReceiver semantics) {
                                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                    SduiCryptoStakingDataRowCondensedKt.setCryptoDemeterDataRowCondensed(semantics, cryptoDemeterDataRowCondensed);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(companion5, false, (Function1) objRememberedValue3, 1, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierSemantics$default);
                        ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion6.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion6.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion6.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion6.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        CryptoStakingDataRowCondensedDefaults cryptoStakingDataRowCondensedDefaults = CryptoStakingDataRowCondensedDefaults.INSTANCE;
                        Modifier modifierM5155defaultMinSizeVpY3zN4$default = SizeKt.m5155defaultMinSizeVpY3zN4$default(companion5, 0.0f, cryptoStakingDataRowCondensedDefaults.m25236getCondensedMinHeightD9Ej5fM(), 1, null);
                        float f = 2;
                        float fM7995constructorimpl = C2002Dp.m7995constructorimpl(cryptoStakingDataRowCondensedDefaults.m25237getCondensedVerticalPaddingD9Ej5fM() / f);
                        Float top_inset = cryptoDemeterDataRowCondensed.getTop_inset();
                        float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(fM7995constructorimpl + (top_inset != null ? C2002Dp.m7995constructorimpl(top_inset.floatValue()) : C2002Dp.m7995constructorimpl(0)));
                        float fM7995constructorimpl3 = C2002Dp.m7995constructorimpl(cryptoStakingDataRowCondensedDefaults.m25237getCondensedVerticalPaddingD9Ej5fM() / f);
                        Float bottom_inset = cryptoDemeterDataRowCondensed.getBottom_inset();
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierM5155defaultMinSizeVpY3zN4$default, 0.0f, fM7995constructorimpl2, 0.0f, C2002Dp.m7995constructorimpl(fM7995constructorimpl3 + (bottom_inset != null ? C2002Dp.m7995constructorimpl(bottom_inset.floatValue()) : C2002Dp.m7995constructorimpl(0))), 5, null);
                        final UIComponent leading_accessory = cryptoDemeterDataRowCondensed.getLeading_accessory();
                        composerStartRestartGroup.startReplaceGroup(1764102048);
                        ComposableLambda composableLambdaRememberComposableLambda = leading_accessory == null ? null : ComposableLambda3.rememberComposableLambda(2001938987, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt$MainContent$lambda$17$lambda$16$$inlined$SduiCryptoStakingDataRowCondensed$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i6) {
                                if ((i6 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2001938987, i6, -1, "com.robinhood.shared.crypto.ui.staking.SduiCryptoStakingDataRowCondensed.<anonymous>.<anonymous>.<anonymous> (SduiCryptoStakingDataRowCondensed.kt:66)");
                                }
                                SduiComponent3.SduiComponent(leading_accessory, null, null, composer2, 0, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54);
                        composerStartRestartGroup.endReplaceGroup();
                        final RenderableText subtitle = cryptoDemeterDataRowCondensed.getSubtitle();
                        composerStartRestartGroup.startReplaceGroup(1764125185);
                        ComposableLambda composableLambdaRememberComposableLambda2 = subtitle == null ? null : ComposableLambda3.rememberComposableLambda(-1687310603, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt$MainContent$lambda$17$lambda$16$$inlined$SduiCryptoStakingDataRowCondensed$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i6) {
                                if ((i6 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1687310603, i6, -1, "com.robinhood.shared.crypto.ui.staking.SduiCryptoStakingDataRowCondensed.<anonymous>.<anonymous>.<anonymous> (SduiCryptoStakingDataRowCondensed.kt:81)");
                                }
                                Parcelable subtitle_tap_action = cryptoDemeterDataRowCondensed.getSubtitle_tap_action();
                                Float subtitle_trailing_icon_spacing = cryptoDemeterDataRowCondensed.getSubtitle_trailing_icon_spacing();
                                C2002Dp c2002DpM7993boximpl = subtitle_trailing_icon_spacing != null ? C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(subtitle_trailing_icon_spacing.floatValue())) : null;
                                RenderableText renderableText = subtitle;
                                TextStyle subtitle_text_style = cryptoDemeterDataRowCondensed.getSubtitle_text_style();
                                ThemedColor subtitle_text_color = cryptoDemeterDataRowCondensed.getSubtitle_text_color();
                                Icon subtitle_trailing_icon = cryptoDemeterDataRowCondensed.getSubtitle_trailing_icon();
                                ThemedColor subtitle_trailing_icon_color = cryptoDemeterDataRowCondensed.getSubtitle_trailing_icon_color();
                                long jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21426getFg20d7_KjU();
                                composer2.startReplaceGroup(1386949870);
                                Modifier modifierThen = UtilKt.onClickModifierWithNoIndication(subtitle_tap_action, composer2, 0).then(Modifier.INSTANCE);
                                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(c2002DpM7993boximpl != null ? c2002DpM7993boximpl.getValue() : C2002Dp.m7995constructorimpl(0)), Alignment.INSTANCE.getCenterVertically(), composer2, 48);
                                int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer2, modifierThen);
                                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor4 = companion7.getConstructor();
                                if (composer2.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor4);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer2);
                                Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyRowMeasurePolicy, companion7.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion7.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion7.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                    composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                    composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion7.getSetModifier());
                                Row6 row6 = Row6.INSTANCE;
                                SduiText2.SduiText(SduiCryptoStakingDataRowCondensedKt.generateText(renderableText, subtitle_text_style, subtitle_text_color), (Modifier) null, composer2, 0, 2);
                                BentoIcon4 bentoIcon = subtitle_trailing_icon != null ? SduiIcon2.toBentoIcon(subtitle_trailing_icon) : null;
                                composer2.startReplaceGroup(938164764);
                                if (bentoIcon != null) {
                                    composer2.startReplaceGroup(938169090);
                                    Color composeColor = subtitle_trailing_icon_color == null ? null : SduiColors2.toComposeColor(subtitle_trailing_icon_color, composer2, 0);
                                    composer2.endReplaceGroup();
                                    if (composeColor != null) {
                                        jM21426getFg20d7_KjU = composeColor.getValue();
                                    }
                                    BentoIcon2.m20644BentoIconFU0evQE(bentoIcon, null, jM21426getFg20d7_KjU, null, null, false, composer2, BentoIcon4.$stable | 48, 56);
                                }
                                composer2.endReplaceGroup();
                                composer2.endNode();
                                composer2.endReplaceGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54);
                        composerStartRestartGroup.endReplaceGroup();
                        final RenderableText value = cryptoDemeterDataRowCondensed.getValue();
                        composerStartRestartGroup.startReplaceGroup(1764149441);
                        ComposableLambda composableLambdaRememberComposableLambda3 = value == null ? null : ComposableLambda3.rememberComposableLambda(918007447, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt$MainContent$lambda$17$lambda$16$$inlined$SduiCryptoStakingDataRowCondensed$4
                            public final void invoke(Composer composer2, int i6) {
                                int i7;
                                Alignment.Companion companion7;
                                BentoTheme bentoTheme2;
                                int i8;
                                if ((i6 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(918007447, i6, -1, "com.robinhood.shared.crypto.ui.staking.SduiCryptoStakingDataRowCondensed.<anonymous>.<anonymous>.<anonymous> (SduiCryptoStakingDataRowCondensed.kt:95)");
                                }
                                Alignment.Companion companion8 = Alignment.INSTANCE;
                                Alignment.Horizontal end = companion8.getEnd();
                                CryptoDemeterDataRowCondensed cryptoDemeterDataRowCondensed2 = cryptoDemeterDataRowCondensed;
                                RenderableText renderableText = value;
                                Modifier.Companion companion9 = Modifier.INSTANCE;
                                Arrangement arrangement2 = Arrangement.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement2.getTop(), end, composer2, 48);
                                int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer2, companion9);
                                ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor4 = companion10.getConstructor();
                                if (composer2.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor4);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer2);
                                Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy3, companion10.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion10.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion10.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                    composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                    composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion10.getSetModifier());
                                Column6 column62 = Column6.INSTANCE;
                                Parcelable value_tap_action = cryptoDemeterDataRowCondensed2.getValue_tap_action();
                                Float value_trailing_icon_spacing = cryptoDemeterDataRowCondensed2.getValue_trailing_icon_spacing();
                                C2002Dp c2002DpM7993boximpl = value_trailing_icon_spacing != null ? C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(value_trailing_icon_spacing.floatValue())) : null;
                                TextStyle value_text_style = cryptoDemeterDataRowCondensed2.getValue_text_style();
                                ThemedColor value_text_color = cryptoDemeterDataRowCondensed2.getValue_text_color();
                                Icon value_trailing_icon = cryptoDemeterDataRowCondensed2.getValue_trailing_icon();
                                ThemedColor value_trailing_icon_color = cryptoDemeterDataRowCondensed2.getValue_trailing_icon_color();
                                C2002Dp c2002Dp = c2002DpM7993boximpl;
                                BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                                int i9 = BentoTheme.$stable;
                                long jM21425getFg0d7_KjU = bentoTheme3.getColors(composer2, i9).m21425getFg0d7_KjU();
                                composer2.startReplaceGroup(1386949870);
                                Modifier modifierThen = UtilKt.onClickModifierWithNoIndication(value_tap_action, composer2, 0).then(companion9);
                                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement2.m5089spacedBy0680j_4(c2002Dp != null ? c2002Dp.getValue() : C2002Dp.m7995constructorimpl(0)), companion8.getCenterVertically(), composer2, 48);
                                int currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composer2, modifierThen);
                                Function0<ComposeUiNode> constructor5 = companion10.getConstructor();
                                if (composer2.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor5);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM6388constructorimpl5 = Updater.m6388constructorimpl(composer2);
                                Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyRowMeasurePolicy, companion10.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion10.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion10.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                    composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                    composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier5, companion10.getSetModifier());
                                Row6 row6 = Row6.INSTANCE;
                                SduiText2.SduiText(SduiCryptoStakingDataRowCondensedKt.generateText(renderableText, value_text_style, value_text_color), (Modifier) null, composer2, 0, 2);
                                BentoIcon4 bentoIcon = value_trailing_icon != null ? SduiIcon2.toBentoIcon(value_trailing_icon) : null;
                                composer2.startReplaceGroup(938164764);
                                if (bentoIcon == null) {
                                    i7 = i9;
                                    companion7 = companion8;
                                    bentoTheme2 = bentoTheme3;
                                    i8 = 1386949870;
                                } else {
                                    composer2.startReplaceGroup(938169090);
                                    Color composeColor = value_trailing_icon_color == null ? null : SduiColors2.toComposeColor(value_trailing_icon_color, composer2, 0);
                                    composer2.endReplaceGroup();
                                    if (composeColor != null) {
                                        jM21425getFg0d7_KjU = composeColor.getValue();
                                    }
                                    BentoIcon4 bentoIcon4 = bentoIcon;
                                    i7 = i9;
                                    companion7 = companion8;
                                    bentoTheme2 = bentoTheme3;
                                    i8 = 1386949870;
                                    BentoIcon2.m20644BentoIconFU0evQE(bentoIcon4, null, jM21425getFg0d7_KjU, null, null, false, composer2, BentoIcon4.$stable | 48, 56);
                                    Unit unit2 = Unit.INSTANCE;
                                }
                                composer2.endReplaceGroup();
                                composer2.endNode();
                                composer2.endReplaceGroup();
                                RenderableText secondary_value = cryptoDemeterDataRowCondensed2.getSecondary_value();
                                composer2.startReplaceGroup(80953817);
                                if (secondary_value != null) {
                                    Parcelable secondary_value_tap_action = cryptoDemeterDataRowCondensed2.getSecondary_value_tap_action();
                                    Float secondary_value_trailing_icon_spacing = cryptoDemeterDataRowCondensed2.getSecondary_value_trailing_icon_spacing();
                                    C2002Dp c2002DpM7993boximpl2 = secondary_value_trailing_icon_spacing != null ? C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(secondary_value_trailing_icon_spacing.floatValue())) : null;
                                    TextStyle secondary_value_text_style = cryptoDemeterDataRowCondensed2.getSecondary_value_text_style();
                                    ThemedColor secondary_value_text_color = cryptoDemeterDataRowCondensed2.getSecondary_value_text_color();
                                    Icon secondary_value_trailing_icon = cryptoDemeterDataRowCondensed2.getSecondary_value_trailing_icon();
                                    ThemedColor secondary_value_trailing_icon_color = cryptoDemeterDataRowCondensed2.getSecondary_value_trailing_icon_color();
                                    long jM21426getFg20d7_KjU = bentoTheme2.getColors(composer2, i7).m21426getFg20d7_KjU();
                                    composer2.startReplaceGroup(i8);
                                    Modifier modifierThen2 = UtilKt.onClickModifierWithNoIndication(secondary_value_tap_action, composer2, 0).then(companion9);
                                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.m5089spacedBy0680j_4(c2002DpM7993boximpl2 != null ? c2002DpM7993boximpl2.getValue() : C2002Dp.m7995constructorimpl(0)), companion7.getCenterVertically(), composer2, 48);
                                    int currentCompositeKeyHash6 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier6 = ComposedModifier2.materializeModifier(composer2, modifierThen2);
                                    Function0<ComposeUiNode> constructor6 = companion10.getConstructor();
                                    if (composer2.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor6);
                                    } else {
                                        composer2.useNode();
                                    }
                                    Composer composerM6388constructorimpl6 = Updater.m6388constructorimpl(composer2);
                                    Updater.m6390setimpl(composerM6388constructorimpl6, measurePolicyRowMeasurePolicy2, companion10.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl6, currentCompositionLocalMap6, companion10.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion10.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                        composerM6388constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                        composerM6388constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl6, modifierMaterializeModifier6, companion10.getSetModifier());
                                    SduiText2.SduiText(SduiCryptoStakingDataRowCondensedKt.generateText(secondary_value, secondary_value_text_style, secondary_value_text_color), (Modifier) null, composer2, 0, 2);
                                    BentoIcon4 bentoIcon2 = secondary_value_trailing_icon != null ? SduiIcon2.toBentoIcon(secondary_value_trailing_icon) : null;
                                    composer2.startReplaceGroup(938164764);
                                    if (bentoIcon2 != null) {
                                        composer2.startReplaceGroup(938169090);
                                        Color composeColor2 = secondary_value_trailing_icon_color == null ? null : SduiColors2.toComposeColor(secondary_value_trailing_icon_color, composer2, 0);
                                        composer2.endReplaceGroup();
                                        if (composeColor2 != null) {
                                            jM21426getFg20d7_KjU = composeColor2.getValue();
                                        }
                                        BentoIcon2.m20644BentoIconFU0evQE(bentoIcon2, null, jM21426getFg20d7_KjU, null, null, false, composer2, BentoIcon4.$stable | 48, 56);
                                        Unit unit3 = Unit.INSTANCE;
                                    }
                                    composer2.endReplaceGroup();
                                    composer2.endNode();
                                    composer2.endReplaceGroup();
                                    Unit unit4 = Unit.INSTANCE;
                                }
                                composer2.endReplaceGroup();
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }
                        }, composerStartRestartGroup, 54);
                        composerStartRestartGroup.endReplaceGroup();
                        final UIComponent trailing_accessory = cryptoDemeterDataRowCondensed.getTrailing_accessory();
                        composerStartRestartGroup.startReplaceGroup(1764203200);
                        ComposableLambda composableLambdaRememberComposableLambda4 = trailing_accessory == null ? null : ComposableLambda3.rememberComposableLambda(-1355735006, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt$MainContent$lambda$17$lambda$16$$inlined$SduiCryptoStakingDataRowCondensed$5
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i6) {
                                if ((i6 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1355735006, i6, -1, "com.robinhood.shared.crypto.ui.staking.SduiCryptoStakingDataRowCondensed.<anonymous>.<anonymous>.<anonymous> (SduiCryptoStakingDataRowCondensed.kt:123)");
                                }
                                SduiComponent3.SduiComponent(trailing_accessory, null, null, composer2, 0, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54);
                        composerStartRestartGroup.endReplaceGroup();
                        Composer composer2 = composerStartRestartGroup;
                        BentoBaseRowLayout.BentoBaseRowLayout(modifierM5146paddingqDBjuR0$default, null, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(-1190523398, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt$MainContent$lambda$17$lambda$16$$inlined$SduiCryptoStakingDataRowCondensed$6
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i6) {
                                if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1190523398, i6, -1, "com.robinhood.shared.crypto.ui.staking.SduiCryptoStakingDataRowCondensed.<anonymous>.<anonymous> (SduiCryptoStakingDataRowCondensed.kt:68)");
                                }
                                Parcelable title_tap_action = cryptoDemeterDataRowCondensed.getTitle_tap_action();
                                Float title_trailing_icon_spacing = cryptoDemeterDataRowCondensed.getTitle_trailing_icon_spacing();
                                C2002Dp c2002DpM7993boximpl = title_trailing_icon_spacing != null ? C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(title_trailing_icon_spacing.floatValue())) : null;
                                RenderableText title = cryptoDemeterDataRowCondensed.getTitle();
                                TextStyle title_text_style = cryptoDemeterDataRowCondensed.getTitle_text_style();
                                ThemedColor title_text_color = cryptoDemeterDataRowCondensed.getTitle_text_color();
                                Icon title_trailing_icon = cryptoDemeterDataRowCondensed.getTitle_trailing_icon();
                                ThemedColor title_trailing_icon_color = cryptoDemeterDataRowCondensed.getTitle_trailing_icon_color();
                                long jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21425getFg0d7_KjU();
                                composer3.startReplaceGroup(1386949870);
                                Modifier modifierThen = UtilKt.onClickModifierWithNoIndication(title_tap_action, composer3, 0).then(Modifier.INSTANCE);
                                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(c2002DpM7993boximpl != null ? c2002DpM7993boximpl.getValue() : C2002Dp.m7995constructorimpl(0)), Alignment.INSTANCE.getCenterVertically(), composer3, 48);
                                int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer3, modifierThen);
                                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor4 = companion7.getConstructor();
                                if (composer3.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor4);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer3);
                                Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyRowMeasurePolicy, companion7.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion7.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion7.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                    composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                    composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion7.getSetModifier());
                                Row6 row6 = Row6.INSTANCE;
                                SduiText2.SduiText(SduiCryptoStakingDataRowCondensedKt.generateText(title, title_text_style, title_text_color), (Modifier) null, composer3, 0, 2);
                                BentoIcon4 bentoIcon = title_trailing_icon != null ? SduiIcon2.toBentoIcon(title_trailing_icon) : null;
                                composer3.startReplaceGroup(938164764);
                                if (bentoIcon != null) {
                                    composer3.startReplaceGroup(938169090);
                                    Color composeColor = title_trailing_icon_color == null ? null : SduiColors2.toComposeColor(title_trailing_icon_color, composer3, 0);
                                    composer3.endReplaceGroup();
                                    if (composeColor != null) {
                                        jM21425getFg0d7_KjU = composeColor.getValue();
                                    }
                                    BentoIcon2.m20644BentoIconFU0evQE(bentoIcon, null, jM21425getFg0d7_KjU, null, null, false, composer3, BentoIcon4.$stable | 48, 56);
                                }
                                composer3.endReplaceGroup();
                                composer3.endNode();
                                composer3.endReplaceGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composableLambdaRememberComposableLambda2, composableLambdaRememberComposableLambda3, composableLambdaRememberComposableLambda4, false, true, true, null, composer2, 918555648, 0, 1026);
                        composerStartRestartGroup = composer2;
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-452139460);
                        Composer composer3 = composerStartRestartGroup;
                        SduiComponent3.SduiComponent(uIComponent, null, null, composer3, 0, 6);
                        composerStartRestartGroup = composer3;
                        composerStartRestartGroup.endReplaceGroup();
                    }
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme2.getColors(composerStartRestartGroup, i6).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 5);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, bentoTheme2.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoStakingReviewComposable4.MainContent$lambda$18(cryptoStakingReviewViewState, event, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            if (event != null) {
            }
            Resources resources2 = ((android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            Arrangement arrangement2 = Arrangement.INSTANCE;
            BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = arrangement2.m5089spacedBy0680j_4(bentoTheme3.getSpacing(composerStartRestartGroup, i52).m21595getXsmallD9Ej5fM());
            Alignment.Companion companion22 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_42, companion22.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default2);
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
                Modifier.Companion companion42 = Modifier.INSTANCE;
                Spacer2.Spacer(Column5.weight$default(column62, companion42, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                StringResource amountText2 = cryptoStakingReviewViewState.getAmountText();
                Intrinsics.checkNotNull(resources2);
                String string22 = amountText2.getText(resources2).toString();
                String string32 = cryptoStakingReviewViewState.getAmountSubtitleText().getText(resources2).toString();
                currencySymbol = cryptoStakingReviewViewState.getCurrencySymbol();
                if (currencySymbol == null) {
                }
                boolean showCurrencySymbolForTickerInput2 = cryptoStakingReviewViewState.getShowCurrencySymbolForTickerInput();
                ComposeUiEvent<CryptoAmountInputEvent> composeUiEventMainContent$lambda$112 = MainContent$lambda$11(snapshotState2);
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(companion42, bentoTheme3.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier52 = modifier4;
                CryptoAmountInputComposable.CryptoAmountInputView(string22, string32, currencySymbol, showCurrencySymbolForTickerInput2, composeUiEventMainContent$lambda$112, (Function0) objRememberedValue2, modifierFillMaxWidth$default2, false, composerStartRestartGroup, (ComposeUiEvent.$stable << 12) | 12779520, 0);
                composerStartRestartGroup = composerStartRestartGroup;
                Spacer2.Spacer(Column5.weight$default(column62, companion42, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme3.getColors(composerStartRestartGroup, i52).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 5);
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion42, 0.0f, composerStartRestartGroup, 6, 1);
                MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion22.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ2);
                Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy22, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                    composerStartRestartGroup.startReplaceGroup(2063616575);
                    while (r0.hasNext()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                    int i62 = BentoTheme.$stable;
                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme22.getColors(composerStartRestartGroup, i62).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 5);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, bentoTheme22.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ButtonBar(final CryptoStakingReviewViewState cryptoStakingReviewViewState, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        CryptoStakingReviewViewState cryptoStakingReviewViewState2;
        int i3;
        Modifier modifier2;
        final EventLogger current;
        final UserInteractionEventDescriptor userInteractionEventDescriptorUpdateWith;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChangedInstance;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1203300860);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            cryptoStakingReviewViewState2 = cryptoStakingReviewViewState;
        } else if ((i & 6) == 0) {
            cryptoStakingReviewViewState2 = cryptoStakingReviewViewState;
            i3 = (composerStartRestartGroup.changedInstance(cryptoStakingReviewViewState2) ? 4 : 2) | i;
        } else {
            cryptoStakingReviewViewState2 = cryptoStakingReviewViewState;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1203300860, i3, -1, "com.robinhood.shared.crypto.staking.staking.review.ButtonBar (CryptoStakingReviewComposable.kt:267)");
                }
                Resources resources = ((android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                userInteractionEventDescriptorUpdateWith = UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, cryptoStakingReviewViewState2.getCryptoStakingContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -536870913, -1, 16383, null), new Component(Component.ComponentType.BUTTON, "submit", null, 4, null), null, 39, null));
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, 0.0f, composerStartRestartGroup, 6, 1);
                Modifier modifier5 = modifier4;
                String disclaimer = cryptoStakingReviewViewState2.getDisclaimer();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                BentoMarkdownSpannedText2.m21101BentoMarkdownSpannedTextTHkziT8(disclaimer, modifierM21623defaultHorizontalPaddingrAjV9yQ, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), C20690R.attr.textAppearanceRegularSmall, 17, 0, 0, null, composerStartRestartGroup, 196608, 448);
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, 0.0f, composerStartRestartGroup, 6, 1), userInteractionEventDescriptorUpdateWith, true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                StringResource orderTypeButtonTitle = cryptoStakingReviewViewState.getOrderTypeButtonTitle();
                Intrinsics.checkNotNull(resources);
                String string2 = orderTypeButtonTitle.getText(resources).toString();
                boolean submitButtonEnabled = cryptoStakingReviewViewState.getSubmitButtonEnabled();
                boolean submitButtonLoading = cryptoStakingReviewViewState.getSubmitButtonLoading();
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(current) | ((i3 & 112) != 32) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptorUpdateWith);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoStakingReviewComposable4.ButtonBar$lambda$21$lambda$20$lambda$19(function0, current, userInteractionEventDescriptorUpdateWith);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoButtonBar2.BentoButtonBar(modifierAutoLogEvents$default, null, null, false, null, null, (Function0) objRememberedValue, string2, submitButtonLoading, null, submitButtonEnabled, null, null, false, null, true, composerStartRestartGroup, 0, 199680, 23102);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoStakingReviewComposable4.ButtonBar$lambda$22(cryptoStakingReviewViewState, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) != 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Resources resources2 = ((android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            userInteractionEventDescriptorUpdateWith = UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, cryptoStakingReviewViewState2.getCryptoStakingContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -536870913, -1, 16383, null), new Component(Component.ComponentType.BUTTON, "submit", null, 4, null), null, 39, null));
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion22 = Modifier.INSTANCE;
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion22, 0.0f, composerStartRestartGroup, 6, 1);
                Modifier modifier52 = modifier4;
                String disclaimer2 = cryptoStakingReviewViewState2.getDisclaimer();
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                BentoMarkdownSpannedText2.m21101BentoMarkdownSpannedTextTHkziT8(disclaimer2, modifierM21623defaultHorizontalPaddingrAjV9yQ2, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU()), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU()), C20690R.attr.textAppearanceRegularSmall, 17, 0, 0, null, composerStartRestartGroup, 196608, 448);
                Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion22, 0.0f, composerStartRestartGroup, 6, 1), userInteractionEventDescriptorUpdateWith, true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                StringResource orderTypeButtonTitle2 = cryptoStakingReviewViewState.getOrderTypeButtonTitle();
                Intrinsics.checkNotNull(resources2);
                String string22 = orderTypeButtonTitle2.getText(resources2).toString();
                boolean submitButtonEnabled2 = cryptoStakingReviewViewState.getSubmitButtonEnabled();
                boolean submitButtonLoading2 = cryptoStakingReviewViewState.getSubmitButtonLoading();
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(current) | ((i3 & 112) != 32) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptorUpdateWith);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoStakingReviewComposable4.ButtonBar$lambda$21$lambda$20$lambda$19(function0, current, userInteractionEventDescriptorUpdateWith);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    BentoButtonBar2.BentoButtonBar(modifierAutoLogEvents$default2, null, null, false, null, null, (Function0) objRememberedValue, string22, submitButtonLoading2, null, submitButtonEnabled2, null, null, false, null, true, composerStartRestartGroup, 0, 199680, 23102);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ButtonBar$lambda$21$lambda$20$lambda$19(Function0 function0, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor) {
        function0.invoke();
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(userInteractionEventDescriptor, UserInteractionEventData.EventType.TAP), false, false, 6, null);
        return Unit.INSTANCE;
    }
}
