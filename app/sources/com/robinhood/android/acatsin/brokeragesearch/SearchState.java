package com.robinhood.android.acatsin.brokeragesearch;

import com.robinhood.models.api.bonfire.ApiBrokerage;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/acatsin/brokeragesearch/SearchState;", "", "<init>", "()V", "Loading", "Error", "Success", "Lcom/robinhood/android/acatsin/brokeragesearch/SearchState$Error;", "Lcom/robinhood/android/acatsin/brokeragesearch/SearchState$Loading;", "Lcom/robinhood/android/acatsin/brokeragesearch/SearchState$Success;", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public abstract class SearchState {
    public static final int $stable = 0;

    public /* synthetic */ SearchState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: SearchState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/acatsin/brokeragesearch/SearchState$Loading;", "Lcom/robinhood/android/acatsin/brokeragesearch/SearchState;", "<init>", "()V", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading extends SearchState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    private SearchState() {
    }

    /* compiled from: SearchState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/acatsin/brokeragesearch/SearchState$Error;", "Lcom/robinhood/android/acatsin/brokeragesearch/SearchState;", "<init>", "()V", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Error extends SearchState {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        private Error() {
            super(null);
        }
    }

    /* compiled from: SearchState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/acatsin/brokeragesearch/SearchState$Success;", "Lcom/robinhood/android/acatsin/brokeragesearch/SearchState;", "results", "", "Lcom/robinhood/models/api/bonfire/ApiBrokerage;", "<init>", "(Ljava/util/List;)V", "getResults", "()Ljava/util/List;", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Success extends SearchState {
        public static final int $stable = 8;
        private final List<ApiBrokerage> results;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(List<ApiBrokerage> results) {
            super(null);
            Intrinsics.checkNotNullParameter(results, "results");
            this.results = results;
        }

        public final List<ApiBrokerage> getResults() {
            return this.results;
        }
    }
}
