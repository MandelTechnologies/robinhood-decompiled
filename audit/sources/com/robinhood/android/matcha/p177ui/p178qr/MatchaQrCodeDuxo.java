package com.robinhood.android.matcha.p177ui.p178qr;

import android.graphics.Bitmap;
import com.robinhood.android.matcha.p177ui.p178qr.MatchaQrCodeEvent;
import com.robinhood.android.privacy.ProfileDiscoverabilityManager;
import com.robinhood.android.store.matcha.EncryptedUserIdStore;
import com.robinhood.android.store.matcha.QrCodeStore;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p320db.matcha.EncryptedUserId;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.store.user.UserStore;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaQrCodeDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0006\u0010\u0015\u001a\u00020\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/qr/MatchaQrCodeDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/matcha/ui/qr/MatchaQrCodeDataState;", "Lcom/robinhood/android/matcha/ui/qr/MatchaQrCodeViewState;", "Lcom/robinhood/android/matcha/ui/qr/MatchaQrCodeEvent;", "encryptedUserIdStore", "Lcom/robinhood/android/store/matcha/EncryptedUserIdStore;", "qrCodeStore", "Lcom/robinhood/android/store/matcha/QrCodeStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "profileDiscoverabilityManager", "Lcom/robinhood/android/privacy/ProfileDiscoverabilityManager;", "stateProvider", "Lcom/robinhood/android/matcha/ui/qr/MatchaQrCodeStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/store/matcha/EncryptedUserIdStore;Lcom/robinhood/android/store/matcha/QrCodeStore;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/android/privacy/ProfileDiscoverabilityManager;Lcom/robinhood/android/matcha/ui/qr/MatchaQrCodeStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "onStart", "", "requestQrCodePdf", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MatchaQrCodeDuxo extends BaseDuxo3<MatchaQrCodeDataState, MatchaQrCodeViewState, MatchaQrCodeEvent> {
    public static final int $stable = 8;
    private final EncryptedUserIdStore encryptedUserIdStore;
    private final ProfileDiscoverabilityManager profileDiscoverabilityManager;
    private final QrCodeStore qrCodeStore;
    private final UserStore userStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchaQrCodeDuxo(EncryptedUserIdStore encryptedUserIdStore, QrCodeStore qrCodeStore, UserStore userStore, ProfileDiscoverabilityManager profileDiscoverabilityManager, MatchaQrCodeStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new MatchaQrCodeDataState(null, null, null, null, 15, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(encryptedUserIdStore, "encryptedUserIdStore");
        Intrinsics.checkNotNullParameter(qrCodeStore, "qrCodeStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(profileDiscoverabilityManager, "profileDiscoverabilityManager");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.encryptedUserIdStore = encryptedUserIdStore;
        this.qrCodeStore = qrCodeStore;
        this.userStore = userStore;
        this.profileDiscoverabilityManager = profileDiscoverabilityManager;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, this.encryptedUserIdStore.stream(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.matcha.ui.qr.MatchaQrCodeDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaQrCodeDuxo.onStart$lambda$0(this.f$0, (EncryptedUserId) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.qrCodeStore.getBitmap(new Function1() { // from class: com.robinhood.android.matcha.ui.qr.MatchaQrCodeDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaQrCodeDuxo.onStart$lambda$1((EncryptedUserId) obj);
            }
        }), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.matcha.ui.qr.MatchaQrCodeDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaQrCodeDuxo.onStart$lambda$2(this.f$0, (Bitmap) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.matcha.ui.qr.MatchaQrCodeDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaQrCodeDuxo.onStart$lambda$3(this.f$0, (Throwable) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.userStore.getUser(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.matcha.ui.qr.MatchaQrCodeDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaQrCodeDuxo.onStart$lambda$4(this.f$0, (User) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.profileDiscoverabilityManager.getDiscoverabilityConsentStatuses(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.matcha.ui.qr.MatchaQrCodeDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaQrCodeDuxo.onStart$lambda$5(this.f$0, (List) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.matcha.ui.qr.MatchaQrCodeDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaQrCodeDuxo.onStart$lambda$6(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(MatchaQrCodeDuxo matchaQrCodeDuxo, EncryptedUserId encryptedUserId) {
        Intrinsics.checkNotNullParameter(encryptedUserId, "encryptedUserId");
        matchaQrCodeDuxo.applyMutation(new MatchaQrCodeDuxo2(encryptedUserId, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onStart$lambda$1(EncryptedUserId it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return MatchaQrCodeDuxo6.getProfileDeepLink(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(MatchaQrCodeDuxo matchaQrCodeDuxo, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        matchaQrCodeDuxo.applyMutation(new MatchaQrCodeDuxo3(bitmap, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(MatchaQrCodeDuxo matchaQrCodeDuxo, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        matchaQrCodeDuxo.submit(new MatchaQrCodeEvent.Error(throwable));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$4(MatchaQrCodeDuxo matchaQrCodeDuxo, User user) {
        Intrinsics.checkNotNullParameter(user, "user");
        matchaQrCodeDuxo.applyMutation(new MatchaQrCodeDuxo4(user, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5(MatchaQrCodeDuxo matchaQrCodeDuxo, List statuses) {
        Intrinsics.checkNotNullParameter(statuses, "statuses");
        matchaQrCodeDuxo.applyMutation(new MatchaQrCodeDuxo5(statuses, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$6(MatchaQrCodeDuxo matchaQrCodeDuxo, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        matchaQrCodeDuxo.submit(new MatchaQrCodeEvent.Error(throwable));
        return Unit.INSTANCE;
    }

    public final void requestQrCodePdf() {
        LifecycleHost.DefaultImpls.bind$default(this, this.qrCodeStore.getPdf(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.matcha.ui.qr.MatchaQrCodeDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaQrCodeDuxo.requestQrCodePdf$lambda$7(this.f$0, (File) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.matcha.ui.qr.MatchaQrCodeDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaQrCodeDuxo.requestQrCodePdf$lambda$8(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestQrCodePdf$lambda$7(MatchaQrCodeDuxo matchaQrCodeDuxo, File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        matchaQrCodeDuxo.submit(new MatchaQrCodeEvent.OpenPdf(file));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestQrCodePdf$lambda$8(MatchaQrCodeDuxo matchaQrCodeDuxo, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        matchaQrCodeDuxo.submit(new MatchaQrCodeEvent.Error(throwable));
        return Unit.INSTANCE;
    }
}
