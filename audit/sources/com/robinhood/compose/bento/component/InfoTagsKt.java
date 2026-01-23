package com.robinhood.compose.bento.component;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.DarkTheme;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.compose.C11917R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.DayNightPreview;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InfoTags.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a[\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001ak\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a_\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001aQ\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001ae\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u000f\u0010 \u001a\u00020\u000bH\u0003¢\u0006\u0004\b \u0010!\u001a\u000f\u0010\"\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\"\u0010!\u001a\u000f\u0010#\u001a\u00020\u000bH\u0003¢\u0006\u0004\b#\u0010!\u001a\u000f\u0010$\u001a\u00020\u000bH\u0003¢\u0006\u0004\b$\u0010!\u001aA\u0010*\u001a\u00020\u000b2\u0017\u0010(\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u000b0%¢\u0006\u0002\b'2\u0017\u0010)\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u000b0%¢\u0006\u0002\b'H\u0003¢\u0006\u0004\b*\u0010+¨\u0006,"}, m3636d2 = {"", "text", "Landroidx/compose/ui/Modifier;", "modifier", "", "showIcon", "enabled", "contentDescription", "Landroidx/compose/ui/graphics/Color;", "textColorOverride", "Lkotlin/Function0;", "", "onClick", "BentoAlertInfoTag-yZUFuyM", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZZLjava/lang/String;Landroidx/compose/ui/graphics/Color;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "BentoAlertInfoTag", "", "icon", "backgroundColorOverride", "BentoInformInfoTag-IAMbWEA", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/Integer;Landroidx/compose/ui/graphics/Color;Ljava/lang/String;ZLandroidx/compose/ui/graphics/Color;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "BentoInformInfoTag", "BentoInlineInfoTag-yZUFuyM", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/Integer;Ljava/lang/String;ZLandroidx/compose/ui/graphics/Color;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "BentoInlineInfoTag", "BentoPositiveInfoTag", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/Integer;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/compose/bento/component/TagColorStates;", "tagColors", "BentoInfoTag-VF7tc6g", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/robinhood/compose/bento/component/TagColorStates;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Color;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "BentoInfoTag", "AlertInfoTags", "(Landroidx/compose/runtime/Composer;I)V", "InformInfoTags", "InlineInfoTags", "PositiveInfoTags", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "firstColumn", "secondColumn", "InfoTagPreviewGrid", "(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class InfoTagsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AlertInfoTags$lambda$5(int i, Composer composer, int i2) {
        AlertInfoTags(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoAlertInfoTag_yZUFuyM$lambda$0(String str, Modifier modifier, boolean z, boolean z2, String str2, Color color, Function0 function0, int i, int i2, Composer composer, int i3) {
        m20823BentoAlertInfoTagyZUFuyM(str, modifier, z, z2, str2, color, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoInfoTag_VF7tc6g$lambda$4(String str, Integer num, String str2, TagColorStates tagColorStates, Modifier modifier, boolean z, Color color, Function0 function0, int i, int i2, Composer composer, int i3) {
        m20824BentoInfoTagVF7tc6g(str, num, str2, tagColorStates, modifier, z, color, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoInformInfoTag_IAMbWEA$lambda$1(String str, Modifier modifier, Integer num, Color color, String str2, boolean z, Color color2, Function0 function0, int i, int i2, Composer composer, int i3) {
        m20825BentoInformInfoTagIAMbWEA(str, modifier, num, color, str2, z, color2, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoInlineInfoTag_yZUFuyM$lambda$2(String str, Modifier modifier, Integer num, String str2, boolean z, Color color, Function0 function0, int i, int i2, Composer composer, int i3) {
        m20826BentoInlineInfoTagyZUFuyM(str, modifier, num, str2, z, color, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoPositiveInfoTag$lambda$3(String str, Modifier modifier, Integer num, String str2, boolean z, Function0 function0, int i, int i2, Composer composer, int i3) {
        BentoPositiveInfoTag(str, modifier, num, str2, z, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InfoTagPreviewGrid$lambda$9(Function3 function3, Function3 function32, int i, Composer composer, int i2) {
        InfoTagPreviewGrid(function3, function32, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InformInfoTags$lambda$6(int i, Composer composer, int i2) {
        InformInfoTags(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InlineInfoTags$lambda$7(int i, Composer composer, int i2) {
        InlineInfoTags(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PositiveInfoTags$lambda$8(int i, Composer composer, int i2) {
        PositiveInfoTags(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010c  */
    /* renamed from: BentoAlertInfoTag-yZUFuyM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20823BentoAlertInfoTagyZUFuyM(final String text, Modifier modifier, boolean z, boolean z2, String str, Color color, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        String strStringResource;
        int i6;
        Color color2;
        Function0<Unit> function02;
        int i7;
        boolean z5;
        boolean z6;
        String str2;
        final Color color3;
        final String str3;
        final Modifier modifier3;
        final boolean z7;
        final boolean z8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-518985885);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    z3 = z;
                    i3 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        z4 = z2;
                        i3 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
                    }
                    if ((i & 24576) != 0) {
                        if ((i2 & 16) == 0) {
                            strStringResource = str;
                            int i9 = composerStartRestartGroup.changed(strStringResource) ? 16384 : 8192;
                            i3 |= i9;
                        } else {
                            strStringResource = str;
                        }
                        i3 |= i9;
                    } else {
                        strStringResource = str;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else {
                        if ((196608 & i) == 0) {
                            color2 = color;
                            i3 |= composerStartRestartGroup.changed(color2) ? 131072 : 65536;
                        }
                        if ((i2 & 64) == 0) {
                            if ((i & 1572864) == 0) {
                                function02 = function0;
                                i3 |= composerStartRestartGroup.changedInstance(function02) ? 1048576 : 524288;
                            }
                            if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                                    if (i4 != 0) {
                                        z3 = true;
                                    }
                                    if (i5 != 0) {
                                        z4 = true;
                                    }
                                    if ((i2 & 16) != 0) {
                                        i3 &= -57345;
                                        strStringResource = StringResources_androidKt.stringResource(C11917R.string.content_description_alert, composerStartRestartGroup, 0);
                                    }
                                    modifier2 = modifier4;
                                    i7 = i3;
                                    if (i6 == 0) {
                                        z5 = z3;
                                        z6 = z4;
                                        str2 = strStringResource;
                                        color3 = null;
                                    }
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-518985885, i7, -1, "com.robinhood.compose.bento.component.BentoAlertInfoTag (InfoTags.kt:48)");
                                    }
                                    int i10 = (i7 & 14) | ((i7 >> 6) & 896) | ((i7 << 9) & 57344) | ((i7 << 6) & 458752);
                                    int i11 = i7 << 3;
                                    m20824BentoInfoTagVF7tc6g(text, z5 ? Integer.valueOf(ServerToBentoAssetMapper2.TRIANGLE_ALERT_16.getResourceId()) : null, str2, TagColorStates.INSTANCE.alert(composerStartRestartGroup, 6), modifier2, z6, color3, function02, composerStartRestartGroup, i10 | (3670016 & i11) | (i11 & 29360128), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    boolean z9 = z6;
                                    str3 = str2;
                                    modifier3 = modifier2;
                                    z7 = z9;
                                    z8 = z5;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i2 & 16) != 0) {
                                        i3 &= -57345;
                                    }
                                    i7 = i3;
                                }
                                z5 = z3;
                                z6 = z4;
                                str2 = strStringResource;
                                color3 = color2;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                int i102 = (i7 & 14) | ((i7 >> 6) & 896) | ((i7 << 9) & 57344) | ((i7 << 6) & 458752);
                                int i112 = i7 << 3;
                                m20824BentoInfoTagVF7tc6g(text, z5 ? Integer.valueOf(ServerToBentoAssetMapper2.TRIANGLE_ALERT_16.getResourceId()) : null, str2, TagColorStates.INSTANCE.alert(composerStartRestartGroup, 6), modifier2, z6, color3, function02, composerStartRestartGroup, i102 | (3670016 & i112) | (i112 & 29360128), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                boolean z92 = z6;
                                str3 = str2;
                                modifier3 = modifier2;
                                z7 = z92;
                                z8 = z5;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                                z8 = z3;
                                z7 = z4;
                                str3 = strStringResource;
                                color3 = color2;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.InfoTagsKt$$ExternalSyntheticLambda7
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return InfoTagsKt.BentoAlertInfoTag_yZUFuyM$lambda$0(text, modifier3, z8, z7, str3, color3, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 1572864;
                        function02 = function0;
                        if ((599187 & i3) == 599186) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i8 == 0) {
                                }
                                if (i4 != 0) {
                                }
                                if (i5 != 0) {
                                }
                                if ((i2 & 16) != 0) {
                                }
                                modifier2 = modifier4;
                                i7 = i3;
                                if (i6 == 0) {
                                    z5 = z3;
                                    z6 = z4;
                                    str2 = strStringResource;
                                    color3 = color2;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                int i1022 = (i7 & 14) | ((i7 >> 6) & 896) | ((i7 << 9) & 57344) | ((i7 << 6) & 458752);
                                int i1122 = i7 << 3;
                                m20824BentoInfoTagVF7tc6g(text, z5 ? Integer.valueOf(ServerToBentoAssetMapper2.TRIANGLE_ALERT_16.getResourceId()) : null, str2, TagColorStates.INSTANCE.alert(composerStartRestartGroup, 6), modifier2, z6, color3, function02, composerStartRestartGroup, i1022 | (3670016 & i1122) | (i1122 & 29360128), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                boolean z922 = z6;
                                str3 = str2;
                                modifier3 = modifier2;
                                z7 = z922;
                                z8 = z5;
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    color2 = color;
                    if ((i2 & 64) == 0) {
                    }
                    function02 = function0;
                    if ((599187 & i3) == 599186) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                z4 = z2;
                if ((i & 24576) != 0) {
                }
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                color2 = color;
                if ((i2 & 64) == 0) {
                }
                function02 = function0;
                if ((599187 & i3) == 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z3 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z4 = z2;
            if ((i & 24576) != 0) {
            }
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            color2 = color;
            if ((i2 & 64) == 0) {
            }
            function02 = function0;
            if ((599187 & i3) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z3 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z4 = z2;
        if ((i & 24576) != 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        color2 = color;
        if ((i2 & 64) == 0) {
        }
        function02 = function0;
        if ((599187 & i3) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0114  */
    /* renamed from: BentoInformInfoTag-IAMbWEA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20825BentoInformInfoTagIAMbWEA(final String text, Modifier modifier, Integer num, Color color, String str, boolean z, Color color2, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Integer num2;
        int i5;
        Color color3;
        int i6;
        String str2;
        int i7;
        boolean z2;
        int i8;
        final Integer num3;
        final Color color4;
        final boolean z3;
        final String str3;
        final Modifier modifier3;
        final Color color5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(1039479610);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    num2 = num;
                    i3 |= composerStartRestartGroup.changed(num2) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        color3 = color;
                        i3 |= composerStartRestartGroup.changed(color3) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            str2 = str;
                            i3 |= composerStartRestartGroup.changed(str2) ? 16384 : 8192;
                        }
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= 196608;
                        } else {
                            if ((196608 & i) == 0) {
                                z2 = z;
                                i3 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                            }
                            i8 = i2 & 64;
                            if (i8 == 0) {
                                i3 |= 1572864;
                            } else if ((i & 1572864) == 0) {
                                i3 |= composerStartRestartGroup.changed(color2) ? 1048576 : 524288;
                            }
                            if ((i2 & 128) != 0) {
                                if ((i & 12582912) == 0) {
                                    i3 |= composerStartRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
                                }
                                if ((i3 & 4793491) == 4793490 && composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    color4 = color2;
                                    modifier3 = modifier2;
                                    num3 = num2;
                                    color5 = color3;
                                    str3 = str2;
                                    z3 = z2;
                                } else {
                                    if (i9 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    Integer num4 = i4 == 0 ? null : num2;
                                    Color color6 = i5 == 0 ? null : color3;
                                    if (i6 != 0) {
                                        str2 = null;
                                    }
                                    boolean z4 = i7 == 0 ? true : z2;
                                    Color color7 = i8 == 0 ? null : color2;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1039479610, i3, -1, "com.robinhood.compose.bento.component.BentoInformInfoTag (InfoTags.kt:73)");
                                    }
                                    TagColorStates tagColorStatesM20839informoJZG2nU = TagColorStates.INSTANCE.m20839informoJZG2nU(color6, composerStartRestartGroup, ((i3 >> 9) & 14) | 48);
                                    int i10 = (i3 & 14) | ((i3 >> 3) & 112) | ((i3 >> 6) & 896) | (57344 & (i3 << 9)) | (458752 & i3) | (3670016 & i3) | (i3 & 29360128);
                                    String str4 = str2;
                                    Color color8 = color6;
                                    m20824BentoInfoTagVF7tc6g(text, num4, str4, tagColorStatesM20839informoJZG2nU, modifier2, z4, color7, function0, composerStartRestartGroup, i10, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    num3 = num4;
                                    color4 = color7;
                                    z3 = z4;
                                    str3 = str4;
                                    modifier3 = modifier2;
                                    color5 = color8;
                                }
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.InfoTagsKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return InfoTagsKt.BentoInformInfoTag_IAMbWEA$lambda$1(text, modifier3, num3, color5, str3, z3, color4, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i3 |= 12582912;
                            if ((i3 & 4793491) == 4793490) {
                                if (i9 != 0) {
                                }
                                if (i4 == 0) {
                                }
                                if (i5 == 0) {
                                }
                                if (i6 != 0) {
                                }
                                if (i7 == 0) {
                                }
                                if (i8 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                TagColorStates tagColorStatesM20839informoJZG2nU2 = TagColorStates.INSTANCE.m20839informoJZG2nU(color6, composerStartRestartGroup, ((i3 >> 9) & 14) | 48);
                                int i102 = (i3 & 14) | ((i3 >> 3) & 112) | ((i3 >> 6) & 896) | (57344 & (i3 << 9)) | (458752 & i3) | (3670016 & i3) | (i3 & 29360128);
                                String str42 = str2;
                                Color color82 = color6;
                                m20824BentoInfoTagVF7tc6g(text, num4, str42, tagColorStatesM20839informoJZG2nU2, modifier2, z4, color7, function0, composerStartRestartGroup, i102, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                num3 = num4;
                                color4 = color7;
                                z3 = z4;
                                str3 = str42;
                                modifier3 = modifier2;
                                color5 = color82;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        z2 = z;
                        i8 = i2 & 64;
                        if (i8 == 0) {
                        }
                        if ((i2 & 128) != 0) {
                        }
                        if ((i3 & 4793491) == 4793490) {
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    str2 = str;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    z2 = z;
                    i8 = i2 & 64;
                    if (i8 == 0) {
                    }
                    if ((i2 & 128) != 0) {
                    }
                    if ((i3 & 4793491) == 4793490) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                color3 = color;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                str2 = str;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                z2 = z;
                i8 = i2 & 64;
                if (i8 == 0) {
                }
                if ((i2 & 128) != 0) {
                }
                if ((i3 & 4793491) == 4793490) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            num2 = num;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            color3 = color;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            str2 = str;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            z2 = z;
            i8 = i2 & 64;
            if (i8 == 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if ((i3 & 4793491) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        num2 = num;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        color3 = color;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        str2 = str;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        z2 = z;
        i8 = i2 & 64;
        if (i8 == 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if ((i3 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0101  */
    /* renamed from: BentoInlineInfoTag-yZUFuyM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20826BentoInlineInfoTagyZUFuyM(final String text, Modifier modifier, Integer num, String str, boolean z, Color color, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Integer num2;
        int i5;
        String str2;
        int i6;
        boolean z2;
        int i7;
        Color color2;
        Function0<Unit> function02;
        final boolean z3;
        final Color color3;
        final String str3;
        final Modifier modifier3;
        final Integer num3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1089432095);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    num2 = num;
                    i3 |= composerStartRestartGroup.changed(num2) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        str2 = str;
                        i3 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            z2 = z;
                            i3 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                        }
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= 196608;
                        } else {
                            if ((196608 & i) == 0) {
                                color2 = color;
                                i3 |= composerStartRestartGroup.changed(color2) ? 131072 : 65536;
                            }
                            if ((i2 & 64) != 0) {
                                if ((i & 1572864) == 0) {
                                    function02 = function0;
                                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 1048576 : 524288;
                                }
                                if ((i3 & 599187) == 599186 && composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    modifier3 = modifier2;
                                    num3 = num2;
                                    str3 = str2;
                                    z3 = z2;
                                    color3 = color2;
                                } else {
                                    if (i8 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    Integer num4 = i4 == 0 ? null : num2;
                                    if (i5 != 0) {
                                        str2 = null;
                                    }
                                    z3 = i6 == 0 ? true : z2;
                                    color3 = i7 == 0 ? null : color2;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1089432095, i3, -1, "com.robinhood.compose.bento.component.BentoInlineInfoTag (InfoTags.kt:96)");
                                    }
                                    int i9 = i3 >> 3;
                                    int i10 = (i3 & 14) | (i9 & 112) | (i9 & 896) | ((i3 << 9) & 57344);
                                    int i11 = i3 << 3;
                                    int i12 = i10 | (458752 & i11) | (3670016 & i11) | (i11 & 29360128);
                                    String str4 = str2;
                                    m20824BentoInfoTagVF7tc6g(text, num4, str4, TagColorStates.INSTANCE.inline(composerStartRestartGroup, 6), modifier2, z3, color3, function02, composerStartRestartGroup, i12, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    Modifier modifier4 = modifier2;
                                    str3 = str4;
                                    modifier3 = modifier4;
                                    num3 = num4;
                                }
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.InfoTagsKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return InfoTagsKt.BentoInlineInfoTag_yZUFuyM$lambda$2(text, modifier3, num3, str3, z3, color3, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i3 |= 1572864;
                            function02 = function0;
                            if ((i3 & 599187) == 599186) {
                                if (i8 != 0) {
                                }
                                if (i4 == 0) {
                                }
                                if (i5 != 0) {
                                }
                                if (i6 == 0) {
                                }
                                if (i7 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                int i92 = i3 >> 3;
                                int i102 = (i3 & 14) | (i92 & 112) | (i92 & 896) | ((i3 << 9) & 57344);
                                int i112 = i3 << 3;
                                int i122 = i102 | (458752 & i112) | (3670016 & i112) | (i112 & 29360128);
                                String str42 = str2;
                                m20824BentoInfoTagVF7tc6g(text, num4, str42, TagColorStates.INSTANCE.inline(composerStartRestartGroup, 6), modifier2, z3, color3, function02, composerStartRestartGroup, i122, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                Modifier modifier42 = modifier2;
                                str3 = str42;
                                modifier3 = modifier42;
                                num3 = num4;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        color2 = color;
                        if ((i2 & 64) != 0) {
                        }
                        function02 = function0;
                        if ((i3 & 599187) == 599186) {
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    z2 = z;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    color2 = color;
                    if ((i2 & 64) != 0) {
                    }
                    function02 = function0;
                    if ((i3 & 599187) == 599186) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                str2 = str;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                z2 = z;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                color2 = color;
                if ((i2 & 64) != 0) {
                }
                function02 = function0;
                if ((i3 & 599187) == 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            num2 = num;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            str2 = str;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            z2 = z;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            color2 = color;
            if ((i2 & 64) != 0) {
            }
            function02 = function0;
            if ((i3 & 599187) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        num2 = num;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        str2 = str;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        z2 = z;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        color2 = color;
        if ((i2 & 64) != 0) {
        }
        function02 = function0;
        if ((i3 & 599187) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoPositiveInfoTag(final String text, Modifier modifier, Integer num, String str, boolean z, final Function0<Unit> onClick, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Integer num2;
        int i5;
        String str2;
        int i6;
        boolean z2;
        final boolean z3;
        final String str3;
        final Modifier modifier3;
        final Integer num3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-961653206);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    num2 = num;
                    i3 |= composerStartRestartGroup.changed(num2) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        str2 = str;
                        i3 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 != 0) {
                        if ((i & 24576) == 0) {
                            z2 = z;
                            i3 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                        }
                        if ((i2 & 32) != 0) {
                            i3 |= 196608;
                        } else if ((i & 196608) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 131072 : 65536;
                        }
                        if ((74899 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            num3 = num2;
                            str3 = str2;
                            z3 = z2;
                        } else {
                            if (i7 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                num2 = null;
                            }
                            if (i5 != 0) {
                                str2 = null;
                            }
                            z3 = i6 == 0 ? true : z2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-961653206, i3, -1, "com.robinhood.compose.bento.component.BentoPositiveInfoTag (InfoTags.kt:115)");
                            }
                            int i8 = i3 >> 3;
                            int i9 = (i3 & 14) | (i8 & 112) | (i8 & 896) | ((i3 << 9) & 57344) | (458752 & (i3 << 3)) | ((i3 << 6) & 29360128);
                            String str4 = str2;
                            Integer num4 = num2;
                            m20824BentoInfoTagVF7tc6g(text, num4, str4, TagColorStates.INSTANCE.positive(composerStartRestartGroup, 6), modifier2, z3, null, onClick, composerStartRestartGroup, i9, 64);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            Modifier modifier4 = modifier2;
                            str3 = str4;
                            modifier3 = modifier4;
                            num3 = num4;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.InfoTagsKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return InfoTagsKt.BentoPositiveInfoTag$lambda$3(text, modifier3, num3, str3, z3, onClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 24576;
                    z2 = z;
                    if ((i2 & 32) != 0) {
                    }
                    if ((74899 & i3) == 74898) {
                        if (i7 != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i82 = i3 >> 3;
                        int i92 = (i3 & 14) | (i82 & 112) | (i82 & 896) | ((i3 << 9) & 57344) | (458752 & (i3 << 3)) | ((i3 << 6) & 29360128);
                        String str42 = str2;
                        Integer num42 = num2;
                        m20824BentoInfoTagVF7tc6g(text, num42, str42, TagColorStates.INSTANCE.positive(composerStartRestartGroup, 6), modifier2, z3, null, onClick, composerStartRestartGroup, i92, 64);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Modifier modifier42 = modifier2;
                        str3 = str42;
                        modifier3 = modifier42;
                        num3 = num42;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                str2 = str;
                i6 = i2 & 16;
                if (i6 != 0) {
                }
                z2 = z;
                if ((i2 & 32) != 0) {
                }
                if ((74899 & i3) == 74898) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            num2 = num;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            str2 = str;
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            z2 = z;
            if ((i2 & 32) != 0) {
            }
            if ((74899 & i3) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        num2 = num;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        str2 = str;
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        z2 = z;
        if ((i2 & 32) != 0) {
        }
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010b  */
    /* renamed from: BentoInfoTag-VF7tc6g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20824BentoInfoTagVF7tc6g(final String text, final Integer num, final String str, final TagColorStates tagColors, Modifier modifier, boolean z, Color color, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Integer num2;
        String str2;
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        int i6;
        Color color2;
        boolean z3;
        Object obj;
        Modifier modifierM4893clickableXHw0xAI$default;
        final Color color3;
        final boolean z4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(tagColors, "tagColors");
        Composer composerStartRestartGroup = composer.startRestartGroup(626149037);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                num2 = num;
                i3 |= composerStartRestartGroup.changed(num2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    str2 = str;
                    i3 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    i3 |= composerStartRestartGroup.changed(tagColors) ? 2048 : 1024;
                }
                i4 = i2 & 16;
                if (i4 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        modifier2 = modifier;
                        i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                    }
                    i5 = i2 & 32;
                    if (i5 == 0) {
                        i3 |= 196608;
                    } else {
                        if ((196608 & i) == 0) {
                            z2 = z;
                            i3 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                        }
                        i6 = i2 & 64;
                        if (i6 == 0) {
                            if ((1572864 & i) == 0) {
                                color2 = color;
                                i3 |= composerStartRestartGroup.changed(color2) ? 1048576 : 524288;
                            }
                            if ((i2 & 128) == 0) {
                                i3 |= 12582912;
                            } else if ((i & 12582912) == 0) {
                                i3 |= composerStartRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
                            }
                            if ((4793491 & i3) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                                z3 = i5 == 0 ? true : z2;
                                Color color4 = i6 == 0 ? null : color2;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(626149037, i3, -1, "com.robinhood.compose.bento.component.BentoInfoTag (InfoTags.kt:138)");
                                }
                                if (z3 || function0 == null) {
                                    obj = null;
                                    modifierM4893clickableXHw0xAI$default = Modifier.INSTANCE;
                                } else {
                                    obj = null;
                                    modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(Modifier.INSTANCE, false, null, null, function0, 7, null);
                                }
                                TagColors tagColors2 = !z3 ? tagColors.getDefault() : tagColors.getDisabled();
                                InfoTagDefaults infoTagDefaults = InfoTagDefaults.INSTANCE;
                                RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(infoTagDefaults.m20818getShapeRadiusD9Ej5fM());
                                long jM20845getBackground0d7_KjU = tagColors2.m20845getBackground0d7_KjU();
                                long jM20846getForeground0d7_KjU = tagColors2.m20846getForeground0d7_KjU();
                                Modifier modifierWithBentoPillPlaceholder$default = LocalShowPlaceholder.withBentoPillPlaceholder$default(Clip.clip(modifier3, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(infoTagDefaults.m20818getShapeRadiusD9Ej5fM())).then(modifierM4893clickableXHw0xAI$default), false, 1, obj);
                                modifier2 = modifier3;
                                final String str3 = str2;
                                final TagColors tagColors3 = tagColors2;
                                final Integer num3 = num2;
                                final Color color5 = color4;
                                SurfaceKt.m5967SurfaceT9BRK9s(modifierWithBentoPillPlaceholder$default, roundedCornerShapeM5327RoundedCornerShape0680j_4, jM20845getBackground0d7_KjU, jM20846getForeground0d7_KjU, 0.0f, 0.0f, null, ComposableLambda3.rememberComposableLambda(-498856462, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.InfoTagsKt$BentoInfoTag$1
                                    public final void invoke(Composer composer2, int i7) {
                                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-498856462, i7, -1, "com.robinhood.compose.bento.component.BentoInfoTag.<anonymous> (InfoTags.kt:150)");
                                        }
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        InfoTagDefaults infoTagDefaults2 = InfoTagDefaults.INSTANCE;
                                        Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(PaddingKt.m5146paddingqDBjuR0$default(companion, infoTagDefaults2.m20817getInternalPaddingStartD9Ej5fM(), 0.0f, infoTagDefaults2.m20816getInternalPaddingEndD9Ej5fM(), 0.0f, 10, null), infoTagDefaults2.m20815getHeightD9Ej5fM());
                                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                        Integer num4 = num3;
                                        String str4 = str3;
                                        Color color6 = color5;
                                        TagColors tagColors4 = tagColors3;
                                        String str5 = text;
                                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5156height3ABfNKs);
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
                                        composer2.startReplaceGroup(244835096);
                                        if (num4 != null) {
                                            IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(num4.intValue(), composer2, 0), str4, LocalShowPlaceholder.withBentoCirclePlaceholder$default(SizeKt.m5169size3ABfNKs(companion, C2002Dp.m7995constructorimpl(16)), false, 1, null), color6 != null ? color6.getValue() : tagColors4.m20846getForeground0d7_KjU(), composer2, 0, 0);
                                        }
                                        composer2.endReplaceGroup();
                                        Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, C2002Dp.m7995constructorimpl(4)), composer2, 6);
                                        BentoText2.m20747BentoText38GnDrw(str5, null, Color.m6701boximpl(color6 != null ? color6.getValue() : tagColors4.m20846getForeground0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer2, 6).getTextS(), composer2, 24576, 0, 8170);
                                        composer2.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num4) {
                                        invoke(composer2, num4.intValue());
                                        return Unit.INSTANCE;
                                    }
                                }, composerStartRestartGroup, 54), composerStartRestartGroup, 12582912, 112);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                color3 = color5;
                                z4 = z3;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                z4 = z2;
                                color3 = color2;
                            }
                            final Modifier modifier4 = modifier2;
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.InfoTagsKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj2, Object obj3) {
                                        return InfoTagsKt.BentoInfoTag_VF7tc6g$lambda$4(text, num, str, tagColors, modifier4, z4, color3, function0, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 1572864;
                        color2 = color;
                        if ((i2 & 128) == 0) {
                        }
                        if ((4793491 & i3) == 4793490) {
                            if (i4 == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (z3) {
                                obj = null;
                                modifierM4893clickableXHw0xAI$default = Modifier.INSTANCE;
                                if (!z3) {
                                }
                                InfoTagDefaults infoTagDefaults2 = InfoTagDefaults.INSTANCE;
                                RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_42 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(infoTagDefaults2.m20818getShapeRadiusD9Ej5fM());
                                long jM20845getBackground0d7_KjU2 = tagColors2.m20845getBackground0d7_KjU();
                                long jM20846getForeground0d7_KjU2 = tagColors2.m20846getForeground0d7_KjU();
                                Modifier modifierWithBentoPillPlaceholder$default2 = LocalShowPlaceholder.withBentoPillPlaceholder$default(Clip.clip(modifier3, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(infoTagDefaults2.m20818getShapeRadiusD9Ej5fM())).then(modifierM4893clickableXHw0xAI$default), false, 1, obj);
                                modifier2 = modifier3;
                                final String str32 = str2;
                                final TagColors tagColors32 = tagColors2;
                                final Integer num32 = num2;
                                final Color color52 = color4;
                                SurfaceKt.m5967SurfaceT9BRK9s(modifierWithBentoPillPlaceholder$default2, roundedCornerShapeM5327RoundedCornerShape0680j_42, jM20845getBackground0d7_KjU2, jM20846getForeground0d7_KjU2, 0.0f, 0.0f, null, ComposableLambda3.rememberComposableLambda(-498856462, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.InfoTagsKt$BentoInfoTag$1
                                    public final void invoke(Composer composer2, int i7) {
                                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-498856462, i7, -1, "com.robinhood.compose.bento.component.BentoInfoTag.<anonymous> (InfoTags.kt:150)");
                                        }
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        InfoTagDefaults infoTagDefaults22 = InfoTagDefaults.INSTANCE;
                                        Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(PaddingKt.m5146paddingqDBjuR0$default(companion, infoTagDefaults22.m20817getInternalPaddingStartD9Ej5fM(), 0.0f, infoTagDefaults22.m20816getInternalPaddingEndD9Ej5fM(), 0.0f, 10, null), infoTagDefaults22.m20815getHeightD9Ej5fM());
                                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                        Integer num4 = num32;
                                        String str4 = str32;
                                        Color color6 = color52;
                                        TagColors tagColors4 = tagColors32;
                                        String str5 = text;
                                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5156height3ABfNKs);
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
                                        composer2.startReplaceGroup(244835096);
                                        if (num4 != null) {
                                            IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(num4.intValue(), composer2, 0), str4, LocalShowPlaceholder.withBentoCirclePlaceholder$default(SizeKt.m5169size3ABfNKs(companion, C2002Dp.m7995constructorimpl(16)), false, 1, null), color6 != null ? color6.getValue() : tagColors4.m20846getForeground0d7_KjU(), composer2, 0, 0);
                                        }
                                        composer2.endReplaceGroup();
                                        Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, C2002Dp.m7995constructorimpl(4)), composer2, 6);
                                        BentoText2.m20747BentoText38GnDrw(str5, null, Color.m6701boximpl(color6 != null ? color6.getValue() : tagColors4.m20846getForeground0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer2, 6).getTextS(), composer2, 24576, 0, 8170);
                                        composer2.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num4) {
                                        invoke(composer2, num4.intValue());
                                        return Unit.INSTANCE;
                                    }
                                }, composerStartRestartGroup, 54), composerStartRestartGroup, 12582912, 112);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                color3 = color52;
                                z4 = z3;
                            }
                        }
                        final Modifier modifier42 = modifier2;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    z2 = z;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                    }
                    color2 = color;
                    if ((i2 & 128) == 0) {
                    }
                    if ((4793491 & i3) == 4793490) {
                    }
                    final Modifier modifier422 = modifier2;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                modifier2 = modifier;
                i5 = i2 & 32;
                if (i5 == 0) {
                }
                z2 = z;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                color2 = color;
                if ((i2 & 128) == 0) {
                }
                if ((4793491 & i3) == 4793490) {
                }
                final Modifier modifier4222 = modifier2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            str2 = str;
            if ((i2 & 8) != 0) {
            }
            i4 = i2 & 16;
            if (i4 != 0) {
            }
            modifier2 = modifier;
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            z2 = z;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            color2 = color;
            if ((i2 & 128) == 0) {
            }
            if ((4793491 & i3) == 4793490) {
            }
            final Modifier modifier42222 = modifier2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        num2 = num;
        if ((i2 & 4) == 0) {
        }
        str2 = str;
        if ((i2 & 8) != 0) {
        }
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        z2 = z;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        color2 = color;
        if ((i2 & 128) == 0) {
        }
        if ((4793491 & i3) == 4793490) {
        }
        final Modifier modifier422222 = modifier2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @DayNightPreview
    private static final void AlertInfoTags(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1072228704);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1072228704, i, -1, "com.robinhood.compose.bento.component.AlertInfoTags (InfoTags.kt:297)");
            }
            ComposableSingletons$InfoTagsKt composableSingletons$InfoTagsKt = ComposableSingletons$InfoTagsKt.INSTANCE;
            InfoTagPreviewGrid(composableSingletons$InfoTagsKt.getLambda$135209825$lib_compose_bento_externalRelease(), composableSingletons$InfoTagsKt.m20803getLambda$851372864$lib_compose_bento_externalRelease(), composerStartRestartGroup, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.InfoTagsKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InfoTagsKt.AlertInfoTags$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @DayNightPreview
    private static final void InformInfoTags(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1043776343);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1043776343, i, -1, "com.robinhood.compose.bento.component.InformInfoTags (InfoTags.kt:313)");
            }
            ComposableSingletons$InfoTagsKt composableSingletons$InfoTagsKt = ComposableSingletons$InfoTagsKt.INSTANCE;
            InfoTagPreviewGrid(composableSingletons$InfoTagsKt.getLambda$2060962166$lib_compose_bento_externalRelease(), composableSingletons$InfoTagsKt.getLambda$1541669879$lib_compose_bento_externalRelease(), composerStartRestartGroup, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.InfoTagsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InfoTagsKt.InformInfoTags$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @DayNightPreview
    private static final void InlineInfoTags(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(339883559);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(339883559, i, -1, "com.robinhood.compose.bento.component.InlineInfoTags (InfoTags.kt:328)");
            }
            ComposableSingletons$InfoTagsKt composableSingletons$InfoTagsKt = ComposableSingletons$InfoTagsKt.INSTANCE;
            InfoTagPreviewGrid(composableSingletons$InfoTagsKt.getLambda$1357069382$lib_compose_bento_externalRelease(), composableSingletons$InfoTagsKt.getLambda$837777095$lib_compose_bento_externalRelease(), composerStartRestartGroup, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.InfoTagsKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InfoTagsKt.InlineInfoTags$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @DayNightPreview
    private static final void PositiveInfoTags(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1673466297);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1673466297, i, -1, "com.robinhood.compose.bento.component.PositiveInfoTags (InfoTags.kt:343)");
            }
            ComposableSingletons$InfoTagsKt composableSingletons$InfoTagsKt = ComposableSingletons$InfoTagsKt.INSTANCE;
            InfoTagPreviewGrid(composableSingletons$InfoTagsKt.getLambda$884533414$lib_compose_bento_externalRelease(), composableSingletons$InfoTagsKt.getLambda$60851943$lib_compose_bento_externalRelease(), composerStartRestartGroup, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.InfoTagsKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InfoTagsKt.PositiveInfoTags$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void InfoTagPreviewGrid(final Function3<? super Column5, ? super Composer, ? super Integer, Unit> function3, final Function3<? super Column5, ? super Composer, ? super Integer, Unit> function32, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-771795135);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function3) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function32) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-771795135, i2, -1, "com.robinhood.compose.bento.component.InfoTagPreviewGrid (InfoTags.kt:361)");
            }
            BentoTheme2.BentoTheme(Boolean.valueOf(!DarkTheme.isSystemInDarkTheme(composerStartRestartGroup, 0)), null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(847781513, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.InfoTagsKt.InfoTagPreviewGrid.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(847781513, i3, -1, "com.robinhood.compose.bento.component.InfoTagPreviewGrid.<anonymous> (InfoTags.kt:363)");
                    }
                    Arrangement arrangement = Arrangement.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer2, 6).m21592getMediumD9Ej5fM());
                    Function3<Column5, Composer, Integer, Unit> function33 = function3;
                    Function3<Column5, Composer, Integer, Unit> function34 = function32;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, companion2.getTop(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer2, 6).m21590getDefaultD9Ej5fM()), companion2.getStart(), composer2, 0);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, companion);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    function33.invoke(column6, composer2, 6);
                    composer2.endNode();
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer2, 6).m21590getDefaultD9Ej5fM()), companion2.getStart(), composer2, 0);
                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, companion);
                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                    function34.invoke(column6, composer2, 6);
                    composer2.endNode();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.InfoTagsKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InfoTagsKt.InfoTagPreviewGrid$lambda$9(function3, function32, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
