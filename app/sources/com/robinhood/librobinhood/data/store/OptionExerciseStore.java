package com.robinhood.librobinhood.data.store;

import androidx.room.RoomDatabase;
import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.models.api.ApiOptionEvent;
import com.robinhood.models.api.ApiOptionExerciseChecks;
import com.robinhood.models.api.ApiOptionExerciseRequest;
import com.robinhood.models.dao.OptionEventDao;
import com.robinhood.models.p320db.OptionEvent;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import timber.log.Timber;

/* compiled from: OptionExerciseStore.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u0010\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012\u0012\u0004\u0012\u00020\u000e0\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000e0\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R)\u0010\u001a\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionExerciseStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/OptionEventDao;", "optionsApi", "Lcom/robinhood/android/api/options/retrofit/OptionsApi;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/OptionEventDao;Lcom/robinhood/android/api/options/retrofit/OptionsApi;)V", "getOptionsApi", "()Lcom/robinhood/android/api/options/retrofit/OptionsApi;", "saveAction", "Lkotlin/Function1;", "Lcom/robinhood/models/api/ApiOptionEvent;", "", "cancelOptionExercise", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lkotlin/Pair;", "Ljava/util/UUID;", "", "getCancelOptionExercise", "()Lcom/robinhood/android/moria/network/PostEndpoint;", "submitOptionExercise", "Lcom/robinhood/models/api/ApiOptionExerciseRequest;", "getSubmitOptionExercise", "getOptionExerciseChecks", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/models/api/ApiOptionExerciseChecks;", "getGetOptionExerciseChecks", "()Lcom/robinhood/android/moria/network/Endpoint;", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class OptionExerciseStore extends Store {
    private final PostEndpoint<Tuples2<UUID, String>, ApiOptionEvent> cancelOptionExercise;
    private final OptionEventDao dao;
    private final Endpoint<Tuples2<String, UUID>, ApiOptionExerciseChecks> getOptionExerciseChecks;
    private final OptionsApi optionsApi;
    private final Function1<ApiOptionEvent, Unit> saveAction;
    private final PostEndpoint<ApiOptionExerciseRequest, ApiOptionEvent> submitOptionExercise;

    public final OptionsApi getOptionsApi() {
        return this.optionsApi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionExerciseStore(StoreBundle storeBundle, final OptionEventDao dao, OptionsApi optionsApi) {
        super(storeBundle, OptionEvent.INSTANCE);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(optionsApi, "optionsApi");
        this.dao = dao;
        this.optionsApi = optionsApi;
        final LogoutKillswitch logoutKillswitch = ((Store) this).logoutKillswitch;
        final RoomDatabase roomDatabase = ((Store) this).roomDatabase;
        this.saveAction = new Function1<ApiOptionEvent, Unit>() { // from class: com.robinhood.librobinhood.data.store.OptionExerciseStore$special$$inlined$safeSave$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ApiOptionEvent apiOptionEvent) {
                m22681invoke(apiOptionEvent);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m22681invoke(ApiOptionEvent apiOptionEvent) {
                if (!logoutKillswitch.isLoggedOut()) {
                    try {
                        dao.insert(apiOptionEvent);
                        return;
                    } catch (IllegalStateException e) {
                        if (logoutKillswitch.isLoggedOut()) {
                            Timber.INSTANCE.mo3355e(e, "Ignoring exception due to logout.", new Object[0]);
                            try {
                                roomDatabase.close();
                                return;
                            } catch (Throwable unused) {
                                return;
                            }
                        }
                        throw e;
                    }
                }
                Timber.INSTANCE.mo3350d("Skipping save due to logout", new Object[0]);
            }
        };
        PostEndpoint.Companion companion = PostEndpoint.INSTANCE;
        this.cancelOptionExercise = companion.create(new OptionExerciseStore2(this, null), new OptionExerciseStore3(this, null));
        this.submitOptionExercise = companion.create(new OptionExerciseStore6(optionsApi), new OptionExerciseStore7(this, null));
        this.getOptionExerciseChecks = Endpoint.Companion.create$default(Endpoint.INSTANCE, new OptionExerciseStore4(this, null), getLogoutKillswitch(), new OptionExerciseStore5(null), storeBundle.getClock(), null, 16, null);
    }

    public final PostEndpoint<Tuples2<UUID, String>, ApiOptionEvent> getCancelOptionExercise() {
        return this.cancelOptionExercise;
    }

    public final PostEndpoint<ApiOptionExerciseRequest, ApiOptionEvent> getSubmitOptionExercise() {
        return this.submitOptionExercise;
    }

    public final Endpoint<Tuples2<String, UUID>, ApiOptionExerciseChecks> getGetOptionExerciseChecks() {
        return this.getOptionExerciseChecks;
    }
}
