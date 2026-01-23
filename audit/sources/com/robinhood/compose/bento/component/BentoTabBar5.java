package com.robinhood.compose.bento.component;

import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import com.robinhood.compose.bento.component.BentoTabBarState;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: BentoTabBar.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoTabBarPreviewParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/robinhood/compose/bento/component/TabPreviewData;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.component.BentoTabBarPreviewParameterProvider, reason: use source file name */
/* loaded from: classes15.dex */
final class BentoTabBar5 implements PreviewParameterProvider<BentoTabBar7> {
    private final Sequence<BentoTabBar7> values;

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    public BentoTabBar5() {
        BentoTabBarState.Tab tab = BentoTabBarState.Tab.PORTFOLIO;
        BentoTabBarState.Tab tab2 = BentoTabBarState.Tab.CRYPTO;
        BentoTabBarState.Tab tab3 = BentoTabBarState.Tab.RETIREMENT;
        BentoTabBarState.Tab tab4 = BentoTabBarState.Tab.BROWSE;
        BentoTabBarState.Tab tab5 = BentoTabBarState.Tab.NOTIFICATIONS;
        BentoTabBarState.Tab tab6 = BentoTabBarState.Tab.ACCOUNT;
        ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(tab, tab2, tab3, tab4, tab5, tab6);
        BentoTabBarState.BadgeState badgeState = BentoTabBarState.BadgeState.NORMAL;
        Tuples2 tuples2M3642to = Tuples4.m3642to(tab2, badgeState);
        BentoTabBarState.BadgeState badgeState2 = BentoTabBarState.BadgeState.CRITICAL;
        this.values = SequencesKt.sequenceOf(new BentoTabBar7(new BentoTabBarState(immutableList3PersistentListOf, 0, extensions2.persistentMapOf(tuples2M3642to, Tuples4.m3642to(tab5, badgeState2))), false, true, false), new BentoTabBar7(new BentoTabBarState(extensions2.persistentListOf(tab, tab2, tab3, tab4, tab5, tab6), 0, extensions2.persistentMapOf(Tuples4.m3642to(tab2, badgeState), Tuples4.m3642to(tab5, badgeState2))), false, true, true), new BentoTabBar7(new BentoTabBarState(extensions2.persistentListOf(tab2, BentoTabBarState.Tab.PERPETUALS, BentoTabBarState.Tab.SEARCH, tab6), 1, extensions2.persistentMapOf(Tuples4.m3642to(tab2, badgeState2), Tuples4.m3642to(tab6, badgeState))), true, false, false));
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public Sequence<BentoTabBar7> getValues() {
        return this.values;
    }
}
