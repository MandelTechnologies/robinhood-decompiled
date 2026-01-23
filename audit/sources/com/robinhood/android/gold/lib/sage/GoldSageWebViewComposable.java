package com.robinhood.android.gold.lib.sage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.gold.lib.sage.GoldSageWebViewComposable;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: GoldSageWebViewComposable.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a©\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072#\u0010\n\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00010\u000b2#\u0010\u0010\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"GoldSageWebViewComposable", "", "callbacks", "Lcom/robinhood/android/gold/lib/sage/GoldSageWebViewCallbacks;", "url", "", "allowedUrls", "Lkotlinx/collections/immutable/ImmutableList;", "allowedUrlsToOpenExternally", "allowedUrlsToOpenInApp", "openUrlExternally", "Lkotlin/Function1;", "Landroid/net/Uri;", "Lkotlin/ParameterName;", "name", "uri", "openUrlInApp", "onOpenDisallowedUrl", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/gold/lib/sage/GoldSageWebViewCallbacks;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-gold-sage_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.lib.sage.GoldSageWebViewComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldSageWebViewComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldSageWebViewComposable$lambda$0(GoldSageWebViewCallbacks goldSageWebViewCallbacks, String str, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, Function1 function1, Function1 function12, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GoldSageWebViewComposable(goldSageWebViewCallbacks, str, immutableList, immutableList2, immutableList3, function1, function12, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    @SuppressLint({"SetJavaScriptEnabled"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoldSageWebViewComposable(final GoldSageWebViewCallbacks callbacks, final String url, final ImmutableList<String> allowedUrls, final ImmutableList<String> allowedUrlsToOpenExternally, final ImmutableList<String> allowedUrlsToOpenInApp, final Function1<? super Uri, Unit> openUrlExternally, final Function1<? super Uri, Unit> openUrlInApp, final Function0<Unit> onOpenDisallowedUrl, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(allowedUrls, "allowedUrls");
        Intrinsics.checkNotNullParameter(allowedUrlsToOpenExternally, "allowedUrlsToOpenExternally");
        Intrinsics.checkNotNullParameter(allowedUrlsToOpenInApp, "allowedUrlsToOpenInApp");
        Intrinsics.checkNotNullParameter(openUrlExternally, "openUrlExternally");
        Intrinsics.checkNotNullParameter(openUrlInApp, "openUrlInApp");
        Intrinsics.checkNotNullParameter(onOpenDisallowedUrl, "onOpenDisallowedUrl");
        Composer composerStartRestartGroup = composer.startRestartGroup(520056394);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(url) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(allowedUrls) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(allowedUrlsToOpenExternally) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(allowedUrlsToOpenInApp) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(openUrlExternally) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(openUrlInApp) ? 1048576 : 524288;
        }
        if ((i2 & 128) != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onOpenDisallowedUrl) ? 8388608 : 4194304;
        }
        int i4 = i2 & 256;
        if (i4 == 0) {
            if ((100663296 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 67108864 : 33554432;
            }
            if ((38347923 & i3) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(520056394, i3, -1, "com.robinhood.android.gold.lib.sage.GoldSageWebViewComposable (GoldSageWebViewComposable.kt:30)");
                }
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
                BentoTheme2.BentoTheme(Boolean.TRUE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-195691006, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.lib.sage.GoldSageWebViewComposableKt.GoldSageWebViewComposable.1

                    /* compiled from: GoldSageWebViewComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.gold.lib.sage.GoldSageWebViewComposableKt$GoldSageWebViewComposable$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ ImmutableList<String> $allowedUrls;
                        final /* synthetic */ ImmutableList<String> $allowedUrlsToOpenExternally;
                        final /* synthetic */ ImmutableList<String> $allowedUrlsToOpenInApp;
                        final /* synthetic */ GoldSageWebViewCallbacks $callbacks;
                        final /* synthetic */ Modifier $modifier;
                        final /* synthetic */ Function0<Unit> $onOpenDisallowedUrl;
                        final /* synthetic */ Function1<Uri, Unit> $openUrlExternally;
                        final /* synthetic */ Function1<Uri, Unit> $openUrlInApp;
                        final /* synthetic */ String $url;

                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass1(ImmutableList<String> immutableList, Function1<? super Uri, Unit> function1, ImmutableList<String> immutableList2, Function1<? super Uri, Unit> function12, ImmutableList<String> immutableList3, Function0<Unit> function0, GoldSageWebViewCallbacks goldSageWebViewCallbacks, String str, Modifier modifier) {
                            this.$allowedUrlsToOpenExternally = immutableList;
                            this.$openUrlExternally = function1;
                            this.$allowedUrlsToOpenInApp = immutableList2;
                            this.$openUrlInApp = function12;
                            this.$allowedUrls = immutableList3;
                            this.$onOpenDisallowedUrl = function0;
                            this.$callbacks = goldSageWebViewCallbacks;
                            this.$url = str;
                            this.$modifier = modifier;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer, int i) {
                            if ((i & 3) == 2 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(288555469, i, -1, "com.robinhood.android.gold.lib.sage.GoldSageWebViewComposable.<anonymous>.<anonymous> (GoldSageWebViewComposable.kt:33)");
                            }
                            composer.startReplaceGroup(-1224400529);
                            boolean zChanged = composer.changed(this.$allowedUrlsToOpenExternally) | composer.changed(this.$openUrlExternally) | composer.changed(this.$allowedUrlsToOpenInApp) | composer.changed(this.$openUrlInApp) | composer.changed(this.$allowedUrls) | composer.changed(this.$onOpenDisallowedUrl) | composer.changedInstance(this.$callbacks) | composer.changed(this.$url);
                            final GoldSageWebViewCallbacks goldSageWebViewCallbacks = this.$callbacks;
                            final String str = this.$url;
                            final ImmutableList<String> immutableList = this.$allowedUrlsToOpenExternally;
                            final Function1<Uri, Unit> function1 = this.$openUrlExternally;
                            final ImmutableList<String> immutableList2 = this.$allowedUrlsToOpenInApp;
                            final Function1<Uri, Unit> function12 = this.$openUrlInApp;
                            final ImmutableList<String> immutableList3 = this.$allowedUrls;
                            final Function0<Unit> function0 = this.$onOpenDisallowedUrl;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.gold.lib.sage.GoldSageWebViewComposableKt$GoldSageWebViewComposable$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return GoldSageWebViewComposable.C178401.AnonymousClass1.invoke$lambda$3$lambda$2(goldSageWebViewCallbacks, str, immutableList, function1, immutableList2, function12, immutableList3, function0, (Context) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            Function1 function13 = (Function1) objRememberedValue;
                            composer.endReplaceGroup();
                            Modifier modifier = this.$modifier;
                            composer.startReplaceGroup(5004770);
                            boolean zChanged2 = composer.changed(this.$url);
                            final String str2 = this.$url;
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.gold.lib.sage.GoldSageWebViewComposableKt$GoldSageWebViewComposable$1$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return GoldSageWebViewComposable.C178401.AnonymousClass1.invoke$lambda$5$lambda$4(str2, (WebView) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            composer.endReplaceGroup();
                            AndroidView_androidKt.AndroidView(function13, modifier, (Function1) objRememberedValue2, composer, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final WebView invoke$lambda$3$lambda$2(final GoldSageWebViewCallbacks goldSageWebViewCallbacks, String str, final ImmutableList immutableList, final Function1 function1, final ImmutableList immutableList2, final Function1 function12, final ImmutableList immutableList3, final Function0 function0, Context it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            WebView webView = new WebView(it);
                            webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                            webView.setWebChromeClient(new WebChromeClient());
                            webView.setWebViewClient(new WebViewClient() { // from class: com.robinhood.android.gold.lib.sage.GoldSageWebViewComposableKt$GoldSageWebViewComposable$1$1$1$1$1$1
                                @Override // android.webkit.WebViewClient
                                public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                                    Uri url = request != null ? request.getUrl() : null;
                                    String str2 = (url != null ? url.getHost() : null) + (url != null ? url.getPath() : null);
                                    if (immutableList.contains(str2)) {
                                        function1.invoke(url);
                                        return true;
                                    }
                                    if (immutableList2.contains(str2)) {
                                        function12.invoke(url);
                                        return true;
                                    }
                                    if (immutableList3.contains(str2)) {
                                        return false;
                                    }
                                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("GoldSageWebViewComposable: Disallowed URL: " + (url != null ? url.getHost() : null) + (url != null ? url.getPath() : null)), false, null, 6, null);
                                    function0.invoke();
                                    return true;
                                }

                                @Override // android.webkit.WebViewClient
                                public void onPageFinished(WebView view, String url) {
                                    goldSageWebViewCallbacks.onPageFinished(view, url);
                                    super.onPageFinished(view, url);
                                }
                            });
                            webView.addJavascriptInterface(new GoldSageWebViewCallbacks2(goldSageWebViewCallbacks), "android");
                            WebSettings settings = webView.getSettings();
                            settings.setLoadsImagesAutomatically(true);
                            settings.setJavaScriptEnabled(true);
                            settings.setDomStorageEnabled(true);
                            webView.setScrollBarStyle(0);
                            webView.loadUrl(str);
                            return webView;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$5$lambda$4(String str, WebView it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            it.loadUrl(str);
                            return Unit.INSTANCE;
                        }
                    }

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
                            ComposerKt.traceEventStart(-195691006, i5, -1, "com.robinhood.android.gold.lib.sage.GoldSageWebViewComposable.<anonymous> (GoldSageWebViewComposable.kt:32)");
                        }
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(288555469, true, new AnonymousClass1(allowedUrlsToOpenExternally, openUrlExternally, allowedUrlsToOpenInApp, openUrlInApp, allowedUrls, onOpenDisallowedUrl, callbacks, url, modifier3), composer3, 54), composer3, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.lib.sage.GoldSageWebViewComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GoldSageWebViewComposable.GoldSageWebViewComposable$lambda$0(callbacks, url, allowedUrls, allowedUrlsToOpenExternally, allowedUrlsToOpenInApp, openUrlExternally, openUrlInApp, onOpenDisallowedUrl, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 100663296;
        modifier2 = modifier;
        if ((38347923 & i3) == 38347922) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier2;
            composer2 = composerStartRestartGroup;
            BentoTheme2.BentoTheme(Boolean.TRUE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-195691006, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.lib.sage.GoldSageWebViewComposableKt.GoldSageWebViewComposable.1

                /* compiled from: GoldSageWebViewComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.gold.lib.sage.GoldSageWebViewComposableKt$GoldSageWebViewComposable$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ ImmutableList<String> $allowedUrls;
                    final /* synthetic */ ImmutableList<String> $allowedUrlsToOpenExternally;
                    final /* synthetic */ ImmutableList<String> $allowedUrlsToOpenInApp;
                    final /* synthetic */ GoldSageWebViewCallbacks $callbacks;
                    final /* synthetic */ Modifier $modifier;
                    final /* synthetic */ Function0<Unit> $onOpenDisallowedUrl;
                    final /* synthetic */ Function1<Uri, Unit> $openUrlExternally;
                    final /* synthetic */ Function1<Uri, Unit> $openUrlInApp;
                    final /* synthetic */ String $url;

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(ImmutableList<String> immutableList, Function1<? super Uri, Unit> function1, ImmutableList<String> immutableList2, Function1<? super Uri, Unit> function12, ImmutableList<String> immutableList3, Function0<Unit> function0, GoldSageWebViewCallbacks goldSageWebViewCallbacks, String str, Modifier modifier) {
                        this.$allowedUrlsToOpenExternally = immutableList;
                        this.$openUrlExternally = function1;
                        this.$allowedUrlsToOpenInApp = immutableList2;
                        this.$openUrlInApp = function12;
                        this.$allowedUrls = immutableList3;
                        this.$onOpenDisallowedUrl = function0;
                        this.$callbacks = goldSageWebViewCallbacks;
                        this.$url = str;
                        this.$modifier = modifier;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(288555469, i, -1, "com.robinhood.android.gold.lib.sage.GoldSageWebViewComposable.<anonymous>.<anonymous> (GoldSageWebViewComposable.kt:33)");
                        }
                        composer.startReplaceGroup(-1224400529);
                        boolean zChanged = composer.changed(this.$allowedUrlsToOpenExternally) | composer.changed(this.$openUrlExternally) | composer.changed(this.$allowedUrlsToOpenInApp) | composer.changed(this.$openUrlInApp) | composer.changed(this.$allowedUrls) | composer.changed(this.$onOpenDisallowedUrl) | composer.changedInstance(this.$callbacks) | composer.changed(this.$url);
                        final GoldSageWebViewCallbacks goldSageWebViewCallbacks = this.$callbacks;
                        final String str = this.$url;
                        final ImmutableList immutableList = this.$allowedUrlsToOpenExternally;
                        final Function1 function1 = this.$openUrlExternally;
                        final ImmutableList immutableList2 = this.$allowedUrlsToOpenInApp;
                        final Function1 function12 = this.$openUrlInApp;
                        final ImmutableList immutableList3 = this.$allowedUrls;
                        final Function0 function0 = this.$onOpenDisallowedUrl;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.gold.lib.sage.GoldSageWebViewComposableKt$GoldSageWebViewComposable$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return GoldSageWebViewComposable.C178401.AnonymousClass1.invoke$lambda$3$lambda$2(goldSageWebViewCallbacks, str, immutableList, function1, immutableList2, function12, immutableList3, function0, (Context) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        Function1 function13 = (Function1) objRememberedValue;
                        composer.endReplaceGroup();
                        Modifier modifier = this.$modifier;
                        composer.startReplaceGroup(5004770);
                        boolean zChanged2 = composer.changed(this.$url);
                        final String str2 = this.$url;
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.gold.lib.sage.GoldSageWebViewComposableKt$GoldSageWebViewComposable$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return GoldSageWebViewComposable.C178401.AnonymousClass1.invoke$lambda$5$lambda$4(str2, (WebView) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        AndroidView_androidKt.AndroidView(function13, modifier, (Function1) objRememberedValue2, composer, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final WebView invoke$lambda$3$lambda$2(final GoldSageWebViewCallbacks goldSageWebViewCallbacks, String str, final ImmutableList<String> immutableList, final Function1<? super Uri, Unit> function1, final ImmutableList<String> immutableList2, final Function1<? super Uri, Unit> function12, final ImmutableList<String> immutableList3, final Function0<Unit> function0, Context it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        WebView webView = new WebView(it);
                        webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        webView.setWebChromeClient(new WebChromeClient());
                        webView.setWebViewClient(new WebViewClient() { // from class: com.robinhood.android.gold.lib.sage.GoldSageWebViewComposableKt$GoldSageWebViewComposable$1$1$1$1$1$1
                            @Override // android.webkit.WebViewClient
                            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                                Uri url = request != null ? request.getUrl() : null;
                                String str2 = (url != null ? url.getHost() : null) + (url != null ? url.getPath() : null);
                                if (immutableList.contains(str2)) {
                                    function1.invoke(url);
                                    return true;
                                }
                                if (immutableList2.contains(str2)) {
                                    function12.invoke(url);
                                    return true;
                                }
                                if (immutableList3.contains(str2)) {
                                    return false;
                                }
                                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("GoldSageWebViewComposable: Disallowed URL: " + (url != null ? url.getHost() : null) + (url != null ? url.getPath() : null)), false, null, 6, null);
                                function0.invoke();
                                return true;
                            }

                            @Override // android.webkit.WebViewClient
                            public void onPageFinished(WebView view, String url) {
                                goldSageWebViewCallbacks.onPageFinished(view, url);
                                super.onPageFinished(view, url);
                            }
                        });
                        webView.addJavascriptInterface(new GoldSageWebViewCallbacks2(goldSageWebViewCallbacks), "android");
                        WebSettings settings = webView.getSettings();
                        settings.setLoadsImagesAutomatically(true);
                        settings.setJavaScriptEnabled(true);
                        settings.setDomStorageEnabled(true);
                        webView.setScrollBarStyle(0);
                        webView.loadUrl(str);
                        return webView;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$5$lambda$4(String str, WebView it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        it.loadUrl(str);
                        return Unit.INSTANCE;
                    }
                }

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
                        ComposerKt.traceEventStart(-195691006, i5, -1, "com.robinhood.android.gold.lib.sage.GoldSageWebViewComposable.<anonymous> (GoldSageWebViewComposable.kt:32)");
                    }
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(288555469, true, new AnonymousClass1(allowedUrlsToOpenExternally, openUrlExternally, allowedUrlsToOpenInApp, openUrlInApp, allowedUrls, onOpenDisallowedUrl, callbacks, url, modifier3), composer3, 54), composer3, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
