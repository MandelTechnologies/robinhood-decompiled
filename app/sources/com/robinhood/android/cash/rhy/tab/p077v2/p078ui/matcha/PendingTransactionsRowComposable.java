package com.robinhood.android.cash.rhy.tab.p077v2.p078ui.matcha;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.ImageLoader;
import coil.compose.LocalImageLoader;
import coil.compose.LocalImageLoader2;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.p355ui.matcha.UiMatchaPendingTransaction;
import com.robinhood.p2p.common.ProfileAvatarState2;
import com.robinhood.p2p.common.ProfileAvatars;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PendingTransactionsRowComposable.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"PendingTransactionsRowComposable", "", "pendingTransactions", "", "Lcom/robinhood/models/ui/matcha/UiMatchaPendingTransaction;", "imageLoader", "Lcoil/ImageLoader;", "onClick", "Lkotlin/Function0;", "(Ljava/util/List;Lcoil/ImageLoader;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-cash-rhy-tab_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.cash.rhy.tab.v2.ui.matcha.PendingTransactionsRowComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class PendingTransactionsRowComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PendingTransactionsRowComposable$lambda$0(List list, ImageLoader imageLoader, Function0 function0, int i, Composer composer, int i2) {
        PendingTransactionsRowComposable(list, imageLoader, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PendingTransactionsRowComposable$lambda$3(List list, ImageLoader imageLoader, Function0 function0, int i, Composer composer, int i2) {
        PendingTransactionsRowComposable(list, imageLoader, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void PendingTransactionsRowComposable(final List<? extends UiMatchaPendingTransaction> pendingTransactions, final ImageLoader imageLoader, final Function0<Unit> onClick, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(pendingTransactions, "pendingTransactions");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-902847815);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(pendingTransactions) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(imageLoader) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-902847815, i2, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.matcha.PendingTransactionsRowComposable (PendingTransactionsRowComposable.kt:26)");
            }
            final int size = pendingTransactions.size();
            if (size == 0) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.matcha.PendingTransactionsRowComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return PendingTransactionsRowComposable.PendingTransactionsRowComposable$lambda$0(pendingTransactions, imageLoader, onClick, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z = (i2 & 896) == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.matcha.PendingTransactionsRowComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PendingTransactionsRowComposable.PendingTransactionsRowComposable$lambda$2$lambda$1(onClick);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            BentoBaseRowLayout.BentoBaseRowLayout(ClickableKt.m4893clickableXHw0xAI$default(modifierFillMaxWidth$default, false, null, null, (Function0) objRememberedValue, 7, null), null, ComposableLambda3.rememberComposableLambda(1800109429, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.matcha.PendingTransactionsRowComposableKt.PendingTransactionsRowComposable.3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1800109429, i3, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.matcha.PendingTransactionsRowComposable.<anonymous> (PendingTransactionsRowComposable.kt:32)");
                    }
                    ProvidedValue<ImageLoader> providedValueM9117providesimpl = LocalImageLoader.m9117providesimpl(LocalImageLoader2.getLocalImageLoader(), imageLoader);
                    final List<UiMatchaPendingTransaction> list = pendingTransactions;
                    CompositionLocal3.CompositionLocalProvider(providedValueM9117providesimpl, ComposableLambda3.rememberComposableLambda(-181677515, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.matcha.PendingTransactionsRowComposableKt.PendingTransactionsRowComposable.3.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i4) {
                            if ((i4 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-181677515, i4, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.matcha.PendingTransactionsRowComposable.<anonymous>.<anonymous> (PendingTransactionsRowComposable.kt:34)");
                            }
                            composer4.startReplaceGroup(1501569826);
                            List<UiMatchaPendingTransaction> list2 = list;
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                            Iterator<T> it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(ProfileAvatarState2.toBentoPogContent(ProfileAvatars.getAvatar(((UiMatchaPendingTransaction) it.next()).getTransactor()), BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable)));
                            }
                            composer4.endReplaceGroup();
                            GroupPog.GroupPog(null, null, arrayList, composer4, 0, 3);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), composer3, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(104086070, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.matcha.PendingTransactionsRowComposableKt.PendingTransactionsRowComposable.4
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(104086070, i3, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.matcha.PendingTransactionsRowComposable.<anonymous> (PendingTransactionsRowComposable.kt:42)");
                    }
                    int i4 = C10285R.plurals.rhy_overview_pending_matcha_transactions_title;
                    int i5 = size;
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.pluralStringResource(i4, i5, new Object[]{Integer.valueOf(i5)}, composer3, 0), null, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, null, composer3, 24576, 0, 16362);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, false, false, false, null, composer2, 3456, 0, 2034);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.matcha.PendingTransactionsRowComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PendingTransactionsRowComposable.PendingTransactionsRowComposable$lambda$3(pendingTransactions, imageLoader, onClick, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PendingTransactionsRowComposable$lambda$2$lambda$1(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
