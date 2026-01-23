package com.robinhood.android.odyssey.lib.view;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoFlagIcon;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.serverdrivenui.component.ApiSdIcon;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTypedIcon;
import com.robinhood.models.serverdriven.p347db.ThemedColor;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SdTypedIcon.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\b\u001a\u0015\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"SdTypedIcon", "", "apiSdTypedIcon", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTypedIcon;", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTypedIcon;Landroidx/compose/runtime/Composer;I)V", "SdFlag", "countryCode", "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "SdResource", "iconData", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdIcon$ApiSdIconData;", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdIcon$ApiSdIconData;Landroidx/compose/runtime/Composer;I)V", "feature-lib-odyssey_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.odyssey.lib.view.SdTypedIconKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class SdTypedIcon2 {

    /* compiled from: SdTypedIcon.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.odyssey.lib.view.SdTypedIconKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ApiSdIcon.IconType.values().length];
            try {
                iArr[ApiSdIcon.IconType.DOCUMENTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiSdIcon.IconType.LOCATION_FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiSdIcon.IconType.LOCK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiSdIcon.IconType.SEARCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiSdIcon.IconType.BANKING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ApiSdIcon.IconType.DISCLOSURES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ApiSdIcon.IconType.DOWNLOAD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ApiSdIcon.IconType.QUESTION_FILLED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ApiSdIcon.IconType.DOT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ApiSdIcon.IconType.SPARKLE_BULLET.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ApiSdIcon.IconType.WARNING_FILLED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ApiSdIcon.IconType.EDIT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ApiSdIcon.IconType.ROBINHOOD.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ApiSdIcon.IconType.CARET_LEFT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ApiSdIcon.IconType.CARET_RIGHT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ApiSdIcon.IconType.CLOSE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ApiSdIcon.IconType.UNSUPPORTED.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ApiSdIcon.IconSize.values().length];
            try {
                iArr2[ApiSdIcon.IconSize.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[ApiSdIcon.IconSize.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[ApiSdIcon.IconSize.LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SdFlag$lambda$1(String str, int i, Composer composer, int i2) {
        SdFlag(str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SdResource$lambda$2(ApiSdIcon.ApiSdIconData apiSdIconData, int i, Composer composer, int i2) {
        SdResource(apiSdIconData, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SdResource$lambda$3(ApiSdIcon.ApiSdIconData apiSdIconData, int i, Composer composer, int i2) {
        SdResource(apiSdIconData, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SdTypedIcon$lambda$0(ApiSdTypedIcon apiSdTypedIcon, int i, Composer composer, int i2) {
        SdTypedIcon(apiSdTypedIcon, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void SdTypedIcon(final ApiSdTypedIcon apiSdTypedIcon, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(apiSdTypedIcon, "apiSdTypedIcon");
        Composer composerStartRestartGroup = composer.startRestartGroup(1584877086);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(apiSdTypedIcon) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1584877086, i2, -1, "com.robinhood.android.odyssey.lib.view.SdTypedIcon (SdTypedIcon.kt:15)");
            }
            if (apiSdTypedIcon instanceof ApiSdTypedIcon.ApiSdResource) {
                composerStartRestartGroup.startReplaceGroup(-1646505888);
                SdResource(((ApiSdTypedIcon.ApiSdResource) apiSdTypedIcon).getValue(), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (apiSdTypedIcon instanceof ApiSdTypedIcon.ApiSdFlag) {
                composerStartRestartGroup.startReplaceGroup(-1646502465);
                SdFlag(((ApiSdTypedIcon.ApiSdFlag) apiSdTypedIcon).getValue(), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(apiSdTypedIcon instanceof ApiSdTypedIcon.ApiSdUnknown)) {
                    composerStartRestartGroup.startReplaceGroup(-1646507777);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(498138244);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.odyssey.lib.view.SdTypedIconKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SdTypedIcon2.SdTypedIcon$lambda$0(apiSdTypedIcon, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void SdFlag(final String str, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(143693008);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(143693008, i2, -1, "com.robinhood.android.odyssey.lib.view.SdFlag (SdTypedIcon.kt:34)");
            }
            BentoFlagIcon.BentoFlagIcon(str, null, composerStartRestartGroup, i2 & 14, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.odyssey.lib.view.SdTypedIconKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SdTypedIcon2.SdFlag$lambda$1(str, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void SdResource(final ApiSdIcon.ApiSdIconData apiSdIconData, Composer composer, final int i) {
        int i2;
        SdTypedIcon sdTypedIcon;
        BentoIcon4 size12;
        Composer composerStartRestartGroup = composer.startRestartGroup(-272947339);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(apiSdIconData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-272947339, i2, -1, "com.robinhood.android.odyssey.lib.view.SdResource (SdTypedIcon.kt:41)");
            }
            switch (WhenMappings.$EnumSwitchMapping$0[apiSdIconData.getType().ordinal()]) {
                case 1:
                    sdTypedIcon = SdTypedIcon.DOCUMENTS;
                    break;
                case 2:
                    sdTypedIcon = SdTypedIcon.LOCATION_FILL;
                    break;
                case 3:
                    sdTypedIcon = SdTypedIcon.LOCK;
                    break;
                case 4:
                    sdTypedIcon = SdTypedIcon.SEARCH;
                    break;
                case 5:
                    sdTypedIcon = SdTypedIcon.BANKING;
                    break;
                case 6:
                    sdTypedIcon = SdTypedIcon.DISCLOSURES;
                    break;
                case 7:
                    sdTypedIcon = SdTypedIcon.DOWNLOAD;
                    break;
                case 8:
                    sdTypedIcon = SdTypedIcon.QUESTION_FILLED;
                    break;
                case 9:
                    sdTypedIcon = SdTypedIcon.DOT;
                    break;
                case 10:
                    sdTypedIcon = SdTypedIcon.SPARKLE_BULLET;
                    break;
                case 11:
                    sdTypedIcon = SdTypedIcon.WARNING_FILLED;
                    break;
                case 12:
                    sdTypedIcon = SdTypedIcon.EDIT;
                    break;
                case 13:
                    sdTypedIcon = SdTypedIcon.ROBINHOOD;
                    break;
                case 14:
                    sdTypedIcon = SdTypedIcon.CARET_LEFT;
                    break;
                case 15:
                    sdTypedIcon = SdTypedIcon.CARET_RIGHT;
                    break;
                case 16:
                    sdTypedIcon = SdTypedIcon.CLOSE;
                    break;
                case 17:
                    sdTypedIcon = null;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            if (sdTypedIcon == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.odyssey.lib.view.SdTypedIconKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SdTypedIcon2.SdResource$lambda$2(apiSdIconData, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            int i3 = WhenMappings.$EnumSwitchMapping$1[apiSdIconData.getSize().ordinal()];
            if (i3 == 1) {
                size12 = new BentoIcon4.Size12(sdTypedIcon.getSmall());
            } else if (i3 == 2) {
                size12 = new BentoIcon4.Size16(sdTypedIcon.getMedium());
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                size12 = new BentoIcon4.Size24(sdTypedIcon.getLarge());
            }
            ThemedColor tint = apiSdIconData.getTint();
            composerStartRestartGroup.startReplaceGroup(-309336283);
            Color composeColor = tint != null ? SduiColors2.toComposeColor(tint, composerStartRestartGroup, 0) : null;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-309336724);
            long jM21425getFg0d7_KjU = composeColor == null ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU() : composeColor.getValue();
            composerStartRestartGroup.endReplaceGroup();
            BentoIcon2.m20644BentoIconFU0evQE(size12, null, jM21425getFg0d7_KjU, null, null, false, composerStartRestartGroup, BentoIcon4.$stable | 48, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.odyssey.lib.view.SdTypedIconKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SdTypedIcon2.SdResource$lambda$3(apiSdIconData, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
