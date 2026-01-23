package com.robinhood.android.history.p153ui;

import android.content.Context;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.history.p082ui.HistoryDetailErrorDialog2;
import com.robinhood.android.common.history.p082ui.HistoryDetailErrorDialogData;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.history.C18359R;
import com.robinhood.android.navigation.DialogFragmentResolver;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailErrorDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0014¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/history/ui/DetailErrorDialogFragment;", "Lcom/robinhood/android/common/ui/RhDialogFragment;", "<init>", "()V", "onPositiveButtonClick", "", "Builder", "Companion", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class DetailErrorDialogFragment extends RhDialogFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = RhDialogFragment.$stable;

    @Override // com.robinhood.android.common.p088ui.RhDialogFragment
    protected void onPositiveButtonClick() {
        dismiss();
    }

    /* compiled from: DetailErrorDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0014¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/history/ui/DetailErrorDialogFragment$Builder;", "Lcom/robinhood/android/common/ui/RhDialogFragment$Builder;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "createDialogFragment", "Lcom/robinhood/android/history/ui/DetailErrorDialogFragment;", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class Builder extends RhDialogFragment.Builder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.robinhood.android.common.ui.RhDialogFragment.Builder
        public DetailErrorDialogFragment createDialogFragment() {
            return new DetailErrorDialogFragment();
        }
    }

    /* compiled from: DetailErrorDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/history/ui/DetailErrorDialogFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$DetailError;", "<init>", "()V", "createDialogFragment", "Lcom/robinhood/android/common/ui/RhDialogFragment;", "key", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolver<LegacyDialogFragmentKey.DetailError> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
        @Override // com.robinhood.android.navigation.DialogFragmentResolver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public RhDialogFragment createDialogFragment(LegacyDialogFragmentKey.DetailError key) {
            String string2;
            Intrinsics.checkNotNullParameter(key, "key");
            HistoryDetailErrorDialogData dialogData = HistoryDetailErrorDialog2.getDialogData(key.getErrorType());
            Integer message = dialogData.getMessage();
            if (message != null) {
                string2 = key.getContext().getString(message.intValue());
                if (string2 == null) {
                    string2 = "";
                }
            }
            return RhDialogFragment.Builder.show$default(new Builder(key.getContext()).setId(C18359R.id.dialog_id_equity_detail_error).setUseDesignSystemOverlay(true).setTitle(dialogData.getTitle(), new Object[0]).setMessage(string2).setPositiveButton(C11048R.string.general_label_done, new Object[0]), key.getSupportFragmentManager(), "equity_order_error", false, 4, null);
        }
    }
}
