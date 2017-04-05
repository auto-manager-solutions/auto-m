public final class MotHistoryDataResponse {
    public final Request request;
    public final Response response;

    public MotHistoryDataResponse(Request request, Response response){
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
    
            public StatusInformation(){
            }
        }

        public static final class DataItems {
            public final MotHistory motHistory;
            public final VehicleDetails vehicleDetails;
    
            public DataItems(MotHistory motHistory, VehicleDetails vehicleDetails){
                this.motHistory = motHistory;
                this.vehicleDetails = vehicleDetails;
            }
    
            public static final class MotHistory {
                public final long recordCount;
                public final RecordList recordList[];
        
                public MotHistory(long recordCount, RecordList[] recordList){
                    this.recordCount = recordCount;
                    this.recordList = recordList;
                }
        
                public static final class RecordList {
                    public final String testDate;
                    public final String expiryDate;
                    public final String testResult;
                    public final long odometerReading;
                    public final String testNumber;
                    public final AdvisoryNoticeList advisoryNoticeList[];
                    public final FailureReasonList failureReasonList[];
            
                    public RecordList(String testDate, String expiryDate, String testResult, long odometerReading, String testNumber, AdvisoryNoticeList[] advisoryNoticeList, FailureReasonList[] failureReasonList){
                        this.testDate = testDate;
                        this.expiryDate = expiryDate;
                        this.testResult = testResult;
                        this.odometerReading = odometerReading;
                        this.testNumber = testNumber;
                        this.advisoryNoticeList = advisoryNoticeList;
                        this.failureReasonList = failureReasonList;
                    }
            
                    public static final class AdvisoryNoticeList {
                
                        public AdvisoryNoticeList(){
                        }
                    }
            
                    public static final class FailureReasonList {
                
                        public FailureReasonList(){
                        }
                    }
                }
            }
    
            public static final class VehicleDetails {
                public final String make;
                public final String model;
                public final String dateOfFirstRegistration;
                public final String colour;
                public final String fuelType;
        
                public VehicleDetails(String make, String model, String dateOfFirstRegistration, String colour, String fuelType){
                    this.make = make;
                    this.model = model;
                    this.dateOfFirstRegistration = dateOfFirstRegistration;
                    this.colour = colour;
                    this.fuelType = fuelType;
                }
            }
        }
    }
}
