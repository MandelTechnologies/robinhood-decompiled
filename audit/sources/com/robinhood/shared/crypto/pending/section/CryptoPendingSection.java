package com.robinhood.shared.crypto.pending.section;

import android.content.Context;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.history.contracts.DetailType;
import com.robinhood.android.history.contracts.LegacyDetailFragmentKey;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.shared.crypto.contracts.transfers.CryptoTransferHistoryFragmentKey;
import com.robinhood.shared.crypto.pending.rows.PendingData;
import com.robinhood.shared.crypto.pending.rows.PendingLoggingData;
import com.robinhood.shared.crypto.pending.rows.PendingSection2;
import com.robinhood.shared.crypto.perpetuals.contracts.PerpetualsMarginEditDetailFragmentKey;
import com.robinhood.shared.crypto.perpetuals.contracts.PerpetualsOrderDetailFragmentKey;
import com.robinhood.shared.history.contracts.account.AccountsHistoryAccountTypeFilter;
import com.robinhood.shared.history.contracts.account.AccountsHistoryContract;
import com.robinhood.shared.history.contracts.account.AccountsHistoryTransactionTypeFilter;
import com.robinhood.shared.staking.contracts.CryptoStakingHistoryDetailFragmentKey;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoPendingSection.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002"}, m3636d2 = {"CryptoPendingSection", "", "config", "Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionConfig;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionDuxo;", "(Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionConfig;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionDuxo;Landroidx/compose/runtime/Composer;II)V", "lib-pending-section_externalDebug", "viewState", "Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.pending.section.CryptoPendingSectionKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoPendingSection {

    /* compiled from: CryptoPendingSection.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.pending.section.CryptoPendingSectionKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PendingData.Type.values().length];
            try {
                iArr[PendingData.Type.ORDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PendingData.Type.TRANSFER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PendingData.Type.PERPETUAL_ORDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PendingData.Type.PERPETUAL_MARGIN_EDIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PendingData.Type.STAKING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoPendingSection$lambda$6(CryptoPendingSectionConfig cryptoPendingSectionConfig, Modifier modifier, CryptoPendingSectionDuxo cryptoPendingSectionDuxo, int i, int i2, Composer composer, int i3) {
        CryptoPendingSection(cryptoPendingSectionConfig, modifier, cryptoPendingSectionDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoPendingSection(final CryptoPendingSectionConfig config, Modifier modifier, CryptoPendingSectionDuxo cryptoPendingSectionDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoPendingSectionDuxo cryptoPendingSectionDuxo2;
        Modifier modifier3;
        int i4;
        CryptoPendingSectionDuxo cryptoPendingSectionDuxo3;
        final Navigator navigator;
        final Context context;
        boolean zChangedInstance;
        Object objRememberedValue;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        final CryptoPendingSectionDuxo cryptoPendingSectionDuxo4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(config, "config");
        Composer composerStartRestartGroup = composer.startRestartGroup(1521766160);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(config) ? 4 : 2) | i;
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
                    cryptoPendingSectionDuxo2 = cryptoPendingSectionDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(cryptoPendingSectionDuxo2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    cryptoPendingSectionDuxo2 = cryptoPendingSectionDuxo;
                }
                i3 |= i6;
            } else {
                cryptoPendingSectionDuxo2 = cryptoPendingSectionDuxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        composerStartRestartGroup.startReplaceGroup(2050738472);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        CreationExtras2 creationExtras2 = new CreationExtras2(current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                        creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, config)));
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoPendingSectionDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.crypto.pending.section.CryptoPendingSectionKt$CryptoPendingSection$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.crypto.pending.section.CryptoPendingSectionKt$CryptoPendingSection$$inlined$duxo$1.1
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
                        cryptoPendingSectionDuxo3 = (CryptoPendingSectionDuxo) baseDuxo;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1521766160, i4, -1, "com.robinhood.shared.crypto.pending.section.CryptoPendingSection (CryptoPendingSection.kt:37)");
                        }
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoPendingSectionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                        navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                        context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        StringResource title = CryptoPendingSection$lambda$0(snapshotState4CollectAsStateWithLifecycle).getTitle();
                        ImmutableList<PendingData> pendingDataList = CryptoPendingSection$lambda$0(snapshotState4CollectAsStateWithLifecycle).getPendingDataList();
                        boolean zIsShowMoreVisible = CryptoPendingSection$lambda$0(snapshotState4CollectAsStateWithLifecycle).isShowMoreVisible();
                        PendingLoggingData pendingLoggingData = new PendingLoggingData(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(Component.ComponentType.ROW, "crypto-pending-order-section-row", null, 4, null), null, 47, null), UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(Component.ComponentType.BUTTON, "crypto-pending-order-section-show-more-cta", null, 4, null), null, 47, null));
                        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier3, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(Component.ComponentType.PENDING_ORDER_SECTION, null, null, 6, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.pending.section.CryptoPendingSectionKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CryptoPendingSection.CryptoPendingSection$lambda$2$lambda$1(navigator, context, (PendingData) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        Function1 function1 = (Function1) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-1746271574);
                        zChangedInstance2 = ((i4 & 14) != 4) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.pending.section.CryptoPendingSectionKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoPendingSection.CryptoPendingSection$lambda$5$lambda$4(navigator, context, config);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        PendingSection2.PendingSection(title, pendingDataList, zIsShowMoreVisible, function1, (Function0) objRememberedValue2, modifierAutoLogEvents$default, pendingLoggingData, composerStartRestartGroup, StringResource.$stable | (PendingData.$stable << 3) | (PendingLoggingData.$stable << 18), 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        cryptoPendingSectionDuxo4 = cryptoPendingSectionDuxo3;
                        modifier4 = modifier3;
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
                cryptoPendingSectionDuxo3 = cryptoPendingSectionDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(cryptoPendingSectionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                StringResource title2 = CryptoPendingSection$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getTitle();
                ImmutableList<PendingData> pendingDataList2 = CryptoPendingSection$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getPendingDataList();
                boolean zIsShowMoreVisible2 = CryptoPendingSection$lambda$0(snapshotState4CollectAsStateWithLifecycle2).isShowMoreVisible();
                PendingLoggingData pendingLoggingData2 = new PendingLoggingData(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, null, null, null, new Component(Component.ComponentType.ROW, "crypto-pending-order-section-row", null, 4, null), null, 47, null), UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, null, null, null, new Component(Component.ComponentType.BUTTON, "crypto-pending-order-section-show-more-cta", null, 4, null), null, 47, null));
                Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(modifier3, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, null, null, null, new Component(Component.ComponentType.PENDING_ORDER_SECTION, null, null, 6, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.pending.section.CryptoPendingSectionKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CryptoPendingSection.CryptoPendingSection$lambda$2$lambda$1(navigator, context, (PendingData) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    Function1 function12 = (Function1) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChangedInstance2 = ((i4 & 14) != 4) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance2) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.pending.section.CryptoPendingSectionKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoPendingSection.CryptoPendingSection$lambda$5$lambda$4(navigator, context, config);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        PendingSection2.PendingSection(title2, pendingDataList2, zIsShowMoreVisible2, function12, (Function0) objRememberedValue2, modifierAutoLogEvents$default2, pendingLoggingData2, composerStartRestartGroup, StringResource.$stable | (PendingData.$stable << 3) | (PendingLoggingData.$stable << 18), 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        cryptoPendingSectionDuxo4 = cryptoPendingSectionDuxo3;
                        modifier4 = modifier3;
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                cryptoPendingSectionDuxo4 = cryptoPendingSectionDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.pending.section.CryptoPendingSectionKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoPendingSection.CryptoPendingSection$lambda$6(config, modifier4, cryptoPendingSectionDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoPendingSection$lambda$2$lambda$1(Navigator navigator, Context context, PendingData pendingOrderData) {
        Intrinsics.checkNotNullParameter(pendingOrderData, "pendingOrderData");
        int i = WhenMappings.$EnumSwitchMapping$0[pendingOrderData.getType().ordinal()];
        if (i == 1) {
            Navigator.DefaultImpls.showFragment$default(navigator, context, LegacyDetailFragmentKey.Companion.from$default(LegacyDetailFragmentKey.INSTANCE, DetailType.CRYPTO_ORDER, pendingOrderData.getId(), null, false, 12, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        } else if (i == 2) {
            Navigator.DefaultImpls.showFragment$default(navigator, context, new CryptoTransferHistoryFragmentKey(pendingOrderData.getId(), true), false, false, false, null, false, null, true, false, null, null, 3828, null);
        } else if (i == 3) {
            Navigator.DefaultImpls.showFragment$default(navigator, context, new PerpetualsOrderDetailFragmentKey(pendingOrderData.getId(), PerpetualsOrderDetailFragmentKey.NavigationIcon.BACK), false, false, false, null, false, null, false, false, null, null, 4092, null);
        } else if (i == 4) {
            Navigator.DefaultImpls.showFragment$default(navigator, context, new PerpetualsMarginEditDetailFragmentKey(pendingOrderData.getId()), false, false, false, null, false, null, false, false, null, null, 4092, null);
        } else if (i == 5) {
            Navigator.DefaultImpls.showFragment$default(navigator, context, new CryptoStakingHistoryDetailFragmentKey(pendingOrderData.getId()), false, false, false, null, false, null, false, false, null, null, 4092, null);
        }
        return Unit.INSTANCE;
    }

    private static final CryptoPendingSectionViewState CryptoPendingSection$lambda$0(SnapshotState4<CryptoPendingSectionViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoPendingSection$lambda$5$lambda$4(Navigator navigator, Context context, CryptoPendingSectionConfig cryptoPendingSectionConfig) {
        AccountsHistoryAccountTypeFilter accountsHistoryAccountTypeFilter = AccountsHistoryAccountTypeFilter.CRYPTO;
        AccountsHistoryTransactionTypeFilter accountsHistoryTransactionTypeFilter = AccountsHistoryTransactionTypeFilter.ALL;
        UUID currencyPairId = CryptoPendingSectionConfig2.getCurrencyPairId(cryptoPendingSectionConfig);
        Navigator.DefaultImpls.showFragment$default(navigator, context, new AccountsHistoryContract.Key(accountsHistoryAccountTypeFilter, accountsHistoryTransactionTypeFilter, currencyPairId != null ? new AccountsHistoryContract.InstrumentFilter(currencyPairId, AccountsHistoryContract.InstrumentFilterType.CRYPTO) : null, null, true, FragmentTab.CURRENT_TAB, 8, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }
}
