package com.robinhood.compose.bento.component.alerts;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.window.AndroidDialog_androidKt;
import androidx.compose.p011ui.window.DialogProperties;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.wires.p278ui.WiresInvalidAccountContentComposable;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme2;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoAlertDialog.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aw\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0012H\u0007¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0017\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0015¨\u0006\u0018"}, m3636d2 = {"BentoAlertDialog", "", "title", "", CarResultComposable2.BODY, "Lcom/robinhood/compose/bento/component/alerts/BentoAlertDialogs$Body;", WiresInvalidAccountContentComposable.PrimaryButtonTag, "Lcom/robinhood/compose/bento/component/alerts/BentoAlertButton;", "modifier", "Landroidx/compose/ui/Modifier;", WiresInvalidAccountContentComposable.SecondaryButtonTag, "pictogram", "Lcom/robinhood/android/libdesignsystem/serverui/PictogramAsset;", "allowThemeOverride", "", "onClickUri", "Lkotlin/Function1;", "onDismissRequest", "Lkotlin/Function0;", "(Ljava/lang/String;Lcom/robinhood/compose/bento/component/alerts/BentoAlertDialogs$Body;Lcom/robinhood/compose/bento/component/alerts/BentoAlertButton;Landroidx/compose/ui/Modifier;Lcom/robinhood/compose/bento/component/alerts/BentoAlertButton;Lcom/robinhood/android/libdesignsystem/serverui/PictogramAsset;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "BentoAlertDialogPreview", "(Landroidx/compose/runtime/Composer;I)V", "BentoAlertDialogMarkdownPreview", "BentoAlertDialogAnnotatedStringPreview", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.component.alerts.BentoAlertDialogKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoAlertDialog {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoAlertDialog$lambda$0(String str, BentoAlertDialog2.Body body, BentoAlertButton bentoAlertButton, Modifier modifier, BentoAlertButton bentoAlertButton2, ServerToBentoAssetMapper3 serverToBentoAssetMapper3, boolean z, Function1 function1, Function0 function0, int i, int i2, Composer composer, int i3) {
        BentoAlertDialog(str, body, bentoAlertButton, modifier, bentoAlertButton2, serverToBentoAssetMapper3, z, function1, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoAlertDialogAnnotatedStringPreview$lambda$3(int i, Composer composer, int i2) {
        BentoAlertDialogAnnotatedStringPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoAlertDialogMarkdownPreview$lambda$2(int i, Composer composer, int i2) {
        BentoAlertDialogMarkdownPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoAlertDialogPreview$lambda$1(int i, Composer composer, int i2) {
        BentoAlertDialogPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00aa A[PHI: r15
      0x00aa: PHI (r15v10 int) = (r15v0 int), (r15v5 int), (r15v6 int) binds: [B:56:0x00a8, B:66:0x00c0, B:65:0x00bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoAlertDialog(final String title, final BentoAlertDialog2.Body body, final BentoAlertButton primaryButton, Modifier modifier, BentoAlertButton bentoAlertButton, ServerToBentoAssetMapper3 serverToBentoAssetMapper3, boolean z, Function1<? super String, Unit> function1, final Function0<Unit> onDismissRequest, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        BentoAlertButton bentoAlertButton2;
        int i5;
        int i6;
        int i7;
        int i8;
        Composer composer2;
        final Modifier modifier3;
        final ServerToBentoAssetMapper3 serverToBentoAssetMapper32;
        final BentoAlertButton bentoAlertButton3;
        final boolean z2;
        final Function1<? super String, Unit> function12;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Composer composerStartRestartGroup = composer.startRestartGroup(-952072926);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(title) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(body) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(primaryButton) ? 256 : 128;
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    bentoAlertButton2 = bentoAlertButton;
                    i3 |= composerStartRestartGroup.changed(bentoAlertButton2) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                int i10 = 196608;
                if (i5 != 0) {
                    i3 |= i10;
                } else if ((196608 & i) == 0) {
                    i10 = composerStartRestartGroup.changed(serverToBentoAssetMapper3 == null ? -1 : serverToBentoAssetMapper3.ordinal()) ? 131072 : 65536;
                    i3 |= i10;
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= composerStartRestartGroup.changed(z) ? 1048576 : 524288;
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function1) ? 8388608 : 4194304;
                }
                if ((i2 & 256) != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(onDismissRequest) ? 67108864 : 33554432;
                }
                i8 = i3;
                if ((38347923 & i8) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                    final Modifier modifier4 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                    final BentoAlertButton bentoAlertButton4 = i4 == 0 ? null : bentoAlertButton2;
                    ServerToBentoAssetMapper3 serverToBentoAssetMapper33 = i5 == 0 ? null : serverToBentoAssetMapper3;
                    final boolean z3 = i6 == 0 ? false : z;
                    final Function1<? super String, Unit> function13 = i7 == 0 ? null : function1;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-952072926, i8, -1, "com.robinhood.compose.bento.component.alerts.BentoAlertDialog (BentoAlertDialog.kt:46)");
                    }
                    DialogProperties dialogProperties = new DialogProperties(false, false, false, 3, (DefaultConstructorMarker) null);
                    final ServerToBentoAssetMapper3 serverToBentoAssetMapper34 = serverToBentoAssetMapper33;
                    Function2<Composer, Integer, Unit> function2 = new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.alerts.BentoAlertDialogKt.BentoAlertDialog.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i11) {
                            if ((i11 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-15508295, i11, -1, "com.robinhood.compose.bento.component.alerts.BentoAlertDialog.<anonymous> (BentoAlertDialog.kt:51)");
                            }
                            Modifier modifier5 = modifier4;
                            BentoAlertDialog2 bentoAlertDialog2 = BentoAlertDialog2.INSTANCE;
                            Modifier modifierClip = Clip.clip(PaddingKt.m5144paddingVpY3zN4$default(modifier5, bentoAlertDialog2.m20851getHorizontalPaddingD9Ej5fM(), 0.0f, 2, null), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoAlertDialog2.m20850getCornerRadiusD9Ej5fM()));
                            ServerToBentoAssetMapper3 serverToBentoAssetMapper35 = serverToBentoAssetMapper34;
                            String str = title;
                            List listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new BentoAlertButton[]{primaryButton, bentoAlertButton4});
                            boolean z4 = z3;
                            final BentoAlertDialog2.Body body2 = body;
                            final Function1<String, Unit> function14 = function13;
                            BentoAlerts2.AlertContent(modifierClip, serverToBentoAssetMapper35, str, null, listListOfNotNull, z4, ComposableLambda3.rememberComposableLambda(2117762121, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.alerts.BentoAlertDialogKt.BentoAlertDialog.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i12) {
                                    if ((i12 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(2117762121, i12, -1, "com.robinhood.compose.bento.component.alerts.BentoAlertDialog.<anonymous>.<anonymous> (BentoAlertDialog.kt:60)");
                                    }
                                    BentoAlertDialog2.Body body3 = body2;
                                    if (body3 instanceof BentoAlertDialog2.Body.MarkdownText) {
                                        composer4.startReplaceGroup(-645096388);
                                        BentoMarkdownText2.BentoMarkdownText(((BentoAlertDialog2.Body.MarkdownText) body2).getMarkdownText(), (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(null, TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0L, 0L, false, composer4, 196608, 29), (Function0<Unit>) null, function14, composer4, MarkdownStyle.$stable << 6, 10);
                                        composer4.endReplaceGroup();
                                    } else if (body3 instanceof BentoAlertDialog2.Body.Text) {
                                        composer4.startReplaceGroup(-645086423);
                                        BentoText2.m20747BentoText38GnDrw(((BentoAlertDialog2.Body.Text) body2).getText(), null, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composer4, 0, 0, 16318);
                                        composer4.endReplaceGroup();
                                    } else {
                                        if (!(body3 instanceof BentoAlertDialog2.Body.Annotated)) {
                                            composer4.startReplaceGroup(-645098750);
                                            composer4.endReplaceGroup();
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        composer4.startReplaceGroup(-645079792);
                                        BentoText2.m20748BentoTextQnj7Zds(((BentoAlertDialog2.Body.Annotated) body2).getAnnotatedString(), null, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, ((BentoAlertDialog2.Body.Annotated) body2).getInlineContent(), null, null, composer4, 0, 0, 14270);
                                        composer4.endReplaceGroup();
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 1572864, 8);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    };
                    boolean z4 = z3;
                    Function1<? super String, Unit> function14 = function13;
                    Modifier modifier5 = modifier4;
                    BentoAlertButton bentoAlertButton5 = bentoAlertButton4;
                    composer2 = composerStartRestartGroup;
                    AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties, ComposableLambda3.rememberComposableLambda(-15508295, true, function2, composerStartRestartGroup, 54), composer2, ((i8 >> 24) & 14) | 432, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                    serverToBentoAssetMapper32 = serverToBentoAssetMapper34;
                    bentoAlertButton3 = bentoAlertButton5;
                    z2 = z4;
                    function12 = function14;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    serverToBentoAssetMapper32 = serverToBentoAssetMapper3;
                    z2 = z;
                    modifier3 = modifier2;
                    bentoAlertButton3 = bentoAlertButton2;
                    composer2 = composerStartRestartGroup;
                    function12 = function1;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.alerts.BentoAlertDialogKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return BentoAlertDialog.BentoAlertDialog$lambda$0(title, body, primaryButton, modifier3, bentoAlertButton3, serverToBentoAssetMapper32, z2, function12, onDismissRequest, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            bentoAlertButton2 = bentoAlertButton;
            i5 = i2 & 32;
            int i102 = 196608;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            if ((i2 & 256) != 0) {
            }
            i8 = i3;
            if ((38347923 & i8) != 38347922) {
                if (i9 == 0) {
                }
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
                DialogProperties dialogProperties2 = new DialogProperties(false, false, false, 3, (DefaultConstructorMarker) null);
                final ServerToBentoAssetMapper3 serverToBentoAssetMapper342 = serverToBentoAssetMapper33;
                Function2<Composer, Integer, Unit> function22 = new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.alerts.BentoAlertDialogKt.BentoAlertDialog.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i11) {
                        if ((i11 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-15508295, i11, -1, "com.robinhood.compose.bento.component.alerts.BentoAlertDialog.<anonymous> (BentoAlertDialog.kt:51)");
                        }
                        Modifier modifier52 = modifier4;
                        BentoAlertDialog2 bentoAlertDialog2 = BentoAlertDialog2.INSTANCE;
                        Modifier modifierClip = Clip.clip(PaddingKt.m5144paddingVpY3zN4$default(modifier52, bentoAlertDialog2.m20851getHorizontalPaddingD9Ej5fM(), 0.0f, 2, null), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoAlertDialog2.m20850getCornerRadiusD9Ej5fM()));
                        ServerToBentoAssetMapper3 serverToBentoAssetMapper35 = serverToBentoAssetMapper342;
                        String str = title;
                        List listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new BentoAlertButton[]{primaryButton, bentoAlertButton4});
                        boolean z42 = z3;
                        final BentoAlertDialog2.Body body2 = body;
                        final Function1<? super String, Unit> function142 = function13;
                        BentoAlerts2.AlertContent(modifierClip, serverToBentoAssetMapper35, str, null, listListOfNotNull, z42, ComposableLambda3.rememberComposableLambda(2117762121, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.alerts.BentoAlertDialogKt.BentoAlertDialog.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i12) {
                                if ((i12 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2117762121, i12, -1, "com.robinhood.compose.bento.component.alerts.BentoAlertDialog.<anonymous>.<anonymous> (BentoAlertDialog.kt:60)");
                                }
                                BentoAlertDialog2.Body body3 = body2;
                                if (body3 instanceof BentoAlertDialog2.Body.MarkdownText) {
                                    composer4.startReplaceGroup(-645096388);
                                    BentoMarkdownText2.BentoMarkdownText(((BentoAlertDialog2.Body.MarkdownText) body2).getMarkdownText(), (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(null, TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0L, 0L, false, composer4, 196608, 29), (Function0<Unit>) null, function142, composer4, MarkdownStyle.$stable << 6, 10);
                                    composer4.endReplaceGroup();
                                } else if (body3 instanceof BentoAlertDialog2.Body.Text) {
                                    composer4.startReplaceGroup(-645086423);
                                    BentoText2.m20747BentoText38GnDrw(((BentoAlertDialog2.Body.Text) body2).getText(), null, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composer4, 0, 0, 16318);
                                    composer4.endReplaceGroup();
                                } else {
                                    if (!(body3 instanceof BentoAlertDialog2.Body.Annotated)) {
                                        composer4.startReplaceGroup(-645098750);
                                        composer4.endReplaceGroup();
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    composer4.startReplaceGroup(-645079792);
                                    BentoText2.m20748BentoTextQnj7Zds(((BentoAlertDialog2.Body.Annotated) body2).getAnnotatedString(), null, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, ((BentoAlertDialog2.Body.Annotated) body2).getInlineContent(), null, null, composer4, 0, 0, 14270);
                                    composer4.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, 1572864, 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                };
                boolean z42 = z3;
                Function1<? super String, Unit> function142 = function13;
                Modifier modifier52 = modifier4;
                BentoAlertButton bentoAlertButton52 = bentoAlertButton4;
                composer2 = composerStartRestartGroup;
                AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambda3.rememberComposableLambda(-15508295, true, function22, composerStartRestartGroup, 54), composer2, ((i8 >> 24) & 14) | 432, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
                serverToBentoAssetMapper32 = serverToBentoAssetMapper342;
                bentoAlertButton3 = bentoAlertButton52;
                z2 = z42;
                function12 = function142;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        bentoAlertButton2 = bentoAlertButton;
        i5 = i2 & 32;
        int i1022 = 196608;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        if ((i2 & 256) != 0) {
        }
        i8 = i3;
        if ((38347923 & i8) != 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final void BentoAlertDialogPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2010625241);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2010625241, i, -1, "com.robinhood.compose.bento.component.alerts.BentoAlertDialogPreview (BentoAlertDialog.kt:101)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, BentoAlertDialog3.INSTANCE.m20855getLambda$1281328929$lib_compose_bento_externalRelease(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.alerts.BentoAlertDialogKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoAlertDialog.BentoAlertDialogPreview$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void BentoAlertDialogMarkdownPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1779978952);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1779978952, i, -1, "com.robinhood.compose.bento.component.alerts.BentoAlertDialogMarkdownPreview (BentoAlertDialog.kt:124)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, BentoAlertDialog3.INSTANCE.getLambda$1645388528$lib_compose_bento_externalRelease(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.alerts.BentoAlertDialogKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoAlertDialog.BentoAlertDialogMarkdownPreview$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void BentoAlertDialogAnnotatedStringPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-293331082);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-293331082, i, -1, "com.robinhood.compose.bento.component.alerts.BentoAlertDialogAnnotatedStringPreview (BentoAlertDialog.kt:147)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, BentoAlertDialog3.INSTANCE.getLambda$686017214$lib_compose_bento_externalRelease(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.alerts.BentoAlertDialogKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoAlertDialog.BentoAlertDialogAnnotatedStringPreview$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
