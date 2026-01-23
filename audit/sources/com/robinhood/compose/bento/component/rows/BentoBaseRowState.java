package com.robinhood.compose.bento.component.rows;

import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.unit.C2002Dp;
import com.adjust.sdk.Constants;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.markdown.compose.MarkdownText4;
import com.robinhood.compose.bento.component.BentoPogBackgroundOverride;
import com.robinhood.compose.bento.component.BentoPogSize;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.hammer.android.GenerateMockLoadingState2;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.resource.StringResource;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.extensions2;

/* compiled from: BentoBaseRow.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u00042345BU\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fBa\b\u0016\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u0012Bc\b\u0016\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u0014J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010*\u001a\u00020\fHÆ\u0003J\t\u0010+\u001a\u00020\fHÆ\u0003JW\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001J\u0013\u0010-\u001a\u00020\f2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0014\u0010!\u001a\u00020\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u00066"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState;", "", "start", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start;", "primaryText", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Text;", "secondaryText", Constants.REFERRER_API_META, "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta;", "end", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$End;", "enabled", "", "loading", "<init>", "(Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start;Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Text;Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Text;Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta;Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$End;ZZ)V", "", "markdownSecondaryText", "(Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta;Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$End;ZZ)V", "Landroidx/compose/ui/text/AnnotatedString;", "(Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start;Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Text;Landroidx/compose/ui/text/AnnotatedString;Ljava/lang/String;Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta;Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$End;ZZ)V", "getStart", "()Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start;", "getPrimaryText", "()Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Text;", "getSecondaryText", "getMeta", "()Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta;", "getEnd", "()Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$End;", "getEnabled", "()Z", "getLoading", "metaModifier", "Landroidx/compose/ui/Modifier;", "getMetaModifier$lib_compose_bento_externalRelease", "()Landroidx/compose/ui/Modifier;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "Start", "Text", "Meta", "End", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final /* data */ class BentoBaseRowState {
    public static final int $stable = 0;
    private final boolean enabled;
    private final End end;
    private final boolean loading;
    private final Meta meta;
    private final Text primaryText;
    private final Text secondaryText;
    private final Start start;

    public BentoBaseRowState() {
        this(null, null, null, null, null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public static /* synthetic */ BentoBaseRowState copy$default(BentoBaseRowState bentoBaseRowState, Start start, Text text, Text text2, Meta meta, End end, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            start = bentoBaseRowState.start;
        }
        if ((i & 2) != 0) {
            text = bentoBaseRowState.primaryText;
        }
        if ((i & 4) != 0) {
            text2 = bentoBaseRowState.secondaryText;
        }
        if ((i & 8) != 0) {
            meta = bentoBaseRowState.meta;
        }
        if ((i & 16) != 0) {
            end = bentoBaseRowState.end;
        }
        if ((i & 32) != 0) {
            z = bentoBaseRowState.enabled;
        }
        if ((i & 64) != 0) {
            z2 = bentoBaseRowState.loading;
        }
        boolean z3 = z;
        boolean z4 = z2;
        End end2 = end;
        Text text3 = text2;
        return bentoBaseRowState.copy(start, text, text3, meta, end2, z3, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final Start getStart() {
        return this.start;
    }

    /* renamed from: component2, reason: from getter */
    public final Text getPrimaryText() {
        return this.primaryText;
    }

    /* renamed from: component3, reason: from getter */
    public final Text getSecondaryText() {
        return this.secondaryText;
    }

    /* renamed from: component4, reason: from getter */
    public final Meta getMeta() {
        return this.meta;
    }

    /* renamed from: component5, reason: from getter */
    public final End getEnd() {
        return this.end;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    public final BentoBaseRowState copy(Start start, Text primaryText, Text secondaryText, Meta meta, End end, boolean enabled, boolean loading) {
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        return new BentoBaseRowState(start, primaryText, secondaryText, meta, end, enabled, loading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BentoBaseRowState)) {
            return false;
        }
        BentoBaseRowState bentoBaseRowState = (BentoBaseRowState) other;
        return Intrinsics.areEqual(this.start, bentoBaseRowState.start) && Intrinsics.areEqual(this.primaryText, bentoBaseRowState.primaryText) && Intrinsics.areEqual(this.secondaryText, bentoBaseRowState.secondaryText) && Intrinsics.areEqual(this.meta, bentoBaseRowState.meta) && Intrinsics.areEqual(this.end, bentoBaseRowState.end) && this.enabled == bentoBaseRowState.enabled && this.loading == bentoBaseRowState.loading;
    }

    public int hashCode() {
        Start start = this.start;
        int iHashCode = (((start == null ? 0 : start.hashCode()) * 31) + this.primaryText.hashCode()) * 31;
        Text text = this.secondaryText;
        int iHashCode2 = (iHashCode + (text == null ? 0 : text.hashCode())) * 31;
        Meta meta = this.meta;
        int iHashCode3 = (iHashCode2 + (meta == null ? 0 : meta.hashCode())) * 31;
        End end = this.end;
        return ((((iHashCode3 + (end != null ? end.hashCode() : 0)) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.loading);
    }

    public String toString() {
        return "BentoBaseRowState(start=" + this.start + ", primaryText=" + this.primaryText + ", secondaryText=" + this.secondaryText + ", meta=" + this.meta + ", end=" + this.end + ", enabled=" + this.enabled + ", loading=" + this.loading + ")";
    }

    public BentoBaseRowState(Start start, Text primaryText, Text text, Meta meta, End end, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        this.start = start;
        this.primaryText = primaryText;
        this.secondaryText = text;
        this.meta = meta;
        this.end = end;
        this.enabled = z;
        this.loading = z2;
    }

    public final Start getStart() {
        return this.start;
    }

    public /* synthetic */ BentoBaseRowState(Start start, Text text, Text text2, Meta meta, End end, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : start, (i & 2) != 0 ? new Text.Plain("") : text, (i & 4) != 0 ? null : text2, (i & 8) != 0 ? null : meta, (i & 16) != 0 ? null : end, (i & 32) != 0 ? true : z, (i & 64) != 0 ? false : z2);
    }

    public final Text getPrimaryText() {
        return this.primaryText;
    }

    public final Text getSecondaryText() {
        return this.secondaryText;
    }

    public final Meta getMeta() {
        return this.meta;
    }

    public final End getEnd() {
        return this.end;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public /* synthetic */ BentoBaseRowState(Start start, String str, String str2, String str3, Meta meta, End end, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : start, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : meta, (i & 32) != 0 ? null : end, (i & 64) != 0 ? true : z, (i & 128) != 0 ? false : z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BentoBaseRowState(Start start, String primaryText, String str, String str2, Meta meta, End end, boolean z, boolean z2) {
        AnnotatedString annotatedString;
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Text.Plain plain = new Text.Plain(primaryText);
        List list = null;
        Object[] objArr = 0;
        if (str != null) {
            annotatedString = new AnnotatedString(str, list, 2, objArr == true ? 1 : 0);
        } else {
            annotatedString = null;
        }
        this(start, plain, annotatedString, str2, meta, end, z, z2);
    }

    public /* synthetic */ BentoBaseRowState(Start start, Text text, AnnotatedString annotatedString, String str, Meta meta, End end, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : start, (i & 2) != 0 ? new Text.Plain("") : text, (i & 4) != 0 ? null : annotatedString, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : meta, (i & 32) != 0 ? null : end, (i & 64) != 0 ? true : z, (i & 128) != 0 ? false : z2);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public BentoBaseRowState(com.robinhood.compose.bento.component.rows.BentoBaseRowState.Start r11, com.robinhood.compose.bento.component.rows.BentoBaseRowState.Text r12, androidx.compose.p011ui.text.AnnotatedString r13, java.lang.String r14, com.robinhood.compose.bento.component.rows.BentoBaseRowState.Meta r15, com.robinhood.compose.bento.component.rows.BentoBaseRowState.End r16, boolean r17, boolean r18) {
        /*
            r10 = this;
            java.lang.String r0 = "primaryText"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            if (r14 == 0) goto L20
            com.robinhood.compose.bento.component.rows.BentoBaseRowState$Text$Markdown r1 = new com.robinhood.compose.bento.component.rows.BentoBaseRowState$Text$Markdown
            int r3 = com.robinhood.android.libdesignsystem.C20690R.attr.textAppearanceRegularSmall
            r6 = 12
            r7 = 0
            r4 = 0
            r5 = 0
            r2 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
        L14:
            r2 = r10
            r3 = r11
            r4 = r12
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r5 = r1
            goto L34
        L20:
            r1 = 0
            if (r13 == 0) goto L14
            com.robinhood.compose.bento.component.rows.BentoBaseRowState$Text$Annotated r14 = new com.robinhood.compose.bento.component.rows.BentoBaseRowState$Text$Annotated
            r0 = 2
            r14.<init>(r13, r1, r0, r1)
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
        L34:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.compose.bento.component.rows.BentoBaseRowState.<init>(com.robinhood.compose.bento.component.rows.BentoBaseRowState$Start, com.robinhood.compose.bento.component.rows.BentoBaseRowState$Text, androidx.compose.ui.text.AnnotatedString, java.lang.String, com.robinhood.compose.bento.component.rows.BentoBaseRowState$Meta, com.robinhood.compose.bento.component.rows.BentoBaseRowState$End, boolean, boolean):void");
    }

    /* compiled from: BentoBaseRow.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start;", "", "<init>", "()V", "Icon", "Image", "Drawable", "NumberPog", "PictogramPog", "TextPog", "FlagIcon", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start$Drawable;", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start$FlagIcon;", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start$Icon;", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start$Image;", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start$NumberPog;", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start$PictogramPog;", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start$TextPog;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Start {
        public static final int $stable = 0;

        public /* synthetic */ Start(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Start() {
        }

        /* compiled from: BentoBaseRow.kt */
        @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\b\u0013J0\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\b\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start$Icon;", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start;", "asset24dp", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "layeredAsset", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start$Icon$LayeredAsset;", "tint", "Landroidx/compose/ui/graphics/Color;", "<init>", "(Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start$Icon$LayeredAsset;Landroidx/compose/ui/graphics/Color;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAsset24dp", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getLayeredAsset", "()Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start$Icon$LayeredAsset;", "getTint-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "component1", "component2", "component3", "component3-QN2ZGVo", "copy", "copy-t9lfQc4", "equals", "", "other", "", "hashCode", "", "toString", "", "LayeredAsset", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Icon extends Start {
            public static final int $stable = 0;
            private final ServerToBentoAssetMapper2 asset24dp;
            private final LayeredAsset layeredAsset;
            private final Color tint;

            public /* synthetic */ Icon(ServerToBentoAssetMapper2 serverToBentoAssetMapper2, LayeredAsset layeredAsset, Color color, DefaultConstructorMarker defaultConstructorMarker) {
                this(serverToBentoAssetMapper2, layeredAsset, color);
            }

            /* renamed from: copy-t9lfQc4$default, reason: not valid java name */
            public static /* synthetic */ Icon m20941copyt9lfQc4$default(Icon icon, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, LayeredAsset layeredAsset, Color color, int i, Object obj) {
                if ((i & 1) != 0) {
                    serverToBentoAssetMapper2 = icon.asset24dp;
                }
                if ((i & 2) != 0) {
                    layeredAsset = icon.layeredAsset;
                }
                if ((i & 4) != 0) {
                    color = icon.tint;
                }
                return icon.m20943copyt9lfQc4(serverToBentoAssetMapper2, layeredAsset, color);
            }

            /* renamed from: component1, reason: from getter */
            public final ServerToBentoAssetMapper2 getAsset24dp() {
                return this.asset24dp;
            }

            /* renamed from: component2, reason: from getter */
            public final LayeredAsset getLayeredAsset() {
                return this.layeredAsset;
            }

            /* renamed from: component3-QN2ZGVo, reason: not valid java name and from getter */
            public final Color getTint() {
                return this.tint;
            }

            /* renamed from: copy-t9lfQc4, reason: not valid java name */
            public final Icon m20943copyt9lfQc4(ServerToBentoAssetMapper2 asset24dp, LayeredAsset layeredAsset, Color tint) {
                Intrinsics.checkNotNullParameter(asset24dp, "asset24dp");
                return new Icon(asset24dp, layeredAsset, tint, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Icon)) {
                    return false;
                }
                Icon icon = (Icon) other;
                return this.asset24dp == icon.asset24dp && Intrinsics.areEqual(this.layeredAsset, icon.layeredAsset) && Intrinsics.areEqual(this.tint, icon.tint);
            }

            public int hashCode() {
                int iHashCode = this.asset24dp.hashCode() * 31;
                LayeredAsset layeredAsset = this.layeredAsset;
                int iHashCode2 = (iHashCode + (layeredAsset == null ? 0 : layeredAsset.hashCode())) * 31;
                Color color = this.tint;
                return iHashCode2 + (color != null ? Color.m6713hashCodeimpl(color.getValue()) : 0);
            }

            public String toString() {
                return "Icon(asset24dp=" + this.asset24dp + ", layeredAsset=" + this.layeredAsset + ", tint=" + this.tint + ")";
            }

            public /* synthetic */ Icon(ServerToBentoAssetMapper2 serverToBentoAssetMapper2, LayeredAsset layeredAsset, Color color, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(serverToBentoAssetMapper2, (i & 2) != 0 ? null : layeredAsset, (i & 4) != 0 ? null : color, null);
            }

            public final ServerToBentoAssetMapper2 getAsset24dp() {
                return this.asset24dp;
            }

            public final LayeredAsset getLayeredAsset() {
                return this.layeredAsset;
            }

            /* renamed from: getTint-QN2ZGVo, reason: not valid java name */
            public final Color m20944getTintQN2ZGVo() {
                return this.tint;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private Icon(ServerToBentoAssetMapper2 asset24dp, LayeredAsset layeredAsset, Color color) {
                super(null);
                Intrinsics.checkNotNullParameter(asset24dp, "asset24dp");
                this.asset24dp = asset24dp;
                this.layeredAsset = layeredAsset;
                this.tint = color;
            }

            /* compiled from: BentoBaseRow.kt */
            @GenerateMockLoadingState2(parameterName = "alignment", parameterValue = "androidx.compose.ui.Alignment.BottomEnd")
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start$Icon$LayeredAsset;", "", "asset12dp", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "alignment", "Landroidx/compose/ui/Alignment;", "<init>", "(Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Landroidx/compose/ui/Alignment;)V", "getAsset12dp", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getAlignment", "()Landroidx/compose/ui/Alignment;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class LayeredAsset {
                public static final int $stable = 0;
                private final Alignment alignment;
                private final ServerToBentoAssetMapper2 asset12dp;

                public static /* synthetic */ LayeredAsset copy$default(LayeredAsset layeredAsset, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, Alignment alignment, int i, Object obj) {
                    if ((i & 1) != 0) {
                        serverToBentoAssetMapper2 = layeredAsset.asset12dp;
                    }
                    if ((i & 2) != 0) {
                        alignment = layeredAsset.alignment;
                    }
                    return layeredAsset.copy(serverToBentoAssetMapper2, alignment);
                }

                /* renamed from: component1, reason: from getter */
                public final ServerToBentoAssetMapper2 getAsset12dp() {
                    return this.asset12dp;
                }

                /* renamed from: component2, reason: from getter */
                public final Alignment getAlignment() {
                    return this.alignment;
                }

                public final LayeredAsset copy(ServerToBentoAssetMapper2 asset12dp, Alignment alignment) {
                    Intrinsics.checkNotNullParameter(asset12dp, "asset12dp");
                    Intrinsics.checkNotNullParameter(alignment, "alignment");
                    return new LayeredAsset(asset12dp, alignment);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof LayeredAsset)) {
                        return false;
                    }
                    LayeredAsset layeredAsset = (LayeredAsset) other;
                    return this.asset12dp == layeredAsset.asset12dp && Intrinsics.areEqual(this.alignment, layeredAsset.alignment);
                }

                public int hashCode() {
                    return (this.asset12dp.hashCode() * 31) + this.alignment.hashCode();
                }

                public String toString() {
                    return "LayeredAsset(asset12dp=" + this.asset12dp + ", alignment=" + this.alignment + ")";
                }

                public LayeredAsset(ServerToBentoAssetMapper2 asset12dp, Alignment alignment) {
                    Intrinsics.checkNotNullParameter(asset12dp, "asset12dp");
                    Intrinsics.checkNotNullParameter(alignment, "alignment");
                    this.asset12dp = asset12dp;
                    this.alignment = alignment;
                }

                public final ServerToBentoAssetMapper2 getAsset12dp() {
                    return this.asset12dp;
                }

                public /* synthetic */ LayeredAsset(ServerToBentoAssetMapper2 serverToBentoAssetMapper2, Alignment alignment, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this(serverToBentoAssetMapper2, (i & 2) != 0 ? Alignment.INSTANCE.getBottomEnd() : alignment);
                }

                public final Alignment getAlignment() {
                    return this.alignment;
                }
            }
        }

        /* compiled from: BentoBaseRow.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001&BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003JI\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006'"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start$Image;", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start;", MarkdownText4.TagImageUrl, "", "contentDescription", "size", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start$Image$ImageSize;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "clipShape", "Landroidx/compose/ui/graphics/Shape;", "backupText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start$Image$ImageSize;Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/ui/graphics/Shape;Ljava/lang/String;)V", "getImageUrl", "()Ljava/lang/String;", "getContentDescription", "getSize", "()Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start$Image$ImageSize;", "getContentScale", "()Landroidx/compose/ui/layout/ContentScale;", "getClipShape", "()Landroidx/compose/ui/graphics/Shape;", "getBackupText", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ImageSize", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Image extends Start {
            public static final int $stable = 0;
            private final String backupText;
            private final Shape clipShape;
            private final String contentDescription;
            private final ContentScale contentScale;
            private final String imageUrl;
            private final ImageSize size;

            public static /* synthetic */ Image copy$default(Image image, String str, String str2, ImageSize imageSize, ContentScale contentScale, Shape shape, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = image.imageUrl;
                }
                if ((i & 2) != 0) {
                    str2 = image.contentDescription;
                }
                if ((i & 4) != 0) {
                    imageSize = image.size;
                }
                if ((i & 8) != 0) {
                    contentScale = image.contentScale;
                }
                if ((i & 16) != 0) {
                    shape = image.clipShape;
                }
                if ((i & 32) != 0) {
                    str3 = image.backupText;
                }
                Shape shape2 = shape;
                String str4 = str3;
                return image.copy(str, str2, imageSize, contentScale, shape2, str4);
            }

            /* renamed from: component1, reason: from getter */
            public final String getImageUrl() {
                return this.imageUrl;
            }

            /* renamed from: component2, reason: from getter */
            public final String getContentDescription() {
                return this.contentDescription;
            }

            /* renamed from: component3, reason: from getter */
            public final ImageSize getSize() {
                return this.size;
            }

            /* renamed from: component4, reason: from getter */
            public final ContentScale getContentScale() {
                return this.contentScale;
            }

            /* renamed from: component5, reason: from getter */
            public final Shape getClipShape() {
                return this.clipShape;
            }

            /* renamed from: component6, reason: from getter */
            public final String getBackupText() {
                return this.backupText;
            }

            public final Image copy(String imageUrl, String contentDescription, ImageSize size, ContentScale contentScale, Shape clipShape, String backupText) {
                Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
                Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
                Intrinsics.checkNotNullParameter(size, "size");
                Intrinsics.checkNotNullParameter(contentScale, "contentScale");
                return new Image(imageUrl, contentDescription, size, contentScale, clipShape, backupText);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Image)) {
                    return false;
                }
                Image image = (Image) other;
                return Intrinsics.areEqual(this.imageUrl, image.imageUrl) && Intrinsics.areEqual(this.contentDescription, image.contentDescription) && this.size == image.size && Intrinsics.areEqual(this.contentScale, image.contentScale) && Intrinsics.areEqual(this.clipShape, image.clipShape) && Intrinsics.areEqual(this.backupText, image.backupText);
            }

            public int hashCode() {
                int iHashCode = ((((((this.imageUrl.hashCode() * 31) + this.contentDescription.hashCode()) * 31) + this.size.hashCode()) * 31) + this.contentScale.hashCode()) * 31;
                Shape shape = this.clipShape;
                int iHashCode2 = (iHashCode + (shape == null ? 0 : shape.hashCode())) * 31;
                String str = this.backupText;
                return iHashCode2 + (str != null ? str.hashCode() : 0);
            }

            public String toString() {
                return "Image(imageUrl=" + this.imageUrl + ", contentDescription=" + this.contentDescription + ", size=" + this.size + ", contentScale=" + this.contentScale + ", clipShape=" + this.clipShape + ", backupText=" + this.backupText + ")";
            }

            public final String getImageUrl() {
                return this.imageUrl;
            }

            public final String getContentDescription() {
                return this.contentDescription;
            }

            public /* synthetic */ Image(String str, String str2, ImageSize imageSize, ContentScale contentScale, Shape shape, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i & 4) != 0 ? ImageSize.Standard : imageSize, (i & 8) != 0 ? ContentScale.INSTANCE.getFit() : contentScale, (i & 16) != 0 ? null : shape, (i & 32) != 0 ? null : str3);
            }

            public final ImageSize getSize() {
                return this.size;
            }

            public final ContentScale getContentScale() {
                return this.contentScale;
            }

            public final Shape getClipShape() {
                return this.clipShape;
            }

            public final String getBackupText() {
                return this.backupText;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Image(String imageUrl, String contentDescription, ImageSize size, ContentScale contentScale, Shape shape, String str) {
                super(null);
                Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
                Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
                Intrinsics.checkNotNullParameter(size, "size");
                Intrinsics.checkNotNullParameter(contentScale, "contentScale");
                this.imageUrl = imageUrl;
                this.contentDescription = contentDescription;
                this.size = size;
                this.contentScale = contentScale;
                this.clipShape = shape;
                this.backupText = str;
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: BentoBaseRow.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start$Image$ImageSize;", "", "value", "Landroidx/compose/ui/unit/Dp;", "<init>", "(Ljava/lang/String;IF)V", "getValue-D9Ej5fM", "()F", "F", "Small", "Standard", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            public static final class ImageSize {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ ImageSize[] $VALUES;
                public static final ImageSize Small = new ImageSize("Small", 0, C2002Dp.m7995constructorimpl(24));
                public static final ImageSize Standard = new ImageSize("Standard", 1, C2002Dp.m7995constructorimpl(48));
                private final float value;

                private static final /* synthetic */ ImageSize[] $values() {
                    return new ImageSize[]{Small, Standard};
                }

                public static EnumEntries<ImageSize> getEntries() {
                    return $ENTRIES;
                }

                private ImageSize(String str, int i, float f) {
                    this.value = f;
                }

                /* renamed from: getValue-D9Ej5fM, reason: not valid java name and from getter */
                public final float getValue() {
                    return this.value;
                }

                static {
                    ImageSize[] imageSizeArr$values = $values();
                    $VALUES = imageSizeArr$values;
                    $ENTRIES = EnumEntries2.enumEntries(imageSizeArr$values);
                }

                public static ImageSize valueOf(String str) {
                    return (ImageSize) Enum.valueOf(ImageSize.class, str);
                }

                public static ImageSize[] values() {
                    return (ImageSize[]) $VALUES.clone();
                }
            }
        }

        /* compiled from: BentoBaseRow.kt */
        @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001$B=\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003J?\u0010\u001d\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start$Drawable;", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start;", "drawableRes", "", "contentDescription", "", "size", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start$Drawable$ImageSize;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "clipShape", "Landroidx/compose/ui/graphics/Shape;", "<init>", "(ILjava/lang/String;Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start$Drawable$ImageSize;Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/ui/graphics/Shape;)V", "getDrawableRes", "()I", "getContentDescription", "()Ljava/lang/String;", "getSize", "()Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start$Drawable$ImageSize;", "getContentScale", "()Landroidx/compose/ui/layout/ContentScale;", "getClipShape", "()Landroidx/compose/ui/graphics/Shape;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "ImageSize", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Drawable extends Start {
            public static final int $stable = 0;
            private final Shape clipShape;
            private final String contentDescription;
            private final ContentScale contentScale;
            private final int drawableRes;
            private final ImageSize size;

            public static /* synthetic */ Drawable copy$default(Drawable drawable, int i, String str, ImageSize imageSize, ContentScale contentScale, Shape shape, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = drawable.drawableRes;
                }
                if ((i2 & 2) != 0) {
                    str = drawable.contentDescription;
                }
                if ((i2 & 4) != 0) {
                    imageSize = drawable.size;
                }
                if ((i2 & 8) != 0) {
                    contentScale = drawable.contentScale;
                }
                if ((i2 & 16) != 0) {
                    shape = drawable.clipShape;
                }
                Shape shape2 = shape;
                ImageSize imageSize2 = imageSize;
                return drawable.copy(i, str, imageSize2, contentScale, shape2);
            }

            /* renamed from: component1, reason: from getter */
            public final int getDrawableRes() {
                return this.drawableRes;
            }

            /* renamed from: component2, reason: from getter */
            public final String getContentDescription() {
                return this.contentDescription;
            }

            /* renamed from: component3, reason: from getter */
            public final ImageSize getSize() {
                return this.size;
            }

            /* renamed from: component4, reason: from getter */
            public final ContentScale getContentScale() {
                return this.contentScale;
            }

            /* renamed from: component5, reason: from getter */
            public final Shape getClipShape() {
                return this.clipShape;
            }

            public final Drawable copy(int drawableRes, String contentDescription, ImageSize size, ContentScale contentScale, Shape clipShape) {
                Intrinsics.checkNotNullParameter(size, "size");
                Intrinsics.checkNotNullParameter(contentScale, "contentScale");
                return new Drawable(drawableRes, contentDescription, size, contentScale, clipShape);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Drawable)) {
                    return false;
                }
                Drawable drawable = (Drawable) other;
                return this.drawableRes == drawable.drawableRes && Intrinsics.areEqual(this.contentDescription, drawable.contentDescription) && this.size == drawable.size && Intrinsics.areEqual(this.contentScale, drawable.contentScale) && Intrinsics.areEqual(this.clipShape, drawable.clipShape);
            }

            public int hashCode() {
                int iHashCode = Integer.hashCode(this.drawableRes) * 31;
                String str = this.contentDescription;
                int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.size.hashCode()) * 31) + this.contentScale.hashCode()) * 31;
                Shape shape = this.clipShape;
                return iHashCode2 + (shape != null ? shape.hashCode() : 0);
            }

            public String toString() {
                return "Drawable(drawableRes=" + this.drawableRes + ", contentDescription=" + this.contentDescription + ", size=" + this.size + ", contentScale=" + this.contentScale + ", clipShape=" + this.clipShape + ")";
            }

            public final int getDrawableRes() {
                return this.drawableRes;
            }

            public final String getContentDescription() {
                return this.contentDescription;
            }

            public /* synthetic */ Drawable(int i, String str, ImageSize imageSize, ContentScale contentScale, Shape shape, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? ImageSize.Standard : imageSize, (i2 & 8) != 0 ? ContentScale.INSTANCE.getFit() : contentScale, (i2 & 16) != 0 ? null : shape);
            }

            public final ImageSize getSize() {
                return this.size;
            }

            public final ContentScale getContentScale() {
                return this.contentScale;
            }

            public final Shape getClipShape() {
                return this.clipShape;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Drawable(int i, String str, ImageSize size, ContentScale contentScale, Shape shape) {
                super(null);
                Intrinsics.checkNotNullParameter(size, "size");
                Intrinsics.checkNotNullParameter(contentScale, "contentScale");
                this.drawableRes = i;
                this.contentDescription = str;
                this.size = size;
                this.contentScale = contentScale;
                this.clipShape = shape;
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: BentoBaseRow.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start$Drawable$ImageSize;", "", "value", "Landroidx/compose/ui/unit/Dp;", "<init>", "(Ljava/lang/String;IF)V", "getValue-D9Ej5fM", "()F", "F", "Small", "Standard", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            public static final class ImageSize {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ ImageSize[] $VALUES;
                public static final ImageSize Small = new ImageSize("Small", 0, C2002Dp.m7995constructorimpl(24));
                public static final ImageSize Standard = new ImageSize("Standard", 1, C2002Dp.m7995constructorimpl(48));
                private final float value;

                private static final /* synthetic */ ImageSize[] $values() {
                    return new ImageSize[]{Small, Standard};
                }

                public static EnumEntries<ImageSize> getEntries() {
                    return $ENTRIES;
                }

                private ImageSize(String str, int i, float f) {
                    this.value = f;
                }

                /* renamed from: getValue-D9Ej5fM, reason: not valid java name and from getter */
                public final float getValue() {
                    return this.value;
                }

                static {
                    ImageSize[] imageSizeArr$values = $values();
                    $VALUES = imageSizeArr$values;
                    $ENTRIES = EnumEntries2.enumEntries(imageSizeArr$values);
                }

                public static ImageSize valueOf(String str) {
                    return (ImageSize) Enum.valueOf(ImageSize.class, str);
                }

                public static ImageSize[] values() {
                    return (ImageSize[]) $VALUES.clone();
                }
            }
        }

        /* compiled from: BentoBaseRow.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start$NumberPog;", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start;", InquiryField.FloatField.TYPE2, "", "<init>", "(I)V", "getNumber", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NumberPog extends Start {
            public static final int $stable = 0;
            private final int number;

            public static /* synthetic */ NumberPog copy$default(NumberPog numberPog, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = numberPog.number;
                }
                return numberPog.copy(i);
            }

            /* renamed from: component1, reason: from getter */
            public final int getNumber() {
                return this.number;
            }

            public final NumberPog copy(int number) {
                return new NumberPog(number);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NumberPog) && this.number == ((NumberPog) other).number;
            }

            public int hashCode() {
                return Integer.hashCode(this.number);
            }

            public String toString() {
                return "NumberPog(number=" + this.number + ")";
            }

            public NumberPog(int i) {
                super(null);
                this.number = i;
            }

            public final int getNumber() {
                return this.number;
            }
        }

        /* compiled from: BentoBaseRow.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\b\u0010J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\b\u0012J0\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\b\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start$PictogramPog;", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start;", "asset", "Lcom/robinhood/android/libdesignsystem/serverui/PictogramAsset;", "foregroundColorOverride", "Landroidx/compose/ui/graphics/Color;", "backgroundColorOverride", "<init>", "(Lcom/robinhood/android/libdesignsystem/serverui/PictogramAsset;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAsset", "()Lcom/robinhood/android/libdesignsystem/serverui/PictogramAsset;", "getForegroundColorOverride-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "getBackgroundColorOverride-QN2ZGVo", "component1", "component2", "component2-QN2ZGVo", "component3", "component3-QN2ZGVo", "copy", "copy-aroclsI", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PictogramPog extends Start {
            public static final int $stable = 0;
            private final ServerToBentoAssetMapper3 asset;
            private final Color backgroundColorOverride;
            private final Color foregroundColorOverride;

            public /* synthetic */ PictogramPog(ServerToBentoAssetMapper3 serverToBentoAssetMapper3, Color color, Color color2, DefaultConstructorMarker defaultConstructorMarker) {
                this(serverToBentoAssetMapper3, color, color2);
            }

            /* renamed from: copy-aroclsI$default, reason: not valid java name */
            public static /* synthetic */ PictogramPog m20946copyaroclsI$default(PictogramPog pictogramPog, ServerToBentoAssetMapper3 serverToBentoAssetMapper3, Color color, Color color2, int i, Object obj) {
                if ((i & 1) != 0) {
                    serverToBentoAssetMapper3 = pictogramPog.asset;
                }
                if ((i & 2) != 0) {
                    color = pictogramPog.foregroundColorOverride;
                }
                if ((i & 4) != 0) {
                    color2 = pictogramPog.backgroundColorOverride;
                }
                return pictogramPog.m20949copyaroclsI(serverToBentoAssetMapper3, color, color2);
            }

            /* renamed from: component1, reason: from getter */
            public final ServerToBentoAssetMapper3 getAsset() {
                return this.asset;
            }

            /* renamed from: component2-QN2ZGVo, reason: not valid java name and from getter */
            public final Color getForegroundColorOverride() {
                return this.foregroundColorOverride;
            }

            /* renamed from: component3-QN2ZGVo, reason: not valid java name and from getter */
            public final Color getBackgroundColorOverride() {
                return this.backgroundColorOverride;
            }

            /* renamed from: copy-aroclsI, reason: not valid java name */
            public final PictogramPog m20949copyaroclsI(ServerToBentoAssetMapper3 asset, Color foregroundColorOverride, Color backgroundColorOverride) {
                Intrinsics.checkNotNullParameter(asset, "asset");
                return new PictogramPog(asset, foregroundColorOverride, backgroundColorOverride, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PictogramPog)) {
                    return false;
                }
                PictogramPog pictogramPog = (PictogramPog) other;
                return this.asset == pictogramPog.asset && Intrinsics.areEqual(this.foregroundColorOverride, pictogramPog.foregroundColorOverride) && Intrinsics.areEqual(this.backgroundColorOverride, pictogramPog.backgroundColorOverride);
            }

            public int hashCode() {
                int iHashCode = this.asset.hashCode() * 31;
                Color color = this.foregroundColorOverride;
                int iM6713hashCodeimpl = (iHashCode + (color == null ? 0 : Color.m6713hashCodeimpl(color.getValue()))) * 31;
                Color color2 = this.backgroundColorOverride;
                return iM6713hashCodeimpl + (color2 != null ? Color.m6713hashCodeimpl(color2.getValue()) : 0);
            }

            public String toString() {
                return "PictogramPog(asset=" + this.asset + ", foregroundColorOverride=" + this.foregroundColorOverride + ", backgroundColorOverride=" + this.backgroundColorOverride + ")";
            }

            public /* synthetic */ PictogramPog(ServerToBentoAssetMapper3 serverToBentoAssetMapper3, Color color, Color color2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(serverToBentoAssetMapper3, (i & 2) != 0 ? null : color, (i & 4) != 0 ? null : color2, null);
            }

            public final ServerToBentoAssetMapper3 getAsset() {
                return this.asset;
            }

            /* renamed from: getForegroundColorOverride-QN2ZGVo, reason: not valid java name */
            public final Color m20951getForegroundColorOverrideQN2ZGVo() {
                return this.foregroundColorOverride;
            }

            /* renamed from: getBackgroundColorOverride-QN2ZGVo, reason: not valid java name */
            public final Color m20950getBackgroundColorOverrideQN2ZGVo() {
                return this.backgroundColorOverride;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private PictogramPog(ServerToBentoAssetMapper3 asset, Color color, Color color2) {
                super(null);
                Intrinsics.checkNotNullParameter(asset, "asset");
                this.asset = asset;
                this.foregroundColorOverride = color;
                this.backgroundColorOverride = color2;
            }
        }

        /* compiled from: BentoBaseRow.kt */
        @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\b\u0016J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J:\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\b\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start$TextPog;", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start;", "text", "", "foregroundColorOverride", "Landroidx/compose/ui/graphics/Color;", "backgroundOverride", "Lcom/robinhood/compose/bento/component/BentoPogBackgroundOverride;", "size", "Lcom/robinhood/compose/bento/component/BentoPogSize;", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/graphics/Color;Lcom/robinhood/compose/bento/component/BentoPogBackgroundOverride;Lcom/robinhood/compose/bento/component/BentoPogSize;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getText", "()Ljava/lang/String;", "getForegroundColorOverride-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "getBackgroundOverride", "()Lcom/robinhood/compose/bento/component/BentoPogBackgroundOverride;", "getSize", "()Lcom/robinhood/compose/bento/component/BentoPogSize;", "component1", "component2", "component2-QN2ZGVo", "component3", "component4", "copy", "copy-bMF-p3s", "equals", "", "other", "", "hashCode", "", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TextPog extends Start {
            public static final int $stable = 0;
            private final BentoPogBackgroundOverride backgroundOverride;
            private final Color foregroundColorOverride;
            private final BentoPogSize size;
            private final String text;

            public /* synthetic */ TextPog(String str, Color color, BentoPogBackgroundOverride bentoPogBackgroundOverride, BentoPogSize bentoPogSize, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, color, bentoPogBackgroundOverride, bentoPogSize);
            }

            /* renamed from: copy-bMF-p3s$default, reason: not valid java name */
            public static /* synthetic */ TextPog m20952copybMFp3s$default(TextPog textPog, String str, Color color, BentoPogBackgroundOverride bentoPogBackgroundOverride, BentoPogSize bentoPogSize, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = textPog.text;
                }
                if ((i & 2) != 0) {
                    color = textPog.foregroundColorOverride;
                }
                if ((i & 4) != 0) {
                    bentoPogBackgroundOverride = textPog.backgroundOverride;
                }
                if ((i & 8) != 0) {
                    bentoPogSize = textPog.size;
                }
                return textPog.m20954copybMFp3s(str, color, bentoPogBackgroundOverride, bentoPogSize);
            }

            /* renamed from: component1, reason: from getter */
            public final String getText() {
                return this.text;
            }

            /* renamed from: component2-QN2ZGVo, reason: not valid java name and from getter */
            public final Color getForegroundColorOverride() {
                return this.foregroundColorOverride;
            }

            /* renamed from: component3, reason: from getter */
            public final BentoPogBackgroundOverride getBackgroundOverride() {
                return this.backgroundOverride;
            }

            /* renamed from: component4, reason: from getter */
            public final BentoPogSize getSize() {
                return this.size;
            }

            /* renamed from: copy-bMF-p3s, reason: not valid java name */
            public final TextPog m20954copybMFp3s(String text, Color foregroundColorOverride, BentoPogBackgroundOverride backgroundOverride, BentoPogSize size) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(size, "size");
                return new TextPog(text, foregroundColorOverride, backgroundOverride, size, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TextPog)) {
                    return false;
                }
                TextPog textPog = (TextPog) other;
                return Intrinsics.areEqual(this.text, textPog.text) && Intrinsics.areEqual(this.foregroundColorOverride, textPog.foregroundColorOverride) && Intrinsics.areEqual(this.backgroundOverride, textPog.backgroundOverride) && this.size == textPog.size;
            }

            public int hashCode() {
                int iHashCode = this.text.hashCode() * 31;
                Color color = this.foregroundColorOverride;
                int iM6713hashCodeimpl = (iHashCode + (color == null ? 0 : Color.m6713hashCodeimpl(color.getValue()))) * 31;
                BentoPogBackgroundOverride bentoPogBackgroundOverride = this.backgroundOverride;
                return ((iM6713hashCodeimpl + (bentoPogBackgroundOverride != null ? bentoPogBackgroundOverride.hashCode() : 0)) * 31) + this.size.hashCode();
            }

            public String toString() {
                return "TextPog(text=" + this.text + ", foregroundColorOverride=" + this.foregroundColorOverride + ", backgroundOverride=" + this.backgroundOverride + ", size=" + this.size + ")";
            }

            public final String getText() {
                return this.text;
            }

            /* renamed from: getForegroundColorOverride-QN2ZGVo, reason: not valid java name */
            public final Color m20955getForegroundColorOverrideQN2ZGVo() {
                return this.foregroundColorOverride;
            }

            public final BentoPogBackgroundOverride getBackgroundOverride() {
                return this.backgroundOverride;
            }

            public /* synthetic */ TextPog(String str, Color color, BentoPogBackgroundOverride bentoPogBackgroundOverride, BentoPogSize bentoPogSize, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : color, (i & 4) != 0 ? null : bentoPogBackgroundOverride, (i & 8) != 0 ? BentoPogSize.Standard : bentoPogSize, null);
            }

            public final BentoPogSize getSize() {
                return this.size;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private TextPog(String text, Color color, BentoPogBackgroundOverride bentoPogBackgroundOverride, BentoPogSize size) {
                super(null);
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(size, "size");
                this.text = text;
                this.foregroundColorOverride = color;
                this.backgroundOverride = bentoPogBackgroundOverride;
                this.size = size;
            }
        }

        /* compiled from: BentoBaseRow.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start$FlagIcon;", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start;", "countryCode", "", "<init>", "(Ljava/lang/String;)V", "getCountryCode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class FlagIcon extends Start {
            public static final int $stable = 0;
            private final String countryCode;

            public static /* synthetic */ FlagIcon copy$default(FlagIcon flagIcon, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = flagIcon.countryCode;
                }
                return flagIcon.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getCountryCode() {
                return this.countryCode;
            }

            public final FlagIcon copy(String countryCode) {
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                return new FlagIcon(countryCode);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FlagIcon) && Intrinsics.areEqual(this.countryCode, ((FlagIcon) other).countryCode);
            }

            public int hashCode() {
                return this.countryCode.hashCode();
            }

            public String toString() {
                return "FlagIcon(countryCode=" + this.countryCode + ")";
            }

            public final String getCountryCode() {
                return this.countryCode;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FlagIcon(String countryCode) {
                super(null);
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                this.countryCode = countryCode;
            }
        }
    }

    /* compiled from: BentoBaseRow.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Text;", "", "<init>", "()V", "Plain", "Annotated", "Markdown", "MarkdownV2", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Text$Annotated;", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Text$Markdown;", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Text$MarkdownV2;", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Text$Plain;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Text {
        public static final int $stable = 0;

        public /* synthetic */ Text(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Text() {
        }

        /* compiled from: BentoBaseRow.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Text$Plain;", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Text;", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Plain extends Text {
            public static final int $stable = 0;
            private final String text;

            public static /* synthetic */ Plain copy$default(Plain plain, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = plain.text;
                }
                return plain.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getText() {
                return this.text;
            }

            public final Plain copy(String text) {
                Intrinsics.checkNotNullParameter(text, "text");
                return new Plain(text);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Plain) && Intrinsics.areEqual(this.text, ((Plain) other).text);
            }

            public int hashCode() {
                return this.text.hashCode();
            }

            public String toString() {
                return "Plain(text=" + this.text + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Plain(String text) {
                super(null);
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
            }

            public final String getText() {
                return this.text;
            }
        }

        /* compiled from: BentoBaseRow.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Text$Annotated;", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Text;", "annotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "inlineContent", "Lkotlinx/collections/immutable/ImmutableMap;", "", "Landroidx/compose/foundation/text/InlineTextContent;", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Lkotlinx/collections/immutable/ImmutableMap;)V", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "getInlineContent", "()Lkotlinx/collections/immutable/ImmutableMap;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Annotated extends Text {
            public static final int $stable = 0;
            private final AnnotatedString annotatedString;
            private final ImmutableMap<String, InlineTextContent> inlineContent;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Annotated copy$default(Annotated annotated, AnnotatedString annotatedString, ImmutableMap immutableMap, int i, Object obj) {
                if ((i & 1) != 0) {
                    annotatedString = annotated.annotatedString;
                }
                if ((i & 2) != 0) {
                    immutableMap = annotated.inlineContent;
                }
                return annotated.copy(annotatedString, immutableMap);
            }

            /* renamed from: component1, reason: from getter */
            public final AnnotatedString getAnnotatedString() {
                return this.annotatedString;
            }

            public final ImmutableMap<String, InlineTextContent> component2() {
                return this.inlineContent;
            }

            public final Annotated copy(AnnotatedString annotatedString, ImmutableMap<String, InlineTextContent> inlineContent) {
                Intrinsics.checkNotNullParameter(annotatedString, "annotatedString");
                Intrinsics.checkNotNullParameter(inlineContent, "inlineContent");
                return new Annotated(annotatedString, inlineContent);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Annotated)) {
                    return false;
                }
                Annotated annotated = (Annotated) other;
                return Intrinsics.areEqual(this.annotatedString, annotated.annotatedString) && Intrinsics.areEqual(this.inlineContent, annotated.inlineContent);
            }

            public int hashCode() {
                return (this.annotatedString.hashCode() * 31) + this.inlineContent.hashCode();
            }

            public String toString() {
                AnnotatedString annotatedString = this.annotatedString;
                return "Annotated(annotatedString=" + ((Object) annotatedString) + ", inlineContent=" + this.inlineContent + ")";
            }

            public final AnnotatedString getAnnotatedString() {
                return this.annotatedString;
            }

            public /* synthetic */ Annotated(AnnotatedString annotatedString, ImmutableMap immutableMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(annotatedString, (i & 2) != 0 ? extensions2.persistentMapOf() : immutableMap);
            }

            public final ImmutableMap<String, InlineTextContent> getInlineContent() {
                return this.inlineContent;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Annotated(AnnotatedString annotatedString, ImmutableMap<String, InlineTextContent> inlineContent) {
                super(null);
                Intrinsics.checkNotNullParameter(annotatedString, "annotatedString");
                Intrinsics.checkNotNullParameter(inlineContent, "inlineContent");
                this.annotatedString = annotatedString;
                this.inlineContent = inlineContent;
            }
        }

        /* compiled from: BentoBaseRow.kt */
        @Deprecated
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\b\u0015J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\b\u0017J:\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\b\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006 "}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Text$Markdown;", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Text;", "rawMarkdownText", "", "textAppearance", "", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "linkColor", "<init>", "(Ljava/lang/String;ILandroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getRawMarkdownText", "()Ljava/lang/String;", "getTextAppearance", "()I", "getColor-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "getLinkColor-QN2ZGVo", "component1", "component2", "component3", "component3-QN2ZGVo", "component4", "component4-QN2ZGVo", "copy", "copy-Ij2XjQ8", "equals", "", "other", "", "hashCode", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Markdown extends Text {
            public static final int $stable = 0;
            private final Color color;
            private final Color linkColor;
            private final String rawMarkdownText;
            private final int textAppearance;

            public /* synthetic */ Markdown(String str, int i, Color color, Color color2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i, color, color2);
            }

            /* renamed from: copy-Ij2XjQ8$default, reason: not valid java name */
            public static /* synthetic */ Markdown m20956copyIj2XjQ8$default(Markdown markdown, String str, int i, Color color, Color color2, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = markdown.rawMarkdownText;
                }
                if ((i2 & 2) != 0) {
                    i = markdown.textAppearance;
                }
                if ((i2 & 4) != 0) {
                    color = markdown.color;
                }
                if ((i2 & 8) != 0) {
                    color2 = markdown.linkColor;
                }
                return markdown.m20959copyIj2XjQ8(str, i, color, color2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getRawMarkdownText() {
                return this.rawMarkdownText;
            }

            /* renamed from: component2, reason: from getter */
            public final int getTextAppearance() {
                return this.textAppearance;
            }

            /* renamed from: component3-QN2ZGVo, reason: not valid java name and from getter */
            public final Color getColor() {
                return this.color;
            }

            /* renamed from: component4-QN2ZGVo, reason: not valid java name and from getter */
            public final Color getLinkColor() {
                return this.linkColor;
            }

            /* renamed from: copy-Ij2XjQ8, reason: not valid java name */
            public final Markdown m20959copyIj2XjQ8(String rawMarkdownText, int textAppearance, Color color, Color linkColor) {
                Intrinsics.checkNotNullParameter(rawMarkdownText, "rawMarkdownText");
                return new Markdown(rawMarkdownText, textAppearance, color, linkColor, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Markdown)) {
                    return false;
                }
                Markdown markdown = (Markdown) other;
                return Intrinsics.areEqual(this.rawMarkdownText, markdown.rawMarkdownText) && this.textAppearance == markdown.textAppearance && Intrinsics.areEqual(this.color, markdown.color) && Intrinsics.areEqual(this.linkColor, markdown.linkColor);
            }

            public int hashCode() {
                int iHashCode = ((this.rawMarkdownText.hashCode() * 31) + Integer.hashCode(this.textAppearance)) * 31;
                Color color = this.color;
                int iM6713hashCodeimpl = (iHashCode + (color == null ? 0 : Color.m6713hashCodeimpl(color.getValue()))) * 31;
                Color color2 = this.linkColor;
                return iM6713hashCodeimpl + (color2 != null ? Color.m6713hashCodeimpl(color2.getValue()) : 0);
            }

            public String toString() {
                return "Markdown(rawMarkdownText=" + this.rawMarkdownText + ", textAppearance=" + this.textAppearance + ", color=" + this.color + ", linkColor=" + this.linkColor + ")";
            }

            public /* synthetic */ Markdown(String str, int i, Color color, Color color2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i, (i2 & 4) != 0 ? null : color, (i2 & 8) != 0 ? null : color2, null);
            }

            public final String getRawMarkdownText() {
                return this.rawMarkdownText;
            }

            public final int getTextAppearance() {
                return this.textAppearance;
            }

            /* renamed from: getColor-QN2ZGVo, reason: not valid java name */
            public final Color m20960getColorQN2ZGVo() {
                return this.color;
            }

            /* renamed from: getLinkColor-QN2ZGVo, reason: not valid java name */
            public final Color m20961getLinkColorQN2ZGVo() {
                return this.linkColor;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private Markdown(String rawMarkdownText, int i, Color color, Color color2) {
                super(null);
                Intrinsics.checkNotNullParameter(rawMarkdownText, "rawMarkdownText");
                this.rawMarkdownText = rawMarkdownText;
                this.textAppearance = i;
                this.color = color;
                this.linkColor = color2;
            }
        }

        /* compiled from: BentoBaseRow.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Text$MarkdownV2;", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Text;", "rawMarkdownText", "", "<init>", "(Ljava/lang/String;)V", "getRawMarkdownText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class MarkdownV2 extends Text {
            public static final int $stable = 0;
            private final String rawMarkdownText;

            public static /* synthetic */ MarkdownV2 copy$default(MarkdownV2 markdownV2, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = markdownV2.rawMarkdownText;
                }
                return markdownV2.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getRawMarkdownText() {
                return this.rawMarkdownText;
            }

            public final MarkdownV2 copy(String rawMarkdownText) {
                Intrinsics.checkNotNullParameter(rawMarkdownText, "rawMarkdownText");
                return new MarkdownV2(rawMarkdownText);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof MarkdownV2) && Intrinsics.areEqual(this.rawMarkdownText, ((MarkdownV2) other).rawMarkdownText);
            }

            public int hashCode() {
                return this.rawMarkdownText.hashCode();
            }

            public String toString() {
                return "MarkdownV2(rawMarkdownText=" + this.rawMarkdownText + ")";
            }

            public final String getRawMarkdownText() {
                return this.rawMarkdownText;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MarkdownV2(String rawMarkdownText) {
                super(null);
                Intrinsics.checkNotNullParameter(rawMarkdownText, "rawMarkdownText");
                this.rawMarkdownText = rawMarkdownText;
            }
        }
    }

    /* compiled from: BentoBaseRow.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta;", "", "<init>", "()V", "Icon", "SingleLineAndIcon", "SingleLine", "TwoLine", "TwoLineAndIcon", "CallToAction", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta$CallToAction;", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta$Icon;", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta$SingleLine;", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta$SingleLineAndIcon;", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta$TwoLine;", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta$TwoLineAndIcon;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Meta {
        public static final int $stable = 0;

        public /* synthetic */ Meta(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Meta() {
        }

        /* compiled from: BentoBaseRow.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB7\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\r\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\b\u001aJ\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J@\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001¢\u0006\u0002\b\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta$Icon;", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta;", "asset24dp", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "contentDescription", "Lcom/robinhood/utils/resource/StringResource;", "tint", "Landroidx/compose/ui/graphics/Color;", "onClick", "Lkotlin/Function0;", "", "<init>", "(Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Lcom/robinhood/utils/resource/StringResource;Landroidx/compose/ui/graphics/Color;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "(Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Ljava/lang/String;Landroidx/compose/ui/graphics/Color;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAsset24dp", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getContentDescription", "()Lcom/robinhood/utils/resource/StringResource;", "getTint-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "component3", "component3-QN2ZGVo", "component4", "copy", "copy-GUYwDQI", "equals", "", "other", "", "hashCode", "", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Icon extends Meta {
            public static final int $stable = StringResource.$stable;
            private final ServerToBentoAssetMapper2 asset24dp;
            private final StringResource contentDescription;
            private final Function0<Unit> onClick;
            private final Color tint;

            public /* synthetic */ Icon(ServerToBentoAssetMapper2 serverToBentoAssetMapper2, StringResource stringResource, Color color, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
                this(serverToBentoAssetMapper2, stringResource, color, (Function0<Unit>) function0);
            }

            public /* synthetic */ Icon(ServerToBentoAssetMapper2 serverToBentoAssetMapper2, String str, Color color, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
                this(serverToBentoAssetMapper2, str, color, (Function0<Unit>) function0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: copy-GUYwDQI$default, reason: not valid java name */
            public static /* synthetic */ Icon m20928copyGUYwDQI$default(Icon icon, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, StringResource stringResource, Color color, Function0 function0, int i, Object obj) {
                if ((i & 1) != 0) {
                    serverToBentoAssetMapper2 = icon.asset24dp;
                }
                if ((i & 2) != 0) {
                    stringResource = icon.contentDescription;
                }
                if ((i & 4) != 0) {
                    color = icon.tint;
                }
                if ((i & 8) != 0) {
                    function0 = icon.onClick;
                }
                return icon.m20930copyGUYwDQI(serverToBentoAssetMapper2, stringResource, color, function0);
            }

            /* renamed from: component1, reason: from getter */
            public final ServerToBentoAssetMapper2 getAsset24dp() {
                return this.asset24dp;
            }

            /* renamed from: component2, reason: from getter */
            public final StringResource getContentDescription() {
                return this.contentDescription;
            }

            /* renamed from: component3-QN2ZGVo, reason: not valid java name and from getter */
            public final Color getTint() {
                return this.tint;
            }

            public final Function0<Unit> component4() {
                return this.onClick;
            }

            /* renamed from: copy-GUYwDQI, reason: not valid java name */
            public final Icon m20930copyGUYwDQI(ServerToBentoAssetMapper2 asset24dp, StringResource contentDescription, Color tint, Function0<Unit> onClick) {
                Intrinsics.checkNotNullParameter(asset24dp, "asset24dp");
                Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
                return new Icon(asset24dp, contentDescription, tint, onClick, (DefaultConstructorMarker) null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Icon)) {
                    return false;
                }
                Icon icon = (Icon) other;
                return this.asset24dp == icon.asset24dp && Intrinsics.areEqual(this.contentDescription, icon.contentDescription) && Intrinsics.areEqual(this.tint, icon.tint) && Intrinsics.areEqual(this.onClick, icon.onClick);
            }

            public int hashCode() {
                int iHashCode = ((this.asset24dp.hashCode() * 31) + this.contentDescription.hashCode()) * 31;
                Color color = this.tint;
                int iM6713hashCodeimpl = (iHashCode + (color == null ? 0 : Color.m6713hashCodeimpl(color.getValue()))) * 31;
                Function0<Unit> function0 = this.onClick;
                return iM6713hashCodeimpl + (function0 != null ? function0.hashCode() : 0);
            }

            public String toString() {
                return "Icon(asset24dp=" + this.asset24dp + ", contentDescription=" + this.contentDescription + ", tint=" + this.tint + ", onClick=" + this.onClick + ")";
            }

            public /* synthetic */ Icon(ServerToBentoAssetMapper2 serverToBentoAssetMapper2, StringResource stringResource, Color color, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(serverToBentoAssetMapper2, stringResource, (i & 4) != 0 ? null : color, (i & 8) != 0 ? null : function0, (DefaultConstructorMarker) null);
            }

            public final ServerToBentoAssetMapper2 getAsset24dp() {
                return this.asset24dp;
            }

            public final StringResource getContentDescription() {
                return this.contentDescription;
            }

            /* renamed from: getTint-QN2ZGVo, reason: not valid java name */
            public final Color m20931getTintQN2ZGVo() {
                return this.tint;
            }

            public final Function0<Unit> getOnClick() {
                return this.onClick;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private Icon(ServerToBentoAssetMapper2 asset24dp, StringResource contentDescription, Color color, Function0<Unit> function0) {
                super(null);
                Intrinsics.checkNotNullParameter(asset24dp, "asset24dp");
                Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
                this.asset24dp = asset24dp;
                this.contentDescription = contentDescription;
                this.tint = color;
                this.onClick = function0;
            }

            public /* synthetic */ Icon(ServerToBentoAssetMapper2 serverToBentoAssetMapper2, String str, Color color, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(serverToBentoAssetMapper2, str, (i & 4) != 0 ? null : color, (i & 8) != 0 ? null : function0, (DefaultConstructorMarker) null);
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            private Icon(ServerToBentoAssetMapper2 asset24dp, String contentDescription, Color color, Function0<Unit> function0) {
                this(asset24dp, StringResource.INSTANCE.invoke(contentDescription), color, function0, (DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(asset24dp, "asset24dp");
                Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
            }
        }

        /* compiled from: BentoBaseRow.kt */
        @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bB-\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\b\u0019J8\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\b\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006#"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta$SingleLineAndIcon;", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "asset16dp", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "contentDescription", "", "tint", "Landroidx/compose/ui/graphics/Color;", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Ljava/lang/String;Landroidx/compose/ui/graphics/Color;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Ljava/lang/String;Landroidx/compose/ui/graphics/Color;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getText", "()Landroidx/compose/ui/text/AnnotatedString;", "getAsset16dp", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getContentDescription", "()Ljava/lang/String;", "getTint-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "component1", "component2", "component3", "component4", "component4-QN2ZGVo", "copy", "copy-gP2Z1ig", "equals", "", "other", "", "hashCode", "", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SingleLineAndIcon extends Meta {
            public static final int $stable = 0;
            private final ServerToBentoAssetMapper2 asset16dp;
            private final String contentDescription;
            private final AnnotatedString text;
            private final Color tint;

            public /* synthetic */ SingleLineAndIcon(AnnotatedString annotatedString, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, String str, Color color, DefaultConstructorMarker defaultConstructorMarker) {
                this(annotatedString, serverToBentoAssetMapper2, str, color);
            }

            public /* synthetic */ SingleLineAndIcon(String str, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, String str2, Color color, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, serverToBentoAssetMapper2, str2, color);
            }

            /* renamed from: copy-gP2Z1ig$default, reason: not valid java name */
            public static /* synthetic */ SingleLineAndIcon m20932copygP2Z1ig$default(SingleLineAndIcon singleLineAndIcon, AnnotatedString annotatedString, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, String str, Color color, int i, Object obj) {
                if ((i & 1) != 0) {
                    annotatedString = singleLineAndIcon.text;
                }
                if ((i & 2) != 0) {
                    serverToBentoAssetMapper2 = singleLineAndIcon.asset16dp;
                }
                if ((i & 4) != 0) {
                    str = singleLineAndIcon.contentDescription;
                }
                if ((i & 8) != 0) {
                    color = singleLineAndIcon.tint;
                }
                return singleLineAndIcon.m20934copygP2Z1ig(annotatedString, serverToBentoAssetMapper2, str, color);
            }

            /* renamed from: component1, reason: from getter */
            public final AnnotatedString getText() {
                return this.text;
            }

            /* renamed from: component2, reason: from getter */
            public final ServerToBentoAssetMapper2 getAsset16dp() {
                return this.asset16dp;
            }

            /* renamed from: component3, reason: from getter */
            public final String getContentDescription() {
                return this.contentDescription;
            }

            /* renamed from: component4-QN2ZGVo, reason: not valid java name and from getter */
            public final Color getTint() {
                return this.tint;
            }

            /* renamed from: copy-gP2Z1ig, reason: not valid java name */
            public final SingleLineAndIcon m20934copygP2Z1ig(AnnotatedString text, ServerToBentoAssetMapper2 asset16dp, String contentDescription, Color tint) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(asset16dp, "asset16dp");
                Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
                return new SingleLineAndIcon(text, asset16dp, contentDescription, tint, (DefaultConstructorMarker) null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SingleLineAndIcon)) {
                    return false;
                }
                SingleLineAndIcon singleLineAndIcon = (SingleLineAndIcon) other;
                return Intrinsics.areEqual(this.text, singleLineAndIcon.text) && this.asset16dp == singleLineAndIcon.asset16dp && Intrinsics.areEqual(this.contentDescription, singleLineAndIcon.contentDescription) && Intrinsics.areEqual(this.tint, singleLineAndIcon.tint);
            }

            public int hashCode() {
                int iHashCode = ((((this.text.hashCode() * 31) + this.asset16dp.hashCode()) * 31) + this.contentDescription.hashCode()) * 31;
                Color color = this.tint;
                return iHashCode + (color == null ? 0 : Color.m6713hashCodeimpl(color.getValue()));
            }

            public String toString() {
                AnnotatedString annotatedString = this.text;
                return "SingleLineAndIcon(text=" + ((Object) annotatedString) + ", asset16dp=" + this.asset16dp + ", contentDescription=" + this.contentDescription + ", tint=" + this.tint + ")";
            }

            public /* synthetic */ SingleLineAndIcon(AnnotatedString annotatedString, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, String str, Color color, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(annotatedString, serverToBentoAssetMapper2, str, (i & 8) != 0 ? null : color, (DefaultConstructorMarker) null);
            }

            public final AnnotatedString getText() {
                return this.text;
            }

            public final ServerToBentoAssetMapper2 getAsset16dp() {
                return this.asset16dp;
            }

            public final String getContentDescription() {
                return this.contentDescription;
            }

            /* renamed from: getTint-QN2ZGVo, reason: not valid java name */
            public final Color m20935getTintQN2ZGVo() {
                return this.tint;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private SingleLineAndIcon(AnnotatedString text, ServerToBentoAssetMapper2 asset16dp, String contentDescription, Color color) {
                super(null);
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(asset16dp, "asset16dp");
                Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
                this.text = text;
                this.asset16dp = asset16dp;
                this.contentDescription = contentDescription;
                this.tint = color;
            }

            public /* synthetic */ SingleLineAndIcon(String str, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, String str2, Color color, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, serverToBentoAssetMapper2, str2, (i & 8) != 0 ? null : color, (DefaultConstructorMarker) null);
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            private SingleLineAndIcon(String text, ServerToBentoAssetMapper2 asset16dp, String contentDescription, Color color) {
                this(new AnnotatedString(text, null, 2, 0 == true ? 1 : 0), asset16dp, contentDescription, color, (DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(asset16dp, "asset16dp");
                Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
            }
        }

        /* compiled from: BentoBaseRow.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u0007J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta$SingleLine;", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;)V", "", "(Ljava/lang/String;)V", "getText", "()Landroidx/compose/ui/text/AnnotatedString;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SingleLine extends Meta {
            public static final int $stable = 0;
            private final AnnotatedString text;

            public static /* synthetic */ SingleLine copy$default(SingleLine singleLine, AnnotatedString annotatedString, int i, Object obj) {
                if ((i & 1) != 0) {
                    annotatedString = singleLine.text;
                }
                return singleLine.copy(annotatedString);
            }

            /* renamed from: component1, reason: from getter */
            public final AnnotatedString getText() {
                return this.text;
            }

            public final SingleLine copy(AnnotatedString text) {
                Intrinsics.checkNotNullParameter(text, "text");
                return new SingleLine(text);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SingleLine) && Intrinsics.areEqual(this.text, ((SingleLine) other).text);
            }

            public int hashCode() {
                return this.text.hashCode();
            }

            public String toString() {
                return "SingleLine(text=" + ((Object) this.text) + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SingleLine(AnnotatedString text) {
                super(null);
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
            }

            public final AnnotatedString getText() {
                return this.text;
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public SingleLine(String text) {
                this(new AnnotatedString(text, null, 2, 0 == true ? 1 : 0));
                Intrinsics.checkNotNullParameter(text, "text");
            }
        }

        /* compiled from: BentoBaseRow.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta$TwoLine;", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta;", "text1", "Landroidx/compose/ui/text/AnnotatedString;", "text2", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;)V", "", "(Ljava/lang/String;Ljava/lang/String;)V", "getText1", "()Landroidx/compose/ui/text/AnnotatedString;", "getText2", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TwoLine extends Meta {
            public static final int $stable = 0;
            private final AnnotatedString text1;
            private final AnnotatedString text2;

            public static /* synthetic */ TwoLine copy$default(TwoLine twoLine, AnnotatedString annotatedString, AnnotatedString annotatedString2, int i, Object obj) {
                if ((i & 1) != 0) {
                    annotatedString = twoLine.text1;
                }
                if ((i & 2) != 0) {
                    annotatedString2 = twoLine.text2;
                }
                return twoLine.copy(annotatedString, annotatedString2);
            }

            /* renamed from: component1, reason: from getter */
            public final AnnotatedString getText1() {
                return this.text1;
            }

            /* renamed from: component2, reason: from getter */
            public final AnnotatedString getText2() {
                return this.text2;
            }

            public final TwoLine copy(AnnotatedString text1, AnnotatedString text2) {
                Intrinsics.checkNotNullParameter(text1, "text1");
                Intrinsics.checkNotNullParameter(text2, "text2");
                return new TwoLine(text1, text2);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TwoLine)) {
                    return false;
                }
                TwoLine twoLine = (TwoLine) other;
                return Intrinsics.areEqual(this.text1, twoLine.text1) && Intrinsics.areEqual(this.text2, twoLine.text2);
            }

            public int hashCode() {
                return (this.text1.hashCode() * 31) + this.text2.hashCode();
            }

            public String toString() {
                return "TwoLine(text1=" + ((Object) this.text1) + ", text2=" + ((Object) this.text2) + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TwoLine(AnnotatedString text1, AnnotatedString text2) {
                super(null);
                Intrinsics.checkNotNullParameter(text1, "text1");
                Intrinsics.checkNotNullParameter(text2, "text2");
                this.text1 = text1;
                this.text2 = text2;
            }

            public final AnnotatedString getText1() {
                return this.text1;
            }

            public final AnnotatedString getText2() {
                return this.text2;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /* JADX WARN: Multi-variable type inference failed */
            public TwoLine(String text1, String text2) {
                Intrinsics.checkNotNullParameter(text1, "text1");
                Intrinsics.checkNotNullParameter(text2, "text2");
                int i = 2;
                this(new AnnotatedString(text1, null, i, 0 == true ? 1 : 0), new AnnotatedString(text2, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0));
            }
        }

        /* compiled from: BentoBaseRow.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\b J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003JT\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001¢\u0006\u0002\b#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006+"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta$TwoLineAndIcon;", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta;", "text1", "Landroidx/compose/ui/text/AnnotatedString;", "text2", "asset16dp", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "contentDescription", "", "tint", "Landroidx/compose/ui/graphics/Color;", "onClick", "Lkotlin/Function0;", "", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Ljava/lang/String;Landroidx/compose/ui/graphics/Color;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getText1", "()Landroidx/compose/ui/text/AnnotatedString;", "getText2", "getAsset16dp", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getContentDescription", "()Ljava/lang/String;", "getTint-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "component3", "component4", "component5", "component5-QN2ZGVo", "component6", "copy", "copy-gCxFOHY", "equals", "", "other", "", "hashCode", "", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TwoLineAndIcon extends Meta {
            public static final int $stable = 0;
            private final ServerToBentoAssetMapper2 asset16dp;
            private final String contentDescription;
            private final Function0<Unit> onClick;
            private final AnnotatedString text1;
            private final AnnotatedString text2;
            private final Color tint;

            public /* synthetic */ TwoLineAndIcon(AnnotatedString annotatedString, AnnotatedString annotatedString2, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, String str, Color color, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
                this(annotatedString, annotatedString2, serverToBentoAssetMapper2, str, color, function0);
            }

            /* renamed from: copy-gCxFOHY$default, reason: not valid java name */
            public static /* synthetic */ TwoLineAndIcon m20936copygCxFOHY$default(TwoLineAndIcon twoLineAndIcon, AnnotatedString annotatedString, AnnotatedString annotatedString2, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, String str, Color color, Function0 function0, int i, Object obj) {
                if ((i & 1) != 0) {
                    annotatedString = twoLineAndIcon.text1;
                }
                if ((i & 2) != 0) {
                    annotatedString2 = twoLineAndIcon.text2;
                }
                if ((i & 4) != 0) {
                    serverToBentoAssetMapper2 = twoLineAndIcon.asset16dp;
                }
                if ((i & 8) != 0) {
                    str = twoLineAndIcon.contentDescription;
                }
                if ((i & 16) != 0) {
                    color = twoLineAndIcon.tint;
                }
                if ((i & 32) != 0) {
                    function0 = twoLineAndIcon.onClick;
                }
                Color color2 = color;
                Function0 function02 = function0;
                return twoLineAndIcon.m20938copygCxFOHY(annotatedString, annotatedString2, serverToBentoAssetMapper2, str, color2, function02);
            }

            /* renamed from: component1, reason: from getter */
            public final AnnotatedString getText1() {
                return this.text1;
            }

            /* renamed from: component2, reason: from getter */
            public final AnnotatedString getText2() {
                return this.text2;
            }

            /* renamed from: component3, reason: from getter */
            public final ServerToBentoAssetMapper2 getAsset16dp() {
                return this.asset16dp;
            }

            /* renamed from: component4, reason: from getter */
            public final String getContentDescription() {
                return this.contentDescription;
            }

            /* renamed from: component5-QN2ZGVo, reason: not valid java name and from getter */
            public final Color getTint() {
                return this.tint;
            }

            public final Function0<Unit> component6() {
                return this.onClick;
            }

            /* renamed from: copy-gCxFOHY, reason: not valid java name */
            public final TwoLineAndIcon m20938copygCxFOHY(AnnotatedString text1, AnnotatedString text2, ServerToBentoAssetMapper2 asset16dp, String contentDescription, Color tint, Function0<Unit> onClick) {
                Intrinsics.checkNotNullParameter(text1, "text1");
                Intrinsics.checkNotNullParameter(text2, "text2");
                Intrinsics.checkNotNullParameter(asset16dp, "asset16dp");
                Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
                return new TwoLineAndIcon(text1, text2, asset16dp, contentDescription, tint, onClick, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TwoLineAndIcon)) {
                    return false;
                }
                TwoLineAndIcon twoLineAndIcon = (TwoLineAndIcon) other;
                return Intrinsics.areEqual(this.text1, twoLineAndIcon.text1) && Intrinsics.areEqual(this.text2, twoLineAndIcon.text2) && this.asset16dp == twoLineAndIcon.asset16dp && Intrinsics.areEqual(this.contentDescription, twoLineAndIcon.contentDescription) && Intrinsics.areEqual(this.tint, twoLineAndIcon.tint) && Intrinsics.areEqual(this.onClick, twoLineAndIcon.onClick);
            }

            public int hashCode() {
                int iHashCode = ((((((this.text1.hashCode() * 31) + this.text2.hashCode()) * 31) + this.asset16dp.hashCode()) * 31) + this.contentDescription.hashCode()) * 31;
                Color color = this.tint;
                int iM6713hashCodeimpl = (iHashCode + (color == null ? 0 : Color.m6713hashCodeimpl(color.getValue()))) * 31;
                Function0<Unit> function0 = this.onClick;
                return iM6713hashCodeimpl + (function0 != null ? function0.hashCode() : 0);
            }

            public String toString() {
                AnnotatedString annotatedString = this.text1;
                AnnotatedString annotatedString2 = this.text2;
                return "TwoLineAndIcon(text1=" + ((Object) annotatedString) + ", text2=" + ((Object) annotatedString2) + ", asset16dp=" + this.asset16dp + ", contentDescription=" + this.contentDescription + ", tint=" + this.tint + ", onClick=" + this.onClick + ")";
            }

            public /* synthetic */ TwoLineAndIcon(AnnotatedString annotatedString, AnnotatedString annotatedString2, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, String str, Color color, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(annotatedString, annotatedString2, serverToBentoAssetMapper2, str, (i & 16) != 0 ? null : color, (i & 32) != 0 ? null : function0, null);
            }

            public final AnnotatedString getText1() {
                return this.text1;
            }

            public final AnnotatedString getText2() {
                return this.text2;
            }

            public final ServerToBentoAssetMapper2 getAsset16dp() {
                return this.asset16dp;
            }

            public final String getContentDescription() {
                return this.contentDescription;
            }

            /* renamed from: getTint-QN2ZGVo, reason: not valid java name */
            public final Color m20939getTintQN2ZGVo() {
                return this.tint;
            }

            public final Function0<Unit> getOnClick() {
                return this.onClick;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private TwoLineAndIcon(AnnotatedString text1, AnnotatedString text2, ServerToBentoAssetMapper2 asset16dp, String contentDescription, Color color, Function0<Unit> function0) {
                super(null);
                Intrinsics.checkNotNullParameter(text1, "text1");
                Intrinsics.checkNotNullParameter(text2, "text2");
                Intrinsics.checkNotNullParameter(asset16dp, "asset16dp");
                Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
                this.text1 = text1;
                this.text2 = text2;
                this.asset16dp = asset16dp;
                this.contentDescription = contentDescription;
                this.tint = color;
                this.onClick = function0;
            }
        }

        /* compiled from: BentoBaseRow.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\b\u000eJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\b\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta$CallToAction;", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta;", "text", "", "tint", "Landroidx/compose/ui/graphics/Color;", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/graphics/Color;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getText", "()Ljava/lang/String;", "getTint-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "component1", "component2", "component2-QN2ZGVo", "copy", "copy-0Yiz4hI", "equals", "", "other", "", "hashCode", "", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class CallToAction extends Meta {
            public static final int $stable = 0;
            private final String text;
            private final Color tint;

            public /* synthetic */ CallToAction(String str, Color color, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, color);
            }

            /* renamed from: copy-0Yiz4hI$default, reason: not valid java name */
            public static /* synthetic */ CallToAction m20924copy0Yiz4hI$default(CallToAction callToAction, String str, Color color, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = callToAction.text;
                }
                if ((i & 2) != 0) {
                    color = callToAction.tint;
                }
                return callToAction.m20926copy0Yiz4hI(str, color);
            }

            /* renamed from: component1, reason: from getter */
            public final String getText() {
                return this.text;
            }

            /* renamed from: component2-QN2ZGVo, reason: not valid java name and from getter */
            public final Color getTint() {
                return this.tint;
            }

            /* renamed from: copy-0Yiz4hI, reason: not valid java name */
            public final CallToAction m20926copy0Yiz4hI(String text, Color tint) {
                Intrinsics.checkNotNullParameter(text, "text");
                return new CallToAction(text, tint, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CallToAction)) {
                    return false;
                }
                CallToAction callToAction = (CallToAction) other;
                return Intrinsics.areEqual(this.text, callToAction.text) && Intrinsics.areEqual(this.tint, callToAction.tint);
            }

            public int hashCode() {
                int iHashCode = this.text.hashCode() * 31;
                Color color = this.tint;
                return iHashCode + (color == null ? 0 : Color.m6713hashCodeimpl(color.getValue()));
            }

            public String toString() {
                return "CallToAction(text=" + this.text + ", tint=" + this.tint + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private CallToAction(String text, Color color) {
                super(null);
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
                this.tint = color;
            }

            public /* synthetic */ CallToAction(String str, Color color, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : color, null);
            }

            public final String getText() {
                return this.text;
            }

            /* renamed from: getTint-QN2ZGVo, reason: not valid java name */
            public final Color m20927getTintQN2ZGVo() {
                return this.tint;
            }
        }
    }

    /* compiled from: BentoBaseRow.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$End;", "", "<init>", "()V", "Caret", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$End$Caret;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class End {
        public static final int $stable = 0;

        public /* synthetic */ End(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: BentoBaseRow.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$End$Caret;", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$End;", "direction", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$End$Caret$Direction;", "<init>", "(Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$End$Caret$Direction;)V", "getDirection", "()Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$End$Caret$Direction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Direction", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Caret extends End {
            public static final int $stable = 0;
            private final Direction direction;

            public static /* synthetic */ Caret copy$default(Caret caret, Direction direction, int i, Object obj) {
                if ((i & 1) != 0) {
                    direction = caret.direction;
                }
                return caret.copy(direction);
            }

            /* renamed from: component1, reason: from getter */
            public final Direction getDirection() {
                return this.direction;
            }

            public final Caret copy(Direction direction) {
                Intrinsics.checkNotNullParameter(direction, "direction");
                return new Caret(direction);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Caret) && this.direction == ((Caret) other).direction;
            }

            public int hashCode() {
                return this.direction.hashCode();
            }

            public String toString() {
                return "Caret(direction=" + this.direction + ")";
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: BentoBaseRow.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$End$Caret$Direction;", "", "resId", "", "<init>", "(Ljava/lang/String;II)V", "getResId", "()I", "UP", "DOWN", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Direction {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ Direction[] $VALUES;
                private final int resId;

                /* renamed from: UP */
                public static final Direction f5158UP = new Direction("UP", 0, C20690R.drawable.ic_rds_caret_up_16dp);
                public static final Direction DOWN = new Direction("DOWN", 1, C20690R.drawable.ic_rds_caret_down_16dp);

                private static final /* synthetic */ Direction[] $values() {
                    return new Direction[]{f5158UP, DOWN};
                }

                public static EnumEntries<Direction> getEntries() {
                    return $ENTRIES;
                }

                private Direction(String str, int i, int i2) {
                    this.resId = i2;
                }

                public final int getResId() {
                    return this.resId;
                }

                static {
                    Direction[] directionArr$values = $values();
                    $VALUES = directionArr$values;
                    $ENTRIES = EnumEntries2.enumEntries(directionArr$values);
                }

                public static Direction valueOf(String str) {
                    return (Direction) Enum.valueOf(Direction.class, str);
                }

                public static Direction[] values() {
                    return (Direction[]) $VALUES.clone();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Caret(Direction direction) {
                super(null);
                Intrinsics.checkNotNullParameter(direction, "direction");
                this.direction = direction;
            }

            public final Direction getDirection() {
                return this.direction;
            }
        }

        private End() {
        }
    }

    public final Modifier getMetaModifier$lib_compose_bento_externalRelease() {
        Meta meta = this.meta;
        if ((meta instanceof Meta.CallToAction) || (meta instanceof Meta.SingleLine) || (meta instanceof Meta.SingleLineAndIcon) || (meta instanceof Meta.TwoLineAndIcon) || (meta instanceof Meta.TwoLine)) {
            return LocalShowPlaceholder.withBentoPlaceholder$default(Modifier.INSTANCE, false, null, 3, null);
        }
        if (meta instanceof Meta.Icon) {
            return LocalShowPlaceholder.withBentoCirclePlaceholder$default(Modifier.INSTANCE, false, 1, null);
        }
        if (meta != null) {
            throw new NoWhenBranchMatchedException();
        }
        return Modifier.INSTANCE;
    }
}
