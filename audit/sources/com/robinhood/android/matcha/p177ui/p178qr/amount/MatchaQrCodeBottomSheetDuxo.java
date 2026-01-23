package com.robinhood.android.matcha.p177ui.p178qr.amount;

import android.graphics.Bitmap;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.matcha.p177ui.p178qr.amount.MatchaQrCodeBottomSheet;
import com.robinhood.android.store.matcha.QrCodeStore;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p320db.matcha.EncryptedUserId;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaQrCodeBottomSheetDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0010B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/qr/amount/MatchaQrCodeBottomSheetDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/matcha/ui/qr/amount/MatchaQrCodeBottomSheetState;", "Lcom/robinhood/android/udf/HasSavedState;", "qrCodeStore", "Lcom/robinhood/android/store/matcha/QrCodeStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/store/matcha/QrCodeStore;Lcom/robinhood/shared/store/user/UserStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MatchaQrCodeBottomSheetDuxo extends OldBaseDuxo<MatchaQrCodeBottomSheetState> implements HasSavedState {
    private final QrCodeStore qrCodeStore;
    private final SavedStateHandle savedStateHandle;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MatchaQrCodeBottomSheetDuxo(QrCodeStore qrCodeStore, UserStore userStore, SavedStateHandle savedStateHandle) {
        super(new MatchaQrCodeBottomSheetState(null, null, null, 7, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(qrCodeStore, "qrCodeStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.qrCodeStore = qrCodeStore;
        this.userStore = userStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, this.qrCodeStore.getBitmapUncached(new Function1() { // from class: com.robinhood.android.matcha.ui.qr.amount.MatchaQrCodeBottomSheetDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaQrCodeBottomSheetDuxo.onStart$lambda$0(this.f$0, (EncryptedUserId) obj);
            }
        }), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.matcha.ui.qr.amount.MatchaQrCodeBottomSheetDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaQrCodeBottomSheetDuxo.onStart$lambda$2(this.f$0, (Bitmap) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.matcha.ui.qr.amount.MatchaQrCodeBottomSheetDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaQrCodeBottomSheetDuxo.onStart$lambda$4(this.f$0, (Throwable) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.userStore.getUser(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.matcha.ui.qr.amount.MatchaQrCodeBottomSheetDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaQrCodeBottomSheetDuxo.onStart$lambda$6(this.f$0, (User) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onStart$lambda$0(MatchaQrCodeBottomSheetDuxo matchaQrCodeBottomSheetDuxo, EncryptedUserId it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return MatchaQrCodeBottomSheetDuxo2.createSendDeeplink(it, ((MatchaQrCodeBottomSheet.Args) INSTANCE.getArgs((HasSavedState) matchaQrCodeBottomSheetDuxo)).getAmount().getDecimalValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(MatchaQrCodeBottomSheetDuxo matchaQrCodeBottomSheetDuxo, final Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        matchaQrCodeBottomSheetDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.matcha.ui.qr.amount.MatchaQrCodeBottomSheetDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaQrCodeBottomSheetDuxo.onStart$lambda$2$lambda$1(bitmap, (MatchaQrCodeBottomSheetState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MatchaQrCodeBottomSheetState onStart$lambda$2$lambda$1(Bitmap bitmap, MatchaQrCodeBottomSheetState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return MatchaQrCodeBottomSheetState.copy$default(applyMutation, null, bitmap, null, 5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$4(MatchaQrCodeBottomSheetDuxo matchaQrCodeBottomSheetDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        matchaQrCodeBottomSheetDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.matcha.ui.qr.amount.MatchaQrCodeBottomSheetDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaQrCodeBottomSheetDuxo.onStart$lambda$4$lambda$3(throwable, (MatchaQrCodeBottomSheetState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MatchaQrCodeBottomSheetState onStart$lambda$4$lambda$3(Throwable th, MatchaQrCodeBottomSheetState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return MatchaQrCodeBottomSheetState.copy$default(applyMutation, null, null, new UiEvent(th), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$6(MatchaQrCodeBottomSheetDuxo matchaQrCodeBottomSheetDuxo, final User user) {
        Intrinsics.checkNotNullParameter(user, "user");
        matchaQrCodeBottomSheetDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.matcha.ui.qr.amount.MatchaQrCodeBottomSheetDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaQrCodeBottomSheetDuxo.onStart$lambda$6$lambda$5(user, (MatchaQrCodeBottomSheetState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MatchaQrCodeBottomSheetState onStart$lambda$6$lambda$5(User user, MatchaQrCodeBottomSheetState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return MatchaQrCodeBottomSheetState.copy$default(applyMutation, user, null, null, 6, null);
    }

    /* compiled from: MatchaQrCodeBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/qr/amount/MatchaQrCodeBottomSheetDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/matcha/ui/qr/amount/MatchaQrCodeBottomSheetDuxo;", "Lcom/robinhood/android/matcha/ui/qr/amount/MatchaQrCodeBottomSheet$Args;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<MatchaQrCodeBottomSheetDuxo, MatchaQrCodeBottomSheet.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MatchaQrCodeBottomSheet.Args getArgs(SavedStateHandle savedStateHandle) {
            return (MatchaQrCodeBottomSheet.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MatchaQrCodeBottomSheet.Args getArgs(MatchaQrCodeBottomSheetDuxo matchaQrCodeBottomSheetDuxo) {
            return (MatchaQrCodeBottomSheet.Args) DuxoCompanion.DefaultImpls.getArgs(this, matchaQrCodeBottomSheetDuxo);
        }
    }
}
