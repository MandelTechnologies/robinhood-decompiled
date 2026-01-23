package com.robinhood.android.gold.sage;

import android.net.Uri;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.gold.lib.sage.GoldSageBottomBar3;
import com.robinhood.android.gold.lib.sage.GoldSageWebViewCallbacks;
import com.robinhood.android.gold.lib.sage.GoldSageWebViewComposable;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: GoldSageRateComposable.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aÁ\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\n2#\u0010\r\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00010\u000e2#\u0010\u0013\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00010\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0001¢\u0006\u0002\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"GoldSageRateComposable", "", "ctaText", "", "onClickCta", "Lkotlin/Function0;", "callbacks", "Lcom/robinhood/android/gold/lib/sage/GoldSageWebViewCallbacks;", "url", "allowedUrls", "Lkotlinx/collections/immutable/ImmutableList;", "allowedUrlsToOpenExternally", "allowedUrlsToOpenInApp", "openUrlExternally", "Lkotlin/Function1;", "Landroid/net/Uri;", "Lkotlin/ParameterName;", "name", "uri", "openUrlInApp", "onOpenDisallowedUrl", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/gold/lib/sage/GoldSageWebViewCallbacks;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "feature-gold-sage_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.sage.GoldSageRateComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldSageRateComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldSageRateComposable$lambda$0(String str, Function0 function0, GoldSageWebViewCallbacks goldSageWebViewCallbacks, String str2, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, Function1 function1, Function1 function12, Function0 function02, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        GoldSageRateComposable(str, function0, goldSageWebViewCallbacks, str2, immutableList, immutableList2, immutableList3, function1, function12, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    public static final void GoldSageRateComposable(final String str, final Function0<Unit> onClickCta, final GoldSageWebViewCallbacks callbacks, final String url, final ImmutableList<String> allowedUrls, final ImmutableList<String> allowedUrlsToOpenExternally, final ImmutableList<String> allowedUrlsToOpenInApp, final Function1<? super Uri, Unit> openUrlExternally, final Function1<? super Uri, Unit> openUrlInApp, final Function0<Unit> onOpenDisallowedUrl, Modifier modifier, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        int i6;
        Composer composer2;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(onClickCta, "onClickCta");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(allowedUrls, "allowedUrls");
        Intrinsics.checkNotNullParameter(allowedUrlsToOpenExternally, "allowedUrlsToOpenExternally");
        Intrinsics.checkNotNullParameter(allowedUrlsToOpenInApp, "allowedUrlsToOpenInApp");
        Intrinsics.checkNotNullParameter(openUrlExternally, "openUrlExternally");
        Intrinsics.checkNotNullParameter(openUrlInApp, "openUrlInApp");
        Intrinsics.checkNotNullParameter(onOpenDisallowedUrl, "onOpenDisallowedUrl");
        Composer composerStartRestartGroup = composer.startRestartGroup(206481164);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = i | (composerStartRestartGroup.changed(str) ? 4 : 2);
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onClickCta) ? 32 : 16;
        }
        int i7 = i4;
        if ((i3 & 4) != 0) {
            i7 |= 384;
        } else if ((i & 384) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(callbacks) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i7 |= 3072;
        } else if ((i & 3072) == 0) {
            i7 |= composerStartRestartGroup.changed(url) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i7 |= 24576;
        } else if ((i & 24576) == 0) {
            i7 |= composerStartRestartGroup.changed(allowedUrls) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i7 |= 196608;
        } else if ((i & 196608) == 0) {
            i7 |= composerStartRestartGroup.changed(allowedUrlsToOpenExternally) ? 131072 : 65536;
        }
        if ((i3 & 64) != 0) {
            i7 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i7 |= composerStartRestartGroup.changed(allowedUrlsToOpenInApp) ? 1048576 : 524288;
        }
        if ((i3 & 128) != 0) {
            i7 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(openUrlExternally) ? 8388608 : 4194304;
        }
        if ((i3 & 256) != 0) {
            i7 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(openUrlInApp) ? 67108864 : 33554432;
        }
        if ((i3 & 512) != 0) {
            i7 |= 805306368;
        } else if ((i & 805306368) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(onOpenDisallowedUrl) ? 536870912 : 268435456;
        }
        int i8 = i3 & 1024;
        if (i8 != 0) {
            modifier2 = modifier;
            i5 = i8;
            i6 = i2 | 6;
        } else {
            modifier2 = modifier;
            if ((i2 & 6) == 0) {
                i5 = i8;
                i6 = i2 | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
            } else {
                i5 = i8;
                i6 = i2;
            }
        }
        if ((i7 & 306783379) != 306783378 || (i6 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            final Modifier modifier4 = i5 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(206481164, i7, i6, "com.robinhood.android.gold.sage.GoldSageRateComposable (GoldSageRateComposable.kt:26)");
            }
            composer2 = composerStartRestartGroup;
            BentoTheme2.BentoTheme(Boolean.TRUE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(471955540, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.sage.GoldSageRateComposableKt.GoldSageRateComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i9) {
                    if ((i9 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(471955540, i9, -1, "com.robinhood.android.gold.sage.GoldSageRateComposable.<anonymous> (GoldSageRateComposable.kt:28)");
                    }
                    final Modifier modifier5 = modifier4;
                    final String str2 = str;
                    final Function0<Unit> function0 = onClickCta;
                    final GoldSageWebViewCallbacks goldSageWebViewCallbacks = callbacks;
                    final String str3 = url;
                    final ImmutableList<String> immutableList = allowedUrls;
                    final ImmutableList<String> immutableList2 = allowedUrlsToOpenExternally;
                    final ImmutableList<String> immutableList3 = allowedUrlsToOpenInApp;
                    final Function1<Uri, Unit> function1 = openUrlExternally;
                    final Function1<Uri, Unit> function12 = openUrlInApp;
                    final Function0<Unit> function02 = onOpenDisallowedUrl;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1069132329, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.sage.GoldSageRateComposableKt.GoldSageRateComposable.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i10) {
                            if ((i10 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1069132329, i10, -1, "com.robinhood.android.gold.sage.GoldSageRateComposable.<anonymous>.<anonymous> (GoldSageRateComposable.kt:29)");
                            }
                            Modifier modifier6 = modifier5;
                            final String str4 = str2;
                            final Function0<Unit> function03 = function0;
                            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-444953442, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.sage.GoldSageRateComposableKt.GoldSageRateComposable.1.1.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer5, Integer num) {
                                    invoke(bentoButtonBar3, composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer5, int i11) {
                                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                    if ((i11 & 17) == 16 && composer5.getSkipping()) {
                                        composer5.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-444953442, i11, -1, "com.robinhood.android.gold.sage.GoldSageRateComposable.<anonymous>.<anonymous>.<anonymous> (GoldSageRateComposable.kt:31)");
                                    }
                                    String str5 = str4;
                                    if (str5 != null) {
                                        GoldSageBottomBar3.GoldSageBottomBar(str5, function03, null, null, null, null, null, false, composer5, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer4, 54);
                            final GoldSageWebViewCallbacks goldSageWebViewCallbacks2 = goldSageWebViewCallbacks;
                            final String str5 = str3;
                            final ImmutableList<String> immutableList4 = immutableList;
                            final ImmutableList<String> immutableList5 = immutableList2;
                            final ImmutableList<String> immutableList6 = immutableList3;
                            final Function1<Uri, Unit> function13 = function1;
                            final Function1<Uri, Unit> function14 = function12;
                            final Function0<Unit> function04 = function02;
                            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifier6, false, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(43105041, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.sage.GoldSageRateComposableKt.GoldSageRateComposable.1.1.2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer5, Integer num) {
                                    invoke(boxScope, composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer5, int i11) {
                                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                    if ((i11 & 17) == 16 && composer5.getSkipping()) {
                                        composer5.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(43105041, i11, -1, "com.robinhood.android.gold.sage.GoldSageRateComposable.<anonymous>.<anonymous>.<anonymous> (GoldSageRateComposable.kt:40)");
                                    }
                                    GoldSageWebViewComposable.GoldSageWebViewComposable(goldSageWebViewCallbacks2, str5, immutableList4, immutableList5, immutableList6, function13, function14, function04, null, composer5, 0, 256);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer4, 54), composer4, 3456, 2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), composer3, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.sage.GoldSageRateComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldSageRateComposable.GoldSageRateComposable$lambda$0(str, onClickCta, callbacks, url, allowedUrls, allowedUrlsToOpenExternally, allowedUrlsToOpenInApp, openUrlExternally, openUrlInApp, onOpenDisallowedUrl, modifier3, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
