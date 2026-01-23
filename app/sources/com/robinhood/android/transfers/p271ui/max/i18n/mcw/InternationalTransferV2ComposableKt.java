package com.robinhood.android.transfers.p271ui.max.i18n.mcw;

import android.content.Context;
import android.content.res.Resources;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
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
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.FragmentManager;
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
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.equityadvancedorder.EquityOrderFormRowState2;
import com.robinhood.android.font.C16915R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.p273ui.transfers.ekiben.p274uk.TickerInputView;
import com.robinhood.android.transfers.p271ui.common.TransferAmountEntryLayout;
import com.robinhood.android.transfers.p271ui.common.TransferAmountEntryLayout2;
import com.robinhood.android.transfers.p271ui.max.i18n.mcw.InternationalTransferV2Event;
import com.robinhood.android.transfers.p271ui.max.i18n.mcw.InternationalTransferV2Fragment;
import com.robinhood.android.transfers.p271ui.max.i18n.mcw.InternationalTransferV2ViewState;
import com.robinhood.android.transfers.util.Constants5;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoChip;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoDataRowKt;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.models.util.Money;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: InternationalTransferV2Composable.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a\u0015\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u000e\u001ai\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00182\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u001b\u001a5\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\r2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00182\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010 \u001aW\u0010!\u001a\u00020\u00012\u0014\u0010\"\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$\u0018\u00010#2\u0006\u0010&\u001a\u00020'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010\u00182\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00010*2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010,¨\u0006-²\u0006\n\u0010.\u001a\u00020/X\u008a\u0084\u0002²\u0006\u0012\u00100\u001a\n\u0012\u0004\u0012\u000202\u0018\u000101X\u008a\u0084\u0002"}, m3636d2 = {"InternationalTransferV2Composable", "", "callbacks", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2Fragment$Callbacks;", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2Duxo;", "(Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2Fragment$Callbacks;Landroidx/fragment/app/FragmentManager;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2Duxo;Landroidx/compose/runtime/Composer;II)V", "TickerInputViewComposable", "amountInput", "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "ReviewSection", "sourceAccountRow", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2ViewState$AccountRowState;", "sinkAccountRow", "submitButtonText", "isSubmitButtonEnabled", "", "isSubmitButtonLoading", "onSourceAccountClick", "Lkotlin/Function0;", "onSinkAccountClick", "onSubmitClick", "(Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2ViewState$AccountRowState;Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2ViewState$AccountRowState;Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", EquityOrderFormRowState2.AccountRowTestTag, "state", AnnotatedPrivateKey.LABEL, "onClick", "(Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2ViewState$AccountRowState;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ButtonWithDisclosure", "disclosureContent", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "primaryAction", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2ViewState$AmountInputPrimaryAction;", "onButtonClick", "onSuggestedDepositAmountClick", "Lkotlin/Function1;", "Lcom/robinhood/models/util/Money;", "(Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2ViewState$AmountInputPrimaryAction;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-transfers_externalRelease", "viewState", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2ViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2Event;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class InternationalTransferV2ComposableKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountRow$lambda$23(InternationalTransferV2ViewState.AccountRowState accountRowState, String str, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AccountRow(accountRowState, str, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ButtonWithDisclosure$lambda$29(ImmutableList immutableList, InternationalTransferV2ViewState.AmountInputPrimaryAction amountInputPrimaryAction, Function0 function0, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ButtonWithDisclosure(immutableList, amountInputPrimaryAction, function0, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternationalTransferV2Composable$lambda$10(InternationalTransferV2Fragment.Callbacks callbacks, FragmentManager fragmentManager, Modifier modifier, InternationalTransferV2Duxo internationalTransferV2Duxo, int i, int i2, Composer composer, int i3) {
        InternationalTransferV2Composable(callbacks, fragmentManager, modifier, internationalTransferV2Duxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReviewSection$lambda$19(InternationalTransferV2ViewState.AccountRowState accountRowState, InternationalTransferV2ViewState.AccountRowState accountRowState2, String str, boolean z, boolean z2, Function0 function0, Function0 function02, Function0 function03, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ReviewSection(accountRowState, accountRowState2, str, z, z2, function0, function02, function03, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TickerInputViewComposable$lambda$17(String str, int i, Composer composer, int i2) {
        TickerInputViewComposable(str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InternationalTransferV2Composable(final InternationalTransferV2Fragment.Callbacks callbacks, final FragmentManager childFragmentManager, Modifier modifier, InternationalTransferV2Duxo internationalTransferV2Duxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        InternationalTransferV2Duxo internationalTransferV2Duxo2;
        Modifier modifier3;
        int i4;
        final InternationalTransferV2Duxo internationalTransferV2Duxo3;
        final Context context;
        final Navigator navigator;
        boolean zChangedInstance;
        Object objRememberedValue;
        final Function0 function0;
        final Event<InternationalTransferV2Event> eventInternationalTransferV2Composable$lambda$1;
        final Event<InternationalTransferV2Event> eventInternationalTransferV2Composable$lambda$12;
        final Event<InternationalTransferV2Event> eventInternationalTransferV2Composable$lambda$13;
        final Event<InternationalTransferV2Event> eventInternationalTransferV2Composable$lambda$14;
        final Event<InternationalTransferV2Event> eventInternationalTransferV2Composable$lambda$15;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        final InternationalTransferV2Duxo internationalTransferV2Duxo4;
        final Modifier modifier4;
        EventConsumer<InternationalTransferV2Event> eventConsumerInvoke;
        EventConsumer<InternationalTransferV2Event> eventConsumerInvoke2;
        EventConsumer<InternationalTransferV2Event> eventConsumerInvoke3;
        EventConsumer<InternationalTransferV2Event> eventConsumerInvoke4;
        EventConsumer<InternationalTransferV2Event> eventConsumerInvoke5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(childFragmentManager, "childFragmentManager");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2072598842);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(childFragmentManager) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    internationalTransferV2Duxo2 = internationalTransferV2Duxo;
                    int i6 = composerStartRestartGroup.changedInstance(internationalTransferV2Duxo2) ? 2048 : 1024;
                    i3 |= i6;
                } else {
                    internationalTransferV2Duxo2 = internationalTransferV2Duxo;
                }
                i3 |= i6;
            } else {
                internationalTransferV2Duxo2 = internationalTransferV2Duxo;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(InternationalTransferV2Duxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2ComposableKt$InternationalTransferV2Composable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2ComposableKt$InternationalTransferV2Composable$$inlined$duxo$1.1
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
                        i4 = i3 & (-7169);
                        internationalTransferV2Duxo3 = (InternationalTransferV2Duxo) baseDuxo;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2072598842, i4, -1, "com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Composable (InternationalTransferV2Composable.kt:70)");
                        }
                        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(internationalTransferV2Duxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(internationalTransferV2Duxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChangedInstance = composerStartRestartGroup.changedInstance(context);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2ComposableKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return BaseContexts.requireActivityBaseContext(context);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        function0 = (Function0) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        eventInternationalTransferV2Composable$lambda$1 = InternationalTransferV2Composable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                        if (eventInternationalTransferV2Composable$lambda$1 != null && (eventInternationalTransferV2Composable$lambda$1.getData() instanceof InternationalTransferV2Event.Exit) && (eventConsumerInvoke5 = eventInternationalTransferV2Composable$lambda$1.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke5.consume(eventInternationalTransferV2Composable$lambda$1, new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2ComposableKt$InternationalTransferV2Composable$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    m19864invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m19864invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    ((AppCompatActivity) function0.invoke()).onBackPressed();
                                }
                            });
                        }
                        eventInternationalTransferV2Composable$lambda$12 = InternationalTransferV2Composable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                        if (eventInternationalTransferV2Composable$lambda$12 != null && (eventInternationalTransferV2Composable$lambda$12.getData() instanceof InternationalTransferV2Event.LaunchDialog) && (eventConsumerInvoke4 = eventInternationalTransferV2Composable$lambda$12.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke4.consume(eventInternationalTransferV2Composable$lambda$12, new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2ComposableKt$InternationalTransferV2Composable$$inlined$consumeIfType$2
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    m19865invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m19865invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    Navigator.DefaultImpls.createDialogFragment$default(navigator, ((InternationalTransferV2Event.LaunchDialog) eventInternationalTransferV2Composable$lambda$12.getData()).getKey(), null, 2, null).show(((AppCompatActivity) function0.invoke()).getSupportFragmentManager(), "accountSelectionDialog");
                                }
                            });
                        }
                        eventInternationalTransferV2Composable$lambda$13 = InternationalTransferV2Composable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                        if (eventInternationalTransferV2Composable$lambda$13 != null && (eventInternationalTransferV2Composable$lambda$13.getData() instanceof InternationalTransferV2Event.TransferCreated) && (eventConsumerInvoke3 = eventInternationalTransferV2Composable$lambda$13.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke3.consume(eventInternationalTransferV2Composable$lambda$13, new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2ComposableKt$InternationalTransferV2Composable$$inlined$consumeIfType$3
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    m19866invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m19866invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    callbacks.onTransferCreated(((InternationalTransferV2Event.TransferCreated) eventInternationalTransferV2Composable$lambda$13.getData()).getResponse());
                                }
                            });
                        }
                        eventInternationalTransferV2Composable$lambda$14 = InternationalTransferV2Composable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                        if (eventInternationalTransferV2Composable$lambda$14 != null && (eventInternationalTransferV2Composable$lambda$14.getData() instanceof InternationalTransferV2Event.ShowSduiAlert) && (eventConsumerInvoke2 = eventInternationalTransferV2Composable$lambda$14.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke2.consume(eventInternationalTransferV2Composable$lambda$14, new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2ComposableKt$InternationalTransferV2Composable$$inlined$consumeIfType$4
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    m19867invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m19867invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    InternationalTransferV2Event.ShowSduiAlert showSduiAlert = (InternationalTransferV2Event.ShowSduiAlert) eventInternationalTransferV2Composable$lambda$14.getData();
                                    Navigator.DefaultImpls.createDialogFragment$default(navigator, new LegacyDialogFragmentKey.ClientComponentAlert(showSduiAlert.getAlert(), false, true, 0, 10, (DefaultConstructorMarker) null), null, 2, null).show(childFragmentManager, showSduiAlert.getAlert().getTitle());
                                }
                            });
                        }
                        eventInternationalTransferV2Composable$lambda$15 = InternationalTransferV2Composable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                        if (eventInternationalTransferV2Composable$lambda$15 != null && (eventInternationalTransferV2Composable$lambda$15.getData() instanceof InternationalTransferV2Event.ShowAlert) && (eventConsumerInvoke = eventInternationalTransferV2Composable$lambda$15.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(eventInternationalTransferV2Composable$lambda$15, new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2ComposableKt$InternationalTransferV2Composable$$inlined$consumeIfType$5
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    m19868invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m19868invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    InternationalTransferV2Event.ShowAlert showAlert = (InternationalTransferV2Event.ShowAlert) eventInternationalTransferV2Composable$lambda$15.getData();
                                    RhDialogFragment.Builder theme = RhDialogFragment.INSTANCE.create((Context) function0.invoke()).setId(showAlert.getId()).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome);
                                    StringResource title = showAlert.getTitle();
                                    Resources resources = context.getResources();
                                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                                    RhDialogFragment.Builder title2 = theme.setTitle(title.getText(resources));
                                    StringResource message = showAlert.getMessage();
                                    Resources resources2 = context.getResources();
                                    Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                                    RhDialogFragment.Builder.show$default(title2.setMessage(message.getText(resources2)).setPositiveButton(C11048R.string.general_label_ok, new Object[0]), childFragmentManager, "error", false, 4, null);
                                }
                            });
                        }
                        TransferAmountEntryLayout amountEntryState = InternationalTransferV2Composable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getAmountEntryState();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChangedInstance2 = composerStartRestartGroup.changedInstance(internationalTransferV2Duxo3);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new C30797xcdaa4a48(internationalTransferV2Duxo3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Function1 function1 = (Function1) ((KFunction) objRememberedValue2);
                        int i7 = ((i4 << 12) & 3670016) | 28080;
                        Modifier modifier5 = modifier3;
                        Composer composer2 = composerStartRestartGroup;
                        TransferAmountEntryLayout2.TransferAmountEntryLayout(amountEntryState, ComposableLambda3.rememberComposableLambda(-917144685, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2ComposableKt.InternationalTransferV2Composable.7
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i8) {
                                if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-917144685, i8, -1, "com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Composable.<anonymous> (InternationalTransferV2Composable.kt:111)");
                                }
                                AppBarType appBarType = AppBarType.CENTER_ALIGNED;
                                final SnapshotState4<InternationalTransferV2ViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1909821318, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2ComposableKt.InternationalTransferV2Composable.7.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i9) {
                                        if ((i9 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1909821318, i9, -1, "com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Composable.<anonymous>.<anonymous> (InternationalTransferV2Composable.kt:114)");
                                        }
                                        BentoText2.m20747BentoText38GnDrw(StringResources6.getTextAsString(InternationalTransferV2ComposableKt.InternationalTransferV2Composable$lambda$0(snapshotState4).getToolbarTitle(), composer4, StringResource.$stable), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer4, 0, 0, 16382);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54);
                                final InternationalTransferV2Duxo internationalTransferV2Duxo5 = internationalTransferV2Duxo3;
                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(composableLambdaRememberComposableLambda, null, ComposableLambda3.rememberComposableLambda(-1685210190, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2ComposableKt.InternationalTransferV2Composable.7.2
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                        invoke(bentoAppBarScope, composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i9) {
                                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                        if ((i9 & 6) == 0) {
                                            i9 |= (i9 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                        }
                                        if ((i9 & 19) == 18 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1685210190, i9, -1, "com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Composable.<anonymous>.<anonymous> (InternationalTransferV2Composable.kt:119)");
                                        }
                                        InternationalTransferV2Duxo internationalTransferV2Duxo6 = internationalTransferV2Duxo5;
                                        composer4.startReplaceGroup(5004770);
                                        boolean zChangedInstance4 = composer4.changedInstance(internationalTransferV2Duxo6);
                                        Object objRememberedValue4 = composer4.rememberedValue();
                                        if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue4 = new C30799x347152e4(internationalTransferV2Duxo6);
                                            composer4.updateRememberedValue(objRememberedValue4);
                                        }
                                        composer4.endReplaceGroup();
                                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) ((KFunction) objRememberedValue4), composer4, (BentoAppBarScope.$stable << 12) | ((i9 << 12) & 57344), 7);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), null, null, false, false, appBarType, null, 0L, null, composer3, 12583302, 0, 1914);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1720714354, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2ComposableKt.InternationalTransferV2Composable.8
                            public final void invoke(Composer composer3, int i8) {
                                if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1720714354, i8, -1, "com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Composable.<anonymous> (InternationalTransferV2Composable.kt:126)");
                                }
                                Alignment.Companion companion = Alignment.INSTANCE;
                                Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                                SnapshotState4<InternationalTransferV2ViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                                InternationalTransferV2Duxo internationalTransferV2Duxo5 = internationalTransferV2Duxo3;
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                Arrangement arrangement = Arrangement.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer3, 48);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion2);
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                if (composer3.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                InternationalTransferV2ComposableKt.TickerInputViewComposable(InternationalTransferV2ComposableKt.InternationalTransferV2Composable$lambda$0(snapshotState4).getAmountInput(), composer3, 0);
                                StringResource sourceDropdownChipText = InternationalTransferV2ComposableKt.InternationalTransferV2Composable$lambda$0(snapshotState4).getSourceDropdownChipText();
                                composer3.startReplaceGroup(1025085505);
                                if (sourceDropdownChipText != null) {
                                    composer3.startReplaceGroup(5004770);
                                    boolean zChangedInstance4 = composer3.changedInstance(internationalTransferV2Duxo5);
                                    Object objRememberedValue4 = composer3.rememberedValue();
                                    if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue4 = new C30801x3cc66231(internationalTransferV2Duxo5);
                                        composer3.updateRememberedValue(objRememberedValue4);
                                    }
                                    composer3.endReplaceGroup();
                                    String string2 = StringResource2.getString(sourceDropdownChipText, composer3, StringResource.$stable);
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i9 = BentoTheme.$stable;
                                    BentoChip.BentoDropdownChip((Function0) ((KFunction) objRememberedValue4), PaddingKt.m5145paddingqDBjuR0(companion2, bentoTheme.getSpacing(composer3, i9).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer3, i9).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer3, i9).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer3, i9).m21593getSmallD9Ej5fM()), false, null, string2, composer3, 0, 12);
                                }
                                composer3.endReplaceGroup();
                                StringResource promotionInfoTagText = InternationalTransferV2ComposableKt.InternationalTransferV2Composable$lambda$0(snapshotState4).getPromotionInfoTagText();
                                composer3.startReplaceGroup(1025106109);
                                if (promotionInfoTagText != null) {
                                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                    int i10 = BentoTheme.$stable;
                                    Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion2, bentoTheme2.getSpacing(composer3, i10).m21590getDefaultD9Ej5fM(), 0.0f, composer3, 6, 2);
                                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composer3, 48);
                                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierM21622defaultHorizontalPaddingWMci_g0);
                                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor2);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                                    Row6 row6 = Row6.INSTANCE;
                                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.GIFT_16), null, bentoTheme2.getColors(composer3, i10).m21456getPositive0d7_KjU(), null, null, false, composer3, BentoIcon4.Size16.$stable | 48, 56);
                                    Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion2, bentoTheme2.getSpacing(composer3, i10).m21595getXsmallD9Ej5fM()), composer3, 0);
                                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme2.getSpacing(composer3, i10).m21597getXxsmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                                    String string3 = StringResource2.getString(promotionInfoTagText, composer3, StringResource.$stable);
                                    TextStyle textS = bentoTheme2.getTypography(composer3, i10).getTextS();
                                    long jM21456getPositive0d7_KjU = bentoTheme2.getColors(composer3, i10).m21456getPositive0d7_KjU();
                                    BentoText2.m20747BentoText38GnDrw(string3, modifierM5146paddingqDBjuR0$default, Color.m6701boximpl(jM21456getPositive0d7_KjU), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, textS, composer3, 24576, 0, 8168);
                                    composer3.endNode();
                                }
                                composer3.endReplaceGroup();
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }
                        }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(63606097, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2ComposableKt.InternationalTransferV2Composable.9
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i8) {
                                if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(63606097, i8, -1, "com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Composable.<anonymous> (InternationalTransferV2Composable.kt:176)");
                                }
                                InternationalTransferV2ViewState.AccountRowState sourceAccountRowState = InternationalTransferV2ComposableKt.InternationalTransferV2Composable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getSourceAccountRowState();
                                InternationalTransferV2ViewState.AccountRowState sinkAccountRowState = InternationalTransferV2ComposableKt.InternationalTransferV2Composable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getSinkAccountRowState();
                                StringResource primaryButtonText = InternationalTransferV2ComposableKt.InternationalTransferV2Composable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getPrimaryButtonText();
                                int i9 = StringResource.$stable;
                                String textAsString = StringResources6.getTextAsString(primaryButtonText, composer3, i9);
                                boolean zIsPrimaryButtonEnabled = InternationalTransferV2ComposableKt.InternationalTransferV2Composable$lambda$0(snapshotState4CollectAsStateWithLifecycle).isPrimaryButtonEnabled();
                                boolean zIsPrimaryButtonLoading = InternationalTransferV2ComposableKt.InternationalTransferV2Composable$lambda$0(snapshotState4CollectAsStateWithLifecycle).isPrimaryButtonLoading();
                                InternationalTransferV2Duxo internationalTransferV2Duxo5 = internationalTransferV2Duxo3;
                                composer3.startReplaceGroup(5004770);
                                boolean zChangedInstance4 = composer3.changedInstance(internationalTransferV2Duxo5);
                                Object objRememberedValue4 = composer3.rememberedValue();
                                if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = new C30803xc6b2358(internationalTransferV2Duxo5);
                                    composer3.updateRememberedValue(objRememberedValue4);
                                }
                                composer3.endReplaceGroup();
                                Function0 function02 = (Function0) ((KFunction) objRememberedValue4);
                                InternationalTransferV2Duxo internationalTransferV2Duxo6 = internationalTransferV2Duxo3;
                                composer3.startReplaceGroup(5004770);
                                boolean zChangedInstance5 = composer3.changedInstance(internationalTransferV2Duxo6);
                                Object objRememberedValue5 = composer3.rememberedValue();
                                if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue5 = new C30804xc6b2719(internationalTransferV2Duxo6);
                                    composer3.updateRememberedValue(objRememberedValue5);
                                }
                                composer3.endReplaceGroup();
                                Function0 function03 = (Function0) ((KFunction) objRememberedValue5);
                                InternationalTransferV2Duxo internationalTransferV2Duxo7 = internationalTransferV2Duxo3;
                                composer3.startReplaceGroup(5004770);
                                boolean zChangedInstance6 = composer3.changedInstance(internationalTransferV2Duxo7);
                                Object objRememberedValue6 = composer3.rememberedValue();
                                if (zChangedInstance6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue6 = new C30805xc6b2ada(internationalTransferV2Duxo7);
                                    composer3.updateRememberedValue(objRememberedValue6);
                                }
                                composer3.endReplaceGroup();
                                InternationalTransferV2ComposableKt.ReviewSection(sourceAccountRowState, sinkAccountRowState, textAsString, zIsPrimaryButtonEnabled, zIsPrimaryButtonLoading, function02, function03, (Function0) ((KFunction) objRememberedValue6), null, composer3, i9 | (i9 << 3), 256);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1593502160, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2ComposableKt.InternationalTransferV2Composable.10
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i8) {
                                if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1593502160, i8, -1, "com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Composable.<anonymous> (InternationalTransferV2Composable.kt:168)");
                                }
                                ImmutableList<UIComponent<GenericAction>> transferSummaryContent = InternationalTransferV2ComposableKt.InternationalTransferV2Composable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getTransferSummaryContent();
                                InternationalTransferV2ViewState.AmountInputPrimaryAction amountInputPrimaryAction = InternationalTransferV2ComposableKt.InternationalTransferV2Composable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getAmountInputPrimaryAction();
                                InternationalTransferV2Duxo internationalTransferV2Duxo5 = internationalTransferV2Duxo3;
                                composer3.startReplaceGroup(5004770);
                                boolean zChangedInstance4 = composer3.changedInstance(internationalTransferV2Duxo5);
                                Object objRememberedValue4 = composer3.rememberedValue();
                                if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = new C30795x73f5e354(internationalTransferV2Duxo5);
                                    composer3.updateRememberedValue(objRememberedValue4);
                                }
                                composer3.endReplaceGroup();
                                Function0 function02 = (Function0) ((KFunction) objRememberedValue4);
                                InternationalTransferV2Duxo internationalTransferV2Duxo6 = internationalTransferV2Duxo3;
                                composer3.startReplaceGroup(5004770);
                                boolean zChangedInstance5 = composer3.changedInstance(internationalTransferV2Duxo6);
                                Object objRememberedValue5 = composer3.rememberedValue();
                                if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue5 = new C30796x73f5e715(internationalTransferV2Duxo6);
                                    composer3.updateRememberedValue(objRememberedValue5);
                                }
                                composer3.endReplaceGroup();
                                InternationalTransferV2ComposableKt.ButtonWithDisclosure(transferSummaryContent, amountInputPrimaryAction, function02, (Function1) ((KFunction) objRememberedValue5), null, composer3, 0, 16);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), function1, modifier5, composer2, i7, 0);
                        composerStartRestartGroup = composer2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        internationalTransferV2Duxo4 = internationalTransferV2Duxo3;
                        modifier4 = modifier5;
                    } else {
                        i4 = i3;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                }
                internationalTransferV2Duxo3 = internationalTransferV2Duxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final SnapshotState4<InternationalTransferV2ViewState> snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(internationalTransferV2Duxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(internationalTransferV2Duxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(context);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2ComposableKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BaseContexts.requireActivityBaseContext(context);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    function0 = (Function0) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    eventInternationalTransferV2Composable$lambda$1 = InternationalTransferV2Composable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                    if (eventInternationalTransferV2Composable$lambda$1 != null) {
                        eventConsumerInvoke5.consume(eventInternationalTransferV2Composable$lambda$1, new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2ComposableKt$InternationalTransferV2Composable$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m19864invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m19864invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                ((AppCompatActivity) function0.invoke()).onBackPressed();
                            }
                        });
                    }
                    eventInternationalTransferV2Composable$lambda$12 = InternationalTransferV2Composable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                    if (eventInternationalTransferV2Composable$lambda$12 != null) {
                        eventConsumerInvoke4.consume(eventInternationalTransferV2Composable$lambda$12, new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2ComposableKt$InternationalTransferV2Composable$$inlined$consumeIfType$2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m19865invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m19865invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                Navigator.DefaultImpls.createDialogFragment$default(navigator, ((InternationalTransferV2Event.LaunchDialog) eventInternationalTransferV2Composable$lambda$12.getData()).getKey(), null, 2, null).show(((AppCompatActivity) function0.invoke()).getSupportFragmentManager(), "accountSelectionDialog");
                            }
                        });
                    }
                    eventInternationalTransferV2Composable$lambda$13 = InternationalTransferV2Composable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                    if (eventInternationalTransferV2Composable$lambda$13 != null) {
                        eventConsumerInvoke3.consume(eventInternationalTransferV2Composable$lambda$13, new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2ComposableKt$InternationalTransferV2Composable$$inlined$consumeIfType$3
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m19866invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m19866invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                callbacks.onTransferCreated(((InternationalTransferV2Event.TransferCreated) eventInternationalTransferV2Composable$lambda$13.getData()).getResponse());
                            }
                        });
                    }
                    eventInternationalTransferV2Composable$lambda$14 = InternationalTransferV2Composable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                    if (eventInternationalTransferV2Composable$lambda$14 != null) {
                        eventConsumerInvoke2.consume(eventInternationalTransferV2Composable$lambda$14, new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2ComposableKt$InternationalTransferV2Composable$$inlined$consumeIfType$4
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m19867invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m19867invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                InternationalTransferV2Event.ShowSduiAlert showSduiAlert = (InternationalTransferV2Event.ShowSduiAlert) eventInternationalTransferV2Composable$lambda$14.getData();
                                Navigator.DefaultImpls.createDialogFragment$default(navigator, new LegacyDialogFragmentKey.ClientComponentAlert(showSduiAlert.getAlert(), false, true, 0, 10, (DefaultConstructorMarker) null), null, 2, null).show(childFragmentManager, showSduiAlert.getAlert().getTitle());
                            }
                        });
                    }
                    eventInternationalTransferV2Composable$lambda$15 = InternationalTransferV2Composable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                    if (eventInternationalTransferV2Composable$lambda$15 != null) {
                        eventConsumerInvoke.consume(eventInternationalTransferV2Composable$lambda$15, new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2ComposableKt$InternationalTransferV2Composable$$inlined$consumeIfType$5
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m19868invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m19868invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                InternationalTransferV2Event.ShowAlert showAlert = (InternationalTransferV2Event.ShowAlert) eventInternationalTransferV2Composable$lambda$15.getData();
                                RhDialogFragment.Builder theme = RhDialogFragment.INSTANCE.create((Context) function0.invoke()).setId(showAlert.getId()).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome);
                                StringResource title = showAlert.getTitle();
                                Resources resources = context.getResources();
                                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                                RhDialogFragment.Builder title2 = theme.setTitle(title.getText(resources));
                                StringResource message = showAlert.getMessage();
                                Resources resources2 = context.getResources();
                                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                                RhDialogFragment.Builder.show$default(title2.setMessage(message.getText(resources2)).setPositiveButton(C11048R.string.general_label_ok, new Object[0]), childFragmentManager, "error", false, 4, null);
                            }
                        });
                    }
                    TransferAmountEntryLayout amountEntryState2 = InternationalTransferV2Composable$lambda$0(snapshotState4CollectAsStateWithLifecycle3).getAmountEntryState();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(internationalTransferV2Duxo3);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance2) {
                        objRememberedValue2 = new C30797xcdaa4a48(internationalTransferV2Duxo3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        Function1 function12 = (Function1) ((KFunction) objRememberedValue2);
                        int i72 = ((i4 << 12) & 3670016) | 28080;
                        Modifier modifier52 = modifier3;
                        Composer composer22 = composerStartRestartGroup;
                        TransferAmountEntryLayout2.TransferAmountEntryLayout(amountEntryState2, ComposableLambda3.rememberComposableLambda(-917144685, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2ComposableKt.InternationalTransferV2Composable.7
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i8) {
                                if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-917144685, i8, -1, "com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Composable.<anonymous> (InternationalTransferV2Composable.kt:111)");
                                }
                                AppBarType appBarType = AppBarType.CENTER_ALIGNED;
                                final SnapshotState4<InternationalTransferV2ViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle3;
                                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1909821318, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2ComposableKt.InternationalTransferV2Composable.7.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i9) {
                                        if ((i9 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1909821318, i9, -1, "com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Composable.<anonymous>.<anonymous> (InternationalTransferV2Composable.kt:114)");
                                        }
                                        BentoText2.m20747BentoText38GnDrw(StringResources6.getTextAsString(InternationalTransferV2ComposableKt.InternationalTransferV2Composable$lambda$0(snapshotState4).getToolbarTitle(), composer4, StringResource.$stable), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer4, 0, 0, 16382);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54);
                                final InternationalTransferV2Duxo internationalTransferV2Duxo5 = internationalTransferV2Duxo3;
                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(composableLambdaRememberComposableLambda, null, ComposableLambda3.rememberComposableLambda(-1685210190, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2ComposableKt.InternationalTransferV2Composable.7.2
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                        invoke(bentoAppBarScope, composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i9) {
                                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                        if ((i9 & 6) == 0) {
                                            i9 |= (i9 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                        }
                                        if ((i9 & 19) == 18 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1685210190, i9, -1, "com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Composable.<anonymous>.<anonymous> (InternationalTransferV2Composable.kt:119)");
                                        }
                                        InternationalTransferV2Duxo internationalTransferV2Duxo6 = internationalTransferV2Duxo5;
                                        composer4.startReplaceGroup(5004770);
                                        boolean zChangedInstance4 = composer4.changedInstance(internationalTransferV2Duxo6);
                                        Object objRememberedValue4 = composer4.rememberedValue();
                                        if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue4 = new C30799x347152e4(internationalTransferV2Duxo6);
                                            composer4.updateRememberedValue(objRememberedValue4);
                                        }
                                        composer4.endReplaceGroup();
                                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) ((KFunction) objRememberedValue4), composer4, (BentoAppBarScope.$stable << 12) | ((i9 << 12) & 57344), 7);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), null, null, false, false, appBarType, null, 0L, null, composer3, 12583302, 0, 1914);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1720714354, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2ComposableKt.InternationalTransferV2Composable.8
                            public final void invoke(Composer composer3, int i8) {
                                if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1720714354, i8, -1, "com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Composable.<anonymous> (InternationalTransferV2Composable.kt:126)");
                                }
                                Alignment.Companion companion = Alignment.INSTANCE;
                                Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                                SnapshotState4<InternationalTransferV2ViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle3;
                                InternationalTransferV2Duxo internationalTransferV2Duxo5 = internationalTransferV2Duxo3;
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                Arrangement arrangement = Arrangement.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer3, 48);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion2);
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                if (composer3.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                InternationalTransferV2ComposableKt.TickerInputViewComposable(InternationalTransferV2ComposableKt.InternationalTransferV2Composable$lambda$0(snapshotState4).getAmountInput(), composer3, 0);
                                StringResource sourceDropdownChipText = InternationalTransferV2ComposableKt.InternationalTransferV2Composable$lambda$0(snapshotState4).getSourceDropdownChipText();
                                composer3.startReplaceGroup(1025085505);
                                if (sourceDropdownChipText != null) {
                                    composer3.startReplaceGroup(5004770);
                                    boolean zChangedInstance4 = composer3.changedInstance(internationalTransferV2Duxo5);
                                    Object objRememberedValue4 = composer3.rememberedValue();
                                    if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue4 = new C30801x3cc66231(internationalTransferV2Duxo5);
                                        composer3.updateRememberedValue(objRememberedValue4);
                                    }
                                    composer3.endReplaceGroup();
                                    String string2 = StringResource2.getString(sourceDropdownChipText, composer3, StringResource.$stable);
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i9 = BentoTheme.$stable;
                                    BentoChip.BentoDropdownChip((Function0) ((KFunction) objRememberedValue4), PaddingKt.m5145paddingqDBjuR0(companion2, bentoTheme.getSpacing(composer3, i9).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer3, i9).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer3, i9).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer3, i9).m21593getSmallD9Ej5fM()), false, null, string2, composer3, 0, 12);
                                }
                                composer3.endReplaceGroup();
                                StringResource promotionInfoTagText = InternationalTransferV2ComposableKt.InternationalTransferV2Composable$lambda$0(snapshotState4).getPromotionInfoTagText();
                                composer3.startReplaceGroup(1025106109);
                                if (promotionInfoTagText != null) {
                                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                    int i10 = BentoTheme.$stable;
                                    Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion2, bentoTheme2.getSpacing(composer3, i10).m21590getDefaultD9Ej5fM(), 0.0f, composer3, 6, 2);
                                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composer3, 48);
                                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierM21622defaultHorizontalPaddingWMci_g0);
                                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor2);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                                    Row6 row6 = Row6.INSTANCE;
                                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.GIFT_16), null, bentoTheme2.getColors(composer3, i10).m21456getPositive0d7_KjU(), null, null, false, composer3, BentoIcon4.Size16.$stable | 48, 56);
                                    Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion2, bentoTheme2.getSpacing(composer3, i10).m21595getXsmallD9Ej5fM()), composer3, 0);
                                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme2.getSpacing(composer3, i10).m21597getXxsmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                                    String string3 = StringResource2.getString(promotionInfoTagText, composer3, StringResource.$stable);
                                    TextStyle textS = bentoTheme2.getTypography(composer3, i10).getTextS();
                                    long jM21456getPositive0d7_KjU = bentoTheme2.getColors(composer3, i10).m21456getPositive0d7_KjU();
                                    BentoText2.m20747BentoText38GnDrw(string3, modifierM5146paddingqDBjuR0$default, Color.m6701boximpl(jM21456getPositive0d7_KjU), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, textS, composer3, 24576, 0, 8168);
                                    composer3.endNode();
                                }
                                composer3.endReplaceGroup();
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }
                        }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(63606097, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2ComposableKt.InternationalTransferV2Composable.9
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i8) {
                                if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(63606097, i8, -1, "com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Composable.<anonymous> (InternationalTransferV2Composable.kt:176)");
                                }
                                InternationalTransferV2ViewState.AccountRowState sourceAccountRowState = InternationalTransferV2ComposableKt.InternationalTransferV2Composable$lambda$0(snapshotState4CollectAsStateWithLifecycle3).getSourceAccountRowState();
                                InternationalTransferV2ViewState.AccountRowState sinkAccountRowState = InternationalTransferV2ComposableKt.InternationalTransferV2Composable$lambda$0(snapshotState4CollectAsStateWithLifecycle3).getSinkAccountRowState();
                                StringResource primaryButtonText = InternationalTransferV2ComposableKt.InternationalTransferV2Composable$lambda$0(snapshotState4CollectAsStateWithLifecycle3).getPrimaryButtonText();
                                int i9 = StringResource.$stable;
                                String textAsString = StringResources6.getTextAsString(primaryButtonText, composer3, i9);
                                boolean zIsPrimaryButtonEnabled = InternationalTransferV2ComposableKt.InternationalTransferV2Composable$lambda$0(snapshotState4CollectAsStateWithLifecycle3).isPrimaryButtonEnabled();
                                boolean zIsPrimaryButtonLoading = InternationalTransferV2ComposableKt.InternationalTransferV2Composable$lambda$0(snapshotState4CollectAsStateWithLifecycle3).isPrimaryButtonLoading();
                                InternationalTransferV2Duxo internationalTransferV2Duxo5 = internationalTransferV2Duxo3;
                                composer3.startReplaceGroup(5004770);
                                boolean zChangedInstance4 = composer3.changedInstance(internationalTransferV2Duxo5);
                                Object objRememberedValue4 = composer3.rememberedValue();
                                if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = new C30803xc6b2358(internationalTransferV2Duxo5);
                                    composer3.updateRememberedValue(objRememberedValue4);
                                }
                                composer3.endReplaceGroup();
                                Function0 function02 = (Function0) ((KFunction) objRememberedValue4);
                                InternationalTransferV2Duxo internationalTransferV2Duxo6 = internationalTransferV2Duxo3;
                                composer3.startReplaceGroup(5004770);
                                boolean zChangedInstance5 = composer3.changedInstance(internationalTransferV2Duxo6);
                                Object objRememberedValue5 = composer3.rememberedValue();
                                if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue5 = new C30804xc6b2719(internationalTransferV2Duxo6);
                                    composer3.updateRememberedValue(objRememberedValue5);
                                }
                                composer3.endReplaceGroup();
                                Function0 function03 = (Function0) ((KFunction) objRememberedValue5);
                                InternationalTransferV2Duxo internationalTransferV2Duxo7 = internationalTransferV2Duxo3;
                                composer3.startReplaceGroup(5004770);
                                boolean zChangedInstance6 = composer3.changedInstance(internationalTransferV2Duxo7);
                                Object objRememberedValue6 = composer3.rememberedValue();
                                if (zChangedInstance6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue6 = new C30805xc6b2ada(internationalTransferV2Duxo7);
                                    composer3.updateRememberedValue(objRememberedValue6);
                                }
                                composer3.endReplaceGroup();
                                InternationalTransferV2ComposableKt.ReviewSection(sourceAccountRowState, sinkAccountRowState, textAsString, zIsPrimaryButtonEnabled, zIsPrimaryButtonLoading, function02, function03, (Function0) ((KFunction) objRememberedValue6), null, composer3, i9 | (i9 << 3), 256);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1593502160, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2ComposableKt.InternationalTransferV2Composable.10
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i8) {
                                if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1593502160, i8, -1, "com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Composable.<anonymous> (InternationalTransferV2Composable.kt:168)");
                                }
                                ImmutableList<UIComponent<GenericAction>> transferSummaryContent = InternationalTransferV2ComposableKt.InternationalTransferV2Composable$lambda$0(snapshotState4CollectAsStateWithLifecycle3).getTransferSummaryContent();
                                InternationalTransferV2ViewState.AmountInputPrimaryAction amountInputPrimaryAction = InternationalTransferV2ComposableKt.InternationalTransferV2Composable$lambda$0(snapshotState4CollectAsStateWithLifecycle3).getAmountInputPrimaryAction();
                                InternationalTransferV2Duxo internationalTransferV2Duxo5 = internationalTransferV2Duxo3;
                                composer3.startReplaceGroup(5004770);
                                boolean zChangedInstance4 = composer3.changedInstance(internationalTransferV2Duxo5);
                                Object objRememberedValue4 = composer3.rememberedValue();
                                if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = new C30795x73f5e354(internationalTransferV2Duxo5);
                                    composer3.updateRememberedValue(objRememberedValue4);
                                }
                                composer3.endReplaceGroup();
                                Function0 function02 = (Function0) ((KFunction) objRememberedValue4);
                                InternationalTransferV2Duxo internationalTransferV2Duxo6 = internationalTransferV2Duxo3;
                                composer3.startReplaceGroup(5004770);
                                boolean zChangedInstance5 = composer3.changedInstance(internationalTransferV2Duxo6);
                                Object objRememberedValue5 = composer3.rememberedValue();
                                if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue5 = new C30796x73f5e715(internationalTransferV2Duxo6);
                                    composer3.updateRememberedValue(objRememberedValue5);
                                }
                                composer3.endReplaceGroup();
                                InternationalTransferV2ComposableKt.ButtonWithDisclosure(transferSummaryContent, amountInputPrimaryAction, function02, (Function1) ((KFunction) objRememberedValue5), null, composer3, 0, 16);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), function12, modifier52, composer22, i72, 0);
                        composerStartRestartGroup = composer22;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        internationalTransferV2Duxo4 = internationalTransferV2Duxo3;
                        modifier4 = modifier52;
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                internationalTransferV2Duxo4 = internationalTransferV2Duxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2ComposableKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InternationalTransferV2ComposableKt.InternationalTransferV2Composable$lambda$10(callbacks, childFragmentManager, modifier4, internationalTransferV2Duxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
    public static final InternationalTransferV2ViewState InternationalTransferV2Composable$lambda$0(SnapshotState4<InternationalTransferV2ViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<InternationalTransferV2Event> InternationalTransferV2Composable$lambda$1(SnapshotState4<Event<InternationalTransferV2Event>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TickerInputViewComposable(final String str, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-103905350);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-103905350, i2, -1, "com.robinhood.android.transfers.ui.max.i18n.mcw.TickerInputViewComposable (InternationalTransferV2Composable.kt:192)");
            }
            Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, Constants5.getTickerViewHeight());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2ComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return InternationalTransferV2ComposableKt.TickerInputViewComposable$lambda$13$lambda$12((Context) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z = (i2 & 14) == 4;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2ComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return InternationalTransferV2ComposableKt.TickerInputViewComposable$lambda$16$lambda$15(str, (TickerInputView) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            AndroidView_androidKt.AndroidView(function1, modifierM5156height3ABfNKs, (Function1) objRememberedValue2, composerStartRestartGroup, 54, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2ComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InternationalTransferV2ComposableKt.TickerInputViewComposable$lambda$17(str, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TickerInputView TickerInputViewComposable$lambda$13$lambda$12(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        TickerInputView tickerInputView = new TickerInputView(context, null, 0, 6, null);
        tickerInputView.setUseLegacyTextSizingAndLayout(false);
        tickerInputView.setTypeface(ContextsUiExtensions.getFont(context, C16915R.font.capsule_sans_medium));
        return tickerInputView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TickerInputViewComposable$lambda$16$lambda$15(String str, TickerInputView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view.setTextColor(ThemeColors.getThemeColor(context, C20690R.attr.colorForeground1));
        char[] charArray = str.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        view.transitionTo(charArray);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:105:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReviewSection(final InternationalTransferV2ViewState.AccountRowState accountRowState, final InternationalTransferV2ViewState.AccountRowState accountRowState2, final String str, final boolean z, final boolean z2, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        boolean z3;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(48105778);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(accountRowState) : composerStartRestartGroup.changedInstance(accountRowState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(accountRowState2) : composerStartRestartGroup.changedInstance(accountRowState2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            z3 = z;
        } else {
            z3 = z;
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
            }
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function0) ? 131072 : 65536;
            }
            if ((i2 & 64) == 0) {
                i3 |= 1572864;
            } else {
                if ((i & 1572864) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 1048576 : 524288;
                }
                if ((i2 & 128) != 0) {
                    i3 |= 12582912;
                } else {
                    if ((i & 12582912) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function03) ? 8388608 : 4194304;
                    }
                    i4 = i2 & 256;
                    if (i4 != 0) {
                        if ((100663296 & i) == 0) {
                            modifier2 = modifier;
                            i3 |= composerStartRestartGroup.changed(modifier2) ? 67108864 : 33554432;
                        }
                        if ((38347923 & i3) == 38347922 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                        } else {
                            Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(48105778, i3, -1, "com.robinhood.android.transfers.ui.max.i18n.mcw.ReviewSection (InternationalTransferV2Composable.kt:222)");
                            }
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Modifier modifier5 = modifier4;
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
                            int i5 = i3;
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
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i6 = BentoTheme.$stable;
                            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 7, null), bentoTheme.getColors(composerStartRestartGroup, i6).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 4);
                            String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_from, composerStartRestartGroup, 0);
                            int i7 = StringResource.$stable;
                            AccountRow(accountRowState, strStringResource, function0, null, composerStartRestartGroup, (i5 & 14) | i7 | ((i5 >> 9) & 896), 8);
                            int i8 = i5 >> 3;
                            AccountRow(accountRowState2, StringResources_androidKt.stringResource(C11048R.string.general_label_to, composerStartRestartGroup, 0), function02, null, composerStartRestartGroup, (i8 & 14) | i7 | ((i5 >> 12) & 896), 8);
                            int i9 = i5 << 6;
                            BentoButtonKt.m20586BentoButtonEikTQX8(function03, str, com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, 6, 0), null, null, z3, z2, null, null, null, null, false, null, composerStartRestartGroup, ((i5 >> 21) & 14) | (i8 & 112) | (458752 & i9) | (i9 & 3670016), 0, 8088);
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier5;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2ComposableKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return InternationalTransferV2ComposableKt.ReviewSection$lambda$19(accountRowState, accountRowState2, str, z, z2, function0, function02, function03, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 100663296;
                    modifier2 = modifier;
                    if ((38347923 & i3) == 38347922) {
                        if (i4 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Modifier modifier52 = modifier4;
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        int i52 = i3;
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                            Column6 column62 = Column6.INSTANCE;
                            Modifier.Companion companion22 = Modifier.INSTANCE;
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i62 = BentoTheme.$stable;
                            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m5146paddingqDBjuR0$default(companion22, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), 7, null), bentoTheme2.getColors(composerStartRestartGroup, i62).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 4);
                            String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_from, composerStartRestartGroup, 0);
                            int i72 = StringResource.$stable;
                            AccountRow(accountRowState, strStringResource2, function0, null, composerStartRestartGroup, (i52 & 14) | i72 | ((i52 >> 9) & 896), 8);
                            int i82 = i52 >> 3;
                            AccountRow(accountRowState2, StringResources_androidKt.stringResource(C11048R.string.general_label_to, composerStartRestartGroup, 0), function02, null, composerStartRestartGroup, (i82 & 14) | i72 | ((i52 >> 12) & 896), 8);
                            int i92 = i52 << 6;
                            BentoButtonKt.m20586BentoButtonEikTQX8(function03, str, com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, 6, 0), null, null, z3, z2, null, null, null, null, false, null, composerStartRestartGroup, ((i52 >> 21) & 14) | (i82 & 112) | (458752 & i92) | (i92 & 3670016), 0, 8088);
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier52;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i4 = i2 & 256;
                if (i4 != 0) {
                }
                modifier2 = modifier;
                if ((38347923 & i3) == 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            if ((i2 & 128) != 0) {
            }
            i4 = i2 & 256;
            if (i4 != 0) {
            }
            modifier2 = modifier;
            if ((38347923 & i3) == 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if ((i2 & 128) != 0) {
        }
        i4 = i2 & 256;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((38347923 & i3) == 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void AccountRow(final InternationalTransferV2ViewState.AccountRowState accountRowState, final String str, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1927079650);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(accountRowState) : composerStartRestartGroup.changedInstance(accountRowState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
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
                Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1927079650, i3, -1, "com.robinhood.android.transfers.ui.max.i18n.mcw.AccountRow (InternationalTransferV2Composable.kt:258)");
                }
                composerStartRestartGroup.startReplaceGroup(-792632144);
                if (accountRowState.isEnabled()) {
                    modifier3 = modifier5;
                    modifier4 = modifier3;
                } else {
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean z = (i3 & 896) == 256;
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2ComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return InternationalTransferV2ComposableKt.AccountRow$lambda$22$lambda$21$lambda$20(function0);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifier5, false, null, null, (Function0) objRememberedValue, 7, null);
                    modifier3 = modifier5;
                    modifier4 = modifierM4893clickableXHw0xAI$default;
                }
                composerStartRestartGroup.endReplaceGroup();
                AnnotatedString annotatedString = new AnnotatedString(str, null, 2, null);
                AnnotatedString annotatedString2 = new AnnotatedString(StringResources6.getTextAsString(accountRowState.getText(), composerStartRestartGroup, StringResource.$stable), null, 2, null);
                BentoIcon4.Size16 size16 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.DROPDOWN_16);
                composerStartRestartGroup.startReplaceGroup(-792622638);
                Color colorM6701boximpl = !accountRowState.isEnabled() ? null : Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21427getFg30d7_KjU());
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-792620014);
                Color colorM6701boximpl2 = accountRowState.isEnabled() ? null : Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21427getFg30d7_KjU());
                composerStartRestartGroup.endReplaceGroup();
                BentoDataRowKt.BentoCondensedDataRow(new BentoDataRowState(null, annotatedString, null, null, null, annotatedString2, colorM6701boximpl, null, size16, colorM6701boximpl2, false, accountRowState.isLoading(), 1181, null), modifier4, null, null, null, composerStartRestartGroup, BentoDataRowState.$stable, 28);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2ComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InternationalTransferV2ComposableKt.AccountRow$lambda$23(accountRowState, str, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            composerStartRestartGroup.startReplaceGroup(-792632144);
            if (accountRowState.isEnabled()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            AnnotatedString annotatedString3 = new AnnotatedString(str, null, 2, null);
            AnnotatedString annotatedString22 = new AnnotatedString(StringResources6.getTextAsString(accountRowState.getText(), composerStartRestartGroup, StringResource.$stable), null, 2, null);
            BentoIcon4.Size16 size162 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.DROPDOWN_16);
            composerStartRestartGroup.startReplaceGroup(-792622638);
            if (!accountRowState.isEnabled()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-792620014);
            Color colorM6701boximpl22 = accountRowState.isEnabled() ? null : Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21427getFg30d7_KjU());
            composerStartRestartGroup.endReplaceGroup();
            BentoDataRowKt.BentoCondensedDataRow(new BentoDataRowState(null, annotatedString3, null, null, null, annotatedString22, colorM6701boximpl, null, size162, colorM6701boximpl22, false, accountRowState.isLoading(), 1181, null), modifier4, null, null, null, composerStartRestartGroup, BentoDataRowState.$stable, 28);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountRow$lambda$22$lambda$21$lambda$20(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0258  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ButtonWithDisclosure(final ImmutableList<? extends UIComponent<? extends GenericAction>> immutableList, final InternationalTransferV2ViewState.AmountInputPrimaryAction primaryAction, final Function0<Unit> onButtonClick, final Function1<? super Money, Unit> onSuggestedDepositAmountClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int i4;
        float f;
        Modifier modifier3;
        int i5;
        int i6;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(primaryAction, "primaryAction");
        Intrinsics.checkNotNullParameter(onButtonClick, "onButtonClick");
        Intrinsics.checkNotNullParameter(onSuggestedDepositAmountClick, "onSuggestedDepositAmountClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(621985644);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(immutableList) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(primaryAction) : composerStartRestartGroup.changedInstance(primaryAction) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onButtonClick) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSuggestedDepositAmountClick) ? 2048 : 1024;
        }
        int i7 = i2 & 16;
        if (i7 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(621985644, i3, -1, "com.robinhood.android.transfers.ui.max.i18n.mcw.ButtonWithDisclosure (InternationalTransferV2Composable.kt:280)");
                }
                Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                Alignment.Companion companion = Alignment.INSTANCE;
                Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier5);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                if (immutableList != null) {
                    composerStartRestartGroup.startReplaceGroup(1908051174);
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    modifier3 = modifier5;
                    i5 = 1;
                    f = 0.0f;
                    BentoText2.m20747BentoText38GnDrw("------------------------------", ModifiersKt.bentoPlaceholder$default(companion3, true, null, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextS(), composerStartRestartGroup, 6, 0, 8188);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                    i4 = i3;
                    i6 = 0;
                } else {
                    i4 = i3;
                    f = 0.0f;
                    modifier3 = modifier5;
                    i5 = 1;
                    composerStartRestartGroup.startReplaceGroup(1908457305);
                    i6 = 0;
                    GenericActionHandlerKt.GenericActionHandler(null, false, null, navigator, ComposableLambda3.rememberComposableLambda(-299967180, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2ComposableKt$ButtonWithDisclosure$1$2
                        public final void invoke(Composer composer2, int i8) {
                            if ((i8 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-299967180, i8, -1, "com.robinhood.android.transfers.ui.max.i18n.mcw.ButtonWithDisclosure.<anonymous>.<anonymous> (InternationalTransferV2Composable.kt:300)");
                            }
                            ImmutableList immutableList2 = extensions2.toImmutableList(immutableList);
                            composer2.startReplaceGroup(-1772220517);
                            SduiColumns.SduiColumn(immutableList2, GenericAction.class, Modifier.INSTANCE, null, null, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composer2, 0, 0);
                            composer2.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 7);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (!(primaryAction instanceof InternationalTransferV2ViewState.AmountInputPrimaryAction.ContinueButton)) {
                    composerStartRestartGroup.startReplaceGroup(1908783332);
                    Composer composer2 = composerStartRestartGroup;
                    BentoButtonKt.m20586BentoButtonEikTQX8(onButtonClick, StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composerStartRestartGroup, i6), com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f, i5, null), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, 6, i6), null, null, ((InternationalTransferV2ViewState.AmountInputPrimaryAction.ContinueButton) primaryAction).getEnabled(), false, null, null, null, null, false, null, composer2, (i4 >> 6) & 14, 0, 8152);
                    composerStartRestartGroup = composer2;
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (!(primaryAction instanceof InternationalTransferV2ViewState.AmountInputPrimaryAction.SuggestedAmounts)) {
                        composerStartRestartGroup.startReplaceGroup(-1878091505);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(1909301001);
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f, i5, null), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, 6, i6);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getSpaceEvenly(), companion.getTop(), composerStartRestartGroup, 6);
                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, i6);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                    Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(1089483441);
                    for (final Money money : ((InternationalTransferV2ViewState.AmountInputPrimaryAction.SuggestedAmounts) primaryAction).getAmounts()) {
                        Row6 row62 = row6;
                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Row5.weight$default(row6, Modifier.INSTANCE, 1.0f, false, 2, null), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM(), f, 2, null);
                        String str = Money.format$default(money, null, false, null, false, 0, null, false, null, true, false, 767, null);
                        BentoButtons.Type type2 = BentoButtons.Type.Secondary;
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        int i8 = ((i4 & 7168) == 2048 ? 1 : i6) | (composerStartRestartGroup.changedInstance(money) ? 1 : 0);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (i8 != 0 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2ComposableKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return InternationalTransferV2ComposableKt.ButtonWithDisclosure$lambda$28$lambda$27$lambda$26$lambda$25(onSuggestedDepositAmountClick, money);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Composer composer3 = composerStartRestartGroup;
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, str, modifierM5144paddingVpY3zN4$default, null, type2, false, false, null, null, null, null, false, null, composer3, 24576, 0, 8168);
                        composerStartRestartGroup = composer3;
                        row6 = row62;
                        i4 = i4;
                        i6 = i6;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2ComposableKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InternationalTransferV2ComposableKt.ButtonWithDisclosure$lambda$29(immutableList, primaryAction, onButtonClick, onSuggestedDepositAmountClick, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i7 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            Alignment.Companion companion4 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally2 = companion4.getCenterHorizontally();
            Arrangement arrangement2 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.getTop(), centerHorizontally2, composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier5);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor4 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                if (immutableList != null) {
                }
                if (!(primaryAction instanceof InternationalTransferV2ViewState.AmountInputPrimaryAction.ContinueButton)) {
                }
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ButtonWithDisclosure$lambda$28$lambda$27$lambda$26$lambda$25(Function1 function1, Money money) {
        function1.invoke(money);
        return Unit.INSTANCE;
    }
}
