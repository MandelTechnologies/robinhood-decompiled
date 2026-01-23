package com.robinhood.android.microgramsdui;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.shared.serverui.utils.UiObject;
import com.robinhood.microgram.sdui.EmbeddedSectionContent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.Monitoring;
import microgram.android.internal.guest.ResourceLoader;
import microgram.p507ui.p508v1.EmbeddedSectionContentDto;

/* compiled from: EmbeddedSectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/microgramsdui/EmbeddedSectionViewState;", "", "<init>", "()V", "Loading", "Success", "Error", "Lcom/robinhood/android/microgramsdui/EmbeddedSectionViewState$Error;", "Lcom/robinhood/android/microgramsdui/EmbeddedSectionViewState$Loading;", "Lcom/robinhood/android/microgramsdui/EmbeddedSectionViewState$Success;", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.microgramsdui.EmbeddedSectionViewState, reason: use source file name */
/* loaded from: classes8.dex */
public abstract class EmbeddedSectionDuxo4 {
    public static final int $stable = 0;

    public /* synthetic */ EmbeddedSectionDuxo4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: EmbeddedSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/microgramsdui/EmbeddedSectionViewState$Loading;", "Lcom/robinhood/android/microgramsdui/EmbeddedSectionViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.microgramsdui.EmbeddedSectionViewState$Loading */
    public static final /* data */ class Loading extends EmbeddedSectionDuxo4 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -2109696575;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    private EmbeddedSectionDuxo4() {
    }

    /* compiled from: EmbeddedSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006HÆ\u0003J\t\u0010\u0010\u001a\u00020\bHÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/microgramsdui/EmbeddedSectionViewState$Success;", "Lcom/robinhood/android/microgramsdui/EmbeddedSectionViewState;", CarResultComposable2.BODY, "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/microgram/sdui/EmbeddedSectionContent;", "Lmicrogram/ui/v1/EmbeddedSectionContentDto;", "Lcom/robinhood/microgram/sdui/AnyEmbeddedSectionContent;", "resourceLoader", "Lmicrogram/android/internal/guest/ResourceLoader;", "<init>", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;Lmicrogram/android/internal/guest/ResourceLoader;)V", "getBody", "()Lcom/robinhood/android/shared/serverui/utils/UiObject;", "getResourceLoader", "()Lmicrogram/android/internal/guest/ResourceLoader;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.microgramsdui.EmbeddedSectionViewState$Success, reason: from toString */
    public static final /* data */ class Success extends EmbeddedSectionDuxo4 {
        public static final int $stable = 8;
        private final UiObject<EmbeddedSectionContent, EmbeddedSectionContentDto> body;
        private final ResourceLoader resourceLoader;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, UiObject uiObject, ResourceLoader resourceLoader, int i, Object obj) {
            if ((i & 1) != 0) {
                uiObject = success.body;
            }
            if ((i & 2) != 0) {
                resourceLoader = success.resourceLoader;
            }
            return success.copy(uiObject, resourceLoader);
        }

        public final UiObject<EmbeddedSectionContent, EmbeddedSectionContentDto> component1() {
            return this.body;
        }

        /* renamed from: component2, reason: from getter */
        public final ResourceLoader getResourceLoader() {
            return this.resourceLoader;
        }

        public final Success copy(UiObject<EmbeddedSectionContent, EmbeddedSectionContentDto> body, ResourceLoader resourceLoader) {
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(resourceLoader, "resourceLoader");
            return new Success(body, resourceLoader);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return Intrinsics.areEqual(this.body, success.body) && Intrinsics.areEqual(this.resourceLoader, success.resourceLoader);
        }

        public int hashCode() {
            return (this.body.hashCode() * 31) + this.resourceLoader.hashCode();
        }

        public String toString() {
            return "Success(body=" + this.body + ", resourceLoader=" + this.resourceLoader + ")";
        }

        public final UiObject<EmbeddedSectionContent, EmbeddedSectionContentDto> getBody() {
            return this.body;
        }

        public final ResourceLoader getResourceLoader() {
            return this.resourceLoader;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(UiObject<EmbeddedSectionContent, EmbeddedSectionContentDto> body, ResourceLoader resourceLoader) {
            super(null);
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(resourceLoader, "resourceLoader");
            this.body = body;
            this.resourceLoader = resourceLoader;
        }
    }

    /* compiled from: EmbeddedSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/microgramsdui/EmbeddedSectionViewState$Error;", "Lcom/robinhood/android/microgramsdui/EmbeddedSectionViewState;", "state", "Lmicrogram/android/MicrogramState$Terminated;", "<init>", "(Lmicrogram/android/MicrogramState$Terminated;)V", "getState", "()Lmicrogram/android/MicrogramState$Terminated;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.microgramsdui.EmbeddedSectionViewState$Error, reason: from toString */
    public static final /* data */ class Error extends EmbeddedSectionDuxo4 {
        public static final int $stable = 8;
        private final Monitoring.Terminated state;

        public static /* synthetic */ Error copy$default(Error error, Monitoring.Terminated terminated, int i, Object obj) {
            if ((i & 1) != 0) {
                terminated = error.state;
            }
            return error.copy(terminated);
        }

        /* renamed from: component1, reason: from getter */
        public final Monitoring.Terminated getState() {
            return this.state;
        }

        public final Error copy(Monitoring.Terminated state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return new Error(state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.state, ((Error) other).state);
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        public String toString() {
            return "Error(state=" + this.state + ")";
        }

        public final Monitoring.Terminated getState() {
            return this.state;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Monitoring.Terminated state) {
            super(null);
            Intrinsics.checkNotNullParameter(state, "state");
            this.state = state;
        }
    }
}
