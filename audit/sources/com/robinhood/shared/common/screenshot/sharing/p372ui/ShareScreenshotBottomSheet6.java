package com.robinhood.shared.common.screenshot.sharing.p372ui;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
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
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.shared.common.screenshot.sharing.C37479R;
import com.robinhood.shared.common.screenshot.sharing.ShareScreenshot;
import com.robinhood.shared.common.screenshot.sharing.p372ui.ShareScreenshotBottomSheet2;
import com.robinhood.shared.common.screenshot.sharing.p372ui.ShareScreenshotBottomSheet5;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: ShareScreenshotBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a]\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0002\u0010\u000e\u001aI\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\"\u000e\u0010\u001a\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\f8G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m3636d2 = {"ShareScreenshotBottomSheet", "", "bitmap", "Landroid/graphics/Bitmap;", "modifier", "Landroidx/compose/ui/Modifier;", "title", "", "subtitle", "message", "shareTitle", "shareOptions", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/common/screenshot/sharing/ui/ShareOption;", "(Landroid/graphics/Bitmap;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/runtime/Composer;II)V", "ShareOptionComposable", "icon", "Lcom/robinhood/shared/common/screenshot/sharing/ui/ShareOptionIcon;", "text", "loggingIdentifier", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "onClick", "Lkotlin/Function0;", "ShareOptionComposable-FHprtrg", "(Lcom/robinhood/shared/common/screenshot/sharing/ui/ShareOptionIcon;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "TwitterPackageName", "defaultShareOptions", "getDefaultShareOptions", "(Landroidx/compose/runtime/Composer;I)Lkotlinx/collections/immutable/ImmutableList;", "lib-screenshot-sharing_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.common.screenshot.sharing.ui.ShareScreenshotBottomSheetKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class ShareScreenshotBottomSheet6 {
    public static final String TwitterPackageName = "com.twitter.android";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShareOptionComposable_FHprtrg$lambda$3(ShareScreenshotBottomSheet5 shareScreenshotBottomSheet5, String str, String str2, Modifier modifier, long j, Function0 function0, int i, int i2, Composer composer, int i3) {
        m24858ShareOptionComposableFHprtrg(shareScreenshotBottomSheet5, str, str2, modifier, j, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShareScreenshotBottomSheet$lambda$0(Bitmap bitmap, Modifier modifier, String str, String str2, String str3, String str4, ImmutableList immutableList, int i, int i2, Composer composer, int i3) {
        ShareScreenshotBottomSheet(bitmap, modifier, str, str2, str3, str4, immutableList, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ShareScreenshotBottomSheet(final Bitmap bitmap, Modifier modifier, String str, String str2, String str3, String str4, ImmutableList<ShareOption> immutableList, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        String str5;
        int i5;
        String str6;
        int i6;
        String str7;
        String strStringResource;
        ImmutableList<ShareOption> immutableList2;
        Modifier modifier3;
        int i7;
        final String str8;
        final String str9;
        final String str10;
        final String str11;
        final ImmutableList<ShareOption> defaultShareOptions;
        final ImmutableList<ShareOption> immutableList3;
        final String str12;
        final String str13;
        final String str14;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Composer composerStartRestartGroup = composer.startRestartGroup(-841423577);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(bitmap) ? 4 : 2) | i;
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
                    str5 = str;
                    i3 |= composerStartRestartGroup.changed(str5) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        str6 = str2;
                        i3 |= composerStartRestartGroup.changed(str6) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 != 0) {
                        if ((i & 24576) == 0) {
                            str7 = str3;
                            i3 |= composerStartRestartGroup.changed(str7) ? 16384 : 8192;
                        }
                        if ((196608 & i) == 0) {
                            if ((i2 & 32) == 0) {
                                strStringResource = str4;
                                int i9 = composerStartRestartGroup.changed(strStringResource) ? 131072 : 65536;
                                i3 |= i9;
                            } else {
                                strStringResource = str4;
                            }
                            i3 |= i9;
                        } else {
                            strStringResource = str4;
                        }
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                immutableList2 = immutableList;
                                int i10 = composerStartRestartGroup.changed(immutableList2) ? 1048576 : 524288;
                                i3 |= i10;
                            } else {
                                immutableList2 = immutableList;
                            }
                            i3 |= i10;
                        } else {
                            immutableList2 = immutableList;
                        }
                        if ((599187 & i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                modifier3 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i4 != 0) {
                                    str5 = null;
                                }
                                if (i5 != 0) {
                                    str6 = null;
                                }
                                if (i6 != 0) {
                                    str7 = null;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                    strStringResource = StringResources_androidKt.stringResource(C37479R.string.share_screenshot_sheet_title, composerStartRestartGroup, 0);
                                }
                                if ((i2 & 64) == 0) {
                                    i7 = i3 & (-3670017);
                                    defaultShareOptions = getDefaultShareOptions(composerStartRestartGroup, 0);
                                    str8 = str5;
                                    str9 = str6;
                                    str10 = str7;
                                } else {
                                    i7 = i3;
                                    str8 = str5;
                                    str9 = str6;
                                    str10 = str7;
                                    str11 = strStringResource;
                                    defaultShareOptions = immutableList2;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-841423577, i7, -1, "com.robinhood.shared.common.screenshot.sharing.ui.ShareScreenshotBottomSheet (ShareScreenshotBottomSheet.kt:69)");
                                    }
                                    final Modifier modifier5 = modifier3;
                                    BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(-229213495, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.common.screenshot.sharing.ui.ShareScreenshotBottomSheetKt.ShareScreenshotBottomSheet.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer2, int i11) {
                                            Object obj;
                                            String str15;
                                            String str16;
                                            Bitmap bitmap2;
                                            ImmutableList<ShareOption> immutableList4;
                                            String str17;
                                            BentoTheme bentoTheme;
                                            int i12;
                                            String str18;
                                            BentoTheme bentoTheme2;
                                            int i13;
                                            int i14;
                                            if ((i11 & 3) == 2 && composer2.getSkipping()) {
                                                composer2.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-229213495, i11, -1, "com.robinhood.shared.common.screenshot.sharing.ui.ShareScreenshotBottomSheet.<anonymous> (ShareScreenshotBottomSheet.kt:71)");
                                            }
                                            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(ModifiersKt.autoLogEvents$default(modifier5, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BOTTOM_SHEET, "screenshot_sharing_sheet", null, 4, null), null, 47, null)), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                                            BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                                            int i15 = BentoTheme.$stable;
                                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Background3.m4872backgroundbw27NRU$default(modifierVerticalScroll$default, bentoTheme3.getColors(composer2, i15).m21371getBg0d7_KjU(), null, 2, null), 0.0f, bentoTheme3.getSpacing(composer2, i15).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
                                            String str19 = str8;
                                            String str20 = str9;
                                            Bitmap bitmap3 = bitmap;
                                            ImmutableList<ShareOption> immutableList5 = defaultShareOptions;
                                            String str21 = str11;
                                            String str22 = str10;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5146paddingqDBjuR0$default);
                                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                            Column6 column6 = Column6.INSTANCE;
                                            composer2.startReplaceGroup(-540382333);
                                            if (str19 != null) {
                                                str16 = str20;
                                                bitmap2 = bitmap3;
                                                bentoTheme = bentoTheme3;
                                                obj = null;
                                                immutableList4 = immutableList5;
                                                str17 = str21;
                                                i12 = i15;
                                                str18 = str22;
                                                BentoText2.m20747BentoText38GnDrw(str19, com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composer2, i15).getTextL(), composer2, 0, 0, 8188);
                                                str15 = str19;
                                            } else {
                                                obj = null;
                                                str15 = str19;
                                                str16 = str20;
                                                bitmap2 = bitmap3;
                                                immutableList4 = immutableList5;
                                                str17 = str21;
                                                bentoTheme = bentoTheme3;
                                                i12 = i15;
                                                str18 = str22;
                                            }
                                            composer2.endReplaceGroup();
                                            composer2.startReplaceGroup(-540374180);
                                            if (str16 != null) {
                                                BentoTheme bentoTheme4 = bentoTheme;
                                                int i16 = i12;
                                                bentoTheme2 = bentoTheme;
                                                i13 = i12;
                                                BentoText2.m20747BentoText38GnDrw(str16, com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, obj), Color.m6701boximpl(bentoTheme4.getColors(composer2, i16).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme4.getTypography(composer2, i16).getTextS(), composer2, 0, 0, 8184);
                                            } else {
                                                bentoTheme2 = bentoTheme;
                                                i13 = i12;
                                            }
                                            composer2.endReplaceGroup();
                                            composer2.startReplaceGroup(-540364425);
                                            if (str15 == null && str16 == null) {
                                                i14 = i13;
                                            } else {
                                                i14 = i13;
                                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, bentoTheme2.getSpacing(composer2, i14).m21592getMediumD9Ej5fM()), composer2, 0);
                                            }
                                            composer2.endReplaceGroup();
                                            ImageKt.m4912Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmap2), null, Clip.clip(PaddingKt.m5144paddingVpY3zN4$default(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null), bentoTheme2.getSpacing(composer2, i14).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(20))), null, null, 0.0f, null, 0, composer2, 48, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                                            BentoTheme2.BentoTheme(null, null, null, null, Boolean.FALSE, null, null, null, ComposableLambda3.rememberComposableLambda(-1194002725, true, new ShareScreenshotBottomSheet7(immutableList4, bitmap2, str17, str18), composer2, 54), composer2, 100687872, 239);
                                            composer2.endNode();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    String str15 = str10;
                                    immutableList3 = defaultShareOptions;
                                    str12 = str15;
                                    str13 = str9;
                                    str14 = str8;
                                    modifier4 = modifier5;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                modifier3 = modifier2;
                                str9 = str6;
                                str10 = str7;
                                defaultShareOptions = immutableList2;
                                i7 = i3;
                                str8 = str5;
                            }
                            str11 = strStringResource;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            final Modifier modifier52 = modifier3;
                            BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(-229213495, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.common.screenshot.sharing.ui.ShareScreenshotBottomSheetKt.ShareScreenshotBottomSheet.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i11) {
                                    Object obj;
                                    String str152;
                                    String str16;
                                    Bitmap bitmap2;
                                    ImmutableList<ShareOption> immutableList4;
                                    String str17;
                                    BentoTheme bentoTheme;
                                    int i12;
                                    String str18;
                                    BentoTheme bentoTheme2;
                                    int i13;
                                    int i14;
                                    if ((i11 & 3) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-229213495, i11, -1, "com.robinhood.shared.common.screenshot.sharing.ui.ShareScreenshotBottomSheet.<anonymous> (ShareScreenshotBottomSheet.kt:71)");
                                    }
                                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(ModifiersKt.autoLogEvents$default(modifier52, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BOTTOM_SHEET, "screenshot_sharing_sheet", null, 4, null), null, 47, null)), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                                    BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                                    int i15 = BentoTheme.$stable;
                                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Background3.m4872backgroundbw27NRU$default(modifierVerticalScroll$default, bentoTheme3.getColors(composer2, i15).m21371getBg0d7_KjU(), null, 2, null), 0.0f, bentoTheme3.getSpacing(composer2, i15).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
                                    String str19 = str8;
                                    String str20 = str9;
                                    Bitmap bitmap3 = bitmap;
                                    ImmutableList<ShareOption> immutableList5 = defaultShareOptions;
                                    String str21 = str11;
                                    String str22 = str10;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5146paddingqDBjuR0$default);
                                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    composer2.startReplaceGroup(-540382333);
                                    if (str19 != null) {
                                        str16 = str20;
                                        bitmap2 = bitmap3;
                                        bentoTheme = bentoTheme3;
                                        obj = null;
                                        immutableList4 = immutableList5;
                                        str17 = str21;
                                        i12 = i15;
                                        str18 = str22;
                                        BentoText2.m20747BentoText38GnDrw(str19, com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composer2, i15).getTextL(), composer2, 0, 0, 8188);
                                        str152 = str19;
                                    } else {
                                        obj = null;
                                        str152 = str19;
                                        str16 = str20;
                                        bitmap2 = bitmap3;
                                        immutableList4 = immutableList5;
                                        str17 = str21;
                                        bentoTheme = bentoTheme3;
                                        i12 = i15;
                                        str18 = str22;
                                    }
                                    composer2.endReplaceGroup();
                                    composer2.startReplaceGroup(-540374180);
                                    if (str16 != null) {
                                        BentoTheme bentoTheme4 = bentoTheme;
                                        int i16 = i12;
                                        bentoTheme2 = bentoTheme;
                                        i13 = i12;
                                        BentoText2.m20747BentoText38GnDrw(str16, com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, obj), Color.m6701boximpl(bentoTheme4.getColors(composer2, i16).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme4.getTypography(composer2, i16).getTextS(), composer2, 0, 0, 8184);
                                    } else {
                                        bentoTheme2 = bentoTheme;
                                        i13 = i12;
                                    }
                                    composer2.endReplaceGroup();
                                    composer2.startReplaceGroup(-540364425);
                                    if (str152 == null && str16 == null) {
                                        i14 = i13;
                                    } else {
                                        i14 = i13;
                                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, bentoTheme2.getSpacing(composer2, i14).m21592getMediumD9Ej5fM()), composer2, 0);
                                    }
                                    composer2.endReplaceGroup();
                                    ImageKt.m4912Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmap2), null, Clip.clip(PaddingKt.m5144paddingVpY3zN4$default(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null), bentoTheme2.getSpacing(composer2, i14).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(20))), null, null, 0.0f, null, 0, composer2, 48, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                                    BentoTheme2.BentoTheme(null, null, null, null, Boolean.FALSE, null, null, null, ComposableLambda3.rememberComposableLambda(-1194002725, true, new ShareScreenshotBottomSheet7(immutableList4, bitmap2, str17, str18), composer2, 54), composer2, 100687872, 239);
                                    composer2.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            String str152 = str10;
                            immutableList3 = defaultShareOptions;
                            str12 = str152;
                            str13 = str9;
                            str14 = str8;
                            modifier4 = modifier52;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier4 = modifier2;
                            str14 = str5;
                            str13 = str6;
                            str12 = str7;
                            str11 = strStringResource;
                            immutableList3 = immutableList2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.common.screenshot.sharing.ui.ShareScreenshotBottomSheetKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ShareScreenshotBottomSheet6.ShareScreenshotBottomSheet$lambda$0(bitmap, modifier4, str14, str13, str12, str11, immutableList3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 24576;
                    str7 = str3;
                    if ((196608 & i) == 0) {
                    }
                    if ((1572864 & i) == 0) {
                    }
                    if ((599187 & i3) != 599186) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i8 == 0) {
                            }
                            if (i4 != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if ((i2 & 32) != 0) {
                            }
                            if ((i2 & 64) == 0) {
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                str6 = str2;
                i6 = i2 & 16;
                if (i6 != 0) {
                }
                str7 = str3;
                if ((196608 & i) == 0) {
                }
                if ((1572864 & i) == 0) {
                }
                if ((599187 & i3) != 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            str5 = str;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            str6 = str2;
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            str7 = str3;
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            if ((599187 & i3) != 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        str5 = str;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        str6 = str2;
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        str7 = str3;
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if ((599187 & i3) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x017f  */
    /* renamed from: ShareOptionComposable-FHprtrg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m24858ShareOptionComposableFHprtrg(final ShareScreenshotBottomSheet5 shareScreenshotBottomSheet5, final String str, final String str2, Modifier modifier, long j, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        String str3;
        String str4;
        Modifier modifier2;
        long jM21371getBg0d7_KjU;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        final Modifier modifier3;
        final long j2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1950737960);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(shareScreenshotBottomSheet5) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            str3 = str;
        } else {
            str3 = str;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(str3) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            str4 = str2;
        } else {
            str4 = str2;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(str4) ? 256 : 128;
            }
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                jM21371getBg0d7_KjU = j;
                i3 |= ((i2 & 16) == 0 && composerStartRestartGroup.changed(jM21371getBg0d7_KjU)) ? 16384 : 8192;
            } else {
                jM21371getBg0d7_KjU = j;
            }
            if ((i2 & 32) != 0) {
                if ((i & 196608) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function0) ? 131072 : 65536;
                }
                if ((74899 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    j2 = jM21371getBg0d7_KjU;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i5 = BentoTheme.$stable;
                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifier2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 0.0f, 2, null);
                        Alignment.Companion companion = Alignment.INSTANCE;
                        int i6 = i3;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), companion.getCenterHorizontally(), composerStartRestartGroup, 54);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Modifier modifier4 = modifier2;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            long j3 = jM21371getBg0d7_KjU;
                            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(Clip.clip(Background3.m4871backgroundbw27NRU(SizeKt.m5169size3ABfNKs(companion3, C2002Dp.m7995constructorimpl(56)), jM21371getBg0d7_KjU, RoundedCornerShape2.getCircleShape()), RoundedCornerShape2.getCircleShape()), false, null, null, function0, 7, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, str4, null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
                            currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default);
                            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (!composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                            setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl2.getInserting()) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                if (!(shareScreenshotBottomSheet5 instanceof ShareScreenshotBottomSheet5.BentoIcon)) {
                                }
                                composerStartRestartGroup.endNode();
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                                BentoText2.m20747BentoText38GnDrw(str, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, (i6 >> 3) & 14, 0, 8190);
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier4;
                                j2 = j3;
                            }
                        }
                    } else {
                        if (i4 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 16) != 0) {
                            jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU();
                            i3 &= -57345;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1950737960, i3, -1, "com.robinhood.shared.common.screenshot.sharing.ui.ShareOptionComposable (ShareScreenshotBottomSheet.kt:166)");
                        }
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i52 = BentoTheme.$stable;
                        Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(modifier2, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM(), 0.0f, 2, null);
                        Alignment.Companion companion4 = Alignment.INSTANCE;
                        int i62 = i3;
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), companion4.getCenterHorizontally(), composerStartRestartGroup, 54);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default2);
                        ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                        Modifier modifier42 = modifier2;
                        Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor3);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        Modifier.Companion companion32 = Modifier.INSTANCE;
                        long j32 = jM21371getBg0d7_KjU;
                        Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(Clip.clip(Background3.m4871backgroundbw27NRU(SizeKt.m5169size3ABfNKs(companion32, C2002Dp.m7995constructorimpl(56)), jM21371getBg0d7_KjU, RoundedCornerShape2.getCircleShape()), RoundedCornerShape2.getCircleShape()), false, null, null, function0, 7, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, str4, null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenter(), false);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default2);
                        Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor22);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        if (!(shareScreenshotBottomSheet5 instanceof ShareScreenshotBottomSheet5.BentoIcon)) {
                            composerStartRestartGroup.startReplaceGroup(908432131);
                            BentoIcon2.m20644BentoIconFU0evQE(((ShareScreenshotBottomSheet5.BentoIcon) shareScreenshotBottomSheet5).getIcon(), str3, bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU(), null, null, false, composerStartRestartGroup, BentoIcon4.$stable | (i62 & 112), 56);
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            if (!(shareScreenshotBottomSheet5 instanceof ShareScreenshotBottomSheet5.Drawable)) {
                                composerStartRestartGroup.startReplaceGroup(908430410);
                                composerStartRestartGroup.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composerStartRestartGroup.startReplaceGroup(908439014);
                            ImageKt.Image(PainterResources_androidKt.painterResource(((ShareScreenshotBottomSheet5.Drawable) shareScreenshotBottomSheet5).getDrawable(), composerStartRestartGroup, 0), str, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, i62 & 112, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        composerStartRestartGroup.endNode();
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                        BentoText2.m20747BentoText38GnDrw(str, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), composerStartRestartGroup, (i62 >> 3) & 14, 0, 8190);
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier42;
                        j2 = j32;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.common.screenshot.sharing.ui.ShareScreenshotBottomSheetKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ShareScreenshotBottomSheet6.ShareOptionComposable_FHprtrg$lambda$3(shareScreenshotBottomSheet5, str, str2, modifier3, j2, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            if ((74899 & i3) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                    if (i4 != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                    int i522 = BentoTheme.$stable;
                    Modifier modifierM5144paddingVpY3zN4$default22 = PaddingKt.m5144paddingVpY3zN4$default(modifier2, bentoTheme22.getSpacing(composerStartRestartGroup, i522).m21593getSmallD9Ej5fM(), 0.0f, 2, null);
                    Alignment.Companion companion42 = Alignment.INSTANCE;
                    int i622 = i3;
                    MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), companion42.getCenterHorizontally(), composerStartRestartGroup, 54);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default22);
                    ComposeUiNode.Companion companion222 = ComposeUiNode.INSTANCE;
                    Modifier modifier422 = modifier2;
                    Function0<ComposeUiNode> constructor32 = companion222.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy22, companion222.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap32, companion222.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion222.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting()) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    @JvmName
    public static final ImmutableList<ShareOption> getDefaultShareOptions(Composer composer, int i) {
        composer.startReplaceGroup(1211313341);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1211313341, i, -1, "com.robinhood.shared.common.screenshot.sharing.ui.<get-defaultShareOptions> (ShareScreenshotBottomSheet.kt:321)");
        }
        ShareOption shareOption = new ShareOption(new ShareScreenshotBottomSheet5.Drawable(C37479R.drawable.google_messages_logo_square), StringResources_androidKt.stringResource(C37479R.string.share_screenshot_sheet_messages_option, composer, 0), Color2.Color(4279923688L), ShareScreenshotBottomSheet2.Messaging.INSTANCE, "share_via_messages", null);
        ShareScreenshotBottomSheet5.BentoIcon bentoIcon = new ShareScreenshotBottomSheet5.BentoIcon(new BentoIcon4.Size24(ServerToBentoAssetMapper2.COPY_24));
        String strStringResource = StringResources_androidKt.stringResource(C37479R.string.share_screenshot_sheet_copy_option, composer, 0);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        ShareOption shareOption2 = new ShareOption(bentoIcon, strStringResource, bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), ShareScreenshotBottomSheet2.Copy.INSTANCE, "share_via_copy", null);
        composer.startReplaceGroup(136021916);
        ShareOption shareOption3 = ShareScreenshot.isAppInstalled((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()), TwitterPackageName) ? new ShareOption(new ShareScreenshotBottomSheet5.Drawable(C37479R.drawable.x_application_logo), StringResources_androidKt.stringResource(C37479R.string.share_screenshot_sheet_x_option, composer, 0), Color2.Color(0), new ShareScreenshotBottomSheet2.ExternalApp(TwitterPackageName), "share_via_x", null) : null;
        composer.endReplaceGroup();
        ImmutableList3 persistentList = extensions2.toPersistentList(CollectionsKt.listOfNotNull((Object[]) new ShareOption[]{shareOption, shareOption2, shareOption3, new ShareOption(new ShareScreenshotBottomSheet5.BentoIcon(new BentoIcon4.Size24(ServerToBentoAssetMapper2.PLUS_24)), StringResources_androidKt.stringResource(C37479R.string.share_screenshot_sheet_more_option, composer, 0), bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), ShareScreenshotBottomSheet2.More.INSTANCE, "share_via_more", null)}));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return persistentList;
    }
}
