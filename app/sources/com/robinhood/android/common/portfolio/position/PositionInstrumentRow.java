package com.robinhood.android.common.portfolio.position;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.portfolio.instrument.InstrumentRowStates;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.instrumentrow.InstrumentRow5;
import com.robinhood.android.instrumentrow.InstrumentRowState;
import com.robinhood.android.models.portfolio.InstrumentDetails3;
import com.robinhood.android.models.portfolio.PositionSwipeBehavior;
import com.robinhood.android.models.portfolio.PositionsV2;
import com.robinhood.android.models.portfolio.api.ApiPositionSwipeBehavior;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabScrollInteractions;
import com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabScrollInteractions2;
import com.robinhood.android.redesigninvesting.interactions.scrolling.LocalAccountTabScrollInteraction;
import com.robinhood.android.swipetodismiss.SwipeToDismiss2;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.models.serverdriven.experimental.api.InstrumentType;
import com.robinhood.rosetta.eventlogging.Asset;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableMap3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PositionInstrumentRow.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0087\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00112\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011H\u0001¢\u0006\u0002\u0010\u0014\u001a\u001e\u0010\u0015\u001a\u00020\u0003*\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0000\u001a4\u0010\u001b\u001a\u00020\u0003*\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0000\u001a*\u0010!\u001a\u00020\u0003*\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\"\u001a\u00020#2\n\u0010$\u001a\u00060%j\u0002`&H\u0002\u001a\u0010\u0010'\u001a\u00060%j\u0002`&*\u00020\u001aH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006("}, m3636d2 = {"SWIPE_ROW_TEST_TAG", "", "PositionInstrumentRow", "", "state", "Lcom/robinhood/android/common/portfolio/position/PositionRowState;", "isStale", "", "swipeAnimationPreview", "Lcom/robinhood/android/common/portfolio/position/SwipeAnimationPreview;", "onClick", "Lkotlin/Function0;", "onDisplayValueClicked", "modifier", "Landroidx/compose/ui/Modifier;", "identifier", "onSwipe", "Lkotlin/Function1;", "Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;", "onAlertWithReceiptDismissed", "(Lcom/robinhood/android/common/portfolio/position/PositionRowState;ZLcom/robinhood/android/common/portfolio/position/SwipeAnimationPreview;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "logSwipeStart", "Lcom/robinhood/analytics/EventLogger;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "position", "Lcom/robinhood/android/models/portfolio/PositionsV2$PositionListItemV2;", "logSwipeCompleted", "swipeType", "Lcom/robinhood/android/models/portfolio/api/ApiPositionSwipeBehavior$SwipeType;", "swipeBehaviors", "", "Lcom/robinhood/android/models/portfolio/PositionSwipeBehavior;", "logSwipe", "action", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "swipeEventContext", "feature-lib-portfolio_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.portfolio.position.PositionInstrumentRowKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class PositionInstrumentRow {
    public static final String SWIPE_ROW_TEST_TAG = "swipe-row";

    /* compiled from: PositionInstrumentRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.portfolio.position.PositionInstrumentRowKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PositionInstrumentType.values().length];
            try {
                iArr[PositionInstrumentType.EQUITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PositionInstrumentType.EQUITY_LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PositionInstrumentType.CRYPTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PositionInstrumentType.CRYPTO_TOKENIZED_STOCKS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PositionInstrumentType.CRYPTO_PERPETUALS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PositionInstrumentType.OPTIONS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PositionInstrumentType.OPTIONS_PENDING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PositionInstrumentType.COMBO_ORDERS_PENDING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PositionInstrumentType.FUTURES.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[PositionInstrumentType.EVENT_CONTRACT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[PositionInstrumentType.EVENT_CONTRACT_PENDING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[PositionInstrumentType.FUTURES_PENDING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[PositionInstrumentType.EQUITY_PENDING.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[PositionInstrumentType.PSP.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[PositionInstrumentType.UNKNOWN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PositionInstrumentRow$lambda$8(PositionRowState positionRowState, boolean z, SwipeAnimationPreview swipeAnimationPreview, Function0 function0, Function0 function02, Modifier modifier, String str, Function1 function1, Function1 function12, int i, int i2, Composer composer, int i3) {
        PositionInstrumentRow(positionRowState, z, swipeAnimationPreview, function0, function02, modifier, str, function1, function12, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PositionInstrumentRow(final PositionRowState state, final boolean z, final SwipeAnimationPreview swipeAnimationPreview, final Function0<Unit> onClick, final Function0<Unit> onDisplayValueClicked, Modifier modifier, String str, Function1<? super PositionInstrumentType, Unit> function1, Function1<? super String, Unit> function12, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        int i4;
        Modifier modifier2;
        int i5;
        String str2;
        int i6;
        Function1<? super PositionInstrumentType, Unit> function13;
        int i7;
        InstrumentType instrumentType;
        Composer composer2;
        boolean zChangedInstance;
        Object objRememberedValue;
        Modifier modifier3;
        Function1<? super String, Unit> function14;
        String str3;
        final String str4;
        final Function1<? super String, Unit> function15;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(onDisplayValueClicked, "onDisplayValueClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(377590148);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(swipeAnimationPreview) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onClick) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onDisplayValueClicked) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else {
                if ((196608 & i) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else {
                    if ((1572864 & i) == 0) {
                        str2 = str;
                        i3 |= composerStartRestartGroup.changed(str2) ? 1048576 : 524288;
                    }
                    i6 = i2 & 128;
                    if (i6 != 0) {
                        if ((12582912 & i) == 0) {
                            function13 = function1;
                            i3 |= composerStartRestartGroup.changedInstance(function13) ? 8388608 : 4194304;
                        }
                        i7 = i2 & 256;
                        if (i7 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function12) ? 67108864 : 33554432;
                        }
                        if ((i3 & 38347923) == 38347922 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            function15 = function12;
                            composer2 = composerStartRestartGroup;
                            modifier4 = modifier2;
                            str4 = str2;
                        } else {
                            Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                            String str5 = i5 == 0 ? "" : str2;
                            final Function1<? super PositionInstrumentType, Unit> function16 = i6 == 0 ? null : function13;
                            Function1<? super String, Unit> function17 = i7 == 0 ? null : function12;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(377590148, i3, -1, "com.robinhood.android.common.portfolio.position.PositionInstrumentRow (PositionInstrumentRow.kt:44)");
                            }
                            boolean z3 = !Intrinsics.areEqual(state.getDisplayType(), state.getDetails().getDisplayType());
                            boolean shouldShowDisplayStringsAsText = state.getDetails().getDisplayConfiguration().getShouldShowDisplayStringsAsText();
                            InstrumentDetails3.TextDisplay subValue = state.getDetails().getSubValue();
                            InstrumentDetails3.TextDisplay subtitle = state.getDetails().getSubtitle();
                            InstrumentDetails3.TextDisplay title = state.getDetails().getTitle();
                            InstrumentDetails3.ValueDisplay value = state.getDetails().getValue();
                            InstrumentDetails3.Chart chart = state.getDetails().getChart();
                            UUID metadataId = state.getPosition().getMetadataId();
                            switch (WhenMappings.$EnumSwitchMapping$0[state.getPosition().getInstrumentType().ordinal()]) {
                                case 1:
                                case 2:
                                    instrumentType = InstrumentType.EQUITY;
                                    break;
                                case 3:
                                    instrumentType = InstrumentType.CRYPTO;
                                    break;
                                case 4:
                                    instrumentType = InstrumentType.CRYPTO_TOKENIZED_STOCKS;
                                    break;
                                case 5:
                                    instrumentType = InstrumentType.CRYPTO_PERPETUALS;
                                    break;
                                case 6:
                                case 7:
                                case 8:
                                    instrumentType = InstrumentType.OPTION_STRATEGY;
                                    break;
                                case 9:
                                    instrumentType = InstrumentType.FUTURE;
                                    break;
                                case 10:
                                case 11:
                                case 12:
                                    instrumentType = null;
                                    break;
                                case 13:
                                case 14:
                                case 15:
                                    instrumentType = InstrumentType.UNKNOWN;
                                    break;
                                default:
                                    throw new NoWhenBranchMatchedException();
                            }
                            int i8 = i3 >> 3;
                            final InstrumentRowState instrumentRowState = InstrumentRowStates.instrumentRowState(z3, shouldShowDisplayStringsAsText, subValue, subtitle, title, value, chart, metadataId, instrumentType, state.getPosition().getAccountNumber(), z2, null, composerStartRestartGroup, 0, i8 & 14, 2048);
                            composer2 = composerStartRestartGroup;
                            composer2.startReplaceGroup(5004770);
                            zChangedInstance = composer2.changedInstance(state);
                            objRememberedValue = composer2.rememberedValue();
                            if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.common.portfolio.position.PositionInstrumentRowKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return PositionInstrumentRow.PositionInstrumentRow$lambda$1$lambda$0(state, (SemanticsPropertyReceiver) obj);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceGroup();
                            final Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifier5, false, (Function1) objRememberedValue, 1, null);
                            if (state.getSwipingBehaviors().isEmpty()) {
                                composer2.startReplaceGroup(271103281);
                                final Screen screen = ((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getScreen();
                                Modifier modifierAccountTabScrollInteraction = AccountTabScrollInteractions2.accountTabScrollInteraction(TestTag3.testTag(Modifier.INSTANCE, SWIPE_ROW_TEST_TAG), (AccountTabScrollInteractions) composer2.consume(LocalAccountTabScrollInteraction.getLocalAccountTabScrollInteraction()));
                                ImmutableList<PositionSwipeBehavior> swipingBehaviors = state.getSwipingBehaviors();
                                ImmutableMap3 immutableMap3PersistentMapOf = extensions2.persistentMapOf();
                                modifier3 = modifier5;
                                boolean z4 = true;
                                final String str6 = str5;
                                int i9 = i3;
                                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(933173166, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.portfolio.position.PositionInstrumentRowKt.PositionInstrumentRow.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i10) {
                                        if ((i10 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(933173166, i10, -1, "com.robinhood.android.common.portfolio.position.PositionInstrumentRow.<anonymous> (PositionInstrumentRow.kt:90)");
                                        }
                                        InstrumentRow5.InstrumentRow(ClickableKt.m4893clickableXHw0xAI$default(modifierSemantics$default, false, null, null, onClick, 7, null), instrumentRowState, str6, onDisplayValueClicked, composer3, InstrumentRowState.$stable << 3, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54);
                                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(414781321, true, new Function3<SwipeToDismiss2, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.portfolio.position.PositionInstrumentRowKt.PositionInstrumentRow.2
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(SwipeToDismiss2 swipeToDismiss2, Composer composer3, Integer num) {
                                        invoke(swipeToDismiss2, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(SwipeToDismiss2 dismissState, Composer composer3, int i10) {
                                        Intrinsics.checkNotNullParameter(dismissState, "dismissState");
                                        if ((i10 & 6) == 0) {
                                            i10 |= composer3.changed(dismissState) ? 4 : 2;
                                        }
                                        if ((i10 & 19) == 18 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(414781321, i10, -1, "com.robinhood.android.common.portfolio.position.PositionInstrumentRow.<anonymous> (PositionInstrumentRow.kt:102)");
                                        }
                                        SwipeAnimationPreview swipeAnimationPreview2 = swipeAnimationPreview;
                                        composer3.startReplaceGroup(-1633490746);
                                        boolean zChangedInstance2 = ((i10 & 14) == 4) | composer3.changedInstance(swipeAnimationPreview);
                                        SwipeAnimationPreview swipeAnimationPreview3 = swipeAnimationPreview;
                                        Object objRememberedValue2 = composer3.rememberedValue();
                                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new PositionInstrumentRow2(swipeAnimationPreview3, dismissState, null);
                                            composer3.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer3.endReplaceGroup();
                                        EffectsKt.LaunchedEffect(swipeAnimationPreview2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer3, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54);
                                composer2.startReplaceGroup(-1633490746);
                                boolean zChangedInstance2 = composer2.changedInstance(screen) | composer2.changedInstance(state);
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.common.portfolio.position.PositionInstrumentRowKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return PositionInstrumentRow.PositionInstrumentRow$lambda$3$lambda$2(screen, state, (EventLogger) obj);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                Function1 function18 = (Function1) objRememberedValue2;
                                composer2.endReplaceGroup();
                                composer2.startReplaceGroup(-1746271574);
                                int i10 = 29360128 & i9;
                                boolean zChangedInstance3 = (i10 == 8388608) | composer2.changedInstance(state) | composer2.changedInstance(screen);
                                Object objRememberedValue3 = composer2.rememberedValue();
                                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.common.portfolio.position.PositionInstrumentRowKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return PositionInstrumentRow.PositionInstrumentRow$lambda$5$lambda$4(function16, state, screen, (EventLogger) obj);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue3);
                                }
                                Function1 function19 = (Function1) objRememberedValue3;
                                composer2.endReplaceGroup();
                                composer2.startReplaceGroup(-1746271574);
                                if (i10 != 8388608) {
                                    z4 = false;
                                }
                                boolean zChangedInstance4 = z4 | composer2.changedInstance(state) | composer2.changedInstance(screen);
                                Object objRememberedValue4 = composer2.rememberedValue();
                                if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = new Function1() { // from class: com.robinhood.android.common.portfolio.position.PositionInstrumentRowKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return PositionInstrumentRow.PositionInstrumentRow$lambda$7$lambda$6(function16, state, screen, (EventLogger) obj);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue4);
                                }
                                composer2.endReplaceGroup();
                                function14 = function17;
                                SwipeRow3.SwipeRow(swipingBehaviors, immutableMap3PersistentMapOf, composableLambdaRememberComposableLambda, modifierAccountTabScrollInteraction, composableLambdaRememberComposableLambda2, function18, function19, (Function1) objRememberedValue4, null, function14, composer2, (1879048192 & (i9 << 3)) | 25008, 256);
                                composer2 = composer2;
                                composer2.endReplaceGroup();
                                function13 = function16;
                                str3 = str6;
                            } else {
                                modifier3 = modifier5;
                                String str7 = str5;
                                function14 = function17;
                                composer2.startReplaceGroup(273159883);
                                function13 = function16;
                                int i11 = (i3 >> 12) & 896;
                                str3 = str7;
                                InstrumentRow5.InstrumentRow(ClickableKt.m4893clickableXHw0xAI$default(modifierSemantics$default, false, null, null, onClick, 7, null), instrumentRowState, str3, onDisplayValueClicked, composer2, i11 | (InstrumentRowState.$stable << 3) | (i8 & 7168), 0);
                                composer2.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            str4 = str3;
                            function15 = function14;
                            modifier4 = modifier3;
                        }
                        final Function1<? super PositionInstrumentType, Unit> function110 = function13;
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.portfolio.position.PositionInstrumentRowKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return PositionInstrumentRow.PositionInstrumentRow$lambda$8(state, z, swipeAnimationPreview, onClick, onDisplayValueClicked, modifier4, str4, function110, function15, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 12582912;
                    function13 = function1;
                    i7 = i2 & 256;
                    if (i7 != 0) {
                    }
                    if ((i3 & 38347923) == 38347922) {
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        boolean z32 = !Intrinsics.areEqual(state.getDisplayType(), state.getDetails().getDisplayType());
                        boolean shouldShowDisplayStringsAsText2 = state.getDetails().getDisplayConfiguration().getShouldShowDisplayStringsAsText();
                        InstrumentDetails3.TextDisplay subValue2 = state.getDetails().getSubValue();
                        InstrumentDetails3.TextDisplay subtitle2 = state.getDetails().getSubtitle();
                        InstrumentDetails3.TextDisplay title2 = state.getDetails().getTitle();
                        InstrumentDetails3.ValueDisplay value2 = state.getDetails().getValue();
                        InstrumentDetails3.Chart chart2 = state.getDetails().getChart();
                        UUID metadataId2 = state.getPosition().getMetadataId();
                        switch (WhenMappings.$EnumSwitchMapping$0[state.getPosition().getInstrumentType().ordinal()]) {
                        }
                        int i82 = i3 >> 3;
                        final InstrumentRowState instrumentRowState2 = InstrumentRowStates.instrumentRowState(z32, shouldShowDisplayStringsAsText2, subValue2, subtitle2, title2, value2, chart2, metadataId2, instrumentType, state.getPosition().getAccountNumber(), z2, null, composerStartRestartGroup, 0, i82 & 14, 2048);
                        composer2 = composerStartRestartGroup;
                        composer2.startReplaceGroup(5004770);
                        zChangedInstance = composer2.changedInstance(state);
                        objRememberedValue = composer2.rememberedValue();
                        if (!zChangedInstance) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.common.portfolio.position.PositionInstrumentRowKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return PositionInstrumentRow.PositionInstrumentRow$lambda$1$lambda$0(state, (SemanticsPropertyReceiver) obj);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                            composer2.endReplaceGroup();
                            final Modifier modifierSemantics$default2 = SemanticsModifier6.semantics$default(modifier5, false, (Function1) objRememberedValue, 1, null);
                            if (state.getSwipingBehaviors().isEmpty()) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            str4 = str3;
                            function15 = function14;
                            modifier4 = modifier3;
                        }
                    }
                    final Function1 function1102 = function13;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                str2 = str;
                i6 = i2 & 128;
                if (i6 != 0) {
                }
                function13 = function1;
                i7 = i2 & 256;
                if (i7 != 0) {
                }
                if ((i3 & 38347923) == 38347922) {
                }
                final Function1 function11022 = function13;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            str2 = str;
            i6 = i2 & 128;
            if (i6 != 0) {
            }
            function13 = function1;
            i7 = i2 & 256;
            if (i7 != 0) {
            }
            if ((i3 & 38347923) == 38347922) {
            }
            final Function1 function110222 = function13;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z2 = z;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        str2 = str;
        i6 = i2 & 128;
        if (i6 != 0) {
        }
        function13 = function1;
        i7 = i2 & 256;
        if (i7 != 0) {
        }
        if ((i3 & 38347923) == 38347922) {
        }
        final Function1 function1102222 = function13;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PositionInstrumentRow$lambda$1$lambda$0(PositionRowState positionRowState, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setTestTag(semantics, positionRowState.getDetails().getTitle().getValue() + ", " + positionRowState.getDetails().getSubtitle().getValue());
        SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PositionInstrumentRow$lambda$3$lambda$2(Screen screen, PositionRowState positionRowState, EventLogger SwipeRow) {
        Intrinsics.checkNotNullParameter(SwipeRow, "$this$SwipeRow");
        logSwipeStart(SwipeRow, screen, positionRowState.getPosition());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PositionInstrumentRow$lambda$5$lambda$4(Function1 function1, PositionRowState positionRowState, Screen screen, EventLogger SwipeRow) {
        Intrinsics.checkNotNullParameter(SwipeRow, "$this$SwipeRow");
        if (function1 != null) {
            function1.invoke(positionRowState.getPosition().getInstrumentType());
        }
        logSwipeCompleted(SwipeRow, screen, ApiPositionSwipeBehavior.SwipeType.END_TO_START, positionRowState.getPosition(), positionRowState.getSwipingBehaviors());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PositionInstrumentRow$lambda$7$lambda$6(Function1 function1, PositionRowState positionRowState, Screen screen, EventLogger SwipeRow) {
        Intrinsics.checkNotNullParameter(SwipeRow, "$this$SwipeRow");
        if (function1 != null) {
            function1.invoke(positionRowState.getDetails().getInstrumentType());
        }
        logSwipeCompleted(SwipeRow, screen, ApiPositionSwipeBehavior.SwipeType.START_TO_END, positionRowState.getPosition(), positionRowState.getSwipingBehaviors());
        return Unit.INSTANCE;
    }

    public static final void logSwipeStart(EventLogger eventLogger, Screen screen, PositionsV2.PositionListItemV2 position) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(position, "position");
        EventLogger.DefaultImpls.logSwipe$default(eventLogger, UserInteractionEventData.Action.SWIPE_INITIATED, screen, new Component(Component.ComponentType.HOLDING_ROW, null, null, 6, null), null, swipeEventContext(position), false, 40, null);
    }

    public static final void logSwipeCompleted(EventLogger eventLogger, Screen screen, ApiPositionSwipeBehavior.SwipeType swipeType, PositionsV2.PositionListItemV2 position, List<PositionSwipeBehavior> swipeBehaviors) {
        Object next;
        Screen screen2;
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(swipeType, "swipeType");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(swipeBehaviors, "swipeBehaviors");
        Iterator<T> it = swipeBehaviors.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((PositionSwipeBehavior) next).getSwipeType() == swipeType) {
                    break;
                }
            }
        }
        PositionSwipeBehavior positionSwipeBehavior = (PositionSwipeBehavior) next;
        if (positionSwipeBehavior == null) {
            return;
        }
        Context contextSwipeEventContext = swipeEventContext(position);
        String loggingIdentifier = positionSwipeBehavior.getLoggingIdentifier();
        String str = loggingIdentifier == null ? "" : loggingIdentifier;
        String deeplink = positionSwipeBehavior.getDeeplink();
        Context contextCopy$default = Context.copy$default(contextSwipeEventContext, 0, 0, 0, str, null, null, deeplink == null ? "" : deeplink, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -73, -1, -1, -1, -1, -1, 16383, null);
        GenericAlertContent<GenericAction> alert = positionSwipeBehavior.getAlert();
        if (alert != null) {
            Component.ComponentType componentType = Component.ComponentType.ALERT;
            String logging_identifier = alert.getLogging_identifier();
            screen2 = screen;
            EventLogger.DefaultImpls.logAppear$default(eventLogger, null, screen2, new Component(componentType, logging_identifier == null ? "" : logging_identifier, null, 4, null), null, contextCopy$default, 9, null);
        } else {
            screen2 = screen;
            logSwipe(eventLogger, screen2, UserInteractionEventData.Action.SWIPE_COMPLETED, contextCopy$default);
        }
        logSwipe(eventLogger, screen2, UserInteractionEventData.Action.VIEW_DEEPLINK, contextCopy$default);
    }

    private static final void logSwipe(EventLogger eventLogger, Screen screen, UserInteractionEventData.Action action, Context context) {
        EventLogger.DefaultImpls.logSwipe$default(eventLogger, action, screen, new Component(Component.ComponentType.HOLDING_ROW, null, null, 6, null), null, context, false, 40, null);
    }

    private static final Context swipeEventContext(PositionsV2.PositionListItemV2 positionListItemV2) {
        String string2 = positionListItemV2.getInstrumentId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, new Asset(string2, positionListItemV2.getInstrumentType().toRosettaAssetType(), null, null, 12, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, positionListItemV2.getInstrumentType().toRosettaType(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16385, -1, -1, -1, -8193, -1, 16383, null);
    }
}
