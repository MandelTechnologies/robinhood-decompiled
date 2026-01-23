package com.robinhood.shared.tradeladder.p398ui.ladder.ftux;

import android.content.Context;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GenericLadderFtuxManager.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u0018\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\nJ\"\u0010\u0012\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\nJ\u000f\u0010\u0014\u001a\u0004\u0018\u00018\u0000H$¢\u0006\u0002\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH$J\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J$\u0010\u001b\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\n2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxManager;", "T", "Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState;", "", "shouldShowFtuxPref", "Lcom/robinhood/prefs/BooleanPreference;", "<init>", "(Lcom/robinhood/prefs/BooleanPreference;)V", "getFirstFtuxPage", "ignorePref", "", "(Z)Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState;", "onFtuxCompleted", "", "prefetchFirstLottie", "context", "Landroid/content/Context;", "isDay", "prefetchLotties", "force", "getFirstFtuxPageImpl", "()Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState;", "prefetchAllLotties", "getAllFtuxStates", "", "title", "", "defaultPrefetchAllLotties", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public abstract class GenericLadderFtuxManager<T extends GenericLadderFtuxProgressState> {
    public static final int $stable = 8;
    private final BooleanPreference shouldShowFtuxPref;

    protected abstract T getFirstFtuxPageImpl();

    protected abstract void prefetchAllLotties(Context context, boolean isDay);

    public GenericLadderFtuxManager(BooleanPreference shouldShowFtuxPref) {
        Intrinsics.checkNotNullParameter(shouldShowFtuxPref, "shouldShowFtuxPref");
        this.shouldShowFtuxPref = shouldShowFtuxPref;
    }

    public static /* synthetic */ GenericLadderFtuxProgressState getFirstFtuxPage$default(GenericLadderFtuxManager genericLadderFtuxManager, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFirstFtuxPage");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        return genericLadderFtuxManager.getFirstFtuxPage(z);
    }

    public final T getFirstFtuxPage(boolean ignorePref) {
        if (ignorePref || this.shouldShowFtuxPref.get()) {
            return (T) getFirstFtuxPageImpl();
        }
        return null;
    }

    public final void onFtuxCompleted() {
        this.shouldShowFtuxPref.set(false);
    }

    public final void prefetchFirstLottie(Context context, boolean isDay) {
        GenericLadderFtuxProgressState firstFtuxPageImpl;
        if (context == null || !this.shouldShowFtuxPref.get() || (firstFtuxPageImpl = getFirstFtuxPageImpl()) == null) {
            return;
        }
        firstFtuxPageImpl.prefetchLottie(context, isDay);
    }

    public static /* synthetic */ void prefetchLotties$default(GenericLadderFtuxManager genericLadderFtuxManager, Context context, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prefetchLotties");
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        genericLadderFtuxManager.prefetchLotties(context, z, z2);
    }

    public final void prefetchLotties(Context context, boolean isDay, boolean force) {
        if (context != null) {
            if (force || this.shouldShowFtuxPref.get()) {
                prefetchAllLotties(context, isDay);
            }
        }
    }

    public static /* synthetic */ List getAllFtuxStates$default(GenericLadderFtuxManager genericLadderFtuxManager, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAllFtuxStates");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        return genericLadderFtuxManager.getAllFtuxStates(str);
    }

    protected List<T> getAllFtuxStates(String title) {
        ArrayList arrayList = new ArrayList();
        GenericLadderFtuxProgressState firstFtuxPageImpl = getFirstFtuxPageImpl();
        while (firstFtuxPageImpl != null) {
            arrayList.add(firstFtuxPageImpl);
            firstFtuxPageImpl = firstFtuxPageImpl.nextState(title);
            if (firstFtuxPageImpl == null) {
                firstFtuxPageImpl = null;
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void defaultPrefetchAllLotties$default(GenericLadderFtuxManager genericLadderFtuxManager, Context context, boolean z, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defaultPrefetchAllLotties");
        }
        if ((i & 4) != 0) {
            str = null;
        }
        genericLadderFtuxManager.defaultPrefetchAllLotties(context, z, str);
    }

    protected void defaultPrefetchAllLotties(Context context, boolean isDay, String title) {
        Intrinsics.checkNotNullParameter(context, "context");
        Iterator<T> it = getAllFtuxStates(title).iterator();
        while (it.hasNext()) {
            ((GenericLadderFtuxProgressState) it.next()).prefetchLottie(context, isDay);
        }
    }
}
