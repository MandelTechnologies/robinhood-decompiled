package com.stripe.android.payments.financialconnections;

import androidx.appcompat.app.AppCompatActivity;
import com.stripe.android.financialconnections.FinancialConnectionsSheetResult;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForDataLauncher;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForInstantDebitsLauncher;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetInstantDebitsResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FinancialConnectionsPaymentsProxy.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b`\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H&¨\u0006\t"}, m3636d2 = {"Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy;", "", "present", "", "financialConnectionsSessionClientSecret", "", "publishableKey", "stripeAccountId", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes22.dex */
public interface FinancialConnectionsPaymentsProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    void present(String financialConnectionsSessionClientSecret, String publishableKey, String stripeAccountId);

    /* compiled from: FinancialConnectionsPaymentsProxy.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J<\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\b\b\u0002\u0010\r\u001a\u00020\u000eJ<\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\b\b\u0002\u0010\r\u001a\u00020\u000e¨\u0006\u0011"}, m3636d2 = {"Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy$Companion;", "", "()V", "createForACH", "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "onComplete", "Lkotlin/Function1;", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;", "", "provider", "Lkotlin/Function0;", "isFinancialConnectionsAvailable", "Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsAvailable;", "createForInstantDebits", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetInstantDebitsResult;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FinancialConnectionsPaymentsProxy createForInstantDebits$default(Companion companion, final AppCompatActivity appCompatActivity, final Function1 function1, Function0 function0, IsFinancialConnectionsAvailable isFinancialConnectionsAvailable, int i, Object obj) {
            if ((i & 4) != 0) {
                function0 = new Function0<FinancialConnectionsPaymentsProxy2<FinancialConnectionsSheetForInstantDebitsLauncher>>() { // from class: com.stripe.android.payments.financialconnections.FinancialConnectionsPaymentsProxy$Companion$createForInstantDebits$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final FinancialConnectionsPaymentsProxy2<FinancialConnectionsSheetForInstantDebitsLauncher> invoke() {
                        return new FinancialConnectionsPaymentsProxy2<>(new FinancialConnectionsSheetForInstantDebitsLauncher(appCompatActivity, function1));
                    }
                };
            }
            if ((i & 8) != 0) {
                isFinancialConnectionsAvailable = IsFinancialConnectionsAvailable2.INSTANCE;
            }
            return companion.createForInstantDebits(appCompatActivity, function1, function0, isFinancialConnectionsAvailable);
        }

        public final FinancialConnectionsPaymentsProxy createForInstantDebits(AppCompatActivity activity, Function1<? super FinancialConnectionsSheetInstantDebitsResult, Unit> onComplete, Function0<? extends FinancialConnectionsPaymentsProxy> provider, IsFinancialConnectionsAvailable isFinancialConnectionsAvailable) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(onComplete, "onComplete");
            Intrinsics.checkNotNullParameter(provider, "provider");
            Intrinsics.checkNotNullParameter(isFinancialConnectionsAvailable, "isFinancialConnectionsAvailable");
            if (isFinancialConnectionsAvailable.invoke()) {
                return provider.invoke();
            }
            return new FinancialConnectionsPaymentsProxy6();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FinancialConnectionsPaymentsProxy createForACH$default(Companion companion, final AppCompatActivity appCompatActivity, final Function1 function1, Function0 function0, IsFinancialConnectionsAvailable isFinancialConnectionsAvailable, int i, Object obj) {
            if ((i & 4) != 0) {
                function0 = new Function0<FinancialConnectionsPaymentsProxy2<FinancialConnectionsSheetForDataLauncher>>() { // from class: com.stripe.android.payments.financialconnections.FinancialConnectionsPaymentsProxy$Companion$createForACH$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final FinancialConnectionsPaymentsProxy2<FinancialConnectionsSheetForDataLauncher> invoke() {
                        return new FinancialConnectionsPaymentsProxy2<>(new FinancialConnectionsSheetForDataLauncher(appCompatActivity, new FinancialConnectionsPaymentsProxy5(function1)));
                    }
                };
            }
            if ((i & 8) != 0) {
                isFinancialConnectionsAvailable = IsFinancialConnectionsAvailable2.INSTANCE;
            }
            return companion.createForACH(appCompatActivity, function1, function0, isFinancialConnectionsAvailable);
        }

        public final FinancialConnectionsPaymentsProxy createForACH(AppCompatActivity activity, Function1<? super FinancialConnectionsSheetResult, Unit> onComplete, Function0<? extends FinancialConnectionsPaymentsProxy> provider, IsFinancialConnectionsAvailable isFinancialConnectionsAvailable) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(onComplete, "onComplete");
            Intrinsics.checkNotNullParameter(provider, "provider");
            Intrinsics.checkNotNullParameter(isFinancialConnectionsAvailable, "isFinancialConnectionsAvailable");
            if (isFinancialConnectionsAvailable.invoke()) {
                return provider.invoke();
            }
            return new FinancialConnectionsPaymentsProxy6();
        }
    }
}
