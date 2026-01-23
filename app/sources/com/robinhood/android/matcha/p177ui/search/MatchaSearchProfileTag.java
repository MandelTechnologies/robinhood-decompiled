package com.robinhood.android.matcha.p177ui.search;

import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material.SurfaceKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.matcha.p177ui.search.MatchaSearchProfileTag;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoPogSize;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextInput8;
import com.robinhood.compose.bento.component.InfoTagDefaults;
import com.robinhood.compose.bento.component.TagColors;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.p2p.common.ProfileAvatar3;
import com.robinhood.p2p.common.ProfileAvatarState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MatchaSearchProfileTag.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aK\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m3636d2 = {"MatchaSearchProfileTag", "", "isSelected", "", "avatar", "Lcom/robinhood/p2p/common/ProfileAvatarState;", "name", "", "onClick", "Lkotlin/Function0;", "onRemoveClick", "modifier", "Landroidx/compose/ui/Modifier;", "(ZLcom/robinhood/p2p/common/ProfileAvatarState;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-p2p_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.matcha.ui.search.MatchaSearchProfileTagKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class MatchaSearchProfileTag {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchaSearchProfileTag$lambda$0(boolean z, ProfileAvatarState profileAvatarState, String str, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MatchaSearchProfileTag(z, profileAvatarState, str, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MatchaSearchProfileTag(final boolean z, final ProfileAvatarState avatar, final String name, final Function0<Unit> onClick, final Function0<Unit> onRemoveClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        TagColors tagColors;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(onRemoveClick, "onRemoveClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1550434323);
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
            i3 |= composerStartRestartGroup.changedInstance(avatar) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(name) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onRemoveClick) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1550434323, i3, -1, "com.robinhood.android.matcha.ui.search.MatchaSearchProfileTag (MatchaSearchProfileTag.kt:37)");
                }
                Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(Modifier.INSTANCE, false, null, null, onClick, 7, null);
                if (!z) {
                    composerStartRestartGroup.startReplaceGroup(-386256475);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    tagColors = new TagColors(bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU(), 0L, 4, null);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (z) {
                        composerStartRestartGroup.startReplaceGroup(-386257453);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(-386252251);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    tagColors = new TagColors(bentoTheme2.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU(), bentoTheme2.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU(), 0L, 4, null);
                    composerStartRestartGroup.endReplaceGroup();
                }
                InfoTagDefaults infoTagDefaults = InfoTagDefaults.INSTANCE;
                TagColors tagColors2 = tagColors;
                modifier2 = modifier3;
                SurfaceKt.m5643SurfaceFjzlyU(Clip.clip(modifier3, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(infoTagDefaults.m20818getShapeRadiusD9Ej5fM())).then(modifierM4893clickableXHw0xAI$default), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(infoTagDefaults.m20818getShapeRadiusD9Ej5fM()), tagColors2.m20845getBackground0d7_KjU(), tagColors2.m20846getForeground0d7_KjU(), BorderStroke2.m4886BorderStrokecXLIe8U(C2002Dp.m7995constructorimpl(1), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21373getBg30d7_KjU()), 0.0f, ComposableLambda3.rememberComposableLambda(-912568233, true, new C215191(avatar, tagColors2, name, z, onClick, onRemoveClick), composerStartRestartGroup, 54), composerStartRestartGroup, 1572864, 32);
                composer2 = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            final Modifier modifier4 = modifier2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.search.MatchaSearchProfileTagKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MatchaSearchProfileTag.MatchaSearchProfileTag$lambda$0(z, avatar, name, onClick, onRemoveClick, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((74899 & i3) == 74898) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(Modifier.INSTANCE, false, null, null, onClick, 7, null);
            if (!z) {
            }
            InfoTagDefaults infoTagDefaults2 = InfoTagDefaults.INSTANCE;
            TagColors tagColors22 = tagColors;
            modifier2 = modifier3;
            SurfaceKt.m5643SurfaceFjzlyU(Clip.clip(modifier3, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(infoTagDefaults2.m20818getShapeRadiusD9Ej5fM())).then(modifierM4893clickableXHw0xAI$default2), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(infoTagDefaults2.m20818getShapeRadiusD9Ej5fM()), tagColors22.m20845getBackground0d7_KjU(), tagColors22.m20846getForeground0d7_KjU(), BorderStroke2.m4886BorderStrokecXLIe8U(C2002Dp.m7995constructorimpl(1), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21373getBg30d7_KjU()), 0.0f, ComposableLambda3.rememberComposableLambda(-912568233, true, new C215191(avatar, tagColors22, name, z, onClick, onRemoveClick), composerStartRestartGroup, 54), composerStartRestartGroup, 1572864, 32);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        final Modifier modifier42 = modifier2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: MatchaSearchProfileTag.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.matcha.ui.search.MatchaSearchProfileTagKt$MatchaSearchProfileTag$1 */
    static final class C215191 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ ProfileAvatarState $avatar;
        final /* synthetic */ TagColors $colors;
        final /* synthetic */ boolean $isSelected;
        final /* synthetic */ String $name;
        final /* synthetic */ Function0<Unit> $onClick;
        final /* synthetic */ Function0<Unit> $onRemoveClick;

        C215191(ProfileAvatarState profileAvatarState, TagColors tagColors, String str, boolean z, Function0<Unit> function0, Function0<Unit> function02) {
            this.$avatar = profileAvatarState;
            this.$colors = tagColors;
            this.$name = str;
            this.$isSelected = z;
            this.$onClick = function0;
            this.$onRemoveClick = function02;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(boolean z, Function0 function0, Function0 function02) {
            if (!z) {
                function0.invoke();
            }
            function02.invoke();
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-912568233, i, -1, "com.robinhood.android.matcha.ui.search.MatchaSearchProfileTag.<anonymous> (MatchaSearchProfileTag.kt:58)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = 4;
            Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(PaddingKt.m5146paddingqDBjuR0$default(companion, C2002Dp.m7995constructorimpl(f), 0.0f, InfoTagDefaults.INSTANCE.m20816getInternalPaddingEndD9Ej5fM(), 0.0f, 10, null), C2002Dp.m7995constructorimpl(32));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ProfileAvatarState profileAvatarState = this.$avatar;
            TagColors tagColors = this.$colors;
            String str = this.$name;
            final boolean z = this.$isSelected;
            final Function0<Unit> function0 = this.$onClick;
            final Function0<Unit> function02 = this.$onRemoveClick;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5156height3ABfNKs);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            ProfileAvatar3.ProfileAvatar(profileAvatarState, null, BentoPogSize.Number, null, composer, 384, 10);
            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, C2002Dp.m7995constructorimpl(f)), composer, 6);
            long jM20846getForeground0d7_KjU = tagColors.m20846getForeground0d7_KjU();
            BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(jM20846getForeground0d7_KjU), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextS(), composer, 24576, 0, 8170);
            BentoIcon4.Size12 size12 = new BentoIcon4.Size12(new BentoTextInput8.Icon.Size24(ServerToBentoAssetMapper2.CLOSE_12, null, null, 6, null).getAsset());
            long jM20846getForeground0d7_KjU2 = tagColors.m20846getForeground0d7_KjU();
            composer.startReplaceGroup(-1746271574);
            boolean zChanged = composer.changed(z) | composer.changed(function0) | composer.changed(function02);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.matcha.ui.search.MatchaSearchProfileTagKt$MatchaSearchProfileTag$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MatchaSearchProfileTag.C215191.invoke$lambda$2$lambda$1$lambda$0(z, function0, function02);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoIcon2.m20644BentoIconFU0evQE(size12, null, jM20846getForeground0d7_KjU2, null, (Function0) objRememberedValue, false, composer, BentoIcon4.Size12.$stable | 48, 40);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }
}
