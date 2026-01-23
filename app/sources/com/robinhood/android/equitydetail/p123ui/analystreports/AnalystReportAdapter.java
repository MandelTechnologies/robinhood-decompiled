package com.robinhood.android.equitydetail.p123ui.analystreports;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.view.RhCardView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.databinding.IncludeAnalystReportAnalystNoteBinding;
import com.robinhood.android.equitydetail.databinding.IncludeAnalystReportArchivedNoteBinding;
import com.robinhood.android.equitydetail.databinding.IncludeAnalystReportHeaderBinding;
import com.robinhood.android.equitydetail.databinding.IncludeAnalystReportSectionBinding;
import com.robinhood.android.equitydetail.databinding.IncludeAnalystReportSectionHeaderBinding;
import com.robinhood.android.equitydetail.p123ui.analystreports.AnalystNoteDialogFragment;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.models.api.ApiAnalystReport;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.extensions.ContextsUiExtensions2;
import com.robinhood.utils.extensions.DensitySpecs;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;
import p479j$.time.Instant;

/* compiled from: AnalystReportAdapter.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003)*+B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0016J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0016H\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0016H\u0016J\u0018\u0010 \u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010!\u001a\u00020\"H\u0002J\u0018\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020%2\u0006\u0010!\u001a\u00020&H\u0002J\u0018\u0010'\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020%2\u0006\u0010!\u001a\u00020(H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportAdapter$ViewHolder;", "resources", "Landroid/content/res/Resources;", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "<init>", "(Landroid/content/res/Resources;Lcom/robinhood/android/rhimage/ImageLoader;)V", "archivedNoteHeader", "", "items", "", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportAdapter$ViewData;", "report", "Lcom/robinhood/models/api/ApiAnalystReport;", "analystReport", "getAnalystReport", "()Lcom/robinhood/models/api/ApiAnalystReport;", "setAnalystReport", "(Lcom/robinhood/models/api/ApiAnalystReport;)V", "getItemCount", "", "getItemViewType", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "onSectionClicked", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportAdapter$ViewData$Section;", "onAnalystNoteClicked", "view", "Landroid/view/View;", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportAdapter$ViewData$AnalystNote;", "onArchivedNoteClicked", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportAdapter$ViewData$ArchivedNote;", "ViewData", "ViewHolder", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AnalystReportAdapter extends RecyclerView.Adapter<ViewHolder> {
    private static final int VIEW_TYPE_ANALYST_NOTE = 2;
    private static final int VIEW_TYPE_ARCHIVED_NOTE = 4;
    private static final int VIEW_TYPE_HEADER = 3;
    private static final int VIEW_TYPE_PAGE_HEADER = 0;
    private static final int VIEW_TYPE_SECTION = 1;
    private ApiAnalystReport analystReport;
    private final String archivedNoteHeader;
    private final ImageLoader imageLoader;
    private List<? extends ViewData> items;
    public static final int $stable = 8;

    public AnalystReportAdapter(Resources resources, ImageLoader imageLoader) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        this.imageLoader = imageLoader;
        String string2 = resources.getString(C15314R.string.analyst_report_archived_note_header);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        this.archivedNoteHeader = string2;
        this.items = CollectionsKt.emptyList();
    }

    public final ApiAnalystReport getAnalystReport() {
        return this.analystReport;
    }

    public final void setAnalystReport(ApiAnalystReport apiAnalystReport) {
        List<? extends ViewData> listEmptyList;
        this.analystReport = apiAnalystReport;
        if (apiAnalystReport == null) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new ViewData.PageHeader(apiAnalystReport.getTitle(), apiAnalystReport.getAuthor()));
            List<ApiAnalystReport.Section> sections = apiAnalystReport.getSections();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(sections, 10));
            for (ApiAnalystReport.Section section : sections) {
                arrayList2.add(new ViewData.Section(section.getTitle(), section.getBody(), section.getIcon_url(), false, 8, null));
            }
            CollectionsKt.addAll(arrayList, arrayList2);
            arrayList.add(new ViewData.AnalystNote((ApiAnalystReport.Note) CollectionsKt.first((List) apiAnalystReport.getStock_analyst_notes()), null, null, null, 14, null));
            arrayList.add(new ViewData.Header(this.archivedNoteHeader));
            List<ApiAnalystReport.Note> listSubList = apiAnalystReport.getStock_analyst_notes().subList(1, apiAnalystReport.getStock_analyst_notes().size());
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSubList, 10));
            Iterator<T> it = listSubList.iterator();
            while (it.hasNext()) {
                arrayList3.add(new ViewData.ArchivedNote((ApiAnalystReport.Note) it.next(), null, null, 6, null));
            }
            CollectionsKt.addAll(arrayList, arrayList3);
            listEmptyList = arrayList;
        }
        this.items = listEmptyList;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: getItemCount */
    public int getSize() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return this.items.get(position).getViewType();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        if (viewType == 0) {
            IncludeAnalystReportHeaderBinding includeAnalystReportHeaderBindingInflate = IncludeAnalystReportHeaderBinding.inflate(layoutInflaterFrom, parent, false);
            Intrinsics.checkNotNullExpressionValue(includeAnalystReportHeaderBindingInflate, "inflate(...)");
            return new ViewHolder.PageHeader(includeAnalystReportHeaderBindingInflate);
        }
        if (viewType == 1) {
            IncludeAnalystReportSectionBinding includeAnalystReportSectionBindingInflate = IncludeAnalystReportSectionBinding.inflate(layoutInflaterFrom, parent, false);
            Intrinsics.checkNotNullExpressionValue(includeAnalystReportSectionBindingInflate, "inflate(...)");
            return new ViewHolder.Section(includeAnalystReportSectionBindingInflate, this.imageLoader);
        }
        if (viewType == 2) {
            IncludeAnalystReportAnalystNoteBinding includeAnalystReportAnalystNoteBindingInflate = IncludeAnalystReportAnalystNoteBinding.inflate(layoutInflaterFrom, parent, false);
            Intrinsics.checkNotNullExpressionValue(includeAnalystReportAnalystNoteBindingInflate, "inflate(...)");
            return new ViewHolder.AnalystNote(includeAnalystReportAnalystNoteBindingInflate);
        }
        if (viewType == 3) {
            IncludeAnalystReportSectionHeaderBinding includeAnalystReportSectionHeaderBindingInflate = IncludeAnalystReportSectionHeaderBinding.inflate(layoutInflaterFrom, parent, false);
            Intrinsics.checkNotNullExpressionValue(includeAnalystReportSectionHeaderBindingInflate, "inflate(...)");
            return new ViewHolder.Header(includeAnalystReportSectionHeaderBindingInflate);
        }
        if (viewType == 4) {
            IncludeAnalystReportArchivedNoteBinding includeAnalystReportArchivedNoteBindingInflate = IncludeAnalystReportArchivedNoteBinding.inflate(layoutInflaterFrom, parent, false);
            Intrinsics.checkNotNullExpressionValue(includeAnalystReportArchivedNoteBindingInflate, "inflate(...)");
            return new ViewHolder.ArchivedNote(includeAnalystReportArchivedNoteBindingInflate);
        }
        Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(viewType));
        throw new ExceptionsH();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final ViewData viewData = this.items.get(position);
        int itemViewType = getItemViewType(position);
        if (itemViewType == 0) {
            Intrinsics.checkNotNull(viewData, "null cannot be cast to non-null type com.robinhood.android.equitydetail.ui.analystreports.AnalystReportAdapter.ViewData.PageHeader");
            ((ViewHolder.PageHeader) holder).bind((ViewData.PageHeader) viewData);
            return;
        }
        if (itemViewType == 1) {
            Intrinsics.checkNotNull(viewData, "null cannot be cast to non-null type com.robinhood.android.equitydetail.ui.analystreports.AnalystReportAdapter.ViewData.Section");
            ((ViewHolder.Section) holder).bind((ViewData.Section) viewData, new Function0() { // from class: com.robinhood.android.equitydetail.ui.analystreports.AnalystReportAdapter$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AnalystReportAdapter.onBindViewHolder$lambda$2(this.f$0, position, viewData);
                }
            });
            return;
        }
        if (itemViewType == 2) {
            Intrinsics.checkNotNull(viewData, "null cannot be cast to non-null type com.robinhood.android.equitydetail.ui.analystreports.AnalystReportAdapter.ViewData.AnalystNote");
            ((ViewHolder.AnalystNote) holder).bind((ViewData.AnalystNote) viewData, new Function1() { // from class: com.robinhood.android.equitydetail.ui.analystreports.AnalystReportAdapter$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AnalystReportAdapter.onBindViewHolder$lambda$3(this.f$0, viewData, (View) obj);
                }
            });
        } else if (itemViewType == 3) {
            Intrinsics.checkNotNull(viewData, "null cannot be cast to non-null type com.robinhood.android.equitydetail.ui.analystreports.AnalystReportAdapter.ViewData.Header");
            ((ViewHolder.Header) holder).bind((ViewData.Header) viewData);
        } else if (itemViewType == 4) {
            Intrinsics.checkNotNull(viewData, "null cannot be cast to non-null type com.robinhood.android.equitydetail.ui.analystreports.AnalystReportAdapter.ViewData.ArchivedNote");
            ((ViewHolder.ArchivedNote) holder).bind((ViewData.ArchivedNote) viewData, new Function1() { // from class: com.robinhood.android.equitydetail.ui.analystreports.AnalystReportAdapter$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AnalystReportAdapter.onBindViewHolder$lambda$4(this.f$0, viewData, (View) obj);
                }
            });
        } else {
            Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(itemViewType));
            throw new ExceptionsH();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$2(AnalystReportAdapter analystReportAdapter, int i, ViewData viewData) {
        analystReportAdapter.onSectionClicked(i, (ViewData.Section) viewData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$3(AnalystReportAdapter analystReportAdapter, ViewData viewData, View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        analystReportAdapter.onAnalystNoteClicked(v, (ViewData.AnalystNote) viewData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$4(AnalystReportAdapter analystReportAdapter, ViewData viewData, View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        analystReportAdapter.onArchivedNoteClicked(v, (ViewData.ArchivedNote) viewData);
        return Unit.INSTANCE;
    }

    /* compiled from: AnalystReportAdapter.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\b\t\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0005\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportAdapter$ViewData;", "", "viewType", "", "<init>", "(I)V", "getViewType", "()I", "PageHeader", "Section", "AnalystNote", "Header", "ArchivedNote", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportAdapter$ViewData$AnalystNote;", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportAdapter$ViewData$ArchivedNote;", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportAdapter$ViewData$Header;", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportAdapter$ViewData$PageHeader;", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportAdapter$ViewData$Section;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class ViewData {
        public static final int $stable = 0;
        private final int viewType;

        public /* synthetic */ ViewData(int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(i);
        }

        private ViewData(int i) {
            this.viewType = i;
        }

        public final int getViewType() {
            return this.viewType;
        }

        /* compiled from: AnalystReportAdapter.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportAdapter$ViewData$PageHeader;", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportAdapter$ViewData;", "title", "", "author", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getAuthor", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class PageHeader extends ViewData {
            public static final int $stable = 0;
            private final String author;
            private final String title;

            public final String getTitle() {
                return this.title;
            }

            public final String getAuthor() {
                return this.author;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PageHeader(String title, String author) {
                super(0, null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(author, "author");
                this.title = title;
                this.author = author;
            }
        }

        /* compiled from: AnalystReportAdapter.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportAdapter$ViewData$Section;", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportAdapter$ViewData;", "title", "", CarResultComposable2.BODY, "iconUrl", "Lokhttp3/HttpUrl;", "isExpanded", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokhttp3/HttpUrl;Z)V", "getTitle", "()Ljava/lang/String;", "getBody", "()Z", "setExpanded", "(Z)V", "getIconUrl", "context", "Landroid/content/Context;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Section extends ViewData {
            public static final int $stable = 8;
            private final String body;
            private final HttpUrl iconUrl;
            private boolean isExpanded;
            private final String title;

            public /* synthetic */ Section(String str, String str2, HttpUrl httpUrl, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, httpUrl, (i & 8) != 0 ? false : z);
            }

            public final String getTitle() {
                return this.title;
            }

            public final String getBody() {
                return this.body;
            }

            /* renamed from: isExpanded, reason: from getter */
            public final boolean getIsExpanded() {
                return this.isExpanded;
            }

            public final void setExpanded(boolean z) {
                this.isExpanded = z;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Section(String title, String body, HttpUrl iconUrl, boolean z) {
                super(1, null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(body, "body");
                Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
                this.title = title;
                this.body = body;
                this.iconUrl = iconUrl;
                this.isExpanded = z;
            }

            public final HttpUrl getIconUrl(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                ContextsUiExtensions2 densitySpec = ContextsUiExtensions.getDensitySpec(context);
                return this.iconUrl.newBuilder().addEncodedPathSegment(DensitySpecs.getMultiplierString(densitySpec) + ".png").build();
            }
        }

        /* compiled from: AnalystReportAdapter.kt */
        @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportAdapter$ViewData$AnalystNote;", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportAdapter$ViewData;", "Lcom/robinhood/models/api/ApiAnalystReport$Note;", "note", "", "title", CarResultComposable2.BODY, "j$/time/Instant", "publishedAt", "<init>", "(Lcom/robinhood/models/api/ApiAnalystReport$Note;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;)V", "Lcom/robinhood/models/api/ApiAnalystReport$Note;", "getNote", "()Lcom/robinhood/models/api/ApiAnalystReport$Note;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getBody", "Lj$/time/Instant;", "getPublishedAt", "()Lj$/time/Instant;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class AnalystNote extends ViewData {
            public static final int $stable = 8;
            private final String body;
            private final ApiAnalystReport.Note note;
            private final Instant publishedAt;
            private final String title;

            public final ApiAnalystReport.Note getNote() {
                return this.note;
            }

            public /* synthetic */ AnalystNote(ApiAnalystReport.Note note, String str, String str2, Instant instant, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(note, (i & 2) != 0 ? note.getTitle() : str, (i & 4) != 0 ? note.getBody() : str2, (i & 8) != 0 ? note.getPublished_at() : instant);
            }

            public final String getTitle() {
                return this.title;
            }

            public final String getBody() {
                return this.body;
            }

            public final Instant getPublishedAt() {
                return this.publishedAt;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnalystNote(ApiAnalystReport.Note note, String title, String body, Instant publishedAt) {
                super(2, null);
                Intrinsics.checkNotNullParameter(note, "note");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(body, "body");
                Intrinsics.checkNotNullParameter(publishedAt, "publishedAt");
                this.note = note;
                this.title = title;
                this.body = body;
                this.publishedAt = publishedAt;
            }
        }

        /* compiled from: AnalystReportAdapter.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportAdapter$ViewData$Header;", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportAdapter$ViewData;", "title", "", "<init>", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Header extends ViewData {
            public static final int $stable = 0;
            private final String title;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Header(String title) {
                super(3, null);
                Intrinsics.checkNotNullParameter(title, "title");
                this.title = title;
            }

            public final String getTitle() {
                return this.title;
            }
        }

        /* compiled from: AnalystReportAdapter.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportAdapter$ViewData$ArchivedNote;", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportAdapter$ViewData;", "Lcom/robinhood/models/api/ApiAnalystReport$Note;", "note", "", "title", "j$/time/Instant", "publishedAt", "<init>", "(Lcom/robinhood/models/api/ApiAnalystReport$Note;Ljava/lang/String;Lj$/time/Instant;)V", "Lcom/robinhood/models/api/ApiAnalystReport$Note;", "getNote", "()Lcom/robinhood/models/api/ApiAnalystReport$Note;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lj$/time/Instant;", "getPublishedAt", "()Lj$/time/Instant;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class ArchivedNote extends ViewData {
            public static final int $stable = 8;
            private final ApiAnalystReport.Note note;
            private final Instant publishedAt;
            private final String title;

            public final ApiAnalystReport.Note getNote() {
                return this.note;
            }

            public /* synthetic */ ArchivedNote(ApiAnalystReport.Note note, String str, Instant instant, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(note, (i & 2) != 0 ? note.getTitle() : str, (i & 4) != 0 ? note.getPublished_at() : instant);
            }

            public final String getTitle() {
                return this.title;
            }

            public final Instant getPublishedAt() {
                return this.publishedAt;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ArchivedNote(ApiAnalystReport.Note note, String title, Instant publishedAt) {
                super(4, null);
                Intrinsics.checkNotNullParameter(note, "note");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(publishedAt, "publishedAt");
                this.note = note;
                this.title = title;
                this.publishedAt = publishedAt;
            }
        }
    }

    /* compiled from: AnalystReportAdapter.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0006\u0007\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Landroidx/viewbinding/ViewBinding;", "<init>", "(Landroidx/viewbinding/ViewBinding;)V", "PageHeader", "Section", "AnalystNote", "Header", "ArchivedNote", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportAdapter$ViewHolder$AnalystNote;", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportAdapter$ViewHolder$ArchivedNote;", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportAdapter$ViewHolder$Header;", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportAdapter$ViewHolder$PageHeader;", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportAdapter$ViewHolder$Section;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class ViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        public /* synthetic */ ViewHolder(ViewBinding viewBinding, DefaultConstructorMarker defaultConstructorMarker) {
            this(viewBinding);
        }

        private ViewHolder(ViewBinding viewBinding) {
            super(viewBinding.getRoot());
        }

        /* compiled from: AnalystReportAdapter.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportAdapter$ViewHolder$PageHeader;", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportAdapter$ViewHolder;", "binding", "Lcom/robinhood/android/equitydetail/databinding/IncludeAnalystReportHeaderBinding;", "<init>", "(Lcom/robinhood/android/equitydetail/databinding/IncludeAnalystReportHeaderBinding;)V", "bind", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportAdapter$ViewData$PageHeader;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class PageHeader extends ViewHolder {
            public static final int $stable = 8;
            private final IncludeAnalystReportHeaderBinding binding;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PageHeader(IncludeAnalystReportHeaderBinding binding) {
                super(binding, null);
                Intrinsics.checkNotNullParameter(binding, "binding");
                this.binding = binding;
            }

            public final void bind(ViewData.PageHeader data) {
                Intrinsics.checkNotNullParameter(data, "data");
                IncludeAnalystReportHeaderBinding includeAnalystReportHeaderBinding = this.binding;
                includeAnalystReportHeaderBinding.analystReportsTitle.setText(data.getTitle());
                includeAnalystReportHeaderBinding.analystReportsAuthor.setText(this.itemView.getContext().getString(C15314R.string.analyst_report_author_format, data.getAuthor()));
            }
        }

        /* compiled from: AnalystReportAdapter.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportAdapter$ViewHolder$Section;", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportAdapter$ViewHolder;", "binding", "Lcom/robinhood/android/equitydetail/databinding/IncludeAnalystReportSectionBinding;", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "<init>", "(Lcom/robinhood/android/equitydetail/databinding/IncludeAnalystReportSectionBinding;Lcom/robinhood/android/rhimage/ImageLoader;)V", "bind", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportAdapter$ViewData$Section;", "clickListener", "Lkotlin/Function0;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Section extends ViewHolder {
            public static final int $stable = 8;
            private final IncludeAnalystReportSectionBinding binding;
            private final ImageLoader imageLoader;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Section(IncludeAnalystReportSectionBinding binding, ImageLoader imageLoader) {
                super(binding, null);
                Intrinsics.checkNotNullParameter(binding, "binding");
                Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
                this.binding = binding;
                this.imageLoader = imageLoader;
            }

            public final void bind(ViewData.Section data, Function0<Unit> clickListener) {
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(clickListener, "clickListener");
                IncludeAnalystReportSectionBinding includeAnalystReportSectionBinding = this.binding;
                ImageLoader imageLoader = this.imageLoader;
                Context context = this.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                ImageLoader.ImageRequest imageRequestCenterInside = imageLoader.load(data.getIconUrl(context)).fit().centerInside();
                ImageView analystReportsSectionIconImg = includeAnalystReportSectionBinding.analystReportsSectionIconImg;
                Intrinsics.checkNotNullExpressionValue(analystReportsSectionIconImg, "analystReportsSectionIconImg");
                ImageLoader.ImageRequest.DefaultImpls.into$default(imageRequestCenterInside, analystReportsSectionIconImg, null, null, 6, null);
                includeAnalystReportSectionBinding.analystReportsSectionTitleTxt.setText(data.getTitle());
                includeAnalystReportSectionBinding.analystReportsSectionBodyTxt.setText(data.getBody());
                RhTextView analystReportsSectionBodyTxt = includeAnalystReportSectionBinding.analystReportsSectionBodyTxt;
                Intrinsics.checkNotNullExpressionValue(analystReportsSectionBodyTxt, "analystReportsSectionBodyTxt");
                if ((analystReportsSectionBodyTxt.getVisibility() == 0) != data.getIsExpanded()) {
                    RhTextView analystReportsSectionBodyTxt2 = includeAnalystReportSectionBinding.analystReportsSectionBodyTxt;
                    Intrinsics.checkNotNullExpressionValue(analystReportsSectionBodyTxt2, "analystReportsSectionBodyTxt");
                    analystReportsSectionBodyTxt2.setVisibility(data.getIsExpanded() ? 0 : 8);
                    includeAnalystReportSectionBinding.analystReportsSectionCaretImg.animate().rotation(data.getIsExpanded() ? 0.0f : 180.0f);
                }
                View itemView = this.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                OnClickListeners.onClick(itemView, clickListener);
            }
        }

        /* compiled from: AnalystReportAdapter.kt */
        @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportAdapter$ViewHolder$AnalystNote;", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportAdapter$ViewHolder;", "binding", "Lcom/robinhood/android/equitydetail/databinding/IncludeAnalystReportAnalystNoteBinding;", "<init>", "(Lcom/robinhood/android/equitydetail/databinding/IncludeAnalystReportAnalystNoteBinding;)V", "bind", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportAdapter$ViewData$AnalystNote;", "clickListener", "Lkotlin/Function1;", "Landroid/view/View;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class AnalystNote extends ViewHolder {
            public static final int $stable = 8;
            private final IncludeAnalystReportAnalystNoteBinding binding;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnalystNote(IncludeAnalystReportAnalystNoteBinding binding) {
                super(binding, null);
                Intrinsics.checkNotNullParameter(binding, "binding");
                this.binding = binding;
            }

            public final void bind(ViewData.AnalystNote data, Function1<? super View, Unit> clickListener) {
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(clickListener, "clickListener");
                IncludeAnalystReportAnalystNoteBinding includeAnalystReportAnalystNoteBinding = this.binding;
                includeAnalystReportAnalystNoteBinding.analystReportsNoteTitleTxt.setText(data.getTitle());
                includeAnalystReportAnalystNoteBinding.analystReportsNoteBodyTxt.setText(data.getBody());
                includeAnalystReportAnalystNoteBinding.analystReportsNoteDateTxt.setText(InstantFormatter.MEDIUM_DATE_IN_SYSTEM_ZONE.format(data.getPublishedAt()));
                RhCardView root = includeAnalystReportAnalystNoteBinding.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                OnClickListeners.onClickView(root, clickListener);
            }
        }

        /* compiled from: AnalystReportAdapter.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportAdapter$ViewHolder$Header;", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportAdapter$ViewHolder;", "binding", "Lcom/robinhood/android/equitydetail/databinding/IncludeAnalystReportSectionHeaderBinding;", "<init>", "(Lcom/robinhood/android/equitydetail/databinding/IncludeAnalystReportSectionHeaderBinding;)V", "bind", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportAdapter$ViewData$Header;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Header extends ViewHolder {
            public static final int $stable = 8;
            private final IncludeAnalystReportSectionHeaderBinding binding;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Header(IncludeAnalystReportSectionHeaderBinding binding) {
                super(binding, null);
                Intrinsics.checkNotNullParameter(binding, "binding");
                this.binding = binding;
            }

            public final void bind(ViewData.Header data) {
                Intrinsics.checkNotNullParameter(data, "data");
                this.binding.getRoot().setText(data.getTitle());
            }
        }

        /* compiled from: AnalystReportAdapter.kt */
        @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportAdapter$ViewHolder$ArchivedNote;", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportAdapter$ViewHolder;", "binding", "Lcom/robinhood/android/equitydetail/databinding/IncludeAnalystReportArchivedNoteBinding;", "<init>", "(Lcom/robinhood/android/equitydetail/databinding/IncludeAnalystReportArchivedNoteBinding;)V", "bind", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportAdapter$ViewData$ArchivedNote;", "clickListener", "Lkotlin/Function1;", "Landroid/view/View;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class ArchivedNote extends ViewHolder {
            public static final int $stable = 8;
            private final IncludeAnalystReportArchivedNoteBinding binding;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ArchivedNote(IncludeAnalystReportArchivedNoteBinding binding) {
                super(binding, null);
                Intrinsics.checkNotNullParameter(binding, "binding");
                this.binding = binding;
            }

            public final void bind(ViewData.ArchivedNote data, Function1<? super View, Unit> clickListener) {
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(clickListener, "clickListener");
                IncludeAnalystReportArchivedNoteBinding includeAnalystReportArchivedNoteBinding = this.binding;
                includeAnalystReportArchivedNoteBinding.analystReportsNoteTitleTxt.setText(data.getTitle());
                includeAnalystReportArchivedNoteBinding.analystReportsNoteDateTxt.setText(InstantFormatter.MEDIUM_DATE_IN_SYSTEM_ZONE.format(data.getPublishedAt()));
                RhCardView root = includeAnalystReportArchivedNoteBinding.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                OnClickListeners.onClickView(root, clickListener);
            }
        }
    }

    private final void onSectionClicked(int position, ViewData.Section data) {
        data.setExpanded(!data.getIsExpanded());
        notifyItemChanged(position);
    }

    private final void onAnalystNoteClicked(View view, ViewData.AnalystNote data) {
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AppCompatActivity appCompatActivityFindActivityBaseContext = BaseContexts.findActivityBaseContext(context);
        Intrinsics.checkNotNull(appCompatActivityFindActivityBaseContext);
        AnalystNoteDialogFragment.Builder builderCreate = AnalystNoteDialogFragment.INSTANCE.create(appCompatActivityFindActivityBaseContext, data.getNote());
        FragmentManager supportFragmentManager = appCompatActivityFindActivityBaseContext.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        RhDialogFragment.Builder.show$default(builderCreate, supportFragmentManager, "analystNote", false, 4, null);
    }

    private final void onArchivedNoteClicked(View view, ViewData.ArchivedNote data) {
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AppCompatActivity appCompatActivityFindActivityBaseContext = BaseContexts.findActivityBaseContext(context);
        Intrinsics.checkNotNull(appCompatActivityFindActivityBaseContext);
        AnalystNoteDialogFragment.Builder builderCreate = AnalystNoteDialogFragment.INSTANCE.create(appCompatActivityFindActivityBaseContext, data.getNote());
        FragmentManager supportFragmentManager = appCompatActivityFindActivityBaseContext.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        RhDialogFragment.Builder.show$default(builderCreate, supportFragmentManager, "analystNote", false, 4, null);
    }
}
