package com.robinhood.shared.portfolio.lists.p391ui;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import coil.compose.AsyncImagePainter;
import coil.compose.SingletonAsyncImagePainter;
import coil.request.ImageRequest;
import coil.size.Scale;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoCheckbox2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoIconButton2;
import com.robinhood.compose.bento.component.BentoIconButton4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable6;
import com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable7;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: UserListRowComposable.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u001aI\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nH\u0007¢\u0006\u0002\u0010\u0010\u001a\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u0012\u001a\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0015\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0017\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0018\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\u0016\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"roundedCornerRadius", "Landroidx/compose/ui/unit/Dp;", "F", UserListRowComposable5.WATCHLIST_EXPAND_ICON, "", "UserListRowComposable", "", "userListRowState", "Lcom/robinhood/shared/portfolio/lists/ui/UserListRowState;", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "allowOnClick", "", "onLongClick", "(Lcom/robinhood/shared/portfolio/lists/ui/UserListRowState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "UserListRowEndIcon", "(Lcom/robinhood/shared/portfolio/lists/ui/UserListRowState;Landroidx/compose/runtime/Composer;I)V", "UserListRowVisual", "DEFAULT_EMOJI", "UserListStandardPreview", "(Landroidx/compose/runtime/Composer;I)V", "UserListNoEmojiPreview", "UserListLongNamePreview", "lib-lists-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.portfolio.lists.ui.UserListRowComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class UserListRowComposable5 {
    private static final String DEFAULT_EMOJI = "💡";
    public static final String WATCHLIST_EXPAND_ICON = "WATCHLIST_EXPAND_ICON";
    private static final float roundedCornerRadius = C2002Dp.m7995constructorimpl(4);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserListLongNamePreview$lambda$24(int i, Composer composer, int i2) {
        UserListLongNamePreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserListNoEmojiPreview$lambda$23(int i, Composer composer, int i2) {
        UserListNoEmojiPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserListRowComposable$lambda$11(UserListRowComposable7 userListRowComposable7, Function0 function0, Modifier modifier, boolean z, Function0 function02, int i, int i2, Composer composer, int i3) {
        UserListRowComposable(userListRowComposable7, function0, modifier, z, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserListRowEndIcon$lambda$18(UserListRowComposable7 userListRowComposable7, int i, Composer composer, int i2) {
        UserListRowEndIcon(userListRowComposable7, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserListRowVisual$lambda$21(UserListRowComposable7 userListRowComposable7, int i, Composer composer, int i2) {
        UserListRowVisual(userListRowComposable7, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserListStandardPreview$lambda$22(int i, Composer composer, int i2) {
        UserListStandardPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UserListRowComposable(final UserListRowComposable7 userListRowState, final Function0<Unit> onClick, Modifier modifier, boolean z, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        Function0<Unit> function02;
        boolean z3;
        Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        StringResource subtitle;
        final Function0<Unit> function03;
        final Modifier modifier4;
        final boolean z4;
        StringResource stringResource;
        boolean z5;
        Modifier modifierM4893clickableXHw0xAI$default;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(userListRowState, "userListRowState");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(966689720);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(userListRowState) : composerStartRestartGroup.changedInstance(userListRowState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & 24576) == 0) {
                        function02 = function0;
                        i3 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
                    }
                    if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier5 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        z3 = i4 == 0 ? true : z2;
                        final Function0<Unit> function04 = i5 == 0 ? null : function02;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(966689720, i3, -1, "com.robinhood.shared.portfolio.lists.ui.UserListRowComposable (UserListRowComposable.kt:193)");
                        }
                        Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                        composerStartRestartGroup.startReplaceGroup(1275896658);
                        if (z3) {
                            modifier3 = modifier5;
                        } else {
                            if (function04 != null) {
                                composerStartRestartGroup.startReplaceGroup(-990102659);
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                boolean z6 = (57344 & i3) == 16384;
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (z6 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.portfolio.lists.ui.UserListRowComposableKt$$ExternalSyntheticLambda6
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return UserListRowComposable5.UserListRowComposable$lambda$6$lambda$1$lambda$0(function04);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                Function0 function05 = (Function0) objRememberedValue;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                z5 = (i3 & 112) == 32;
                                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (z5 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.portfolio.lists.ui.UserListRowComposableKt$$ExternalSyntheticLambda7
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return UserListRowComposable5.UserListRowComposable$lambda$6$lambda$3$lambda$2(onClick);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                modifierM4893clickableXHw0xAI$default = ClickableKt.m4897combinedClickablef5TDLPQ$default(modifier5, false, null, null, null, function05, null, false, (Function0) objRememberedValue2, 111, null);
                                composerStartRestartGroup.endReplaceGroup();
                                modifier3 = modifier5;
                            } else {
                                composerStartRestartGroup.startReplaceGroup(-989994810);
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                z5 = (i3 & 112) == 32;
                                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (z5 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.portfolio.lists.ui.UserListRowComposableKt$$ExternalSyntheticLambda8
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return UserListRowComposable5.UserListRowComposable$lambda$6$lambda$5$lambda$4(onClick);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifier5, false, null, null, (Function0) objRememberedValue3, 7, null);
                                modifier3 = modifier5;
                                composerStartRestartGroup.endReplaceGroup();
                            }
                            modifier5 = modifierM4893clickableXHw0xAI$default;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier5, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21593getSmallD9Ej5fM(), composerStartRestartGroup, 0, 0);
                        Alignment.Companion companion = Alignment.INSTANCE;
                        Alignment.Vertical centerVertically = companion.getCenterVertically();
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        int i8 = i3 & 14;
                        UserListRowVisual(userListRowState, composerStartRestartGroup, i8);
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        Modifier modifierWeight$default = Row5.weight$default(row6, androidx.compose.foundation.layout.PaddingKt.m5142padding3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM()), 1.0f, false, 2, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
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
                        StringResource displayName = userListRowState.getDisplayName();
                        Intrinsics.checkNotNull(resources);
                        String string2 = displayName.getText(resources).toString();
                        TextOverflow.Companion companion4 = TextOverflow.INSTANCE;
                        Modifier modifier6 = modifier3;
                        Function0<Unit> function06 = function04;
                        BentoText2.m20747BentoText38GnDrw(string2, null, null, null, null, null, null, companion4.m7959getEllipsisgIe3tQ8(), false, 2, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i7).getTextM(), composerStartRestartGroup, 817889280, 0, 7550);
                        composerStartRestartGroup = composerStartRestartGroup;
                        subtitle = userListRowState.getSubtitle();
                        composerStartRestartGroup.startReplaceGroup(1554212635);
                        if (subtitle != null) {
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
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
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                            composerStartRestartGroup.startReplaceGroup(-1437603852);
                            if (userListRowState instanceof UserListRowComposable7.ScreenerRow) {
                                stringResource = subtitle;
                                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size12(ServerToBentoAssetMapper2.RECURRING_12), null, bentoTheme.getColors(composerStartRestartGroup, i7).m21426getFg20d7_KjU(), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21595getXsmallD9Ej5fM(), 0.0f, 11, null), null, false, composerStartRestartGroup, BentoIcon4.Size12.$stable | 48, 48);
                            } else {
                                stringResource = subtitle;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            BentoText2.m20747BentoText38GnDrw(stringResource.getText(resources).toString(), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i7).m21426getFg20d7_KjU()), null, null, null, null, companion4.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i7).getTextS(), composerStartRestartGroup, 817889280, 0, 7546);
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.endNode();
                            Unit unit = Unit.INSTANCE;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        UserListRowEndIcon(userListRowState, composerStartRestartGroup, i8);
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function03 = function06;
                        modifier4 = modifier6;
                        z4 = z3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                        z4 = z2;
                        function03 = function02;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.portfolio.lists.ui.UserListRowComposableKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return UserListRowComposable5.UserListRowComposable$lambda$11(userListRowState, onClick, modifier4, z4, function03, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                function02 = function0;
                if ((i3 & 9363) == 9362) {
                    if (i6 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Resources resources2 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                    composerStartRestartGroup.startReplaceGroup(1275896658);
                    if (z3) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i72 = BentoTheme.$stable;
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier5, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21593getSmallD9Ej5fM(), composerStartRestartGroup, 0, 0);
                    Alignment.Companion companion5 = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically2 = companion5.getCenterVertically();
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(arrangement2.getStart(), centerVertically2, composerStartRestartGroup, 48);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ2);
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor4 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy3, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion22.getSetModifier());
                        Row6 row62 = Row6.INSTANCE;
                        int i82 = i3 & 14;
                        UserListRowVisual(userListRowState, composerStartRestartGroup, i82);
                        Modifier.Companion companion32 = Modifier.INSTANCE;
                        Modifier modifierWeight$default2 = Row5.weight$default(row62, androidx.compose.foundation.layout.PaddingKt.m5142padding3ABfNKs(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21590getDefaultD9Ej5fM()), 1.0f, false, 2, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion5.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default2);
                        Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting()) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                            Column6 column62 = Column6.INSTANCE;
                            StringResource displayName2 = userListRowState.getDisplayName();
                            Intrinsics.checkNotNull(resources2);
                            String string22 = displayName2.getText(resources2).toString();
                            TextOverflow.Companion companion42 = TextOverflow.INSTANCE;
                            Modifier modifier62 = modifier3;
                            Function0<Unit> function062 = function04;
                            BentoText2.m20747BentoText38GnDrw(string22, null, null, null, null, null, null, companion42.m7959getEllipsisgIe3tQ8(), false, 2, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i72).getTextM(), composerStartRestartGroup, 817889280, 0, 7550);
                            composerStartRestartGroup = composerStartRestartGroup;
                            subtitle = userListRowState.getSubtitle();
                            composerStartRestartGroup.startReplaceGroup(1554212635);
                            if (subtitle != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            UserListRowEndIcon(userListRowState, composerStartRestartGroup, i82);
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function03 = function062;
                            modifier4 = modifier62;
                            z4 = z3;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            function02 = function0;
            if ((i3 & 9363) == 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        function02 = function0;
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserListRowComposable$lambda$6$lambda$1$lambda$0(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserListRowComposable$lambda$6$lambda$3$lambda$2(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserListRowComposable$lambda$6$lambda$5$lambda$4(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final void UserListRowEndIcon(final UserListRowComposable7 userListRowComposable7, Composer composer, final int i) {
        int i2;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1714296792);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(userListRowComposable7) : composerStartRestartGroup.changedInstance(userListRowComposable7) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1714296792, i2, -1, "com.robinhood.shared.portfolio.lists.ui.UserListRowEndIcon (UserListRowComposable.kt:250)");
            }
            if (userListRowComposable7.getOverrideEndAsset() != null) {
                composerStartRestartGroup.startReplaceGroup(840531532);
                ServerToBentoAssetMapper2 overrideEndAsset = userListRowComposable7.getOverrideEndAsset();
                if (overrideEndAsset != null) {
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(overrideEndAsset), null, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21426getFg20d7_KjU(), null, null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable | 48, 56);
                    Unit unit = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(840824172);
                if (userListRowComposable7 instanceof UserListRowComposable7.WatchlistRow.Expandable) {
                    composerStartRestartGroup.startReplaceGroup(840893612);
                    UserListRowComposable7.WatchlistRow.Expandable expandable = (UserListRowComposable7.WatchlistRow.Expandable) userListRowComposable7;
                    if (expandable.getItemCount() > 0) {
                        Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, WATCHLIST_EXPAND_ICON);
                        BentoIconButton4.Type type2 = BentoIconButton4.Type.Secondary;
                        long jM6725getTransparent0d7_KjU = Color.INSTANCE.m6725getTransparent0d7_KjU();
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i3 = BentoTheme.$stable;
                        long jM21427getFg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21427getFg30d7_KjU();
                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU();
                        boolean z = true;
                        if (expandable.getExpanded()) {
                            serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.CARET_UP_16;
                        } else {
                            serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.CARET_DOWN_16;
                        }
                        BentoIconButton4.Icon.StandardSize16 standardSize16 = new BentoIconButton4.Icon.StandardSize16(serverToBentoAssetMapper2);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !composerStartRestartGroup.changedInstance(userListRowComposable7))) {
                            z = false;
                        }
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.shared.portfolio.lists.ui.UserListRowComposableKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return UserListRowComposable5.UserListRowEndIcon$lambda$14$lambda$13(userListRowComposable7);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        BentoIconButton2.m20641BentoIconButtoncqYvz4g((Function0) objRememberedValue, standardSize16, "", modifierTestTag, type2, false, Color.m6701boximpl(jM21425getFg0d7_KjU), Color.m6701boximpl(jM6725getTransparent0d7_KjU), Color.m6701boximpl(jM21427getFg30d7_KjU), null, false, composerStartRestartGroup, (BentoIconButton4.Icon.StandardSize16.$stable << 3) | 12610944, 0, 1568);
                        composerStartRestartGroup = composerStartRestartGroup;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Unit unit2 = Unit.INSTANCE;
                } else {
                    boolean z2 = true;
                    if (userListRowComposable7 instanceof UserListRowComposable7.WatchlistRow.Checkable) {
                        composerStartRestartGroup.startReplaceGroup(841990392);
                        boolean checked = ((UserListRowComposable7.WatchlistRow.Checkable) userListRowComposable7).getChecked();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !composerStartRestartGroup.changedInstance(userListRowComposable7))) {
                            z2 = false;
                        }
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.portfolio.lists.ui.UserListRowComposableKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return UserListRowComposable5.UserListRowEndIcon$lambda$16$lambda$15(userListRowComposable7, ((Boolean) obj).booleanValue());
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        BentoCheckbox2.m20599BentoCheckboxSj8uqqQ(null, checked, false, null, (Function1) objRememberedValue2, composerStartRestartGroup, 0, 13);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceGroup();
                        Unit unit3 = Unit.INSTANCE;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(842300733);
                        ServerToBentoAssetMapper2 rowEndAsset = userListRowComposable7.getRowEndAsset();
                        if (rowEndAsset != null) {
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(rowEndAsset), null, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21426getFg20d7_KjU(), null, null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable | 48, 56);
                            Unit unit4 = Unit.INSTANCE;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                    }
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.portfolio.lists.ui.UserListRowComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UserListRowComposable5.UserListRowEndIcon$lambda$18(userListRowComposable7, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserListRowEndIcon$lambda$14$lambda$13(UserListRowComposable7 userListRowComposable7) {
        UserListRowComposable7.WatchlistRow.Expandable expandable = (UserListRowComposable7.WatchlistRow.Expandable) userListRowComposable7;
        expandable.getOnExpandToggled().invoke(expandable.getWatchlist().getId(), Boolean.valueOf(expandable.getExpanded()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserListRowEndIcon$lambda$16$lambda$15(UserListRowComposable7 userListRowComposable7, boolean z) {
        UserListRowComposable7.WatchlistRow.Checkable checkable = (UserListRowComposable7.WatchlistRow.Checkable) userListRowComposable7;
        checkable.getOnCheckToggled().invoke(checkable.getWatchlist().getId(), Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    private static final void UserListRowVisual(final UserListRowComposable7 userListRowComposable7, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2032372762);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(userListRowComposable7) : composerStartRestartGroup.changedInstance(userListRowComposable7) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2032372762, i2, -1, "com.robinhood.shared.portfolio.lists.ui.UserListRowVisual (UserListRowComposable.kt:307)");
            }
            if ((userListRowComposable7 instanceof UserListRowComposable7.WatchlistRow) && ((UserListRowComposable7.WatchlistRow) userListRowComposable7).getWatchlist().isOptionsWatchlist()) {
                composerStartRestartGroup.startReplaceGroup(263199148);
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierM5171sizeVpY3zN4 = SizeKt.m5171sizeVpY3zN4(companion, C2002Dp.m7995constructorimpl(48), C2002Dp.m7995constructorimpl(64));
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                Modifier modifierM4871backgroundbw27NRU = Background3.m4871backgroundbw27NRU(modifierM5171sizeVpY3zN4, bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(roundedCornerRadius));
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4871backgroundbw27NRU);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.EYE_24), null, bentoTheme.getColors(composerStartRestartGroup, i3).m21371getBg0d7_KjU(), BoxScopeInstance.INSTANCE.align(companion, companion2.getCenter()), null, false, composerStartRestartGroup, BentoIcon4.Size24.$stable | 48, 48);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(263862114);
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierM5171sizeVpY3zN42 = SizeKt.m5171sizeVpY3zN4(companion4, C2002Dp.m7995constructorimpl(48), C2002Dp.m7995constructorimpl(64));
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i4 = BentoTheme.$stable;
                long jM21372getBg20d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i4).m21372getBg20d7_KjU();
                float f = roundedCornerRadius;
                Modifier modifierM4871backgroundbw27NRU2 = Background3.m4871backgroundbw27NRU(modifierM5171sizeVpY3zN42, jM21372getBg20d7_KjU, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(f));
                Alignment.Companion companion5 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getTopStart(), false);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4871backgroundbw27NRU2);
                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion6.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion6.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion6.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion6.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                UserListRowComposable6 primaryDisplayAsset = userListRowComposable7.getPrimaryDisplayAsset();
                if (primaryDisplayAsset instanceof UserListRowComposable6.BentoIconAsset) {
                    composerStartRestartGroup.startReplaceGroup(-1968484046);
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(((UserListRowComposable6.BentoIconAsset) primaryDisplayAsset).getIcon()), null, bentoTheme2.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU(), boxScopeInstance.align(companion4, companion5.getCenter()), null, false, composerStartRestartGroup, BentoIcon4.Size24.$stable | 48, 48);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (primaryDisplayAsset instanceof UserListRowComposable6.EmojiAsset) {
                    composerStartRestartGroup.startReplaceGroup(-1968087587);
                    Modifier modifierAlign = boxScopeInstance.align(companion4, companion5.getCenter());
                    String emoji = ((UserListRowComposable6.EmojiAsset) primaryDisplayAsset).getEmoji();
                    if (emoji == null) {
                        emoji = "💡";
                    }
                    BentoText2.m20747BentoText38GnDrw(emoji, modifierAlign, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i4).getDisplayNibSmall(), composerStartRestartGroup, 0, 0, 8124);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (!(primaryDisplayAsset instanceof UserListRowComposable6.UriAsset)) {
                        composerStartRestartGroup.startReplaceGroup(1460518631);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(-1967631081);
                    Modifier modifierClip = Clip.clip(companion4, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(f));
                    AsyncImagePainter asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg = SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageRequest.Builder((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).data(((UserListRowComposable6.UriAsset) primaryDisplayAsset).getUri()).scale(Scale.FIT).build(), null, null, null, 0, null, composerStartRestartGroup, 0, 62);
                    composerStartRestartGroup = composerStartRestartGroup;
                    ImageKt.Image(asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg, StringResources_androidKt.stringResource(C39419R.string.user_list_icon_description, composerStartRestartGroup, 0), modifierClip, (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24576, 104);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.portfolio.lists.ui.UserListRowComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UserListRowComposable5.UserListRowVisual$lambda$21(userListRowComposable7, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void UserListStandardPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-285564149);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-285564149, i, -1, "com.robinhood.shared.portfolio.lists.ui.UserListStandardPreview (UserListRowComposable.kt:381)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, UserListRowComposable.INSTANCE.getLambda$443732163$lib_lists_ui_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.portfolio.lists.ui.UserListRowComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UserListRowComposable5.UserListStandardPreview$lambda$22(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void UserListNoEmojiPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(91821585);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(91821585, i, -1, "com.robinhood.shared.portfolio.lists.ui.UserListNoEmojiPreview (UserListRowComposable.kt:408)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, UserListRowComposable.INSTANCE.getLambda$669536601$lib_lists_ui_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.portfolio.lists.ui.UserListRowComposableKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UserListRowComposable5.UserListNoEmojiPreview$lambda$23(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void UserListLongNamePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1132471137);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1132471137, i, -1, "com.robinhood.shared.portfolio.lists.ui.UserListLongNamePreview (UserListRowComposable.kt:435)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, UserListRowComposable.INSTANCE.getLambda$1861767449$lib_lists_ui_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.portfolio.lists.ui.UserListRowComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UserListRowComposable5.UserListLongNamePreview$lambda$24(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
