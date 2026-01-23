package com.robinhood.android.redesigninvesting.badges.p230ui;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextOverflow;
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
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LifecycleEffectKt;
import androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.redesigninvesting.badges.p230ui.InvestingBadgeViewState;
import com.robinhood.android.redesigninvesting.shared.p234ui.LiveIconSwitcher;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.models.serverdriven.experimental.api.InstrumentType;
import com.robinhood.rosetta.eventlogging.Asset;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.Job;

/* compiled from: InvestingBadgeComposable.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002"}, m3636d2 = {"InvestingBadgeComposable", "", "accountNumber", "", "instrumentType", "Lcom/robinhood/models/serverdriven/experimental/api/InstrumentType;", "metadataId", "Ljava/util/UUID;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/InstrumentType;Ljava/util/UUID;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-badges-ui_externalDebug", "viewState", "Lcom/robinhood/android/redesigninvesting/badges/ui/InvestingBadgeViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.redesigninvesting.badges.ui.InvestingBadgeComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class InvestingBadgeComposable {

    /* compiled from: InvestingBadgeComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.redesigninvesting.badges.ui.InvestingBadgeComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InstrumentType.values().length];
            try {
                iArr[InstrumentType.EQUITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InstrumentType.CRYPTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InstrumentType.CRYPTO_PERPETUALS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InstrumentType.CRYPTO_TOKENIZED_STOCKS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InstrumentType.OPTION_STRATEGY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InstrumentType.FUTURE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[InstrumentType.INDEX.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[InstrumentType.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestingBadgeComposable$lambda$0(String str, InstrumentType instrumentType, UUID uuid, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InvestingBadgeComposable(str, instrumentType, uuid, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestingBadgeComposable$lambda$11(String str, InstrumentType instrumentType, UUID uuid, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InvestingBadgeComposable(str, instrumentType, uuid, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestingBadgeComposable$lambda$2(String str, InstrumentType instrumentType, UUID uuid, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InvestingBadgeComposable(str, instrumentType, uuid, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestingBadgeComposable$lambda$7(String str, InstrumentType instrumentType, UUID uuid, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InvestingBadgeComposable(str, instrumentType, uuid, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InvestingBadgeComposable(final String accountNumber, final InstrumentType instrumentType, final UUID metadataId, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        LocalViewModelStoreOwner localViewModelStoreOwner;
        int i5;
        Composer composer2;
        Asset.AssetType assetType;
        Modifier modifierM5142padding3ABfNKs;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(metadataId, "metadataId");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1466876438);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(accountNumber) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(instrumentType.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(metadataId) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i3;
            if ((i4 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                final Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1466876438, i4, -1, "com.robinhood.android.redesigninvesting.badges.ui.InvestingBadgeComposable (InvestingBadgeComposable.kt:43)");
                }
                localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
                i5 = LocalViewModelStoreOwner.$stable;
                if (localViewModelStoreOwner.getCurrent(composerStartRestartGroup, i5) != null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup2 != null) {
                        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.redesigninvesting.badges.ui.InvestingBadgeComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return InvestingBadgeComposable.InvestingBadgeComposable$lambda$0(accountNumber, instrumentType, metadataId, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                final Modifier modifier5 = modifier4;
                String str = "InvestingBadge " + metadataId;
                composerStartRestartGroup.startReplaceGroup(-747520797);
                ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, i5);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(1729797275);
                ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(InvestingBadgeDuxo.class), current, str, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                composer2 = composerStartRestartGroup;
                composer2.endReplaceableGroup();
                final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                composer2.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.redesigninvesting.badges.ui.InvestingBadgeComposableKt$InvestingBadgeComposable$$inlined$duxo$1
                        @Override // kotlin.jvm.functions.Function1
                        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                            final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                            lifecycle.addObserver(duxoLifecycleObserver);
                            final Lifecycle lifecycle2 = lifecycle;
                            return new DisposableEffectResult() { // from class: com.robinhood.android.redesigninvesting.badges.ui.InvestingBadgeComposableKt$InvestingBadgeComposable$$inlined$duxo$1.1
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
                final InvestingBadgeDuxo investingBadgeDuxo = (InvestingBadgeDuxo) baseDuxo;
                composer2.startReplaceGroup(1849434622);
                Object objRememberedValue2 = composer2.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = CollectionsKt.listOf((Object[]) new InstrumentType[]{InstrumentType.OPTION_STRATEGY, InstrumentType.FUTURE, InstrumentType.INDEX, InstrumentType.UNKNOWN});
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceGroup();
                if (((List) objRememberedValue2).contains(instrumentType)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup3 != null) {
                        scopeUpdateScopeEndRestartGroup3.updateScope(new Function2() { // from class: com.robinhood.android.redesigninvesting.badges.ui.InvestingBadgeComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return InvestingBadgeComposable.InvestingBadgeComposable$lambda$2(accountNumber, instrumentType, metadataId, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                composer2.startReplaceGroup(-1224400529);
                boolean zChangedInstance2 = composer2.changedInstance(investingBadgeDuxo) | ((i4 & 14) == 4) | ((i4 & 112) == 32) | composer2.changedInstance(metadataId);
                Object objRememberedValue3 = composer2.rememberedValue();
                if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.redesigninvesting.badges.ui.InvestingBadgeComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return InvestingBadgeComposable.InvestingBadgeComposable$lambda$5$lambda$4(investingBadgeDuxo, accountNumber, instrumentType, metadataId, (LifecycleResumePauseEffectScope) obj);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                composer2.endReplaceGroup();
                LifecycleEffectKt.LifecycleResumeEffect(accountNumber, instrumentType, metadataId, null, (Function1) objRememberedValue3, composer2, i4 & 1022, 8);
                InvestingBadgeViewState investingBadgeViewStateInvestingBadgeComposable$lambda$6 = InvestingBadgeComposable$lambda$6(FlowExtKt.collectAsStateWithLifecycle(investingBadgeDuxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer2, 0, 7));
                InvestingBadgeViewState.Badge badge = investingBadgeViewStateInvestingBadgeComposable$lambda$6 instanceof InvestingBadgeViewState.Badge ? (InvestingBadgeViewState.Badge) investingBadgeViewStateInvestingBadgeComposable$lambda$6 : null;
                if (badge == null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup4 = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup4 != null) {
                        scopeUpdateScopeEndRestartGroup4.updateScope(new Function2() { // from class: com.robinhood.android.redesigninvesting.badges.ui.InvestingBadgeComposableKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return InvestingBadgeComposable.InvestingBadgeComposable$lambda$7(accountNumber, instrumentType, metadataId, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                composer2.startReplaceGroup(-1633490746);
                boolean zChangedInstance3 = composer2.changedInstance(badge) | composer2.changedInstance(investingBadgeDuxo);
                Object objRememberedValue4 = composer2.rememberedValue();
                if (zChangedInstance3 || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new InvestingBadgeComposable2(badge, investingBadgeDuxo, null);
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                composer2.endReplaceGroup();
                EffectsKt.LaunchedEffect(metadataId, badge, (Function2) objRememberedValue4, composer2, (i4 >> 6) & 14);
                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                Component component = new Component(Component.ComponentType.BADGE, badge.getDetails().getAnalyticsName(), null, 4, null);
                String string2 = metadataId.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                switch (WhenMappings.$EnumSwitchMapping$0[instrumentType.ordinal()]) {
                    case 1:
                        assetType = Asset.AssetType.INSTRUMENT;
                        break;
                    case 2:
                    case 3:
                    case 4:
                        assetType = Asset.AssetType.CURRENCY_PAIR;
                        break;
                    case 5:
                        assetType = Asset.AssetType.OPTIONS_CONTRACT;
                        break;
                    case 6:
                        assetType = Asset.AssetType.FUTURES;
                        break;
                    case 7:
                        assetType = Asset.AssetType.INDEXES;
                        break;
                    case 8:
                        assetType = Asset.AssetType.ASSET_TYPE_UNSPECIFIED;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                UserInteractionEventDescriptor userInteractionEventDescriptorCopy$default = UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, new Asset(string2, assetType, null, null, 12, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16385, -1, -1, -1, -1, -1, 16383, null), component, null, 39, null);
                composer2.startReplaceGroup(-918883007);
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier5, userInteractionEventDescriptorCopy$default, true, false, false, false, false, null, 108, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i7 = BentoTheme.$stable;
                Modifier modifierM4871backgroundbw27NRU = Background3.m4871backgroundbw27NRU(modifierAutoLogEvents$default, bentoTheme.getColors(composer2, i7).m21372getBg20d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(100)));
                if (badge.getDetails().getText() != null) {
                    composer2.startReplaceGroup(-1356181435);
                    modifierM5142padding3ABfNKs = PaddingKt.m5143paddingVpY3zN4(modifierM4871backgroundbw27NRU, bentoTheme.getSpacing(composer2, i7).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composer2, i7).m21597getXxsmallD9Ej5fM());
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(-1356052878);
                    modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(modifierM4871backgroundbw27NRU, bentoTheme.getSpacing(composer2, i7).m21595getXsmallD9Ej5fM());
                    composer2.endReplaceGroup();
                }
                composer2.endReplaceGroup();
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composer2, 48);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5142padding3ABfNKs);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                ServerToBentoAssetMapper2 iconAsset = badge.getDetails().getIconAsset();
                List<Integer> drawableIconIds = badge.getDetails().getDrawableIconIds();
                StringResource text = badge.getDetails().getText();
                if (!drawableIconIds.isEmpty()) {
                    composer2.startReplaceGroup(-1132644719);
                    LiveIconSwitcher.IconSwitcher(extensions2.toPersistentList(drawableIconIds), null, null, composer2, 0, 6);
                    composer2 = composer2;
                    composer2.endReplaceGroup();
                } else if (iconAsset != null) {
                    composer2.startReplaceGroup(-1132531445);
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size12(iconAsset), null, bentoTheme.getColors(composer2, i7).m21425getFg0d7_KjU(), null, null, false, composer2, BentoIcon4.Size12.$stable | 48, 56);
                    composer2 = composer2;
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(-1132299844);
                    composer2.endReplaceGroup();
                }
                composer2.startReplaceGroup(-590714386);
                if (text != null) {
                    Spacer2.Spacer(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, bentoTheme.getSpacing(composer2, i7).m21595getXsmallD9Ej5fM()), composer2, 0);
                    Composer composer3 = composer2;
                    BentoText2.m20747BentoText38GnDrw(StringResource2.getString(text, composer2, StringResource.$stable), null, Color.m6701boximpl(bentoTheme.getColors(composer2, i7).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, bentoTheme.getTypography(composer2, i7).getTextAnnotation(), composer3, 817913856, 0, 7530);
                    composer2 = composer3;
                }
                composer2.endReplaceGroup();
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesigninvesting.badges.ui.InvestingBadgeComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InvestingBadgeComposable.InvestingBadgeComposable$lambda$11(accountNumber, instrumentType, metadataId, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 1171) == 1170) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
            i5 = LocalViewModelStoreOwner.$stable;
            if (localViewModelStoreOwner.getCurrent(composerStartRestartGroup, i5) != null) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecyclePauseOrDisposeEffectResult InvestingBadgeComposable$lambda$5$lambda$4(InvestingBadgeDuxo investingBadgeDuxo, String str, InstrumentType instrumentType, UUID uuid, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        final Job jobBind = investingBadgeDuxo.bind(str, instrumentType, uuid);
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.android.redesigninvesting.badges.ui.InvestingBadgeComposableKt$InvestingBadgeComposable$lambda$5$lambda$4$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                Job.DefaultImpls.cancel$default(jobBind, null, 1, null);
            }
        };
    }

    private static final InvestingBadgeViewState InvestingBadgeComposable$lambda$6(SnapshotState4<? extends InvestingBadgeViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
