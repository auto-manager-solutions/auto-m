public final class VehicleDataResponse {
    public final Request request;
    public final Response response;

    public VehicleDataResponse(Request request, Response response){
        this.request = request;
        this.response = response;
    }

    public static final class Request {
        public final String requestGuid;
        public final String packageId;
        public final long packageVersion;
        public final long responseVersion;
        public final DataKeys dataKeys;

        public Request(String requestGuid, String packageId, long packageVersion, long responseVersion, DataKeys dataKeys){
            this.requestGuid = requestGuid;
            this.packageId = packageId;
            this.packageVersion = packageVersion;
            this.responseVersion = responseVersion;
            this.dataKeys = dataKeys;
        }

        public static final class DataKeys {
            public final String vrm;
    
            public DataKeys(String vrm){
                this.vrm = vrm;
            }
        }
    }

    public static final class Response {
        public final String statusCode;
        public final String statusMessage;
        public final StatusInformation statusInformation;
        public final DataItems dataItems;

        public Response(String statusCode, String statusMessage, StatusInformation statusInformation, DataItems dataItems){
            this.statusCode = statusCode;
            this.statusMessage = statusMessage;
            this.statusInformation = statusInformation;
            this.dataItems = dataItems;
        }

        public static final class StatusInformation {
            public final Lookup lookup;
    
            public StatusInformation(Lookup lookup){
                this.lookup = lookup;
            }
    
            public static final class Lookup {
                public final String statusCode;
                public final String statusMessage;
                public final AdviceTextList adviceTextList[];
        
                public Lookup(String statusCode, String statusMessage, AdviceTextList[] adviceTextList){
                    this.statusCode = statusCode;
                    this.statusMessage = statusMessage;
                    this.adviceTextList = adviceTextList;
                }
        
                public static final class AdviceTextList {
            
                    public AdviceTextList(){
                    }
                }
            }
        }

        public static final class DataItems {
            public final TechnicalDetails technicalDetails;
            public final ClassificationDetails classificationDetails;
            public final VehicleStatus vehicleStatus;
            public final VehicleHistory vehicleHistory;
            public final VehicleRegistration vehicleRegistration;
            public final SmmtDetails smmtDetails;
    
            public DataItems(TechnicalDetails technicalDetails, ClassificationDetails classificationDetails, VehicleStatus vehicleStatus, VehicleHistory vehicleHistory, VehicleRegistration vehicleRegistration, SmmtDetails smmtDetails){
                this.technicalDetails = technicalDetails;
                this.classificationDetails = classificationDetails;
                this.vehicleStatus = vehicleStatus;
                this.vehicleHistory = vehicleHistory;
                this.vehicleRegistration = vehicleRegistration;
                this.smmtDetails = smmtDetails;
            }
    
            public static final class TechnicalDetails {
                public final Dimensions dimensions;
                public final General general;
                public final Performance performance;
                public final Consumption consumption;
        
                public TechnicalDetails(Dimensions dimensions, General general, Performance performance, Consumption consumption){
                    this.dimensions = dimensions;
                    this.general = general;
                    this.performance = performance;
                    this.consumption = consumption;
                }
        
                public static final class Dimensions {
                    public final UnladenWeight unladenWeight;
                    public final String rigidArtic;
                    public final String bodyShape;
                    public final PayloadVolume payloadVolume;
                    public final PayloadWeight payloadWeight;
                    public final long height;
                    public final long numberOfSeats;
                    public final long kerbWeight;
                    public final GrossTrainWeight grossTrainWeight;
                    public final LoadLength loadLength;
                    public final DataVersionNumber dataVersionNumber;
                    public final WheelBase wheelBase;
                    public final long carLength;
                    public final long width;
                    public final long numberOfAxles;
                    public final GrossVehicleWeight grossVehicleWeight;
                    public final GrossCombinedWeight grossCombinedWeight;
            
                    public Dimensions(UnladenWeight unladenWeight, String rigidArtic, String bodyShape, PayloadVolume payloadVolume, PayloadWeight payloadWeight, long height, long numberOfSeats, long kerbWeight, GrossTrainWeight grossTrainWeight, LoadLength loadLength, DataVersionNumber dataVersionNumber, WheelBase wheelBase, long carLength, long width, long numberOfAxles, GrossVehicleWeight grossVehicleWeight, GrossCombinedWeight grossCombinedWeight){
                        this.unladenWeight = unladenWeight;
                        this.rigidArtic = rigidArtic;
                        this.bodyShape = bodyShape;
                        this.payloadVolume = payloadVolume;
                        this.payloadWeight = payloadWeight;
                        this.height = height;
                        this.numberOfSeats = numberOfSeats;
                        this.kerbWeight = kerbWeight;
                        this.grossTrainWeight = grossTrainWeight;
                        this.loadLength = loadLength;
                        this.dataVersionNumber = dataVersionNumber;
                        this.wheelBase = wheelBase;
                        this.carLength = carLength;
                        this.width = width;
                        this.numberOfAxles = numberOfAxles;
                        this.grossVehicleWeight = grossVehicleWeight;
                        this.grossCombinedWeight = grossCombinedWeight;
                    }
            
                    public static final class UnladenWeight {
                
                        public UnladenWeight(){
                        }
                    }
            
                    public static final class PayloadVolume {
                
                        public PayloadVolume(){
                        }
                    }
            
                    public static final class PayloadWeight {
                
                        public PayloadWeight(){
                        }
                    }
            
                    public static final class GrossTrainWeight {
                
                        public GrossTrainWeight(){
                        }
                    }
            
                    public static final class LoadLength {
                
                        public LoadLength(){
                        }
                    }
            
                    public static final class DataVersionNumber {
                
                        public DataVersionNumber(){
                        }
                    }
            
                    public static final class WheelBase {
                
                        public WheelBase(){
                        }
                    }
            
                    public static final class GrossVehicleWeight {
                
                        public GrossVehicleWeight(){
                        }
                    }
            
                    public static final class GrossCombinedWeight {
                
                        public GrossCombinedWeight(){
                        }
                    }
                }
        
                public static final class General {
                    public final Engine engine;
                    public final String powerDelivery;
                    public final String typeApprovalCategory;
                    public final String drivingAxle;
                    public final DataVersionNumber dataVersionNumber;
                    public final String euroStatus;
            
                    public General(Engine engine, String powerDelivery, String typeApprovalCategory, String drivingAxle, DataVersionNumber dataVersionNumber, String euroStatus){
                        this.engine = engine;
                        this.powerDelivery = powerDelivery;
                        this.typeApprovalCategory = typeApprovalCategory;
                        this.drivingAxle = drivingAxle;
                        this.dataVersionNumber = dataVersionNumber;
                        this.euroStatus = euroStatus;
                    }
            
                    public static final class Engine {
                        public final long stroke;
                        public final String primaryFuelFlag;
                        public final long valvesPerCylinder;
                        public final String aspiration;
                        public final long numberOfCylinders;
                        public final String cylinderArrangement;
                        public final String valveGear;
                        public final String location;
                        public final String description;
                        public final long bore;
                        public final String make;
                
                        public Engine(long stroke, String primaryFuelFlag, long valvesPerCylinder, String aspiration, long numberOfCylinders, String cylinderArrangement, String valveGear, String location, String description, long bore, String make){
                            this.stroke = stroke;
                            this.primaryFuelFlag = primaryFuelFlag;
                            this.valvesPerCylinder = valvesPerCylinder;
                            this.aspiration = aspiration;
                            this.numberOfCylinders = numberOfCylinders;
                            this.cylinderArrangement = cylinderArrangement;
                            this.valveGear = valveGear;
                            this.location = location;
                            this.description = description;
                            this.bore = bore;
                            this.make = make;
                        }
                    }
            
                    public static final class DataVersionNumber {
                
                        public DataVersionNumber(){
                        }
                    }
                }
        
                public static final class Performance {
                    public final Torque torque;
                    public final DataVersionNumber dataVersionNumber;
                    public final Power power;
                    public final MaxSpeed maxSpeed;
                    public final long co2;
                    public final Acceleration acceleration;
            
                    public Performance(Torque torque, DataVersionNumber dataVersionNumber, Power power, MaxSpeed maxSpeed, long co2, Acceleration acceleration){
                        this.torque = torque;
                        this.dataVersionNumber = dataVersionNumber;
                        this.power = power;
                        this.maxSpeed = maxSpeed;
                        this.co2 = co2;
                        this.acceleration = acceleration;
                    }
            
                    public static final class Torque {
                        public final double ftLb;
                        public final double nm;
                        public final long rpm;
                
                        public Torque(double ftLb, double nm, long rpm){
                            this.ftLb = ftLb;
                            this.nm = nm;
                            this.rpm = rpm;
                        }
                    }
            
                    public static final class DataVersionNumber {
                
                        public DataVersionNumber(){
                        }
                    }
            
                    public static final class Power {
                        public final double bhp;
                        public final long rpm;
                        public final long kw;
                
                        public Power(double bhp, long rpm, long kw){
                            this.bhp = bhp;
                            this.rpm = rpm;
                            this.kw = kw;
                        }
                    }
            
                    public static final class MaxSpeed {
                        public final long kph;
                        public final long mph;
                
                        public MaxSpeed(long kph, long mph){
                            this.kph = kph;
                            this.mph = mph;
                        }
                    }
            
                    public static final class Acceleration {
                        public final double mph;
                        public final double kph;
                
                        public Acceleration(double mph, double kph){
                            this.mph = mph;
                            this.kph = kph;
                        }
                    }
                }
        
                public static final class Consumption {
                    public final ExtraUrban extraUrban;
                    public final UrbanCold urbanCold;
                    public final Combined combined;
            
                    public Consumption(ExtraUrban extraUrban, UrbanCold urbanCold, Combined combined){
                        this.extraUrban = extraUrban;
                        this.urbanCold = urbanCold;
                        this.combined = combined;
                    }
            
                    public static final class ExtraUrban {
                        public final long lkm;
                        public final double mpg;
                
                        public ExtraUrban(long lkm, double mpg){
                            this.lkm = lkm;
                            this.mpg = mpg;
                        }
                    }
            
                    public static final class UrbanCold {
                        public final double lkm;
                        public final double mpg;
                
                        public UrbanCold(double lkm, double mpg){
                            this.lkm = lkm;
                            this.mpg = mpg;
                        }
                    }
            
                    public static final class Combined {
                        public final double lkm;
                        public final double mpg;
                
                        public Combined(double lkm, double mpg){
                            this.lkm = lkm;
                            this.mpg = mpg;
                        }
                    }
                }
            }
    
            public static final class ClassificationDetails {
                public final Smmt smmt;
                public final Dvla dvla;
        
                public ClassificationDetails(Smmt smmt, Dvla dvla){
                    this.smmt = smmt;
                    this.dvla = dvla;
                }
        
                public static final class Smmt {
                    public final String make;
                    public final Mvris mvris;
                    public final String trim;
                    public final String range;
            
                    public Smmt(String make, Mvris mvris, String trim, String range){
                        this.make = make;
                        this.mvris = mvris;
                        this.trim = trim;
                        this.range = range;
                    }
            
                    public static final class Mvris {
                        public final String modelCode;
                        public final String makeCode;
                
                        public Mvris(String modelCode, String makeCode){
                            this.modelCode = modelCode;
                            this.makeCode = makeCode;
                        }
                    }
                }
        
                public static final class Dvla {
                    public final String modelCode;
                    public final String model;
                    public final String makeCode;
                    public final String make;
            
                    public Dvla(String modelCode, String model, String makeCode, String make){
                        this.modelCode = modelCode;
                        this.model = model;
                        this.makeCode = makeCode;
                        this.make = make;
                    }
                }
            }
    
            public static final class VehicleStatus {
                public final MotVed motVed;
        
                public VehicleStatus(MotVed motVed){
                    this.motVed = motVed;
                }
        
                public static final class MotVed {
                    public final VedRate vedRate;
                    public final long vedCo2Emissions;
                    public final MotDue motDue;
                    public final String vedBand;
                    public final String vedCo2Band;
                    public final TaxDue taxDue;
                    public final Message message;
                    public final VehicleStatus vehicleStatus;
            
                    public MotVed(VedRate vedRate, long vedCo2Emissions, MotDue motDue, String vedBand, String vedCo2Band, TaxDue taxDue, Message message, VehicleStatus vehicleStatus){
                        this.vedRate = vedRate;
                        this.vedCo2Emissions = vedCo2Emissions;
                        this.motDue = motDue;
                        this.vedBand = vedBand;
                        this.vedCo2Band = vedCo2Band;
                        this.taxDue = taxDue;
                        this.message = message;
                        this.vehicleStatus = vehicleStatus;
                    }
            
                    public static final class VedRate {
                        public final FirstYear firstYear;
                        public final PremiumVehicle premiumVehicle;
                        public final Standard standard;
                
                        public VedRate(FirstYear firstYear, PremiumVehicle premiumVehicle, Standard standard){
                            this.firstYear = firstYear;
                            this.premiumVehicle = premiumVehicle;
                            this.standard = standard;
                        }
                
                        public static final class FirstYear {
                            public final SixMonth sixMonth;
                            public final TwelveMonth twelveMonth;
                    
                            public FirstYear(SixMonth sixMonth, TwelveMonth twelveMonth){
                                this.sixMonth = sixMonth;
                                this.twelveMonth = twelveMonth;
                            }
                    
                            public static final class SixMonth {
                        
                                public SixMonth(){
                                }
                            }
                    
                            public static final class TwelveMonth {
                        
                                public TwelveMonth(){
                                }
                            }
                        }
                
                        public static final class PremiumVehicle {
                            public final YearTwoToSix yearTwoToSix;
                    
                            public PremiumVehicle(YearTwoToSix yearTwoToSix){
                                this.yearTwoToSix = yearTwoToSix;
                            }
                    
                            public static final class YearTwoToSix {
                                public final TwelveMonth twelveMonth;
                                public final SixMonth sixMonth;
                        
                                public YearTwoToSix(TwelveMonth twelveMonth, SixMonth sixMonth){
                                    this.twelveMonth = twelveMonth;
                                    this.sixMonth = sixMonth;
                                }
                        
                                public static final class TwelveMonth {
                            
                                    public TwelveMonth(){
                                    }
                                }
                        
                                public static final class SixMonth {
                            
                                    public SixMonth(){
                                    }
                                }
                            }
                        }
                
                        public static final class Standard {
                            public final double sixMonth;
                            public final long twelveMonth;
                    
                            public Standard(double sixMonth, long twelveMonth){
                                this.sixMonth = sixMonth;
                                this.twelveMonth = twelveMonth;
                            }
                        }
                    }
            
                    public static final class MotDue {
                
                        public MotDue(){
                        }
                    }
            
                    public static final class TaxDue {
                
                        public TaxDue(){
                        }
                    }
            
                    public static final class Message {
                
                        public Message(){
                        }
                    }
            
                    public static final class VehicleStatus {
                
                        public VehicleStatus(){
                        }
                    }
                }
            }
    
            public static final class VehicleHistory {
                public final long v5CCertificateCount;
                public final long plateChangeCount;
                public final long numberOfPreviousKeepers;
                public final V5CCertificateList v5CCertificateList[];
                public final long keeperChangesCount;
                public final long vicCount;
                public final long colourChangeCount;
                public final ColourChangeList colourChangeList;
                public final KeeperChangesList keeperChangesList;
                public final PlateChangeList plateChangeList;
                public final VicList vicList;
        
                public VehicleHistory(long v5CCertificateCount, long plateChangeCount, long numberOfPreviousKeepers, V5CCertificateList[] v5CCertificateList, long keeperChangesCount, long vicCount, long colourChangeCount, ColourChangeList colourChangeList, KeeperChangesList keeperChangesList, PlateChangeList plateChangeList, VicList vicList){
                    this.v5CCertificateCount = v5CCertificateCount;
                    this.plateChangeCount = plateChangeCount;
                    this.numberOfPreviousKeepers = numberOfPreviousKeepers;
                    this.v5CCertificateList = v5CCertificateList;
                    this.keeperChangesCount = keeperChangesCount;
                    this.vicCount = vicCount;
                    this.colourChangeCount = colourChangeCount;
                    this.colourChangeList = colourChangeList;
                    this.keeperChangesList = keeperChangesList;
                    this.plateChangeList = plateChangeList;
                    this.vicList = vicList;
                }
        
                public static final class V5CCertificateList {
                    public final String certificateDate;
            
                    public V5CCertificateList(String certificateDate){
                        this.certificateDate = certificateDate;
                    }
                }
        
                public static final class ColourChangeList {
            
                    public ColourChangeList(){
                    }
                }
        
                public static final class KeeperChangesList {
            
                    public KeeperChangesList(){
                    }
                }
        
                public static final class PlateChangeList {
            
                    public PlateChangeList(){
                    }
                }
        
                public static final class VicList {
            
                    public VicList(){
                    }
                }
            }
    
            public static final class VehicleRegistration {
                public final String dateOfLastUpdate;
                public final String colour;
                public final AbiBrokerNetCode abiBrokerNetCode;
                public final String engineNumber;
                public final String engineCapacity;
                public final String transmissionCode;
                public final String dtpMakeCode;
                public final boolean exported;
                public final String yearOfManufacture;
                public final WheelPlan wheelPlan;
                public final DateExported dateExported;
                public final boolean scrapped;
                public final String transmission;
                public final String dateFirstRegisteredUk;
                public final String model;
                public final long gearCount;
                public final boolean importNonEu;
                public final String dtpModelCode;
                public final PreviousVrmGb previousVrmGb;
                public final long grossWeight;
                public final String doorPlanLiteral;
                public final String mvrisModelCode;
                public final String vin;
                public final String vrm;
                public final String dateFirstRegistered;
                public final DateScrapped dateScrapped;
                public final String doorPlan;
                public final String vinLast5;
                public final boolean vehicleUsedBeforeFirstRegistration;
                public final long maxPermissibleMass;
                public final String make;
                public final String makeModel;
                public final String transmissionType;
                public final long seatingCapacity;
                public final String fuelType;
                public final long co2Emissions;
                public final boolean imported;
                public final String mvrisMakeCode;
                public final PreviousVrmNi previousVrmNi;
                public final VinConfirmationFlag vinConfirmationFlag;
        
                public VehicleRegistration(String dateOfLastUpdate, String colour, AbiBrokerNetCode abiBrokerNetCode, String engineNumber, String engineCapacity, String transmissionCode, String dtpMakeCode, boolean exported, String yearOfManufacture, WheelPlan wheelPlan, DateExported dateExported, boolean scrapped, String transmission, String dateFirstRegisteredUk, String model, long gearCount, boolean importNonEu, String dtpModelCode, PreviousVrmGb previousVrmGb, long grossWeight, String doorPlanLiteral, String mvrisModelCode, String vin, String vrm, String dateFirstRegistered, DateScrapped dateScrapped, String doorPlan, String vinLast5, boolean vehicleUsedBeforeFirstRegistration, long maxPermissibleMass, String make, String makeModel, String transmissionType, long seatingCapacity, String fuelType, long co2Emissions, boolean imported, String mvrisMakeCode, PreviousVrmNi previousVrmNi, VinConfirmationFlag vinConfirmationFlag){
                    this.dateOfLastUpdate = dateOfLastUpdate;
                    this.colour = colour;
                    this.abiBrokerNetCode = abiBrokerNetCode;
                    this.engineNumber = engineNumber;
                    this.engineCapacity = engineCapacity;
                    this.transmissionCode = transmissionCode;
                    this.dtpMakeCode = dtpMakeCode;
                    this.exported = exported;
                    this.yearOfManufacture = yearOfManufacture;
                    this.wheelPlan = wheelPlan;
                    this.dateExported = dateExported;
                    this.scrapped = scrapped;
                    this.transmission = transmission;
                    this.dateFirstRegisteredUk = dateFirstRegisteredUk;
                    this.model = model;
                    this.gearCount = gearCount;
                    this.importNonEu = importNonEu;
                    this.dtpModelCode = dtpModelCode;
                    this.previousVrmGb = previousVrmGb;
                    this.grossWeight = grossWeight;
                    this.doorPlanLiteral = doorPlanLiteral;
                    this.mvrisModelCode = mvrisModelCode;
                    this.vin = vin;
                    this.vrm = vrm;
                    this.dateFirstRegistered = dateFirstRegistered;
                    this.dateScrapped = dateScrapped;
                    this.doorPlan = doorPlan;
                    this.vinLast5 = vinLast5;
                    this.vehicleUsedBeforeFirstRegistration = vehicleUsedBeforeFirstRegistration;
                    this.maxPermissibleMass = maxPermissibleMass;
                    this.make = make;
                    this.makeModel = makeModel;
                    this.transmissionType = transmissionType;
                    this.seatingCapacity = seatingCapacity;
                    this.fuelType = fuelType;
                    this.co2Emissions = co2Emissions;
                    this.imported = imported;
                    this.mvrisMakeCode = mvrisMakeCode;
                    this.previousVrmNi = previousVrmNi;
                    this.vinConfirmationFlag = vinConfirmationFlag;
                }
        
                public static final class AbiBrokerNetCode {
            
                    public AbiBrokerNetCode(){
                    }
                }
        
                public static final class WheelPlan {
            
                    public WheelPlan(){
                    }
                }
        
                public static final class DateExported {
            
                    public DateExported(){
                    }
                }
        
                public static final class PreviousVrmGb {
            
                    public PreviousVrmGb(){
                    }
                }
        
                public static final class DateScrapped {
            
                    public DateScrapped(){
                    }
                }
        
                public static final class PreviousVrmNi {
            
                    public PreviousVrmNi(){
                    }
                }
        
                public static final class VinConfirmationFlag {
            
                    public VinConfirmationFlag(){
                    }
                }
            }
    
            public static final class SmmtDetails {
                public final String range;
                public final String fuelType;
                public final String engineCapacity;
                public final String marketSectorCode;
                public final String countryOfOrigin;
                public final String modelCode;
                public final String modelVariant;
                public final DataVersionNumber dataVersionNumber;
                public final long numberOfGears;
                public final double nominalEngineCapacity;
                public final String marqueCode;
                public final String transmission;
                public final String bodyStyle;
                public final String visibilityDate;
                public final String sysSetupDate;
                public final String marque;
                public final String cabType;
                public final String terminateDate;
                public final String series;
                public final long numberOfDoors;
                public final String driveType;
        
                public SmmtDetails(String range, String fuelType, String engineCapacity, String marketSectorCode, String countryOfOrigin, String modelCode, String modelVariant, DataVersionNumber dataVersionNumber, long numberOfGears, double nominalEngineCapacity, String marqueCode, String transmission, String bodyStyle, String visibilityDate, String sysSetupDate, String marque, String cabType, String terminateDate, String series, long numberOfDoors, String driveType){
                    this.range = range;
                    this.fuelType = fuelType;
                    this.engineCapacity = engineCapacity;
                    this.marketSectorCode = marketSectorCode;
                    this.countryOfOrigin = countryOfOrigin;
                    this.modelCode = modelCode;
                    this.modelVariant = modelVariant;
                    this.dataVersionNumber = dataVersionNumber;
                    this.numberOfGears = numberOfGears;
                    this.nominalEngineCapacity = nominalEngineCapacity;
                    this.marqueCode = marqueCode;
                    this.transmission = transmission;
                    this.bodyStyle = bodyStyle;
                    this.visibilityDate = visibilityDate;
                    this.sysSetupDate = sysSetupDate;
                    this.marque = marque;
                    this.cabType = cabType;
                    this.terminateDate = terminateDate;
                    this.series = series;
                    this.numberOfDoors = numberOfDoors;
                    this.driveType = driveType;
                }
        
                public static final class DataVersionNumber {
            
                    public DataVersionNumber(){
                    }
                }
            }
        }
    }
}