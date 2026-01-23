package com.robinhood.android.common.equitydetail.performance;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.equitydetail.C11150R;
import com.robinhood.android.common.equitydetail.databinding.MergePerformanceViewContentBinding;
import com.robinhood.android.common.equitydetail.performance.PerformanceView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.compose.bento.component.Segment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.p320db.EtpDetails;
import com.robinhood.models.p320db.EtpPerformance;
import com.robinhood.models.p320db.EtpPerformanceDetails;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.education.order.OrderTypeEducationLearnMoreFragment;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import java.math.BigDecimal;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import p479j$.time.LocalDate;

/* compiled from: PerformanceView.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000 &2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002%&B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0003H\u0016J\u0018\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0011H\u0002J\u0012\u0010\"\u001a\u00020\u00192\b\u0010#\u001a\u0004\u0018\u00010$H\u0002R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u0019X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006'²\u0006\n\u0010(\u001a\u00020\u0011X\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/common/equitydetail/performance/PerformanceView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/models/db/EtpDetails;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "previousState", "getPreviousState", "()Lcom/robinhood/models/db/EtpDetails;", "setPreviousState", "(Lcom/robinhood/models/db/EtpDetails;)V", "selectedPerformanceType", "Landroidx/compose/runtime/MutableState;", "Lcom/robinhood/android/common/equitydetail/performance/PerformanceView$PerformanceType;", "binding", "Lcom/robinhood/android/common/equitydetail/databinding/MergePerformanceViewContentBinding;", "getBinding", "()Lcom/robinhood/android/common/equitydetail/databinding/MergePerformanceViewContentBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "defaultCellStr", "", "getDefaultCellStr", "()Ljava/lang/String;", "bind", "", "state", "bindPerformance", "etpDetails", "performanceType", "formatPerformanceReturn", "performanceReturn", "Ljava/math/BigDecimal;", "PerformanceType", "Companion", "feature-lib-equity-detail_externalDebug", "mutablePerformanceType"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public class PerformanceView extends ConstraintLayout implements Bindable<EtpDetails> {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final String defaultCellStr;
    private EtpDetails previousState;
    private final SnapshotState<PerformanceType> selectedPerformanceType;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PerformanceView.class, "binding", "getBinding()Lcom/robinhood/android/common/equitydetail/databinding/MergePerformanceViewContentBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PerformanceView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PerformanceType.values().length];
            try {
                iArr[PerformanceType.QUARTER_END.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PerformanceType.MONTH_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerformanceView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.selectedPerformanceType = SnapshotState3.mutableStateOf$default(PerformanceType.MONTH_END, null, 2, null);
        ViewGroups.inflate(this, C11150R.layout.merge_performance_view_content, true);
        this.binding = ViewBinding5.viewBinding(this, PerformanceView3.INSTANCE);
        this.defaultCellStr = ViewsKt.getString(this, C11048R.string.general_label_long_dash);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PerformanceView.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/equitydetail/performance/PerformanceView$PerformanceType;", "", OrderTypeEducationLearnMoreFragment.ARG_TITLE_RES, "", "<init>", "(Ljava/lang/String;II)V", "getTitleRes", "()I", "MONTH_END", "QUARTER_END", "feature-lib-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PerformanceType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PerformanceType[] $VALUES;
        public static final PerformanceType MONTH_END = new PerformanceType("MONTH_END", 0, C11150R.string.performance_month_end);
        public static final PerformanceType QUARTER_END = new PerformanceType("QUARTER_END", 1, C11150R.string.performance_quarter_end);
        private final int titleRes;

        private static final /* synthetic */ PerformanceType[] $values() {
            return new PerformanceType[]{MONTH_END, QUARTER_END};
        }

        public static EnumEntries<PerformanceType> getEntries() {
            return $ENTRIES;
        }

        private PerformanceType(String str, int i, int i2) {
            this.titleRes = i2;
        }

        public final int getTitleRes() {
            return this.titleRes;
        }

        static {
            PerformanceType[] performanceTypeArr$values = $values();
            $VALUES = performanceTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(performanceTypeArr$values);
        }

        public static PerformanceType valueOf(String str) {
            return (PerformanceType) Enum.valueOf(PerformanceType.class, str);
        }

        public static PerformanceType[] values() {
            return (PerformanceType[]) $VALUES.clone();
        }
    }

    protected final EtpDetails getPreviousState() {
        return this.previousState;
    }

    protected final void setPreviousState(EtpDetails etpDetails) {
        this.previousState = etpDetails;
    }

    protected final MergePerformanceViewContentBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergePerformanceViewContentBinding) value;
    }

    protected final String getDefaultCellStr() {
        return this.defaultCellStr;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(final EtpDetails state) throws Resources.NotFoundException {
        String string2;
        Intrinsics.checkNotNullParameter(state, "state");
        MergePerformanceViewContentBinding binding = getBinding();
        if (Intrinsics.areEqual(state, this.previousState)) {
            return;
        }
        this.previousState = state;
        LocalDate inceptionDate = state.getInceptionDate();
        if (inceptionDate != null) {
            string2 = LocalDateFormatter.MEDIUM.format(inceptionDate);
        } else {
            string2 = getResources().getString(C11150R.string.performance_inception_row_default);
            Intrinsics.checkNotNull(string2);
        }
        binding.performanceDataSegmentedControl.setContent(ComposableLambda3.composableLambdaInstance(-29551532, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.equitydetail.performance.PerformanceView$bind$1$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            /* compiled from: PerformanceView.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.common.equitydetail.performance.PerformanceView$bind$1$1$1 */
            static final class C111511 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ SnapshotState<PerformanceView.PerformanceType> $mutablePerformanceType$delegate;
                final /* synthetic */ PerformanceView.PerformanceType[] $performanceTypes;
                final /* synthetic */ EtpDetails $state;
                final /* synthetic */ PerformanceView this$0;

                C111511(PerformanceView.PerformanceType[] performanceTypeArr, PerformanceView performanceView, EtpDetails etpDetails, SnapshotState<PerformanceView.PerformanceType> snapshotState) {
                    this.$performanceTypes = performanceTypeArr;
                    this.this$0 = performanceView;
                    this.$state = etpDetails;
                    this.$mutablePerformanceType$delegate = snapshotState;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    if ((i & 3) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1301981050, i, -1, "com.robinhood.android.common.equitydetail.performance.PerformanceView.bind.<anonymous>.<anonymous>.<anonymous> (PerformanceView.kt:65)");
                    }
                    composer.startReplaceGroup(-1368302961);
                    PerformanceView.PerformanceType[] performanceTypeArr = this.$performanceTypes;
                    ArrayList arrayList = new ArrayList(performanceTypeArr.length);
                    for (PerformanceView.PerformanceType performanceType : performanceTypeArr) {
                        arrayList.add(new Segment(null, StringResources_androidKt.stringResource(performanceType.getTitleRes(), composer, 0), null, 5, null));
                    }
                    composer.endReplaceGroup();
                    int iIndexOf = ArraysKt.indexOf(this.$performanceTypes, PerformanceView2.invoke$lambda$1(this.$mutablePerformanceType$delegate));
                    composer.startReplaceGroup(-1224400529);
                    boolean zChangedInstance = composer.changedInstance(this.$performanceTypes) | composer.changedInstance(this.this$0) | composer.changedInstance(this.$state);
                    final PerformanceView.PerformanceType[] performanceTypeArr2 = this.$performanceTypes;
                    final PerformanceView performanceView = this.this$0;
                    final EtpDetails etpDetails = this.$state;
                    final SnapshotState<PerformanceView.PerformanceType> snapshotState = this.$mutablePerformanceType$delegate;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x008c: CONSTRUCTOR (r6v1 'objRememberedValue' java.lang.Object) = 
                              (r2v5 'performanceTypeArr2' com.robinhood.android.common.equitydetail.performance.PerformanceView$PerformanceType[] A[DONT_INLINE])
                              (r3v2 'performanceView' com.robinhood.android.common.equitydetail.performance.PerformanceView A[DONT_INLINE])
                              (r4v0 'etpDetails' com.robinhood.models.db.EtpDetails A[DONT_INLINE])
                              (r5v0 'snapshotState' androidx.compose.runtime.MutableState<com.robinhood.android.common.equitydetail.performance.PerformanceView$PerformanceType> A[DONT_INLINE])
                             A[MD:(com.robinhood.android.common.equitydetail.performance.PerformanceView$PerformanceType[], com.robinhood.android.common.equitydetail.performance.PerformanceView, com.robinhood.models.db.EtpDetails, androidx.compose.runtime.MutableState):void (m)] (LINE:71) call: com.robinhood.android.common.equitydetail.performance.PerformanceView$bind$1$1$1$$ExternalSyntheticLambda0.<init>(com.robinhood.android.common.equitydetail.performance.PerformanceView$PerformanceType[], com.robinhood.android.common.equitydetail.performance.PerformanceView, com.robinhood.models.db.EtpDetails, androidx.compose.runtime.MutableState):void type: CONSTRUCTOR in method: com.robinhood.android.common.equitydetail.performance.PerformanceView$bind$1$1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes2.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.common.equitydetail.performance.PerformanceView$bind$1$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                            	... 25 more
                            */
                        /*
                            this = this;
                            r0 = r13 & 3
                            r1 = 2
                            if (r0 != r1) goto L10
                            boolean r0 = r12.getSkipping()
                            if (r0 != 0) goto Lc
                            goto L10
                        Lc:
                            r12.skipToGroupEnd()
                            return
                        L10:
                            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                            if (r0 == 0) goto L1f
                            r0 = -1
                            java.lang.String r1 = "com.robinhood.android.common.equitydetail.performance.PerformanceView.bind.<anonymous>.<anonymous>.<anonymous> (PerformanceView.kt:65)"
                            r2 = -1301981050(0xffffffffb2655886, float:-1.3349682E-8)
                            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r13, r0, r1)
                        L1f:
                            r13 = -1368302961(0xffffffffae715a8f, float:-5.4877488E-11)
                            r12.startReplaceGroup(r13)
                            com.robinhood.android.common.equitydetail.performance.PerformanceView$PerformanceType[] r13 = r11.$performanceTypes
                            java.util.ArrayList r0 = new java.util.ArrayList
                            int r1 = r13.length
                            r0.<init>(r1)
                            int r1 = r13.length
                            r2 = 0
                            r3 = r2
                        L30:
                            if (r3 >= r1) goto L4b
                            r4 = r13[r3]
                            com.robinhood.compose.bento.component.Segment r5 = new com.robinhood.compose.bento.component.Segment
                            int r4 = r4.getTitleRes()
                            java.lang.String r7 = androidx.compose.p011ui.res.StringResources_androidKt.stringResource(r4, r12, r2)
                            r9 = 5
                            r10 = 0
                            r6 = 0
                            r8 = 0
                            r5.<init>(r6, r7, r8, r9, r10)
                            r0.add(r5)
                            int r3 = r3 + 1
                            goto L30
                        L4b:
                            r12.endReplaceGroup()
                            com.robinhood.android.common.equitydetail.performance.PerformanceView$PerformanceType[] r13 = r11.$performanceTypes
                            androidx.compose.runtime.MutableState<com.robinhood.android.common.equitydetail.performance.PerformanceView$PerformanceType> r1 = r11.$mutablePerformanceType$delegate
                            com.robinhood.android.common.equitydetail.performance.PerformanceView$PerformanceType r1 = com.robinhood.android.common.equitydetail.performance.PerformanceView2.access$invoke$lambda$1(r1)
                            int r1 = kotlin.collections.ArraysKt.indexOf(r13, r1)
                            r13 = -1224400529(0xffffffffb705216f, float:-7.935202E-6)
                            r12.startReplaceGroup(r13)
                            com.robinhood.android.common.equitydetail.performance.PerformanceView$PerformanceType[] r13 = r11.$performanceTypes
                            boolean r13 = r12.changedInstance(r13)
                            com.robinhood.android.common.equitydetail.performance.PerformanceView r2 = r11.this$0
                            boolean r2 = r12.changedInstance(r2)
                            r13 = r13 | r2
                            com.robinhood.models.db.EtpDetails r2 = r11.$state
                            boolean r2 = r12.changedInstance(r2)
                            r13 = r13 | r2
                            com.robinhood.android.common.equitydetail.performance.PerformanceView$PerformanceType[] r2 = r11.$performanceTypes
                            com.robinhood.android.common.equitydetail.performance.PerformanceView r3 = r11.this$0
                            com.robinhood.models.db.EtpDetails r4 = r11.$state
                            androidx.compose.runtime.MutableState<com.robinhood.android.common.equitydetail.performance.PerformanceView$PerformanceType> r5 = r11.$mutablePerformanceType$delegate
                            java.lang.Object r6 = r12.rememberedValue()
                            if (r13 != 0) goto L8a
                            androidx.compose.runtime.Composer$Companion r13 = androidx.compose.runtime.Composer.INSTANCE
                            java.lang.Object r13 = r13.getEmpty()
                            if (r6 != r13) goto L92
                        L8a:
                            com.robinhood.android.common.equitydetail.performance.PerformanceView$bind$1$1$1$$ExternalSyntheticLambda0 r6 = new com.robinhood.android.common.equitydetail.performance.PerformanceView$bind$1$1$1$$ExternalSyntheticLambda0
                            r6.<init>(r2, r3, r4, r5)
                            r12.updateRememberedValue(r6)
                        L92:
                            r2 = r6
                            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
                            r12.endReplaceGroup()
                            r6 = 0
                            r7 = 24
                            r3 = 0
                            r4 = 0
                            r5 = r12
                            com.robinhood.compose.bento.component.BentoSegmentedControl2.BentoSegmentedControl(r0, r1, r2, r3, r4, r5, r6, r7)
                            boolean r12 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                            if (r12 == 0) goto Laa
                            androidx.compose.runtime.ComposerKt.traceEventEnd()
                        Laa:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.common.equitydetail.performance.PerformanceView2.C111511.invoke(androidx.compose.runtime.Composer, int):void");
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$2$lambda$1(PerformanceView.PerformanceType[] performanceTypeArr, PerformanceView performanceView, EtpDetails etpDetails, SnapshotState snapshotState, int i) {
                        PerformanceView2.invoke$lambda$2(snapshotState, performanceTypeArr[i]);
                        performanceView.bindPerformance(etpDetails, PerformanceView2.invoke$lambda$1(snapshotState));
                        return Unit.INSTANCE;
                    }
                }

                public final void invoke(Composer composer, int i) {
                    if ((i & 3) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-29551532, i, -1, "com.robinhood.android.common.equitydetail.performance.PerformanceView.bind.<anonymous>.<anonymous> (PerformanceView.kt:62)");
                    }
                    PerformanceView.PerformanceType[] performanceTypeArrValues = PerformanceView.PerformanceType.values();
                    composer.startReplaceGroup(1849434622);
                    PerformanceView performanceView = this.this$0;
                    Object objRememberedValue = composer.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = performanceView.selectedPerformanceType;
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    BentoTheme2.BentoTheme(ScarletComposeInterop.themeChangesForCompose(ScarletManager2.getScarletManager(this.this$0)), null, ComposableLambda3.rememberComposableLambda(-1301981050, true, new C111511(performanceTypeArrValues, this.this$0, state, (SnapshotState) objRememberedValue), composer, 54), composer, 384, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final PerformanceView.PerformanceType invoke$lambda$1(SnapshotState<PerformanceView.PerformanceType> snapshotState) {
                    return snapshotState.getValue();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void invoke$lambda$2(SnapshotState<PerformanceView.PerformanceType> snapshotState, PerformanceView.PerformanceType performanceType) {
                    snapshotState.setValue(performanceType);
                }
            }));
            binding.performanceInceptionRowHeader.setText(getResources().getString(C11150R.string.performance_inception_row_header, string2));
            bindPerformance(state, this.selectedPerformanceType.getValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void bindPerformance(EtpDetails etpDetails, PerformanceType performanceType) {
            Tuples2 tuples2M3642to;
            MergePerformanceViewContentBinding binding = getBinding();
            int i = WhenMappings.$EnumSwitchMapping$0[performanceType.ordinal()];
            if (i == 1) {
                tuples2M3642to = Tuples4.m3642to(etpDetails.getQuarterEndPerformance(), etpDetails.getQuarterEndDate());
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                tuples2M3642to = Tuples4.m3642to(etpDetails.getMonthEndPerformance(), etpDetails.getMonthEndDate());
            }
            EtpPerformance etpPerformance = (EtpPerformance) tuples2M3642to.component1();
            LocalDate localDate = (LocalDate) tuples2M3642to.component2();
            EtpPerformanceDetails market = etpPerformance != null ? etpPerformance.getMarket() : null;
            binding.performance1yReturn.setText(formatPerformanceReturn(market != null ? market.getYearOne() : null));
            binding.performance3yReturn.setText(formatPerformanceReturn(market != null ? market.getYearThree() : null));
            binding.performance5yReturn.setText(formatPerformanceReturn(market != null ? market.getYearFive() : null));
            binding.performance10yReturn.setText(formatPerformanceReturn(market != null ? market.getYearTen() : null));
            binding.performanceInceptionReturn.setText(formatPerformanceReturn(market != null ? market.getSinceInception() : null));
            EtpPerformanceDetails nav = etpPerformance != null ? etpPerformance.getNav() : null;
            binding.performance1yNavReturn.setText(formatPerformanceReturn(nav != null ? nav.getYearOne() : null));
            binding.performance3yNavReturn.setText(formatPerformanceReturn(nav != null ? nav.getYearThree() : null));
            binding.performance5yNavReturn.setText(formatPerformanceReturn(nav != null ? nav.getYearFive() : null));
            binding.performance10yNavReturn.setText(formatPerformanceReturn(nav != null ? nav.getYearTen() : null));
            binding.performanceInceptionNavReturn.setText(formatPerformanceReturn(nav != null ? nav.getSinceInception() : null));
            binding.performanceEndDate.setText(localDate != null ? getResources().getString(C11150R.string.performance_quarter_end_date, LocalDateFormatter.MEDIUM.format(localDate)) : null);
        }

        private final String formatPerformanceReturn(BigDecimal performanceReturn) {
            if (performanceReturn != null) {
                return Formats.getNoSymbolPercentFormat().format(performanceReturn);
            }
            return this.defaultCellStr;
        }

        /* compiled from: PerformanceView.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/equitydetail/performance/PerformanceView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/common/equitydetail/performance/PerformanceView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Inflater<PerformanceView> {
            private final /* synthetic */ Inflater<PerformanceView> $$delegate_0;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // com.robinhood.utils.p409ui.view.Inflater
            public PerformanceView inflate(ViewGroup parent) {
                Intrinsics.checkNotNullParameter(parent, "parent");
                return (PerformanceView) this.$$delegate_0.inflate(parent);
            }

            private Companion() {
                this.$$delegate_0 = Inflater.INSTANCE.include(C11150R.layout.include_performance_view);
            }
        }
    }
