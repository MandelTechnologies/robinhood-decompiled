package microgram.p507ui.contracts;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import microgram.annotation.ManagedServices;

/* compiled from: RouterService.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0006\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/ui/contracts/AppRouterExampleService;", "", "launchAlert", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launchBottomSheet", "launchOnboardingRouter", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@ManagedServices(serviceName = "com.robinhood.router.AppRouterExampleService")
/* renamed from: microgram.ui.contracts.AppRouterExampleService, reason: use source file name */
/* loaded from: classes14.dex */
public interface RouterService {
    Object launchAlert(Continuation<? super Unit> continuation);

    Object launchBottomSheet(Continuation<? super Unit> continuation);

    Object launchOnboardingRouter(Continuation<? super Unit> continuation);
}
