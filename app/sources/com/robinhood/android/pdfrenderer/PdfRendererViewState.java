package com.robinhood.android.pdfrenderer;

import com.robinhood.android.pdfrenderer.RhPdfRenderer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: PdfRendererViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/pdfrenderer/PdfRendererViewState;", "", "title", "", "<init>", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "Loading", "Loaded", "Lcom/robinhood/android/pdfrenderer/PdfRendererViewState$Loaded;", "Lcom/robinhood/android/pdfrenderer/PdfRendererViewState$Loading;", "lib-pdf-renderer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public abstract class PdfRendererViewState {
    public static final int $stable = 0;
    private final String title;

    public /* synthetic */ PdfRendererViewState(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* compiled from: PdfRendererViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/pdfrenderer/PdfRendererViewState$Loading;", "Lcom/robinhood/android/pdfrenderer/PdfRendererViewState;", "title", "", "<init>", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-pdf-renderer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading extends PdfRendererViewState {
        public static final int $stable = 0;
        private final String title;

        public static /* synthetic */ Loading copy$default(Loading loading, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loading.title;
            }
            return loading.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final Loading copy(String title) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new Loading(title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && Intrinsics.areEqual(this.title, ((Loading) other).title);
        }

        public int hashCode() {
            return this.title.hashCode();
        }

        public String toString() {
            return "Loading(title=" + this.title + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(String title) {
            super(title, null);
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
        }

        @Override // com.robinhood.android.pdfrenderer.PdfRendererViewState
        public String getTitle() {
            return this.title;
        }
    }

    private PdfRendererViewState(String str) {
        this.title = str;
    }

    public String getTitle() {
        return this.title;
    }

    /* compiled from: PdfRendererViewState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u00060\u0006R\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000f\u001a\f\u0012\b\u0012\u00060\u0006R\u00020\u00070\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\b\u0012\u00060\u0006R\u00020\u00070\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0004\u001a\f\u0012\b\u0012\u00060\u0006R\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/pdfrenderer/PdfRendererViewState$Loaded;", "Lcom/robinhood/android/pdfrenderer/PdfRendererViewState;", "title", "", "pages", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/pdfrenderer/RhPdfRenderer$Page;", "Lcom/robinhood/android/pdfrenderer/RhPdfRenderer;", "<init>", "(Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;)V", "getTitle", "()Ljava/lang/String;", "getPages", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-pdf-renderer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded extends PdfRendererViewState {
        public static final int $stable = 8;
        private final ImmutableList<RhPdfRenderer.Page> pages;
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, String str, ImmutableList immutableList, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loaded.title;
            }
            if ((i & 2) != 0) {
                immutableList = loaded.pages;
            }
            return loaded.copy(str, immutableList);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final ImmutableList<RhPdfRenderer.Page> component2() {
            return this.pages;
        }

        public final Loaded copy(String title, ImmutableList<RhPdfRenderer.Page> pages) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(pages, "pages");
            return new Loaded(title, pages);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.title, loaded.title) && Intrinsics.areEqual(this.pages, loaded.pages);
        }

        public int hashCode() {
            return (this.title.hashCode() * 31) + this.pages.hashCode();
        }

        public String toString() {
            return "Loaded(title=" + this.title + ", pages=" + this.pages + ")";
        }

        @Override // com.robinhood.android.pdfrenderer.PdfRendererViewState
        public String getTitle() {
            return this.title;
        }

        public final ImmutableList<RhPdfRenderer.Page> getPages() {
            return this.pages;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(String title, ImmutableList<RhPdfRenderer.Page> pages) {
            super(title, null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(pages, "pages");
            this.title = title;
            this.pages = pages;
        }
    }
}
