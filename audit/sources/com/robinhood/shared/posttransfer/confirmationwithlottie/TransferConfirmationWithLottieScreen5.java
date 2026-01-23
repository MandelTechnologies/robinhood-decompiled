package com.robinhood.shared.posttransfer.confirmationwithlottie;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.wires.p278ui.WiresInvalidAccountContentComposable;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.GenericButton;
import com.robinhood.shared.posttransfer.confirmationwithlottie.TransferConfirmationWithLottieScreen5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TransferConfirmationWithLottieScreen.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001aW\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u0015\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0016²\u0006\f\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u008a\u0084\u0002"}, m3636d2 = {"TransferConfirmationLottieTag", "", "getTransferConfirmationLottieTag$annotations", "()V", "getTransferConfirmationLottieTag", "()Ljava/lang/String;", "TransferConfirmationWithLottieScreen", "", "title", "subtitleMarkdown", "disclosureMarkdown", "lottieUrlLight", "lottieUrlDark", WiresInvalidAccountContentComposable.PrimaryButtonTag, "Lcom/robinhood/models/serverdriven/db/GenericButton;", "onCloseClicked", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/serverdriven/db/GenericButton;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Preview", "(Landroidx/compose/runtime/Composer;I)V", "lib-post-transfer_externalDebug", "composition", "Lcom/airbnb/lottie/LottieComposition;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.posttransfer.confirmationwithlottie.TransferConfirmationWithLottieScreenKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class TransferConfirmationWithLottieScreen5 {
    private static final String TransferConfirmationLottieTag = "TransferConfirmationLottieTag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$2(int i, Composer composer, int i2) {
        Preview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TransferConfirmationWithLottieScreen$lambda$1(String str, String str2, String str3, String str4, String str5, GenericButton genericButton, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TransferConfirmationWithLottieScreen(str, str2, str3, str4, str5, genericButton, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getTransferConfirmationLottieTag$annotations() {
    }

    public static final String getTransferConfirmationLottieTag() {
        return TransferConfirmationLottieTag;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TransferConfirmationWithLottieScreen(final String title, final String subtitleMarkdown, final String str, final String lottieUrlLight, final String lottieUrlDark, final GenericButton primaryButton, final Function0<Unit> onCloseClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        String str2;
        int i4;
        Modifier modifier2;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitleMarkdown, "subtitleMarkdown");
        Intrinsics.checkNotNullParameter(lottieUrlLight, "lottieUrlLight");
        Intrinsics.checkNotNullParameter(lottieUrlDark, "lottieUrlDark");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        Intrinsics.checkNotNullParameter(onCloseClicked, "onCloseClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1714466264);
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
            i3 |= composerStartRestartGroup.changed(subtitleMarkdown) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                str2 = str;
                i3 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(lottieUrlLight) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changed(lottieUrlDark) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(primaryButton) ? 131072 : 65536;
            }
            if ((i2 & 64) == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onCloseClicked) ? 1048576 : 524288;
            }
            i4 = i2 & 128;
            if (i4 != 0) {
                if ((12582912 & i) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 8388608 : 4194304;
                }
                if ((4793491 & i3) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1714466264, i3, -1, "com.robinhood.shared.posttransfer.confirmationwithlottie.TransferConfirmationWithLottieScreen (TransferConfirmationWithLottieScreen.kt:45)");
                    }
                    Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    composer2 = composerStartRestartGroup;
                    modifier2 = modifier3;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifier2, ComposableLambda3.rememberComposableLambda(-1035291236, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.posttransfer.confirmationwithlottie.TransferConfirmationWithLottieScreenKt.TransferConfirmationWithLottieScreen.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i5) {
                            if ((i5 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1035291236, i5, -1, "com.robinhood.shared.posttransfer.confirmationwithlottie.TransferConfirmationWithLottieScreen.<anonymous> (TransferConfirmationWithLottieScreen.kt:56)");
                            }
                            Function2<Composer, Integer, Unit> lambda$1390164169$lib_post_transfer_externalDebug = TransferConfirmationWithLottieScreen.INSTANCE.getLambda$1390164169$lib_post_transfer_externalDebug();
                            final Function0<Unit> function0 = onCloseClicked;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$1390164169$lib_post_transfer_externalDebug, null, ComposableLambda3.rememberComposableLambda(1111002397, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.posttransfer.confirmationwithlottie.TransferConfirmationWithLottieScreenKt.TransferConfirmationWithLottieScreen.1.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                    invoke(bentoAppBarScope, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i6) {
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i6 & 6) == 0) {
                                        i6 |= (i6 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                    }
                                    if ((i6 & 19) == 18 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1111002397, i6, -1, "com.robinhood.shared.posttransfer.confirmationwithlottie.TransferConfirmationWithLottieScreen.<anonymous>.<anonymous> (TransferConfirmationWithLottieScreen.kt:59)");
                                    }
                                    BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i6 << 12) & 57344), 7);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-2069461849, true, new C395302(title, subtitleMarkdown, str2, primaryButton, navigator, context, rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(!BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay() ? lottieUrlLight : lottieUrlDark)), null, null, null, null, null, composerStartRestartGroup, 0, 62)), composerStartRestartGroup, 54), composer2, ((i3 >> 21) & 14) | 805306416, 508);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                }
                final Modifier modifier4 = modifier2;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.posttransfer.confirmationwithlottie.TransferConfirmationWithLottieScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TransferConfirmationWithLottieScreen5.TransferConfirmationWithLottieScreen$lambda$1(title, subtitleMarkdown, str, lottieUrlLight, lottieUrlDark, primaryButton, onCloseClicked, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 12582912;
            modifier2 = modifier;
            if ((4793491 & i3) != 4793490) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                composer2 = composerStartRestartGroup;
                modifier2 = modifier3;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier2, ComposableLambda3.rememberComposableLambda(-1035291236, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.posttransfer.confirmationwithlottie.TransferConfirmationWithLottieScreenKt.TransferConfirmationWithLottieScreen.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1035291236, i5, -1, "com.robinhood.shared.posttransfer.confirmationwithlottie.TransferConfirmationWithLottieScreen.<anonymous> (TransferConfirmationWithLottieScreen.kt:56)");
                        }
                        Function2<Composer, Integer, Unit> lambda$1390164169$lib_post_transfer_externalDebug = TransferConfirmationWithLottieScreen.INSTANCE.getLambda$1390164169$lib_post_transfer_externalDebug();
                        final Function0<Unit> function0 = onCloseClicked;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$1390164169$lib_post_transfer_externalDebug, null, ComposableLambda3.rememberComposableLambda(1111002397, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.posttransfer.confirmationwithlottie.TransferConfirmationWithLottieScreenKt.TransferConfirmationWithLottieScreen.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                invoke(bentoAppBarScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i6) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i6 & 6) == 0) {
                                    i6 |= (i6 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i6 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1111002397, i6, -1, "com.robinhood.shared.posttransfer.confirmationwithlottie.TransferConfirmationWithLottieScreen.<anonymous>.<anonymous> (TransferConfirmationWithLottieScreen.kt:59)");
                                }
                                BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i6 << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-2069461849, true, new C395302(title, subtitleMarkdown, str2, primaryButton, navigator2, context2, rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(!BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay() ? lottieUrlLight : lottieUrlDark)), null, null, null, null, null, composerStartRestartGroup, 0, 62)), composerStartRestartGroup, 54), composer2, ((i3 >> 21) & 14) | 805306416, 508);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
            final Modifier modifier42 = modifier2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        str2 = str;
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        i4 = i2 & 128;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((4793491 & i3) != 4793490) {
        }
        final Modifier modifier422 = modifier2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: TransferConfirmationWithLottieScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.posttransfer.confirmationwithlottie.TransferConfirmationWithLottieScreenKt$TransferConfirmationWithLottieScreen$2 */
    static final class C395302 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ LottieCompositionResult $composition$delegate;
        final /* synthetic */ Context $context;
        final /* synthetic */ String $disclosureMarkdown;
        final /* synthetic */ Navigator $navigator;
        final /* synthetic */ GenericButton $primaryButton;
        final /* synthetic */ String $subtitleMarkdown;
        final /* synthetic */ String $title;

        C395302(String str, String str2, String str3, GenericButton genericButton, Navigator navigator, Context context, LottieCompositionResult lottieCompositionResult) {
            this.$title = str;
            this.$subtitleMarkdown = str2;
            this.$disclosureMarkdown = str3;
            this.$primaryButton = genericButton;
            this.$navigator = navigator;
            this.$context = context;
            this.$composition$delegate = lottieCompositionResult;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r15v10 */
        /* JADX WARN: Type inference failed for: r15v6 */
        /* JADX WARN: Type inference failed for: r15v7, types: [com.robinhood.compose.bento.component.BentoButtons$Icon$Position, kotlin.jvm.internal.DefaultConstructorMarker] */
        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            int i2;
            ?? r15;
            int i3;
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(paddingValues) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2069461849, i2, -1, "com.robinhood.shared.posttransfer.confirmationwithlottie.TransferConfirmationWithLottieScreen.<anonymous> (TransferConfirmationWithLottieScreen.kt:66)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierPadding = PaddingKt.padding(companion, paddingValues);
            String str = this.$title;
            String str2 = this.$subtitleMarkdown;
            String str3 = this.$disclosureMarkdown;
            final GenericButton genericButton = this.$primaryButton;
            final Navigator navigator = this.$navigator;
            final Context context = this.$context;
            LottieCompositionResult lottieCompositionResult = this.$composition$delegate;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPadding);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier modifierTestTag = TestTag3.testTag(companion, TransferConfirmationWithLottieScreen5.getTransferConfirmationLottieTag());
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            LottieAnimation2.LottieAnimation(TransferConfirmationWithLottieScreen5.TransferConfirmationWithLottieScreen$lambda$0(lottieCompositionResult), Column5.weight$default(column6, com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(modifierTestTag, bentoTheme.getSpacing(composer, i4).m21590getDefaultD9Ej5fM()), 1.0f, false, 2, null), false, false, null, 0.0f, Integer.MAX_VALUE, false, false, false, null, false, false, null, null, ContentScale.INSTANCE.getFillWidth(), false, false, null, false, null, composer, 1572864, 196608, 0, 2064316);
            BentoText2.m20747BentoText38GnDrw(str, com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i4).m21593getSmallD9Ej5fM(), 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i4).getDisplayMartinaLarge(), composer, 0, 0, 8188);
            Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i4).m21593getSmallD9Ej5fM(), 1, null);
            BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i4).m21425getFg0d7_KjU();
            TextStyle textM = bentoTheme.getTypography(composer, i4).getTextM();
            int i5 = BentoMarkdownText.$stable;
            MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I = bentoMarkdownText.m21100withTextStylesYhh7B2I(textM, 0, jM21425getFg0d7_KjU, 0L, false, composer, i5 << 15, 26);
            int i6 = MarkdownStyle.$stable;
            Composer composer2 = composer;
            BentoMarkdownText2.BentoMarkdownText(str2, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, markdownStyleM21100withTextStylesYhh7B2I, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, i6 << 6, 24);
            Spacer2.Spacer(Column5.weight$default(column6, companion, 0.35f, false, 2, null), composer2, 0);
            composer2.startReplaceGroup(-1693810291);
            if (str3 != null) {
                i3 = 2;
                Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default2 = com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer2, i4).m21590getDefaultD9Ej5fM(), 0.0f, 2, null);
                long jM21426getFg20d7_KjU = bentoTheme.getColors(composer2, i4).m21426getFg20d7_KjU();
                r15 = 0;
                composer2 = composer;
                BentoMarkdownText2.BentoMarkdownText(str3, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default2, bentoMarkdownText.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer2, i4).getTextS(), 0, jM21426getFg20d7_KjU, bentoTheme.getColors(composer2, i4).m21426getFg20d7_KjU(), false, composer, i5 << 15, 18), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, i6 << 6, 24);
            } else {
                r15 = 0;
                i3 = 2;
            }
            composer2.endReplaceGroup();
            Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion, bentoTheme.getSpacing(composer2, i4).m21590getDefaultD9Ej5fM());
            String title = genericButton.getTitle();
            boolean zIsEnabled = genericButton.isEnabled();
            ServerToBentoAssetMapper2 icon = genericButton.getIcon();
            BentoButtons.Icon.Size16 size16 = icon != null ? new BentoButtons.Icon.Size16(icon, r15, i3, r15) : r15;
            composer2.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composer2.changedInstance(genericButton) | composer2.changedInstance(navigator) | composer2.changedInstance(context);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.posttransfer.confirmationwithlottie.TransferConfirmationWithLottieScreenKt$TransferConfirmationWithLottieScreen$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TransferConfirmationWithLottieScreen5.C395302.invoke$lambda$4$lambda$3$lambda$2(genericButton, navigator, context);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, title, modifierM21618defaultFillMaxWidthPadding3ABfNKs, size16, null, zIsEnabled, false, null, null, null, null, false, null, composer2, BentoButtons.Icon.Size16.$stable << 9, 0, 8144);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3$lambda$2(GenericButton genericButton, Navigator navigator, Context context) {
            GenericAction typedAction = genericButton.getTypedAction();
            if (typedAction != null && (typedAction instanceof GenericAction.DeeplinkAction)) {
                Navigator.DefaultImpls.handleDeepLink$default(navigator, context, ((GenericAction.DeeplinkAction) typedAction).getUri(), null, null, false, null, 60, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LottieComposition TransferConfirmationWithLottieScreen$lambda$0(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    private static final void Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1066990154);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1066990154, i, -1, "com.robinhood.shared.posttransfer.confirmationwithlottie.Preview (TransferConfirmationWithLottieScreen.kt:133)");
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, Boolean.TRUE, null, null, TransferConfirmationWithLottieScreen.INSTANCE.getLambda$1362016258$lib_post_transfer_externalDebug(), composerStartRestartGroup, 100859910, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.posttransfer.confirmationwithlottie.TransferConfirmationWithLottieScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TransferConfirmationWithLottieScreen5.Preview$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
