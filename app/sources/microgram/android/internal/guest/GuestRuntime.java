package microgram.android.internal.guest;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* compiled from: GuestRuntime.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\bJ\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H¦@¢\u0006\u0002\u0010\u0007¨\u0006\t"}, m3636d2 = {"Lmicrogram/android/internal/guest/GuestRuntime;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "createMessageChannel", "Lkotlin/Pair;", "Lmicrogram/android/internal/guest/HostPort;", "Lmicrogram/android/internal/guest/GuestPort;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Factory", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface GuestRuntime extends AutoCloseable {

    /* compiled from: GuestRuntime.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H¦@¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"Lmicrogram/android/internal/guest/GuestRuntime$Factory;", "", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lmicrogram/android/internal/guest/GuestRuntime;", "onGuestEvent", "Lkotlin/Function1;", "Lmicrogram/android/internal/guest/RuntimeMessage;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Factory {
        Object create(Function1<? super RuntimeMessage, Unit> function1, Continuation<? super GuestRuntime> continuation) throws GuestRuntimeUnavailableException;
    }

    Object createMessageChannel(Continuation<? super Tuples2<? extends GuestRuntime3, ? extends GuestRuntime2>> continuation);
}
