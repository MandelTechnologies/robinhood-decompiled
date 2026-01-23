package com.robinhood.android.banking.util;

import androidx.fragment.app.FragmentManager;
import com.robinhood.android.banking.lib.C9631R;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import io.reactivex.Maybe;
import io.reactivex.Single;
import io.reactivex.functions.Predicate;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeactivatedAccountUtils.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u001a\u001c\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u001a$\u0010\b\u001a\u00020\u0001*\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\u0014\u0010\f\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0006¨\u0006\r"}, m3636d2 = {"preventDeactivatedUsersFromProceeding", "", "Lcom/robinhood/android/common/ui/BaseActivity;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "message", "", "preventDeactivatedIraUsersFromProceeding", "checkTransferAccountsBeforeProceeding", "hasNoAccountsSingle", "Lio/reactivex/Single;", "", "showDeactivatedAccountDialog", "feature-lib-banking_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.banking.util.DeactivatedAccountUtilsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class DeactivatedAccountUtils {
    public static final void preventDeactivatedUsersFromProceeding(BaseActivity baseActivity, TransferAccountStore transferAccountStore, int i) {
        Intrinsics.checkNotNullParameter(baseActivity, "<this>");
        Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
        checkTransferAccountsBeforeProceeding(baseActivity, transferAccountStore.fetchNoActiveInternalAccounts(), i);
    }

    public static final void preventDeactivatedIraUsersFromProceeding(BaseActivity baseActivity, TransferAccountStore transferAccountStore, int i) {
        Intrinsics.checkNotNullParameter(baseActivity, "<this>");
        Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
        checkTransferAccountsBeforeProceeding(baseActivity, transferAccountStore.fetchNoActiveIraAccounts(), i);
    }

    private static final void checkTransferAccountsBeforeProceeding(final BaseActivity baseActivity, Single<Boolean> single, final int i) {
        Maybe<Boolean> maybeFilter = single.filter(new Predicate() { // from class: com.robinhood.android.banking.util.DeactivatedAccountUtilsKt.checkTransferAccountsBeforeProceeding.1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Boolean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.booleanValue();
            }
        });
        Intrinsics.checkNotNullExpressionValue(maybeFilter, "filter(...)");
        LifecycleHost.DefaultImpls.bind$default(baseActivity, maybeFilter, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.banking.util.DeactivatedAccountUtilsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeactivatedAccountUtils.checkTransferAccountsBeforeProceeding$lambda$0(baseActivity, i, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkTransferAccountsBeforeProceeding$lambda$0(BaseActivity baseActivity, int i, Boolean bool) {
        showDeactivatedAccountDialog(baseActivity, i);
        return Unit.INSTANCE;
    }

    public static final void showDeactivatedAccountDialog(BaseActivity baseActivity, int i) {
        Intrinsics.checkNotNullParameter(baseActivity, "<this>");
        RhDialogFragment.Builder negativeButton = RhDialogFragment.INSTANCE.create(baseActivity).setId(C9631R.id.dialog_id_deactivated_account).setMessage(i, new Object[0]).setPositiveButton(C11048R.string.general_label_got_it, new Object[0]).setNegativeButton(C11048R.string.general_label_contact_support, new Object[0]);
        FragmentManager supportFragmentManager = baseActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        RhDialogFragment.Builder.show$default(negativeButton, supportFragmentManager, "deactivated-account-dialog", false, 4, null);
    }
}
