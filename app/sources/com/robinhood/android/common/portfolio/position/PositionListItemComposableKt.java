package com.robinhood.android.common.portfolio.position;

import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
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
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor2;
import com.robinhood.android.common.portfolio.position.PositionItemState;
import com.robinhood.android.common.portfolio.unified.StaleCheck;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.models.portfolio.PositionsV2;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import com.robinhood.android.models.portfolio.api.PositionsLocation;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.rosetta.eventlogging.Asset;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.tooltips.popup.PopupPositioning;
import com.robinhood.tooltips.popup.PopupTooltipKt;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import p479j$.time.Instant;

/* compiled from: PositionListItemComposable.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a{\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0004j\u0002`\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u001d2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u001dH\u0007¢\u0006\u0002\u0010\u001f\u001a'\u0010 \u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u001dH\u0007¢\u0006\u0002\u0010\"\"\u0014\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0006\"\u0014\u0010\u0007\u001a\u00020\u0004X\u0080T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u0004X\u0080T¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0006¨\u0006#²\u0006\n\u0010$\u001a\u00020%X\u008a\u0084\u0002²\u0006\n\u0010&\u001a\u00020\u0001X\u008a\u008e\u0002"}, m3636d2 = {"isEquitiesForSwipingBehaviors", "", "Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;", "PlaceholderPrimaryText", "", "getPlaceholderPrimaryText$annotations", "()V", "PlaceholderSecondaryText", "getPlaceholderSecondaryText$annotations", "PlaceholderMetaText", "getPlaceholderMetaText$annotations", "PositionListItemComposable", "", "position", "Lcom/robinhood/android/models/portfolio/PositionsV2$PositionListItemV2;", "displayType", "Lcom/robinhood/android/models/portfolio/PositionDisplayType;", "location", "Lcom/robinhood/android/models/portfolio/api/PositionsLocation;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "modifier", "Landroidx/compose/ui/Modifier;", "identifier", "duxo", "Lcom/robinhood/android/common/portfolio/position/PositionListItemDuxo;", "swipeAnimationPreview", "Lcom/robinhood/android/common/portfolio/position/SwipeAnimationPreview;", "onClicked", "Lkotlin/Function0;", "onDisplayValueClicked", "(Lcom/robinhood/android/models/portfolio/PositionsV2$PositionListItemV2;Ljava/lang/String;Lcom/robinhood/android/models/portfolio/api/PositionsLocation;ILandroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/robinhood/android/common/portfolio/position/PositionListItemDuxo;Lcom/robinhood/android/common/portfolio/position/SwipeAnimationPreview;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "PositionListItemPlaceholder", "clickHandler", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "feature-lib-portfolio_externalDebug", "uiState", "Lcom/robinhood/android/common/portfolio/position/PositionItemState;", "isStale"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PositionListItemComposableKt {
    public static final String PlaceholderMetaText = "$XXX.XX";
    public static final String PlaceholderPrimaryText = "XXXXX";
    public static final String PlaceholderSecondaryText = "XXX shares";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PositionListItemComposable$lambda$22(PositionsV2.PositionListItemV2 positionListItemV2, String str, PositionsLocation positionsLocation, int i, Modifier modifier, String str2, PositionListItemDuxo positionListItemDuxo, SwipeAnimationPreview swipeAnimationPreview, Function0 function0, Function0 function02, int i2, int i3, Composer composer, int i4) {
        PositionListItemComposable(positionListItemV2, str, positionsLocation, i, modifier, str2, positionListItemDuxo, swipeAnimationPreview, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PositionListItemPlaceholder$lambda$25(Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        PositionListItemPlaceholder(modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getPlaceholderMetaText$annotations() {
    }

    public static /* synthetic */ void getPlaceholderPrimaryText$annotations() {
    }

    public static /* synthetic */ void getPlaceholderSecondaryText$annotations() {
    }

    private static final PositionItemState PositionListItemComposable$lambda$4(SnapshotState4<? extends PositionItemState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final boolean PositionListItemComposable$lambda$6(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isEquitiesForSwipingBehaviors(PositionInstrumentType positionInstrumentType) {
        return SetsKt.setOf((Object[]) new PositionInstrumentType[]{PositionInstrumentType.EQUITY_LEGACY, PositionInstrumentType.EQUITY}).contains(positionInstrumentType);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x071d  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0787  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x07a1  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x07dd  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x07df  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x07e7  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x07e9  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x083a  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x084e  */
    /* JADX WARN: Removed duplicated region for block: B:267:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PositionListItemComposable(final PositionsV2.PositionListItemV2 position, final String displayType, final PositionsLocation location, final int i, Modifier modifier, String str, PositionListItemDuxo positionListItemDuxo, SwipeAnimationPreview swipeAnimationPreview, Function0<Unit> function0, Function0<Unit> function02, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        Modifier modifier2;
        int i6;
        String str2;
        PositionListItemDuxo positionListItemDuxo2;
        int i7;
        int i8;
        int i9;
        Composer composer2;
        final PositionListItemDuxo positionListItemDuxo3;
        SwipeAnimationPreview swipeAnimationPreview2;
        final Function0<Unit> function03;
        Function0<Unit> function04;
        Modifier modifier3;
        String str3;
        String str4;
        PositionItemState positionItemStatePositionListItemComposable$lambda$4;
        SwipeAnimationPreview swipeAnimationPreview3;
        Composer composer3;
        boolean z;
        boolean z2;
        boolean z3;
        Object objRememberedValue;
        final SwipeAnimationPreview swipeAnimationPreview4;
        final Function0<Unit> function05;
        Composer composer4;
        final Function0<Unit> function06;
        final String str5;
        final Modifier modifier4;
        final PositionListItemDuxo positionListItemDuxo4;
        Function0<Unit> function07;
        PositionRowState positionRowState;
        Modifier modifier5;
        boolean zChangedInstance;
        Object objRememberedValue2;
        boolean zChangedInstance2;
        Object objRememberedValue3;
        boolean zChangedInstance3;
        Object objRememberedValue4;
        boolean zChangedInstance4;
        Object objRememberedValue5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(displayType, "displayType");
        Intrinsics.checkNotNullParameter(location, "location");
        Composer composerStartRestartGroup = composer.startRestartGroup(479131335);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(position) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(displayType) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(location.ordinal()) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                i4 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i2 & 24576) == 0) {
                    modifier2 = modifier;
                    i4 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                    str2 = str;
                } else {
                    str2 = str;
                    if ((i2 & 196608) == 0) {
                        i4 |= composerStartRestartGroup.changed(str2) ? 131072 : 65536;
                    }
                }
                if ((i2 & 1572864) == 0) {
                    positionListItemDuxo2 = positionListItemDuxo;
                    i4 |= ((i3 & 64) == 0 && composerStartRestartGroup.changedInstance(positionListItemDuxo2)) ? 1048576 : 524288;
                } else {
                    positionListItemDuxo2 = positionListItemDuxo;
                }
                i7 = i3 & 128;
                if (i7 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(swipeAnimationPreview) ? 8388608 : 4194304;
                }
                i8 = i3 & 256;
                if (i8 != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function0) ? 67108864 : 33554432;
                }
                i9 = i3 & 512;
                if (i9 != 0) {
                    i4 |= 805306368;
                } else if ((i2 & 805306368) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function02) ? 536870912 : 268435456;
                }
                if ((i4 & 306783379) == 306783378 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    swipeAnimationPreview4 = swipeAnimationPreview;
                    composer4 = composerStartRestartGroup;
                    positionListItemDuxo4 = positionListItemDuxo2;
                    str5 = str2;
                    modifier4 = modifier2;
                    function05 = function0;
                    function06 = function02;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier6 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i6 != 0) {
                            str2 = "";
                        }
                        if ((i3 & 64) == 0) {
                            PositionInstrumentType instrumentType = position.getInstrumentType();
                            UUID instrumentId = position.getInstrumentId();
                            if (StringsKt.isBlank(str2)) {
                                str4 = "";
                            } else {
                                str4 = PlaceholderUtils.XXShortPlaceholderText + str2;
                            }
                            String str6 = "Position: " + instrumentType + PlaceholderUtils.XXShortPlaceholderText + instrumentId + str4;
                            composerStartRestartGroup.startReplaceGroup(-747520797);
                            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                            if (current == null) {
                                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            }
                            ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(1729797275);
                            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(PositionListItemDuxo.class), current, str6, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                            composer2 = composerStartRestartGroup;
                            composer2.endReplaceableGroup();
                            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                            final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                            composer2.startReplaceGroup(-1633490746);
                            boolean zChangedInstance5 = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                            Object objRememberedValue6 = composer2.rememberedValue();
                            if (zChangedInstance5 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue6 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.common.portfolio.position.PositionListItemComposableKt$PositionListItemComposable$$inlined$duxo$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                        lifecycle.addObserver(duxoLifecycleObserver);
                                        final Lifecycle lifecycle2 = lifecycle;
                                        return new DisposableEffectResult() { // from class: com.robinhood.android.common.portfolio.position.PositionListItemComposableKt$PositionListItemComposable$$inlined$duxo$1.1
                                            @Override // androidx.compose.runtime.DisposableEffectResult
                                            public void dispose() {
                                                lifecycle2.removeObserver(duxoLifecycleObserver);
                                            }
                                        };
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue6);
                            }
                            composer2.endReplaceGroup();
                            EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue6, composer2, 0);
                            composer2.endReplaceGroup();
                            positionListItemDuxo3 = (PositionListItemDuxo) baseDuxo;
                            i4 &= -3670017;
                        } else {
                            composer2 = composerStartRestartGroup;
                            positionListItemDuxo3 = positionListItemDuxo2;
                        }
                        swipeAnimationPreview2 = i7 == 0 ? null : swipeAnimationPreview;
                        if (i8 == 0) {
                            composer2.startReplaceGroup(1849434622);
                            Object objRememberedValue7 = composer2.rememberedValue();
                            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue7 = new Function0() { // from class: com.robinhood.android.common.portfolio.position.PositionListItemComposableKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue7);
                            }
                            function03 = (Function0) objRememberedValue7;
                            composer2.endReplaceGroup();
                        } else {
                            function03 = function0;
                        }
                        if (i9 == 0) {
                            composer2.startReplaceGroup(1849434622);
                            Object objRememberedValue8 = composer2.rememberedValue();
                            if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue8 = new Function0() { // from class: com.robinhood.android.common.portfolio.position.PositionListItemComposableKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue8);
                            }
                            composer2.endReplaceGroup();
                            function04 = (Function0) objRememberedValue8;
                        } else {
                            function04 = function02;
                        }
                        modifier3 = modifier6;
                        str3 = str2;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                        }
                        swipeAnimationPreview2 = swipeAnimationPreview;
                        function03 = function0;
                        function04 = function02;
                        composer2 = composerStartRestartGroup;
                        positionListItemDuxo3 = positionListItemDuxo2;
                        str3 = str2;
                        modifier3 = modifier2;
                    }
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(479131335, i4, -1, "com.robinhood.android.common.portfolio.position.PositionListItemComposable (PositionListItemComposable.kt:348)");
                    }
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(positionListItemDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer2, 0, 7);
                    PositionInstrumentType instrumentType2 = position.getInstrumentType();
                    UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    UserInteractionEventData.Action action = position.getInstrumentType() != PositionInstrumentType.COMBO_ORDERS_PENDING ? UserInteractionEventData.Action.VIEW_COMBO_ORDER_DETAIL : UserInteractionEventData.Action.VIEW_ASSET_DETAIL_PAGE;
                    Component component = new Component(Component.ComponentType.HOLDING_ROW, null, null, 6, null);
                    Context contextOrNew = UserInteractionEventDescriptor2.orNew(userInteractionEventDescriptor.getContext());
                    Asset.AssetType rosettaAssetType = instrumentType2.toRosettaAssetType();
                    String string2 = position.getMetadataId().toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    final UserInteractionEventDescriptor userInteractionEventDescriptorCopy$default = UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, action, Context.copy$default(contextOrNew, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, new Asset(string2, rosettaAssetType, null, null, 12, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, instrumentType2.toRosettaType(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16385, -1, -1, -1, -8193, -1, 16383, null), component, null, 35, null);
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier3, userInteractionEventDescriptorCopy$default, false, false, false, true, false, null, 110, null);
                    positionItemStatePositionListItemComposable$lambda$4 = PositionListItemComposable$lambda$4(snapshotState4CollectAsStateWithLifecycle);
                    if (positionItemStatePositionListItemComposable$lambda$4 instanceof PositionItemState.Loaded) {
                        swipeAnimationPreview3 = swipeAnimationPreview2;
                        composer3 = composer2;
                        z = true;
                        if (!(positionItemStatePositionListItemComposable$lambda$4 instanceof PositionItemState.Loading)) {
                            composer3.startReplaceGroup(883771686);
                            composer3.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer3.startReplaceGroup(1631279436);
                        z2 = false;
                        PositionListItemPlaceholder(modifierAutoLogEvents$default, function03, composer3, (i4 >> 21) & 112, 0);
                        composer3.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(1627189513);
                        PositionItemState.Loaded loaded = (PositionItemState.Loaded) positionItemStatePositionListItemComposable$lambda$4;
                        PositionRowState positionRowState2 = new PositionRowState(position, displayType, loaded.getDetails(), loaded.getSwipingBehaviors());
                        Instant receivedAt = loaded.getDetails().getReceivedAt();
                        composer2.startReplaceGroup(5004770);
                        boolean zChanged = composer2.changed(receivedAt);
                        Object objRememberedValue9 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                            function07 = function03;
                            objRememberedValue9 = SnapshotState3.mutableStateOf$default(Boolean.valueOf(StaleCheck.checkIfDataIsStale(loaded.getDetails().getReceivedAt())), null, 2, null);
                            composer2.updateRememberedValue(objRememberedValue9);
                        } else {
                            function07 = function03;
                        }
                        SnapshotState snapshotState = (SnapshotState) objRememberedValue9;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChanged2 = composer2.changed(snapshotState) | composer2.changedInstance(positionItemStatePositionListItemComposable$lambda$4);
                        Object objRememberedValue10 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue10 = new PositionListItemComposableKt$PositionListItemComposable$3$1(positionItemStatePositionListItemComposable$lambda$4, snapshotState, null);
                            composer2.updateRememberedValue(objRememberedValue10);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.LaunchedEffect(positionItemStatePositionListItemComposable$lambda$4, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue10, composer2, 0);
                        if (instrumentType2 == PositionInstrumentType.PSP) {
                            composer2.startReplaceGroup(1627781644);
                            PositionPspRow.PositionPspRow(modifierAutoLogEvents$default, positionRowState2, function07, PositionListItemComposable$lambda$6(snapshotState), composer2, (i4 >> 18) & 896, 0);
                            function03 = function07;
                            composer2.endReplaceGroup();
                            swipeAnimationPreview3 = swipeAnimationPreview2;
                            composer3 = composer2;
                            z = true;
                        } else {
                            function03 = function07;
                            composer2.startReplaceGroup(1628117529);
                            final EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer2, AutoLoggingCompositionLocals4.$stable);
                            final Screen screen = ((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getScreen();
                            composer2.startReplaceGroup(883809142);
                            final StringResource swipeTooltip = loaded.getSwipeTooltip();
                            if (swipeTooltip != null) {
                                composer2.startReplaceGroup(-1746271574);
                                boolean zChangedInstance6 = composer2.changedInstance(positionListItemDuxo3) | composer2.changedInstance(current2) | composer2.changedInstance(screen);
                                Object objRememberedValue11 = composer2.rememberedValue();
                                if (zChangedInstance6 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue11 = new Function0() { // from class: com.robinhood.android.common.portfolio.position.PositionListItemComposableKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return PositionListItemComposableKt.PositionListItemComposable$lambda$13$lambda$10$lambda$9(positionListItemDuxo3, current2, screen);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue11);
                                }
                                Function0 function08 = (Function0) objRememberedValue11;
                                composer2.endReplaceGroup();
                                composer2.startReplaceGroup(-1746271574);
                                boolean zChangedInstance7 = composer2.changedInstance(positionListItemDuxo3) | composer2.changedInstance(current2) | composer2.changedInstance(screen);
                                Object objRememberedValue12 = composer2.rememberedValue();
                                if (zChangedInstance7 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue12 = new Function0() { // from class: com.robinhood.android.common.portfolio.position.PositionListItemComposableKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return PositionListItemComposableKt.PositionListItemComposable$lambda$13$lambda$12$lambda$11(positionListItemDuxo3, current2, screen);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue12);
                                }
                                composer2.endReplaceGroup();
                                positionRowState = positionRowState2;
                                Modifier modifierM26519popupTooltipBgaGok8 = PopupTooltipKt.m26519popupTooltipBgaGok8(modifier3, (16232 & 1) != 0 ? Boolean.TRUE : null, (16232 & 2) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                } : function08, (16232 & 4) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda6
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                } : (Function0) objRememberedValue12, (16232 & 8) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda7
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                } : null, (16232 & 16) != 0 ? PopupPositioning.FREE : null, (16232 & 32) != 0 ? null : null, (16232 & 64) != 0 ? null : null, (16232 & 128) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 256) != 0, (16232 & 512) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 1024) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 2048) != 0 ? null : null, (16232 & 4096) != 0 ? EnterTransition.INSTANCE.getNone() : null, (16232 & 8192) != 0 ? ExitTransition.INSTANCE.getNone() : null, ComposableLambda3.rememberComposableLambda(-1868046305, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.portfolio.position.PositionListItemComposableKt$PositionListItemComposable$4$3
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        invoke(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer5, int i10) {
                                        if ((i10 & 3) == 2 && composer5.getSkipping()) {
                                            composer5.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1868046305, i10, -1, "com.robinhood.android.common.portfolio.position.PositionListItemComposable.<anonymous>.<anonymous> (PositionListItemComposable.kt:431)");
                                        }
                                        BentoText2.m20747BentoText38GnDrw(StringResources6.getText(swipeTooltip, composer5, StringResource.$stable).toString(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer5, 0, 0, 16382);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54));
                                if (modifierM26519popupTooltipBgaGok8 != null) {
                                    modifier5 = modifierM26519popupTooltipBgaGok8;
                                }
                                composer2.endReplaceGroup();
                                boolean zPositionListItemComposable$lambda$6 = PositionListItemComposable$lambda$6(snapshotState);
                                SwipeAnimationPreview swipeAnimationPreview5 = swipeAnimationPreview2 != null ? loaded.getSwipeAnimationPreview() : swipeAnimationPreview2;
                                composer2.startReplaceGroup(5004770);
                                zChangedInstance = composer2.changedInstance(positionListItemDuxo3);
                                objRememberedValue2 = composer2.rememberedValue();
                                if (!zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new PositionListItemComposableKt$PositionListItemComposable$5$1(positionListItemDuxo3);
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                KFunction kFunction = (KFunction) objRememberedValue2;
                                composer2.endReplaceGroup();
                                composer2.startReplaceGroup(5004770);
                                zChangedInstance2 = composer2.changedInstance(positionListItemDuxo3);
                                objRememberedValue3 = composer2.rememberedValue();
                                if (!zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new PositionListItemComposableKt$PositionListItemComposable$6$1(positionListItemDuxo3);
                                    composer2.updateRememberedValue(objRememberedValue3);
                                }
                                KFunction kFunction2 = (KFunction) objRememberedValue3;
                                composer2.endReplaceGroup();
                                composer2.startReplaceGroup(-1746271574);
                                swipeAnimationPreview3 = swipeAnimationPreview2;
                                zChangedInstance3 = ((i4 & 234881024) != 67108864) | composer2.changedInstance(current2) | composer2.changedInstance(userInteractionEventDescriptorCopy$default);
                                objRememberedValue4 = composer2.rememberedValue();
                                if (!zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.common.portfolio.position.PositionListItemComposableKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return PositionListItemComposableKt.PositionListItemComposable$lambda$17$lambda$16(current2, userInteractionEventDescriptorCopy$default, function03);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue4);
                                }
                                composer2.endReplaceGroup();
                                Composer composer5 = composer2;
                                z = true;
                                PositionInstrumentRow.PositionInstrumentRow(positionRowState, zPositionListItemComposable$lambda$6, swipeAnimationPreview5, (Function0) objRememberedValue4, function04, modifier5, str3, (Function1) kFunction, (Function1) kFunction2, composer5, ((i4 >> 15) & 57344) | ((i4 << 3) & 3670016), 0);
                                composer3 = composer5;
                                SwipeAnimationPreview swipeAnimationPreview6 = loaded.getSwipeAnimationPreview();
                                composer3.startReplaceGroup(-1746271574);
                                zChangedInstance4 = composer3.changedInstance(positionItemStatePositionListItemComposable$lambda$4) | composer3.changedInstance(current2) | composer3.changedInstance(screen);
                                objRememberedValue5 = composer3.rememberedValue();
                                if (!zChangedInstance4 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue5 = new PositionListItemComposableKt$PositionListItemComposable$8$1(positionItemStatePositionListItemComposable$lambda$4, current2, screen, null);
                                    composer3.updateRememberedValue(objRememberedValue5);
                                }
                                composer3.endReplaceGroup();
                                EffectsKt.LaunchedEffect(swipeAnimationPreview6, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composer3, 0);
                                composer3.endReplaceGroup();
                            } else {
                                positionRowState = positionRowState2;
                            }
                            modifier5 = modifier3;
                            composer2.endReplaceGroup();
                            boolean zPositionListItemComposable$lambda$62 = PositionListItemComposable$lambda$6(snapshotState);
                            if (swipeAnimationPreview2 != null) {
                            }
                            composer2.startReplaceGroup(5004770);
                            zChangedInstance = composer2.changedInstance(positionListItemDuxo3);
                            objRememberedValue2 = composer2.rememberedValue();
                            if (!zChangedInstance) {
                                objRememberedValue2 = new PositionListItemComposableKt$PositionListItemComposable$5$1(positionListItemDuxo3);
                                composer2.updateRememberedValue(objRememberedValue2);
                                KFunction kFunction3 = (KFunction) objRememberedValue2;
                                composer2.endReplaceGroup();
                                composer2.startReplaceGroup(5004770);
                                zChangedInstance2 = composer2.changedInstance(positionListItemDuxo3);
                                objRememberedValue3 = composer2.rememberedValue();
                                if (!zChangedInstance2) {
                                    objRememberedValue3 = new PositionListItemComposableKt$PositionListItemComposable$6$1(positionListItemDuxo3);
                                    composer2.updateRememberedValue(objRememberedValue3);
                                    KFunction kFunction22 = (KFunction) objRememberedValue3;
                                    composer2.endReplaceGroup();
                                    composer2.startReplaceGroup(-1746271574);
                                    swipeAnimationPreview3 = swipeAnimationPreview2;
                                    zChangedInstance3 = ((i4 & 234881024) != 67108864) | composer2.changedInstance(current2) | composer2.changedInstance(userInteractionEventDescriptorCopy$default);
                                    objRememberedValue4 = composer2.rememberedValue();
                                    if (!zChangedInstance3) {
                                        objRememberedValue4 = new Function0() { // from class: com.robinhood.android.common.portfolio.position.PositionListItemComposableKt$$ExternalSyntheticLambda4
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return PositionListItemComposableKt.PositionListItemComposable$lambda$17$lambda$16(current2, userInteractionEventDescriptorCopy$default, function03);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue4);
                                        composer2.endReplaceGroup();
                                        Composer composer52 = composer2;
                                        z = true;
                                        PositionInstrumentRow.PositionInstrumentRow(positionRowState, zPositionListItemComposable$lambda$62, swipeAnimationPreview5, (Function0) objRememberedValue4, function04, modifier5, str3, (Function1) kFunction3, (Function1) kFunction22, composer52, ((i4 >> 15) & 57344) | ((i4 << 3) & 3670016), 0);
                                        composer3 = composer52;
                                        SwipeAnimationPreview swipeAnimationPreview62 = loaded.getSwipeAnimationPreview();
                                        composer3.startReplaceGroup(-1746271574);
                                        zChangedInstance4 = composer3.changedInstance(positionItemStatePositionListItemComposable$lambda$4) | composer3.changedInstance(current2) | composer3.changedInstance(screen);
                                        objRememberedValue5 = composer3.rememberedValue();
                                        if (!zChangedInstance4) {
                                            objRememberedValue5 = new PositionListItemComposableKt$PositionListItemComposable$8$1(positionItemStatePositionListItemComposable$lambda$4, current2, screen, null);
                                            composer3.updateRememberedValue(objRememberedValue5);
                                            composer3.endReplaceGroup();
                                            EffectsKt.LaunchedEffect(swipeAnimationPreview62, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composer3, 0);
                                            composer3.endReplaceGroup();
                                        }
                                    }
                                }
                            }
                        }
                        composer3.endReplaceGroup();
                        z2 = false;
                    }
                    Object[] objArr = {position.getInstrumentId(), displayType, Integer.valueOf(i), positionListItemDuxo3};
                    composer3.startReplaceGroup(-1224400529);
                    boolean zChangedInstance8 = composer3.changedInstance(positionListItemDuxo3) | composer3.changedInstance(position) | ((i4 & 112) != 32 ? z : z2) | ((i4 & 896) != 256 ? z : z2);
                    if ((i4 & 7168) != 2048) {
                        z = z2;
                    }
                    z3 = zChangedInstance8 | z;
                    objRememberedValue = composer3.rememberedValue();
                    if (!z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final PositionListItemDuxo positionListItemDuxo5 = positionListItemDuxo3;
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.common.portfolio.position.PositionListItemComposableKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return PositionListItemComposableKt.PositionListItemComposable$lambda$21$lambda$20(positionListItemDuxo5, position, displayType, location, i, (LifecycleResumePauseEffectScope) obj);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    composer3.endReplaceGroup();
                    Composer composer6 = composer3;
                    LifecycleEffectKt.LifecycleResumeEffect(objArr, (LifecycleOwner) null, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue, composer6, 0, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    swipeAnimationPreview4 = swipeAnimationPreview3;
                    function05 = function03;
                    composer4 = composer6;
                    function06 = function04;
                    str5 = str3;
                    modifier4 = modifier3;
                    positionListItemDuxo4 = positionListItemDuxo3;
                }
                scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.portfolio.position.PositionListItemComposableKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return PositionListItemComposableKt.PositionListItemComposable$lambda$22(position, displayType, location, i, modifier4, str5, positionListItemDuxo4, swipeAnimationPreview4, function05, function06, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 24576;
            modifier2 = modifier;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            i7 = i3 & 128;
            if (i7 != 0) {
            }
            i8 = i3 & 256;
            if (i8 != 0) {
            }
            i9 = i3 & 512;
            if (i9 != 0) {
            }
            if ((i4 & 306783379) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i5 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i3 & 64) == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    modifier3 = modifier6;
                    str3 = str2;
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(positionListItemDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer2, 0, 7);
                    PositionInstrumentType instrumentType22 = position.getInstrumentType();
                    UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    UserInteractionEventData.Action action2 = position.getInstrumentType() != PositionInstrumentType.COMBO_ORDERS_PENDING ? UserInteractionEventData.Action.VIEW_COMBO_ORDER_DETAIL : UserInteractionEventData.Action.VIEW_ASSET_DETAIL_PAGE;
                    Component component2 = new Component(Component.ComponentType.HOLDING_ROW, null, null, 6, null);
                    Context contextOrNew2 = UserInteractionEventDescriptor2.orNew(userInteractionEventDescriptor2.getContext());
                    Asset.AssetType rosettaAssetType2 = instrumentType22.toRosettaAssetType();
                    String string22 = position.getMetadataId().toString();
                    Intrinsics.checkNotNullExpressionValue(string22, "toString(...)");
                    final UserInteractionEventDescriptor userInteractionEventDescriptorCopy$default2 = UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, null, action2, Context.copy$default(contextOrNew2, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, new Asset(string22, rosettaAssetType2, null, null, 12, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, instrumentType22.toRosettaType(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16385, -1, -1, -1, -8193, -1, 16383, null), component2, null, 35, null);
                    Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(modifier3, userInteractionEventDescriptorCopy$default2, false, false, false, true, false, null, 110, null);
                    positionItemStatePositionListItemComposable$lambda$4 = PositionListItemComposable$lambda$4(snapshotState4CollectAsStateWithLifecycle2);
                    if (positionItemStatePositionListItemComposable$lambda$4 instanceof PositionItemState.Loaded) {
                    }
                    Object[] objArr2 = {position.getInstrumentId(), displayType, Integer.valueOf(i), positionListItemDuxo3};
                    composer3.startReplaceGroup(-1224400529);
                    boolean zChangedInstance82 = composer3.changedInstance(positionListItemDuxo3) | composer3.changedInstance(position) | ((i4 & 112) != 32 ? z : z2) | ((i4 & 896) != 256 ? z : z2);
                    if ((i4 & 7168) != 2048) {
                    }
                    z3 = zChangedInstance82 | z;
                    objRememberedValue = composer3.rememberedValue();
                    if (!z3) {
                        final PositionListItemDuxo positionListItemDuxo52 = positionListItemDuxo3;
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.common.portfolio.position.PositionListItemComposableKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return PositionListItemComposableKt.PositionListItemComposable$lambda$21$lambda$20(positionListItemDuxo52, position, displayType, location, i, (LifecycleResumePauseEffectScope) obj);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue);
                        composer3.endReplaceGroup();
                        Composer composer62 = composer3;
                        LifecycleEffectKt.LifecycleResumeEffect(objArr2, (LifecycleOwner) null, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue, composer62, 0, 2);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        swipeAnimationPreview4 = swipeAnimationPreview3;
                        function05 = function03;
                        composer4 = composer62;
                        function06 = function04;
                        str5 = str3;
                        modifier4 = modifier3;
                        positionListItemDuxo4 = positionListItemDuxo3;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i5 = i3 & 16;
        if (i5 != 0) {
        }
        modifier2 = modifier;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        i7 = i3 & 128;
        if (i7 != 0) {
        }
        i8 = i3 & 256;
        if (i8 != 0) {
        }
        i9 = i3 & 512;
        if (i9 != 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PositionListItemComposable$lambda$7(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PositionListItemComposable$lambda$13$lambda$12$lambda$11(PositionListItemDuxo positionListItemDuxo, EventLogger eventLogger, Screen screen) {
        positionListItemDuxo.onEquitySwipeTooltipShown();
        EventLogger.DefaultImpls.logAppear$default(eventLogger, null, screen, new Component(Component.ComponentType.TOOLTIP, "equities_swipe_to_trade_tooltip", null, 4, null), null, null, 25, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PositionListItemComposable$lambda$13$lambda$10$lambda$9(PositionListItemDuxo positionListItemDuxo, EventLogger eventLogger, Screen screen) {
        positionListItemDuxo.onEquitySwipeTooltipClick();
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, new Component(Component.ComponentType.TOOLTIP, "equities_swipe_to_trade_tooltip", null, 4, null), null, null, false, 57, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PositionListItemComposable$lambda$17$lambda$16(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Function0 function0) {
        EventLogger.DefaultImpls.logTap$default(eventLogger, userInteractionEventDescriptor.getAction(), userInteractionEventDescriptor.getScreen(), userInteractionEventDescriptor.getComponent(), userInteractionEventDescriptor.getComponentHierarchy(), userInteractionEventDescriptor.getContext(), false, 32, null);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecyclePauseOrDisposeEffectResult PositionListItemComposable$lambda$21$lambda$20(PositionListItemDuxo positionListItemDuxo, PositionsV2.PositionListItemV2 positionListItemV2, String str, PositionsLocation positionsLocation, int i, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        final Job jobBind = positionListItemDuxo.bind(positionListItemV2, str, positionsLocation, i);
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.android.common.portfolio.position.PositionListItemComposableKt$PositionListItemComposable$lambda$21$lambda$20$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                Job.DefaultImpls.cancel$default(jobBind, null, 1, null);
            }
        };
    }

    public static final void PositionListItemPlaceholder(final Modifier modifier, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1731953933);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i5 != 0) {
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.common.portfolio.position.PositionListItemComposableKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                function0 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1731953933, i3, -1, "com.robinhood.android.common.portfolio.position.PositionListItemPlaceholder (PositionListItemComposable.kt:493)");
            }
            Modifier modifier2 = modifier;
            LocalShowPlaceholder.Loadable(true, modifier2, null, ComposableLambda3.rememberComposableLambda(-1043957917, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.portfolio.position.PositionListItemComposableKt.PositionListItemPlaceholder.2
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
                        ComposerKt.traceEventStart(-1043957917, i6, -1, "com.robinhood.android.common.portfolio.position.PositionListItemPlaceholder.<anonymous> (PositionListItemComposable.kt:497)");
                    }
                    BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, PositionListItemComposableKt.PlaceholderPrimaryText, PositionListItemComposableKt.PlaceholderSecondaryText, null, new BentoBaseRowState.Meta.CallToAction(PositionListItemComposableKt.PlaceholderMetaText, null, 2, null), null, false, false, false, 0L, function0, composer2, (BentoBaseRowState.Meta.CallToAction.$stable << 15) | 3456, 0, 2003);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 << 3) & 112) | 3078, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.portfolio.position.PositionListItemComposableKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PositionListItemComposableKt.PositionListItemPlaceholder$lambda$25(modifier, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
