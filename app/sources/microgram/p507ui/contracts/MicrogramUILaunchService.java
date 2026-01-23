package microgram.p507ui.contracts;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import microgram.annotation.ManagedServices;

/* compiled from: MicrogramUILaunchService.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\bJ\u001e\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\rJ\u001e\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\rJ2\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u0013H§@¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Lmicrogram/ui/contracts/MicrogramUILaunchService;", "", "launchRouter", "", "initialScreenData", "Lmicrogram/ui/contracts/InitialScreenData;", "presentationMode", "Lmicrogram/ui/contracts/PresentationMode;", "(Lmicrogram/ui/contracts/InitialScreenData;Lmicrogram/ui/contracts/PresentationMode;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "presentAlert", "routerIdentifier", "", "encodedAlertContent", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "presentBottomSheet", "identifier", "encodedInitialScreenData", "presentBottomSheetWithMetadata", "metadata", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@ManagedServices(serviceName = "microgram.ui.LaunchService")
/* loaded from: classes14.dex */
public interface MicrogramUILaunchService {
    Object launchRouter(InitialScreenData initialScreenData, PresentationMode presentationMode, Continuation<? super Unit> continuation);

    Object presentAlert(String str, String str2, Continuation<? super Unit> continuation);

    Object presentBottomSheet(String str, String str2, Continuation<? super Unit> continuation);

    Object presentBottomSheetWithMetadata(String str, String str2, Map<String, String> map, Continuation<? super Unit> continuation);
}
