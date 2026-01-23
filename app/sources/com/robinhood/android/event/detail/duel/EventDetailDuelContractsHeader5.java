package com.robinhood.android.event.detail.duel;

import android.annotation.SuppressLint;
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
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.event.detail.C16095R;
import com.robinhood.android.eventcontracts.sharedeventui.ContractImage;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.eventcontracts.sharedeventui.animation.Delta;
import com.robinhood.android.eventcontracts.sharedeventui.animation.MovingDeltasAnimation2;
import com.robinhood.android.eventcontracts.sharedeventui.animation.MovingDeltasAnimation8;
import com.robinhood.android.ticker.TickerTextState;
import com.robinhood.android.ticker.WrappedTickerKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.ModifiersKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: EventDetailDuelContractsHeader.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\u001a=\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\n\u001a+\u0010\u000b\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\f\u001a+\u0010\r\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u0011\u001a!\u0010\u0013\u001a\u00020\u00012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0017\"\u000e\u0010\u0012\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"EventDetailDuelContractsHeader", "", "showLiveActivity", "", "leftContract", "Lcom/robinhood/android/event/detail/duel/DuelEventContractUiDetail;", "rightContract", "modifier", "Landroidx/compose/ui/Modifier;", "mirrorSecondContractImageVertically", "(ZLcom/robinhood/android/event/detail/duel/DuelEventContractUiDetail;Lcom/robinhood/android/event/detail/duel/DuelEventContractUiDetail;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "DeltasAnimationUnderHeader", "(Lcom/robinhood/android/event/detail/duel/DuelEventContractUiDetail;Lcom/robinhood/android/event/detail/duel/DuelEventContractUiDetail;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ContractMidSection", "leftPriceInCents", "", "rightPriceInCents", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TwoDigitsPlaceHolder", "ContractDescription", "description", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewEventContractsHeader", "(Landroidx/compose/runtime/Composer;I)V", "feature-event-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.detail.duel.EventDetailDuelContractsHeaderKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventDetailDuelContractsHeader5 {
    private static final String TwoDigitsPlaceHolder = "  ";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContractDescription$lambda$14(String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ContractDescription(str, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContractMidSection$lambda$13(String str, String str2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ContractMidSection(str, str2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DeltasAnimationUnderHeader$lambda$11(DuelEventContractUiDetail duelEventContractUiDetail, DuelEventContractUiDetail duelEventContractUiDetail2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        DeltasAnimationUnderHeader(duelEventContractUiDetail, duelEventContractUiDetail2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DeltasAnimationUnderHeader$lambda$9(DuelEventContractUiDetail duelEventContractUiDetail, DuelEventContractUiDetail duelEventContractUiDetail2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        DeltasAnimationUnderHeader(duelEventContractUiDetail, duelEventContractUiDetail2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventDetailDuelContractsHeader$lambda$8(boolean z, DuelEventContractUiDetail duelEventContractUiDetail, DuelEventContractUiDetail duelEventContractUiDetail2, Modifier modifier, boolean z2, int i, int i2, Composer composer, int i3) {
        EventDetailDuelContractsHeader(z, duelEventContractUiDetail, duelEventContractUiDetail2, modifier, z2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewEventContractsHeader$lambda$15(int i, Composer composer, int i2) {
        PreviewEventContractsHeader(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0724  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:260:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c2  */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20, types: [androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EventDetailDuelContractsHeader(final boolean z, final DuelEventContractUiDetail duelEventContractUiDetail, final DuelEventContractUiDetail duelEventContractUiDetail2, Modifier modifier, boolean z2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        int currentCompositeKeyHash4;
        Composer composerM6388constructorimpl4;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4;
        int currentCompositeKeyHash5;
        Composer composerM6388constructorimpl5;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5;
        int currentCompositeKeyHash6;
        Composer composerM6388constructorimpl6;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6;
        Arrangement arrangement;
        Row6 row6;
        ?? r4;
        BentoTheme bentoTheme;
        int i6;
        int i7;
        boolean z4;
        Composer composer2;
        int currentCompositeKeyHash7;
        Composer composerM6388constructorimpl7;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7;
        int currentCompositeKeyHash8;
        Composer composerM6388constructorimpl8;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8;
        final boolean z5;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1700010188);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(duelEventContractUiDetail) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(duelEventContractUiDetail2) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    z3 = z2;
                    i3 |= composerStartRestartGroup.changed(z3) ? 16384 : 8192;
                }
                i5 = i3;
                if ((i5 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    z5 = z3;
                } else {
                    Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                    boolean z6 = i4 == 0 ? false : z3;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1700010188, i5, -1, "com.robinhood.android.event.detail.duel.EventDetailDuelContractsHeader (EventDetailDuelContractsHeader.kt:55)");
                    }
                    Alignment.Companion companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(565182798);
                    if (z) {
                        DeltasAnimationUnderHeader(duelEventContractUiDetail, duelEventContractUiDetail2, PaddingKt.m5144paddingVpY3zN4$default(boxScopeInstance.align(Modifier.INSTANCE, companion.getBottomCenter()), C2002Dp.m7995constructorimpl(70), 0.0f, 2, null), composerStartRestartGroup, (i5 >> 3) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 0);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement2.getTop(), companion.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i9 = BentoTheme.$stable;
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i9).m21593getSmallD9Ej5fM(), 7, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement2.getSpaceBetween(), companion.getBottom(), composerStartRestartGroup, 54);
                    currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
                    Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.useNode();
                    } else {
                        composerStartRestartGroup.createNode(constructor3);
                    }
                    composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    String imageUrl = duelEventContractUiDetail == null ? duelEventContractUiDetail.getImageUrl() : null;
                    DayNightColor contractColor = duelEventContractUiDetail == null ? duelEventContractUiDetail.getContractColor() : null;
                    composerStartRestartGroup.startReplaceGroup(-1432510383);
                    Color colorM6701boximpl = contractColor != null ? null : Color.m6701boximpl(contractColor.getColor(composerStartRestartGroup, 0));
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier5 = modifier4;
                    ContractImage.m14359ContractImageMKkPZoM(imageUrl, duelEventContractUiDetail == null ? duelEventContractUiDetail.getContractDisplayShortName() : null, colorM6701boximpl, null, 0.0f, false, composerStartRestartGroup, 0, 56);
                    ContractMidSection(duelEventContractUiDetail == null ? duelEventContractUiDetail.getContractDisplayYesBidPriceInCents() : null, duelEventContractUiDetail2 == null ? duelEventContractUiDetail2.getContractDisplayYesBidPriceInCents() : null, row62.align(PaddingKt.m5144paddingVpY3zN4$default(companion3, bentoTheme2.getSpacing(composerStartRestartGroup, i9).m21593getSmallD9Ej5fM(), 0.0f, 2, null), companion.getCenterVertically()), composerStartRestartGroup, 0, 0);
                    String imageUrl2 = duelEventContractUiDetail2 == null ? duelEventContractUiDetail2.getImageUrl() : null;
                    DayNightColor contractColor2 = duelEventContractUiDetail2 == null ? duelEventContractUiDetail2.getContractColor() : null;
                    composerStartRestartGroup.startReplaceGroup(-1432489167);
                    Color colorM6701boximpl2 = contractColor2 != null ? null : Color.m6701boximpl(contractColor2.getColor(composerStartRestartGroup, 0));
                    composerStartRestartGroup.endReplaceGroup();
                    boolean z7 = z6;
                    ContractImage.m14359ContractImageMKkPZoM(imageUrl2, duelEventContractUiDetail2 == null ? duelEventContractUiDetail2.getContractDisplayShortName() : null, colorM6701boximpl2, null, 0.0f, z7, composerStartRestartGroup, 458752 & (i5 << 3), 24);
                    composerStartRestartGroup.endNode();
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getSpaceBetween(), companion.getTop(), composerStartRestartGroup, 6);
                    currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                    Function0<ComposeUiNode> constructor4 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.useNode();
                    } else {
                        composerStartRestartGroup.createNode(constructor4);
                    }
                    composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash4 = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion2.getSetModifier());
                    Modifier modifierWeight = row62.weight(companion3, 1.0f, false);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight);
                    Function0<ComposeUiNode> constructor5 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.useNode();
                    } else {
                        composerStartRestartGroup.createNode(constructor5);
                    }
                    composerM6388constructorimpl5 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash5 = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                        composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier5, companion2.getSetModifier());
                    MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion.getTop(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash6 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
                    Function0<ComposeUiNode> constructor6 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.useNode();
                    } else {
                        composerStartRestartGroup.createNode(constructor6);
                    }
                    composerM6388constructorimpl6 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl6, measurePolicyRowMeasurePolicy3, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl6, currentCompositionLocalMap6, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash6 = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                        composerM6388constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                        composerM6388constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl6, modifierMaterializeModifier6, companion2.getSetModifier());
                    composerStartRestartGroup.startReplaceGroup(1095707505);
                    if ((duelEventContractUiDetail == null ? duelEventContractUiDetail.getContractMetadata() : null) == null) {
                        Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i9).m21595getXsmallD9Ej5fM(), 0.0f, 11, null);
                        arrangement = arrangement2;
                        row6 = row62;
                        r4 = 0;
                        i7 = 2;
                        bentoTheme = bentoTheme2;
                        i6 = i9;
                        z4 = true;
                        companion3 = companion3;
                        BentoText2.m20747BentoText38GnDrw(duelEventContractUiDetail.getContractMetadata(), modifierM5146paddingqDBjuR0$default2, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i9).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i9).getTextS(), composerStartRestartGroup, 0, 0, 8184);
                        composerStartRestartGroup = composerStartRestartGroup;
                    } else {
                        arrangement = arrangement2;
                        row6 = row62;
                        r4 = 0;
                        bentoTheme = bentoTheme2;
                        i6 = i9;
                        i7 = 2;
                        z4 = true;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierBentoPlaceholder$default = ModifiersKt.bentoPlaceholder$default(companion3, duelEventContractUiDetail != null ? z4 : false, r4, i7, r4);
                    if (duelEventContractUiDetail != null || (mediumPlaceholderText = duelEventContractUiDetail.getContractDisplayShortName()) == null) {
                        String mediumPlaceholderText = PlaceholderUtils.getMediumPlaceholderText();
                    }
                    Composer composer3 = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw(mediumPlaceholderText, modifierBentoPlaceholder$default, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextS(), composer3, 0, 0, 8188);
                    composer2 = composer3;
                    composer2.endNode();
                    ContractDescription(duelEventContractUiDetail == null ? duelEventContractUiDetail.getContractOpenInterest() : r4, r4, composer2, 0, i7);
                    composer2.endNode();
                    Modifier modifierWeight2 = row6.weight(companion3, 1.0f, false);
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getEnd(), composer2, 48);
                    currentCompositeKeyHash7 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap7 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier7 = ComposedModifier2.materializeModifier(composer2, modifierWeight2);
                    Function0<ComposeUiNode> constructor7 = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.useNode();
                    } else {
                        composer2.createNode(constructor7);
                    }
                    composerM6388constructorimpl7 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl7, measurePolicyColumnMeasurePolicy3, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl7, currentCompositionLocalMap7, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash7 = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                        composerM6388constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                        composerM6388constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl7, modifierMaterializeModifier7, companion2.getSetModifier());
                    MeasurePolicy measurePolicyRowMeasurePolicy4 = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composer2, 0);
                    currentCompositeKeyHash8 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap8 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier8 = ComposedModifier2.materializeModifier(composer2, companion3);
                    Function0<ComposeUiNode> constructor8 = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.useNode();
                    } else {
                        composer2.createNode(constructor8);
                    }
                    composerM6388constructorimpl8 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl8, measurePolicyRowMeasurePolicy4, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl8, currentCompositionLocalMap8, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash8 = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl8.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                        composerM6388constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                        composerM6388constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl8, modifierMaterializeModifier8, companion2.getSetModifier());
                    composer2.startReplaceGroup(1959042026);
                    if ((duelEventContractUiDetail2 == null ? duelEventContractUiDetail2.getContractMetadata() : r4) != null) {
                        BentoText2.m20747BentoText38GnDrw(duelEventContractUiDetail2.getContractMetadata(), PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i6).m21595getXsmallD9Ej5fM(), 0.0f, 11, null), Color.m6701boximpl(bentoTheme.getColors(composer2, i6).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i6).getTextS(), composer2, 0, 0, 8184);
                        composer2 = composer2;
                    }
                    composer2.endReplaceGroup();
                    Modifier modifierBentoPlaceholder$default2 = ModifiersKt.bentoPlaceholder$default(companion3, duelEventContractUiDetail2 != null ? z4 : false, r4, i7, r4);
                    if (duelEventContractUiDetail2 != null || (mediumPlaceholderText = duelEventContractUiDetail2.getContractDisplayShortName()) == null) {
                        String mediumPlaceholderText2 = PlaceholderUtils.getMediumPlaceholderText();
                    }
                    Composer composer4 = composer2;
                    BentoText2.m20747BentoText38GnDrw(mediumPlaceholderText2, modifierBentoPlaceholder$default2, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7920getEnde0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i6).getTextS(), composer4, 0, 0, 8124);
                    composerStartRestartGroup = composer4;
                    composerStartRestartGroup.endNode();
                    ContractDescription(duelEventContractUiDetail2 == null ? duelEventContractUiDetail2.getContractOpenInterest() : r4, r4, composerStartRestartGroup, 0, i7);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z7;
                    modifier3 = modifier5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.detail.duel.EventDetailDuelContractsHeaderKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return EventDetailDuelContractsHeader5.EventDetailDuelContractsHeader$lambda$8(z, duelEventContractUiDetail, duelEventContractUiDetail2, modifier3, z5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            z3 = z2;
            i5 = i3;
            if ((i5 & 9363) == 9362) {
                if (i8 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Alignment.Companion companion4 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier9 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor9 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap9, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier9, companion22.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(565182798);
                    if (z) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier.Companion companion32 = Modifier.INSTANCE;
                    Arrangement arrangement22 = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy4 = Column2.columnMeasurePolicy(arrangement22.getTop(), companion4.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion32);
                    Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy4, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null);
                        BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                        int i92 = BentoTheme.$stable;
                        Modifier modifierM5146paddingqDBjuR0$default3 = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default3, 0.0f, 0.0f, 0.0f, bentoTheme22.getSpacing(composerStartRestartGroup, i92).m21593getSmallD9Ej5fM(), 7, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy5 = Row2.rowMeasurePolicy(arrangement22.getSpaceBetween(), companion4.getBottom(), composerStartRestartGroup, 54);
                        currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default3);
                        Function0<ComposeUiNode> constructor32 = companion22.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy5, companion22.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash3 = companion22.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl3.getInserting()) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion22.getSetModifier());
                            Row6 row622 = Row6.INSTANCE;
                            if (duelEventContractUiDetail == null) {
                            }
                            if (duelEventContractUiDetail == null) {
                            }
                            composerStartRestartGroup.startReplaceGroup(-1432510383);
                            if (contractColor != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifier52 = modifier4;
                            ContractImage.m14359ContractImageMKkPZoM(imageUrl, duelEventContractUiDetail == null ? duelEventContractUiDetail.getContractDisplayShortName() : null, colorM6701boximpl, null, 0.0f, false, composerStartRestartGroup, 0, 56);
                            ContractMidSection(duelEventContractUiDetail == null ? duelEventContractUiDetail.getContractDisplayYesBidPriceInCents() : null, duelEventContractUiDetail2 == null ? duelEventContractUiDetail2.getContractDisplayYesBidPriceInCents() : null, row622.align(PaddingKt.m5144paddingVpY3zN4$default(companion32, bentoTheme22.getSpacing(composerStartRestartGroup, i92).m21593getSmallD9Ej5fM(), 0.0f, 2, null), companion4.getCenterVertically()), composerStartRestartGroup, 0, 0);
                            if (duelEventContractUiDetail2 == null) {
                            }
                            if (duelEventContractUiDetail2 == null) {
                            }
                            composerStartRestartGroup.startReplaceGroup(-1432489167);
                            if (contractColor2 != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            boolean z72 = z6;
                            ContractImage.m14359ContractImageMKkPZoM(imageUrl2, duelEventContractUiDetail2 == null ? duelEventContractUiDetail2.getContractDisplayShortName() : null, colorM6701boximpl2, null, 0.0f, z72, composerStartRestartGroup, 458752 & (i5 << 3), 24);
                            composerStartRestartGroup.endNode();
                            Modifier modifierFillMaxWidth$default22 = SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy22 = Row2.rowMeasurePolicy(arrangement22.getSpaceBetween(), companion4.getTop(), composerStartRestartGroup, 6);
                            currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap42 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier42 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default22);
                            Function0<ComposeUiNode> constructor42 = companion22.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyRowMeasurePolicy22, companion22.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap42, companion22.getSetResolvedCompositionLocals());
                            setCompositeKeyHash4 = companion22.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl4.getInserting()) {
                                composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier42, companion22.getSetModifier());
                                Modifier modifierWeight3 = row622.weight(companion32, 1.0f, false);
                                MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement22.getTop(), companion4.getStart(), composerStartRestartGroup, 0);
                                currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap52 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier52 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight3);
                                Function0<ComposeUiNode> constructor52 = companion22.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl5 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyColumnMeasurePolicy22, companion22.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap52, companion22.getSetResolvedCompositionLocals());
                                setCompositeKeyHash5 = companion22.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl5.getInserting()) {
                                    composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                    composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                    Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier52, companion22.getSetModifier());
                                    MeasurePolicy measurePolicyRowMeasurePolicy32 = Row2.rowMeasurePolicy(arrangement22.getStart(), companion4.getTop(), composerStartRestartGroup, 0);
                                    currentCompositeKeyHash6 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap62 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier62 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion32);
                                    Function0<ComposeUiNode> constructor62 = companion22.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (composerStartRestartGroup.getInserting()) {
                                    }
                                    composerM6388constructorimpl6 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                    Updater.m6390setimpl(composerM6388constructorimpl6, measurePolicyRowMeasurePolicy32, companion22.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl6, currentCompositionLocalMap62, companion22.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash6 = companion22.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl6.getInserting()) {
                                        composerM6388constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                        composerM6388constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                                        Updater.m6390setimpl(composerM6388constructorimpl6, modifierMaterializeModifier62, companion22.getSetModifier());
                                        composerStartRestartGroup.startReplaceGroup(1095707505);
                                        if ((duelEventContractUiDetail == null ? duelEventContractUiDetail.getContractMetadata() : null) == null) {
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        Modifier modifierBentoPlaceholder$default3 = ModifiersKt.bentoPlaceholder$default(companion32, duelEventContractUiDetail != null ? z4 : false, r4, i7, r4);
                                        if (duelEventContractUiDetail != null) {
                                            String mediumPlaceholderText3 = PlaceholderUtils.getMediumPlaceholderText();
                                            Composer composer32 = composerStartRestartGroup;
                                            BentoText2.m20747BentoText38GnDrw(mediumPlaceholderText3, modifierBentoPlaceholder$default3, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextS(), composer32, 0, 0, 8188);
                                            composer2 = composer32;
                                            composer2.endNode();
                                            ContractDescription(duelEventContractUiDetail == null ? duelEventContractUiDetail.getContractOpenInterest() : r4, r4, composer2, 0, i7);
                                            composer2.endNode();
                                            Modifier modifierWeight22 = row6.weight(companion32, 1.0f, false);
                                            MeasurePolicy measurePolicyColumnMeasurePolicy32 = Column2.columnMeasurePolicy(arrangement.getTop(), companion4.getEnd(), composer2, 48);
                                            currentCompositeKeyHash7 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap72 = composer2.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier72 = ComposedModifier2.materializeModifier(composer2, modifierWeight22);
                                            Function0<ComposeUiNode> constructor72 = companion22.getConstructor();
                                            if (composer2.getApplier() == null) {
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                            }
                                            composerM6388constructorimpl7 = Updater.m6388constructorimpl(composer2);
                                            Updater.m6390setimpl(composerM6388constructorimpl7, measurePolicyColumnMeasurePolicy32, companion22.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl7, currentCompositionLocalMap72, companion22.getSetResolvedCompositionLocals());
                                            setCompositeKeyHash7 = companion22.getSetCompositeKeyHash();
                                            if (!composerM6388constructorimpl7.getInserting()) {
                                                composerM6388constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                                                composerM6388constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                                                Updater.m6390setimpl(composerM6388constructorimpl7, modifierMaterializeModifier72, companion22.getSetModifier());
                                                MeasurePolicy measurePolicyRowMeasurePolicy42 = Row2.rowMeasurePolicy(arrangement.getStart(), companion4.getTop(), composer2, 0);
                                                currentCompositeKeyHash8 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                                CompositionLocalMap currentCompositionLocalMap82 = composer2.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier82 = ComposedModifier2.materializeModifier(composer2, companion32);
                                                Function0<ComposeUiNode> constructor82 = companion22.getConstructor();
                                                if (composer2.getApplier() == null) {
                                                }
                                                composer2.startReusableNode();
                                                if (composer2.getInserting()) {
                                                }
                                                composerM6388constructorimpl8 = Updater.m6388constructorimpl(composer2);
                                                Updater.m6390setimpl(composerM6388constructorimpl8, measurePolicyRowMeasurePolicy42, companion22.getSetMeasurePolicy());
                                                Updater.m6390setimpl(composerM6388constructorimpl8, currentCompositionLocalMap82, companion22.getSetResolvedCompositionLocals());
                                                setCompositeKeyHash8 = companion22.getSetCompositeKeyHash();
                                                if (!composerM6388constructorimpl8.getInserting()) {
                                                    composerM6388constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                                                    composerM6388constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                                                    Updater.m6390setimpl(composerM6388constructorimpl8, modifierMaterializeModifier82, companion22.getSetModifier());
                                                    composer2.startReplaceGroup(1959042026);
                                                    if ((duelEventContractUiDetail2 == null ? duelEventContractUiDetail2.getContractMetadata() : r4) != null) {
                                                    }
                                                    composer2.endReplaceGroup();
                                                    Modifier modifierBentoPlaceholder$default22 = ModifiersKt.bentoPlaceholder$default(companion32, duelEventContractUiDetail2 != null ? z4 : false, r4, i7, r4);
                                                    if (duelEventContractUiDetail2 != null) {
                                                        String mediumPlaceholderText22 = PlaceholderUtils.getMediumPlaceholderText();
                                                        Composer composer42 = composer2;
                                                        BentoText2.m20747BentoText38GnDrw(mediumPlaceholderText22, modifierBentoPlaceholder$default22, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7920getEnde0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i6).getTextS(), composer42, 0, 0, 8124);
                                                        composerStartRestartGroup = composer42;
                                                        composerStartRestartGroup.endNode();
                                                        ContractDescription(duelEventContractUiDetail2 == null ? duelEventContractUiDetail2.getContractOpenInterest() : r4, r4, composerStartRestartGroup, 0, i7);
                                                        composerStartRestartGroup.endNode();
                                                        composerStartRestartGroup.endNode();
                                                        composerStartRestartGroup.endNode();
                                                        composerStartRestartGroup.endNode();
                                                        if (ComposerKt.isTraceInProgress()) {
                                                        }
                                                        z5 = z72;
                                                        modifier3 = modifier52;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        z3 = z2;
        i5 = i3;
        if ((i5 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void DeltasAnimationUnderHeader(final DuelEventContractUiDetail duelEventContractUiDetail, final DuelEventContractUiDetail duelEventContractUiDetail2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1722205211);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(duelEventContractUiDetail) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(duelEventContractUiDetail2) ? 32 : 16;
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
                    ComposerKt.traceEventStart(1722205211, i3, -1, "com.robinhood.android.event.detail.duel.DeltasAnimationUnderHeader (EventDetailDuelContractsHeader.kt:153)");
                }
                if (duelEventContractUiDetail != null || duelEventContractUiDetail2 == null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final Modifier modifier5 = modifier4;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.detail.duel.EventDetailDuelContractsHeaderKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return EventDetailDuelContractsHeader5.DeltasAnimationUnderHeader$lambda$9(duelEventContractUiDetail, duelEventContractUiDetail2, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                Alignment.Vertical top = Alignment.INSTANCE.getTop();
                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(modifier4, C2002Dp.m7995constructorimpl(70));
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(center, top, composerStartRestartGroup, 54);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5156height3ABfNKs);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                ImmutableList<Delta> deltas = duelEventContractUiDetail.getDeltas();
                long color = duelEventContractUiDetail.getContractColor().getColor(composerStartRestartGroup, 0);
                MovingDeltasAnimation8 movingDeltasAnimation8 = MovingDeltasAnimation8.LEFT;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                MovingDeltasAnimation2.m14389MovingDeltasAnimationsW7UJKQ(deltas, color, movingDeltasAnimation8, Row5.weight$default(row6, companion2, 1.0f, false, 2, null), composerStartRestartGroup, 384, 0);
                MovingDeltasAnimation2.m14389MovingDeltasAnimationsW7UJKQ(duelEventContractUiDetail2.getDeltas(), duelEventContractUiDetail2.getContractColor().getColor(composerStartRestartGroup, 0), MovingDeltasAnimation8.RIGHT, Row5.weight$default(row6, companion2, 1.0f, false, 2, null), composerStartRestartGroup, 384, 0);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup2 == null) {
                scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.event.detail.duel.EventDetailDuelContractsHeaderKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EventDetailDuelContractsHeader5.DeltasAnimationUnderHeader$lambda$11(duelEventContractUiDetail, duelEventContractUiDetail2, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            if (duelEventContractUiDetail != null) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ContractMidSection(final String str, final String str2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1536924162);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
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
                    ComposerKt.traceEventStart(1536924162, i3, -1, "com.robinhood.android.event.detail.duel.ContractMidSection (EventDetailDuelContractsHeader.kt:181)");
                }
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                String str3 = str != null ? TwoDigitsPlaceHolder : str;
                TickerTextState.Style style = TickerTextState.Style.DISPLAY_LARGE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifier5 = modifier4;
                WrappedTickerKt.m19244TickerTextFNF3uiM(ModifiersKt.bentoPlaceholder$default(companion2, str != null, null, 2, null), str3, jM21425getFg0d7_KjU, style, composerStartRestartGroup, 3072);
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C16095R.string.event_detail_header_percentages_display_dash, composerStartRestartGroup, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8190);
                composerStartRestartGroup = composerStartRestartGroup;
                WrappedTickerKt.m19244TickerTextFNF3uiM(ModifiersKt.bentoPlaceholder$default(companion2, str2 != null, null, 2, null), str2 != null ? TwoDigitsPlaceHolder : str2, bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU(), style, composerStartRestartGroup, 3072);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.detail.duel.EventDetailDuelContractsHeaderKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EventDetailDuelContractsHeader5.ContractMidSection$lambda$13(str, str2, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                Row6 row62 = Row6.INSTANCE;
                if (str != null) {
                }
                TickerTextState.Style style2 = TickerTextState.Style.DISPLAY_LARGE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU();
                Modifier.Companion companion22 = Modifier.INSTANCE;
                Modifier modifier52 = modifier4;
                WrappedTickerKt.m19244TickerTextFNF3uiM(ModifiersKt.bentoPlaceholder$default(companion22, str != null, null, 2, null), str3, jM21425getFg0d7_KjU2, style2, composerStartRestartGroup, 3072);
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C16095R.string.event_detail_header_percentages_display_dash, composerStartRestartGroup, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8190);
                composerStartRestartGroup = composerStartRestartGroup;
                WrappedTickerKt.m19244TickerTextFNF3uiM(ModifiersKt.bentoPlaceholder$default(companion22, str2 != null, null, 2, null), str2 != null ? TwoDigitsPlaceHolder : str2, bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU(), style2, composerStartRestartGroup, 3072);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void ContractDescription(final String str, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-860337594);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-860337594, i3, -1, "com.robinhood.android.event.detail.duel.ContractDescription (EventDetailDuelContractsHeader.kt:212)");
            }
            WrappedTickerKt.m19244TickerTextFNF3uiM(ModifiersKt.bentoPlaceholder$default(modifier, str == null, null, 2, null), str == null ? PlaceholderUtils.getMediumPlaceholderText() : str, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21426getFg20d7_KjU(), TickerTextState.Style.REGULAR_SMALL, composerStartRestartGroup, 3072);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.detail.duel.EventDetailDuelContractsHeaderKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventDetailDuelContractsHeader5.ContractDescription$lambda$14(str, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @SuppressLint({"NowWithoutClock"})
    public static final void PreviewEventContractsHeader(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1939530982);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1939530982, i, -1, "com.robinhood.android.event.detail.duel.PreviewEventContractsHeader (EventDetailDuelContractsHeader.kt:224)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, EventDetailDuelContractsHeader.INSTANCE.getLambda$398915682$feature_event_detail_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.detail.duel.EventDetailDuelContractsHeaderKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventDetailDuelContractsHeader5.PreviewEventContractsHeader$lambda$15(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
