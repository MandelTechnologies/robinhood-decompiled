package com.robinhood.android.lib.creditcard.p165ui.invite;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.p011ui.platform.ViewCompositionStrategy;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.creditcard.contracts.CreditCardWaitlistIntentKey;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.utils.p409ui.view.recyclerview.GenericViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* compiled from: CreditApplicationInviteBannerAdapter.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u001e\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0018\u001a\u00020\u0011H\u0016J\u0016\u0010\u0019\u001a\u00020\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\u001a\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/lib/creditcard/ui/invite/CreditApplicationInviteBannerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;", "Landroidx/compose/ui/platform/ComposeView;", "context", "Landroid/content/Context;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "location", "Lcom/robinhood/android/lib/creditcard/ui/invite/Location;", "<init>", "(Landroid/content/Context;Lcom/robinhood/android/navigation/Navigator;Lcom/robinhood/android/lib/creditcard/ui/invite/Location;)V", "shouldShow", "", "bind", "", "getItemCount", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "holder", "position", "onViewRecycled", "startCreditApplication", "feature-lib-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class CreditApplicationInviteBannerAdapter extends RecyclerView.Adapter<GenericViewHolder<? extends ComposeView>> {
    public static final int $stable = 8;
    private final Context context;
    private final CreditApplicationInviteBannerDuxo4 location;
    private final Navigator navigator;
    private boolean shouldShow;

    public CreditApplicationInviteBannerAdapter(Context context, Navigator navigator, CreditApplicationInviteBannerDuxo4 location) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(location, "location");
        this.context = context;
        this.navigator = navigator;
        this.location = location;
    }

    public final void bind(boolean shouldShow) {
        boolean z = this.shouldShow;
        this.shouldShow = shouldShow;
        if (z != shouldShow) {
            if (shouldShow) {
                notifyItemInserted(0);
            } else {
                notifyItemRemoved(0);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: getItemCount */
    public int getSize() {
        return this.shouldShow ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public GenericViewHolder<ComposeView> onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnDetachedFromWindow.INSTANCE);
        return new GenericViewHolder<>(composeView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(GenericViewHolder<ComposeView> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ((ComposeView) holder.getView()).setContent(ComposableLambda3.composableLambdaInstance(-504875653, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.creditcard.ui.invite.CreditApplicationInviteBannerAdapter.onBindViewHolder.1
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
                    ComposerKt.traceEventStart(-504875653, i, -1, "com.robinhood.android.lib.creditcard.ui.invite.CreditApplicationInviteBannerAdapter.onBindViewHolder.<anonymous> (CreditApplicationInviteBannerAdapter.kt:47)");
                }
                CreditApplicationInviteBannerDuxo4 creditApplicationInviteBannerDuxo4 = CreditApplicationInviteBannerAdapter.this.location;
                CreditApplicationInviteBannerAdapter creditApplicationInviteBannerAdapter = CreditApplicationInviteBannerAdapter.this;
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(creditApplicationInviteBannerAdapter);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new CreditApplicationInviteBannerAdapter2(creditApplicationInviteBannerAdapter);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                CreditApplicationInviteBannerComposable.InviteBanner(creditApplicationInviteBannerDuxo4, null, (Function0) ((KFunction) objRememberedValue), false, null, composer, 0, 26);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(GenericViewHolder<ComposeView> holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ((ComposeView) holder.getView()).disposeComposition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startCreditApplication() {
        Navigator.DefaultImpls.startActivity$default(this.navigator, this.context, new CreditCardWaitlistIntentKey(null, null, false, CreditApplicationInviteBannerDuxo.INSTANCE.getEntryPointSource(this.location), false, false, 55, null), null, false, null, null, 60, null);
    }
}
