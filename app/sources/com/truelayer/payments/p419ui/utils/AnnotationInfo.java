package com.truelayer.payments.p419ui.utils;

import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.semantics.CustomAccessibilityAction;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: AnnotationInfo.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u001fB\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00052\u0006\u0010\u0016\u001a\u00020\u00032\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00100\u0018J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006 "}, m3636d2 = {"Lcom/truelayer/payments/ui/utils/AnnotationInfo;", "", "display", "", "annotations", "", "Lcom/truelayer/payments/ui/utils/AnnotationInfo$Annotation;", "(Ljava/lang/String;Ljava/util/List;)V", "getAnnotations", "()Ljava/util/List;", "getDisplay", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "intoAccessibilityActions", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", AnnotatedPrivateKey.LABEL, "onClick", "Lkotlin/Function1;", "Lkotlin/ranges/IntRange;", "intoAnnotatedString", "Landroidx/compose/ui/text/AnnotatedString;", ResourceTypes.STYLE, "Landroidx/compose/ui/text/SpanStyle;", "toString", "Annotation", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final /* data */ class AnnotationInfo {
    public static final int $stable = 8;
    private final List<Annotation> annotations;
    private final String display;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnnotationInfo copy$default(AnnotationInfo annotationInfo, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = annotationInfo.display;
        }
        if ((i & 2) != 0) {
            list = annotationInfo.annotations;
        }
        return annotationInfo.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDisplay() {
        return this.display;
    }

    public final List<Annotation> component2() {
        return this.annotations;
    }

    public final AnnotationInfo copy(String display, List<? extends Annotation> annotations) {
        Intrinsics.checkNotNullParameter(display, "display");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        return new AnnotationInfo(display, annotations);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnnotationInfo)) {
            return false;
        }
        AnnotationInfo annotationInfo = (AnnotationInfo) other;
        return Intrinsics.areEqual(this.display, annotationInfo.display) && Intrinsics.areEqual(this.annotations, annotationInfo.annotations);
    }

    public int hashCode() {
        return (this.display.hashCode() * 31) + this.annotations.hashCode();
    }

    public String toString() {
        return "AnnotationInfo(display=" + this.display + ", annotations=" + this.annotations + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnnotationInfo(String display, List<? extends Annotation> annotations) {
        Intrinsics.checkNotNullParameter(display, "display");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        this.display = display;
        this.annotations = annotations;
    }

    public final String getDisplay() {
        return this.display;
    }

    public final List<Annotation> getAnnotations() {
        return this.annotations;
    }

    public final List<CustomAccessibilityAction> intoAccessibilityActions(String label, final Function1<? super PrimitiveRanges2, Boolean> onClick) {
        CustomAccessibilityAction customAccessibilityAction;
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        List<Annotation> list = this.annotations;
        ArrayList arrayList = new ArrayList();
        for (final Annotation annotation : list) {
            if (annotation instanceof Annotation.LinkAnnotation) {
                String str = String.format(label, Arrays.copyOf(new Object[]{((Annotation.LinkAnnotation) annotation).getDescription()}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                customAccessibilityAction = new CustomAccessibilityAction(str, new Function0<Boolean>() { // from class: com.truelayer.payments.ui.utils.AnnotationInfo$intoAccessibilityActions$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        return onClick.invoke(annotation.getPosition());
                    }
                });
            } else {
                customAccessibilityAction = null;
            }
            if (customAccessibilityAction != null) {
                arrayList.add(customAccessibilityAction);
            }
        }
        return arrayList;
    }

    /* compiled from: AnnotationInfo.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/truelayer/payments/ui/utils/AnnotationInfo$Annotation;", "", "position", "Lkotlin/ranges/IntRange;", "(Lkotlin/ranges/IntRange;)V", "getPosition", "()Lkotlin/ranges/IntRange;", "setPosition", "BoldAnnotation", "ItalicAnnotation", "LinkAnnotation", "Lcom/truelayer/payments/ui/utils/AnnotationInfo$Annotation$BoldAnnotation;", "Lcom/truelayer/payments/ui/utils/AnnotationInfo$Annotation$ItalicAnnotation;", "Lcom/truelayer/payments/ui/utils/AnnotationInfo$Annotation$LinkAnnotation;", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static abstract class Annotation {
        public static final int $stable = 8;
        private PrimitiveRanges2 position;

        public /* synthetic */ Annotation(PrimitiveRanges2 primitiveRanges2, DefaultConstructorMarker defaultConstructorMarker) {
            this(primitiveRanges2);
        }

        private Annotation(PrimitiveRanges2 primitiveRanges2) {
            this.position = primitiveRanges2;
        }

        public PrimitiveRanges2 getPosition() {
            return this.position;
        }

        public void setPosition(PrimitiveRanges2 primitiveRanges2) {
            Intrinsics.checkNotNullParameter(primitiveRanges2, "<set-?>");
            this.position = primitiveRanges2;
        }

        /* compiled from: AnnotationInfo.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\t¨\u0006\u001a"}, m3636d2 = {"Lcom/truelayer/payments/ui/utils/AnnotationInfo$Annotation$LinkAnnotation;", "Lcom/truelayer/payments/ui/utils/AnnotationInfo$Annotation;", "url", "", "description", "position", "Lkotlin/ranges/IntRange;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/ranges/IntRange;)V", "getDescription", "()Ljava/lang/String;", "getPosition", "()Lkotlin/ranges/IntRange;", "setPosition", "(Lkotlin/ranges/IntRange;)V", "getUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class LinkAnnotation extends Annotation {
            public static final int $stable = 8;
            private final String description;
            private PrimitiveRanges2 position;
            private final String url;

            public static /* synthetic */ LinkAnnotation copy$default(LinkAnnotation linkAnnotation, String str, String str2, PrimitiveRanges2 primitiveRanges2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = linkAnnotation.url;
                }
                if ((i & 2) != 0) {
                    str2 = linkAnnotation.description;
                }
                if ((i & 4) != 0) {
                    primitiveRanges2 = linkAnnotation.position;
                }
                return linkAnnotation.copy(str, str2, primitiveRanges2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            /* renamed from: component2, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            /* renamed from: component3, reason: from getter */
            public final PrimitiveRanges2 getPosition() {
                return this.position;
            }

            public final LinkAnnotation copy(String url, String description, PrimitiveRanges2 position) {
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(description, "description");
                Intrinsics.checkNotNullParameter(position, "position");
                return new LinkAnnotation(url, description, position);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LinkAnnotation)) {
                    return false;
                }
                LinkAnnotation linkAnnotation = (LinkAnnotation) other;
                return Intrinsics.areEqual(this.url, linkAnnotation.url) && Intrinsics.areEqual(this.description, linkAnnotation.description) && Intrinsics.areEqual(this.position, linkAnnotation.position);
            }

            public int hashCode() {
                return (((this.url.hashCode() * 31) + this.description.hashCode()) * 31) + this.position.hashCode();
            }

            public String toString() {
                return "LinkAnnotation(url=" + this.url + ", description=" + this.description + ", position=" + this.position + ")";
            }

            public final String getUrl() {
                return this.url;
            }

            public final String getDescription() {
                return this.description;
            }

            @Override // com.truelayer.payments.ui.utils.AnnotationInfo.Annotation
            public PrimitiveRanges2 getPosition() {
                return this.position;
            }

            @Override // com.truelayer.payments.ui.utils.AnnotationInfo.Annotation
            public void setPosition(PrimitiveRanges2 primitiveRanges2) {
                Intrinsics.checkNotNullParameter(primitiveRanges2, "<set-?>");
                this.position = primitiveRanges2;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LinkAnnotation(String url, String description, PrimitiveRanges2 position) {
                super(position, null);
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(description, "description");
                Intrinsics.checkNotNullParameter(position, "position");
                this.url = url;
                this.description = description;
                this.position = position;
            }
        }

        /* compiled from: AnnotationInfo.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0012"}, m3636d2 = {"Lcom/truelayer/payments/ui/utils/AnnotationInfo$Annotation$BoldAnnotation;", "Lcom/truelayer/payments/ui/utils/AnnotationInfo$Annotation;", "position", "Lkotlin/ranges/IntRange;", "(Lkotlin/ranges/IntRange;)V", "getPosition", "()Lkotlin/ranges/IntRange;", "setPosition", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class BoldAnnotation extends Annotation {
            public static final int $stable = 8;
            private PrimitiveRanges2 position;

            public static /* synthetic */ BoldAnnotation copy$default(BoldAnnotation boldAnnotation, PrimitiveRanges2 primitiveRanges2, int i, Object obj) {
                if ((i & 1) != 0) {
                    primitiveRanges2 = boldAnnotation.position;
                }
                return boldAnnotation.copy(primitiveRanges2);
            }

            /* renamed from: component1, reason: from getter */
            public final PrimitiveRanges2 getPosition() {
                return this.position;
            }

            public final BoldAnnotation copy(PrimitiveRanges2 position) {
                Intrinsics.checkNotNullParameter(position, "position");
                return new BoldAnnotation(position);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof BoldAnnotation) && Intrinsics.areEqual(this.position, ((BoldAnnotation) other).position);
            }

            public int hashCode() {
                return this.position.hashCode();
            }

            public String toString() {
                return "BoldAnnotation(position=" + this.position + ")";
            }

            @Override // com.truelayer.payments.ui.utils.AnnotationInfo.Annotation
            public PrimitiveRanges2 getPosition() {
                return this.position;
            }

            @Override // com.truelayer.payments.ui.utils.AnnotationInfo.Annotation
            public void setPosition(PrimitiveRanges2 primitiveRanges2) {
                Intrinsics.checkNotNullParameter(primitiveRanges2, "<set-?>");
                this.position = primitiveRanges2;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BoldAnnotation(PrimitiveRanges2 position) {
                super(position, null);
                Intrinsics.checkNotNullParameter(position, "position");
                this.position = position;
            }
        }

        /* compiled from: AnnotationInfo.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0012"}, m3636d2 = {"Lcom/truelayer/payments/ui/utils/AnnotationInfo$Annotation$ItalicAnnotation;", "Lcom/truelayer/payments/ui/utils/AnnotationInfo$Annotation;", "position", "Lkotlin/ranges/IntRange;", "(Lkotlin/ranges/IntRange;)V", "getPosition", "()Lkotlin/ranges/IntRange;", "setPosition", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class ItalicAnnotation extends Annotation {
            public static final int $stable = 8;
            private PrimitiveRanges2 position;

            public static /* synthetic */ ItalicAnnotation copy$default(ItalicAnnotation italicAnnotation, PrimitiveRanges2 primitiveRanges2, int i, Object obj) {
                if ((i & 1) != 0) {
                    primitiveRanges2 = italicAnnotation.position;
                }
                return italicAnnotation.copy(primitiveRanges2);
            }

            /* renamed from: component1, reason: from getter */
            public final PrimitiveRanges2 getPosition() {
                return this.position;
            }

            public final ItalicAnnotation copy(PrimitiveRanges2 position) {
                Intrinsics.checkNotNullParameter(position, "position");
                return new ItalicAnnotation(position);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ItalicAnnotation) && Intrinsics.areEqual(this.position, ((ItalicAnnotation) other).position);
            }

            public int hashCode() {
                return this.position.hashCode();
            }

            public String toString() {
                return "ItalicAnnotation(position=" + this.position + ")";
            }

            @Override // com.truelayer.payments.ui.utils.AnnotationInfo.Annotation
            public PrimitiveRanges2 getPosition() {
                return this.position;
            }

            @Override // com.truelayer.payments.ui.utils.AnnotationInfo.Annotation
            public void setPosition(PrimitiveRanges2 primitiveRanges2) {
                Intrinsics.checkNotNullParameter(primitiveRanges2, "<set-?>");
                this.position = primitiveRanges2;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ItalicAnnotation(PrimitiveRanges2 position) {
                super(position, null);
                Intrinsics.checkNotNullParameter(position, "position");
                this.position = position;
            }
        }
    }

    public final AnnotatedString intoAnnotatedString(SpanStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        builder.append(this.display);
        for (Annotation annotation : this.annotations) {
            if (annotation instanceof Annotation.BoldAnnotation) {
                builder.addStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null), annotation.getPosition().getFirst(), annotation.getPosition().getLast());
            } else if (annotation instanceof Annotation.LinkAnnotation) {
                builder.addStyle(style, annotation.getPosition().getFirst(), annotation.getPosition().getLast());
                builder.addStringAnnotation("URL", ((Annotation.LinkAnnotation) annotation).getUrl(), annotation.getPosition().getFirst(), annotation.getPosition().getLast());
            } else if (annotation instanceof Annotation.ItalicAnnotation) {
                builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, FontStyle.m7700boximpl(FontStyle.INSTANCE.m7707getItalic_LCdwA()), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65527, (DefaultConstructorMarker) null), annotation.getPosition().getFirst(), annotation.getPosition().getLast());
            }
        }
        return builder.toAnnotatedString();
    }
}
