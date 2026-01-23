package com.robinhood.android.lists.p173ui.userlist;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p011ui.platform.ComposeView;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CuratedListUserListFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lists.ui.userlist.CuratedListUserListFragment$futuresContractsDisclosureAdapter$1, reason: use source file name */
/* loaded from: classes8.dex */
final class CuratedListUserListFragment3<V extends View> implements Inflater {
    final /* synthetic */ CuratedListUserListFragment this$0;

    CuratedListUserListFragment3(CuratedListUserListFragment curatedListUserListFragment) {
        this.this$0 = curatedListUserListFragment;
    }

    @Override // com.robinhood.utils.p409ui.view.Inflater
    public final ComposeView inflate(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        final CuratedListUserListFragment curatedListUserListFragment = this.this$0;
        return UserListFuturesContractsDisclosure.inflateUserListFuturesContractsDisclosureComposeView(context, new Function0() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListFragment$futuresContractsDisclosureAdapter$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CuratedListUserListFragment3.inflate$lambda$0(curatedListUserListFragment);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit inflate$lambda$0(CuratedListUserListFragment curatedListUserListFragment) {
        curatedListUserListFragment.launchSearchFragment(curatedListUserListFragment.curatedListDisplayName);
        return Unit.INSTANCE;
    }
}
