package com.robinhood.android.matcha.p177ui.search.confirm;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoPogSize;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.p2p.common.ProfileAvatar3;
import com.robinhood.p2p.common.ProfileAvatarState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConfirmContactComposable.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0093\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0001¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"ConfirmContact", "", "titleText", "", "subtitleText", "subtitleLinkOnClick", "Lkotlin/Function0;", "avatar", "Lcom/robinhood/p2p/common/ProfileAvatarState;", "displayName", "identifierSubtitle", "disclosureText", "disclosureLinkText", "disclosureLinkTextOnClick", "confirmText", "onConfirm", "onCancel", "confirmLoading", "", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/robinhood/p2p/common/ProfileAvatarState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;II)V", "feature-p2p_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.search.confirm.ConfirmContactComposableKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class ConfirmContactComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConfirmContact$lambda$0(String str, String str2, Function0 function0, ProfileAvatarState profileAvatarState, String str3, String str4, String str5, String str6, Function0 function02, String str7, Function0 function03, Function0 function04, boolean z, int i, int i2, Composer composer, int i3) {
        ConfirmContact(str, str2, function0, profileAvatarState, str3, str4, str5, str6, function02, str7, function03, function04, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    public static final void ConfirmContact(final String titleText, final String str, final Function0<Unit> subtitleLinkOnClick, final ProfileAvatarState avatar, final String displayName, final String str2, final String disclosureText, final String str3, final Function0<Unit> disclosureLinkTextOnClick, final String confirmText, final Function0<Unit> onConfirm, final Function0<Unit> onCancel, final boolean z, Composer composer, final int i, final int i2) {
        int i3;
        final String str4;
        int i4;
        Composer composer2;
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(subtitleLinkOnClick, "subtitleLinkOnClick");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(disclosureText, "disclosureText");
        Intrinsics.checkNotNullParameter(disclosureLinkTextOnClick, "disclosureLinkTextOnClick");
        Intrinsics.checkNotNullParameter(confirmText, "confirmText");
        Intrinsics.checkNotNullParameter(onConfirm, "onConfirm");
        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1581691289);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(titleText) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(subtitleLinkOnClick) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(avatar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(displayName) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            str4 = str2;
            i3 |= composerStartRestartGroup.changed(str4) ? 131072 : 65536;
        } else {
            str4 = str2;
        }
        if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changed(disclosureText) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changed(str3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(disclosureLinkTextOnClick) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= composerStartRestartGroup.changed(confirmText) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changedInstance(onConfirm) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onCancel) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        int i5 = i4;
        if ((i3 & 306783379) != 306783378 || (i5 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1581691289, i3, i5, "com.robinhood.android.matcha.ui.search.confirm.ConfirmContact (ConfirmContactComposable.kt:35)");
            }
            composer2 = composerStartRestartGroup;
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-2021101582, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.search.confirm.ConfirmContactComposableKt.ConfirmContact.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i6) {
                    BentoTheme bentoTheme;
                    int i7;
                    Composer composer4;
                    int i8;
                    if ((i6 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2021101582, i6, -1, "com.robinhood.android.matcha.ui.search.confirm.ConfirmContact.<anonymous> (ConfirmContactComposable.kt:37)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i9 = BentoTheme.$stable;
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme2.getSpacing(composer3, i9).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                    ProfileAvatarState profileAvatarState = avatar;
                    boolean z2 = z;
                    String str5 = disclosureText;
                    String str6 = str3;
                    Function0<Unit> function0 = disclosureLinkTextOnClick;
                    Function0<Unit> function02 = onConfirm;
                    String str7 = confirmText;
                    Function0<Unit> function03 = onCancel;
                    String str8 = titleText;
                    String str9 = str;
                    Function0<Unit> function04 = subtitleLinkOnClick;
                    String str10 = displayName;
                    String str11 = str4;
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer3, 48);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5144paddingVpY3zN4$default);
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
                    Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme2.getSpacing(composer3, i9).m21592getMediumD9Ej5fM(), 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getCenterHorizontally(), composer3, 48);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierM5144paddingVpY3zN4$default2);
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
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    BentoText2.m20747BentoText38GnDrw(str8, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i9).getDisplayCapsuleSmall(), composer3, 0, 0, 8190);
                    composer3.startReplaceGroup(-749561658);
                    if (str9 == null) {
                        composer4 = composer3;
                        bentoTheme = bentoTheme2;
                        i7 = i9;
                    } else {
                        bentoTheme = bentoTheme2;
                        i7 = i9;
                        BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A(str9, StringResources_androidKt.stringResource(C21284R.string.matcha_confirm_contact_subtitle_link_text, composer3, 0), function04, PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer3, i9).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), bentoTheme.getColors(composer3, i9).m21426getFg20d7_KjU(), 0L, bentoTheme.getTypography(composer3, i9).getTextS(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), composer3, 0, 32);
                        composer4 = composer3;
                        Unit unit = Unit.INSTANCE;
                    }
                    composer4.endReplaceGroup();
                    composer4.endNode();
                    ProfileAvatar3.ProfileAvatar(profileAvatarState, PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer4, i7).m21593getSmallD9Ej5fM(), 7, null), BentoPogSize.ExtraLarge, null, composer4, 384, 8);
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getCenterHorizontally(), composer4, 48);
                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer4, companion);
                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                    if (composer4.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor3);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer4);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy3, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                    BentoTheme bentoTheme3 = bentoTheme;
                    int i10 = i7;
                    BentoText2.m20747BentoText38GnDrw(str10, column6.weight(companion, 1.0f, false), null, null, FontWeight.INSTANCE.getBold(), null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer4, i7).getTextL(), composer3, 24576, 0, 8108);
                    composer3.startReplaceGroup(-1166298824);
                    if (str11 == null) {
                        i8 = i10;
                    } else {
                        i8 = i10;
                        BentoText2.m20747BentoText38GnDrw(str11, null, Color.m6701boximpl(bentoTheme3.getColors(composer3, i10).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composer3, i10).getTextS(), composer3, 0, 0, 8186);
                        Unit unit2 = Unit.INSTANCE;
                    }
                    composer3.endReplaceGroup();
                    composer3.endNode();
                    BentoButtonBar2.BentoButtonBar(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme3.getSpacing(composer3, i8).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), str5, str6, false, function0, null, function02, str7, z2, null, false, function03, StringResources_androidKt.stringResource(C11048R.string.general_label_cancel, composer3, 0), false, null, !z2, composer3, 0, 0, 26152);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54), composer2, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.search.confirm.ConfirmContactComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConfirmContactComposable.ConfirmContact$lambda$0(titleText, str, subtitleLinkOnClick, avatar, displayName, str2, disclosureText, str3, disclosureLinkTextOnClick, confirmText, onConfirm, onCancel, z, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
