package com.robinhood.android.transfers.international.p266ui.review;

import com.robinhood.android.banking.util.RefIdFactory;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.transfers.international.p266ui.review.TransferRequestCreator;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferRequestCreator_Factory.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB \u0012\u0017\u0010\u0003\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u001f\u0010\u0003\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/review/TransferRequestCreator_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/transfers/international/ui/review/TransferRequestCreator;", "refIdFactory", "Ljavax/inject/Provider;", "Lcom/robinhood/android/banking/util/RefIdFactory;", "Lcom/robinhood/android/transfers/international/ui/review/TransferRequestCreator$TransferData;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class TransferRequestCreator_Factory implements Factory<TransferRequestCreator> {
    private final Provider<RefIdFactory<TransferRequestCreator.TransferData>> refIdFactory;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final TransferRequestCreator_Factory create(Provider<RefIdFactory<TransferRequestCreator.TransferData>> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final TransferRequestCreator newInstance(RefIdFactory<TransferRequestCreator.TransferData> refIdFactory) {
        return INSTANCE.newInstance(refIdFactory);
    }

    public TransferRequestCreator_Factory(Provider<RefIdFactory<TransferRequestCreator.TransferData>> refIdFactory) {
        Intrinsics.checkNotNullParameter(refIdFactory, "refIdFactory");
        this.refIdFactory = refIdFactory;
    }

    @Override // javax.inject.Provider
    public TransferRequestCreator get() {
        Companion companion = INSTANCE;
        RefIdFactory<TransferRequestCreator.TransferData> refIdFactory = this.refIdFactory.get();
        Intrinsics.checkNotNullExpressionValue(refIdFactory, "get(...)");
        return companion.newInstance(refIdFactory);
    }

    /* compiled from: TransferRequestCreator_Factory.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n0\u0007H\u0007J\u001b\u0010\u000b\u001a\u00020\f2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/review/TransferRequestCreator_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/transfers/international/ui/review/TransferRequestCreator_Factory;", "refIdFactory", "Ljavax/inject/Provider;", "Lcom/robinhood/android/banking/util/RefIdFactory;", "Lcom/robinhood/android/transfers/international/ui/review/TransferRequestCreator$TransferData;", "Lkotlin/jvm/JvmSuppressWildcards;", "newInstance", "Lcom/robinhood/android/transfers/international/ui/review/TransferRequestCreator;", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TransferRequestCreator_Factory create(Provider<RefIdFactory<TransferRequestCreator.TransferData>> refIdFactory) {
            Intrinsics.checkNotNullParameter(refIdFactory, "refIdFactory");
            return new TransferRequestCreator_Factory(refIdFactory);
        }

        @JvmStatic
        public final TransferRequestCreator newInstance(RefIdFactory<TransferRequestCreator.TransferData> refIdFactory) {
            Intrinsics.checkNotNullParameter(refIdFactory, "refIdFactory");
            return new TransferRequestCreator(refIdFactory);
        }
    }
}
